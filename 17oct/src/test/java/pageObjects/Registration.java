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

public class Registration {
WebDriver driver;	

	@FindBy(xpath="//*[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='ConfirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id='gender-female']")
	WebElement gender;
	
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@id='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//*[@id='register-button']")
	WebElement registerButton;

	
	public  Registration(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}
	
public void registerUser() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(gender));
	gender.click();
//	wait.until(ExpectedConditions.elementToBeSelected(FirstName));
	FirstName.sendKeys("juhi");
	LastName.sendKeys("sinha");
	Email.sendKeys("juhi.gsinha@gmail.com");
	Password.sendKeys("Test@1234");
	ConfirmPassword.sendKeys("Test@1234");
	registerButton.click();
	}



	}