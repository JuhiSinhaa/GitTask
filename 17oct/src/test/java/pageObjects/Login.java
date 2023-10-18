package pageObjects;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
WebDriver driver;	

	@FindBy(xpath="//*[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement login;
	
	@FindBy(xpath="//*[text()='Log in']")
	WebElement loginLink;
	
	public  Login(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}
	

	
public void login() {	
	loginLink.click();
	Email.sendKeys("juhi.gsinha@gmail.com");
	Password.sendKeys("Test@1234");
	login.click();
	}

	
}