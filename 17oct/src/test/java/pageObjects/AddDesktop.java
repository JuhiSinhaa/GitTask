package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddDesktop {
	WebDriver driver;	

	@FindBy(xpath="//a[@href='/computers']")
	WebElement computers;
	
	@FindBy(xpath="//a[@href='/computers']/following::a[@href='/desktops']")
	WebElement desktop;

	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement sortBy;
	
	@FindBy(xpath="//a[normalize-space()='Simple Computer']/following::input")
	WebElement pc1;
	
	@FindBy(xpath="//input[@value='Add to compare list']")
	WebElement addToCompareList;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logout;



	public  AddDesktop(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}


public void addADesktop() {		
	Actions a  =new Actions(driver);
	a.moveToElement(computers).build().perform();
	//computers.click();
	desktop.click();
	sortBy.click();
	Select drp= new Select(sortBy);
	drp.selectByVisibleText("Name: A to Z");
	pc1.click();
	addToCompareList.click();
	}

public void logout() {		
	logout.click();
	}
}
