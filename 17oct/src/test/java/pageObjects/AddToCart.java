package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	WebDriver driver;	

	@FindBy(xpath="//*[contains(text(),'Books')][1]")
	WebElement Books;
	
	@FindBy(xpath="//*[text()='Health Book']/following::input[@value='Add to cart']")
	WebElement addToCart;


	public  AddToCart(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}


public void clickOnBooks() {		
	Books.click();
	}

public void addAbook() {		
	addToCart.click();
	}
}
