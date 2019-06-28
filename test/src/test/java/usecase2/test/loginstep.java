package usecase2.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import usecase.test.utility;



public class loginstep {
	
	WebDriver driver;
	
	@Given("User is in the Loginpage")
	public void user_is_in_the_Loginpage() { 
		
		driver = utility.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
		
	 System.out.println("User in the Login page of Testme Application")  ;
	}

	@When("User enters the username{string}")
	public void user_enters_the_username(String string) {
	    driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enters the password{string}")
	public void user_enters_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("Login")).click();
		 Assert.assertEquals("Home", driver.getTitle());
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {
	    
		System.out.println("User in Home page of Testme Application") ;
	}


	
	
}
