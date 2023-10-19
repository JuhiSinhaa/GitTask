package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddAGiftCard;
import pageObjects.AddDesktop;
import pageObjects.Login;
import pageObjects.Registration;



public class Steps {
	WebDriver driver;
	@Given("I hit the url {string}")
	public void i_hit_the_url(String url) {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(url);
		   
	}

	@Given("Enter  all the details")
	public void enter_all_the_details() {
		Registration reg=new Registration(driver);
		reg.registerUser();
	}

	@Then("I click on register button")
	public void i_click_on_register_button() {
		System.out.print("user registration successful");
	}

	@When("click on login")
	public void click_on_login() {
	Login log=new Login(driver);
		log.login();
	}
	
	
	@When("enter credentials")
	public void enter_credentials() {
		
	}
	
	@Then("click on login button")
	public void click_on_login_button() {
	    
	}
	
	@Then("add gift card")
	public void add_gift_card() {
		AddAGiftCard gift=new AddAGiftCard(driver);
		gift.addGift();
	}
	
	@Then("add desktop")
	public void add_desktop() {
		AddDesktop desk=new AddDesktop(driver);
		desk.addADesktop();
	}
	
	@Then("Logout from the application")
	public void logout_from_the_application() {
		AddDesktop desk=new AddDesktop(driver);
		desk.logout();
	}
	
}
