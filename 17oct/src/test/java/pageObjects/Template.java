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

public class Template {
	WebDriver driver;	

	@FindBy(xpath=" //*[text()=' Create a template']")
	WebElement createAtemplateLink;
	
	@FindBy(xpath="//*[text()='Template Name']")
	WebElement templateName;


	public  Template(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}


public void createATemplate() {		
	createAtemplateLink.click();
	templateName.click();
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.elementToBeClickable(templateName));
//	templateName.sendKeys("ASC95193");
	}
}
