package usecase3.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import usecase.test.utility;



public class loginstep {
	
	WebDriver driver;
	
	@Given("User in Loginpage")
	public void user_in_Loginpage() {
		
		driver = utility.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
		 System.out.println("User in the Login page of Testme Application")  ;
	
	}

	@When("User enter the username{string}")
	public void user_enter_the_username(String string) {
		 driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enter the password{string}")
	public void user_enter_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("Login")).click();
		 Assert.assertEquals("Home", driver.getTitle());
	}

	@Then("user search the product in search field{string}")
	public void user_search_the_product_in_search_field(String string) {
		driver.findElement(By.name("products")).sendKeys(string);
		
	}
	
	@Then("user click the Find Detail")
	public void user_click_the_Find_Detail() {
		
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
}
