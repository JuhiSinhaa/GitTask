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

public class AddAGiftCard {
	WebDriver driver;	

	@FindBy(xpath="//ul[@class='top-menu']//a[normalize-space()='Gift Cards']")
	WebElement giftCards;
	
	@FindBy(xpath="//a[normalize-space()='$100 Physical Gift Card']")
	WebElement gift1;

	@FindBy(xpath="//input[@value='Email a friend']")
	WebElement emailFriendLink;
	
	@FindBy(xpath="//input[@id='FriendEmail']")
	WebElement emailFriend;
	
	@FindBy(xpath="//input[@name='send-email']")
	WebElement sendEmailtoFriend;

	public  AddAGiftCard(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
	}


public void addGift() {		
	giftCards.click();
	gift1.click();
	emailFriendLink.click();
	emailFriend.sendKeys("abc.test@gmail.com");
	sendEmailtoFriend.click();
	}
}
