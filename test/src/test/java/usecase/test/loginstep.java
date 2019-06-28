package usecase.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginstep
{
	WebDriver driver;
	
	
	@Given("User in the Testme application")
	public void user_in_the_Testme_application() 
	{
		
		driver = utility.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	System.out.println("User in the Home page of Testme Application")  ;
	}
	
	@When("User click the SignUp button")
	public void user_click_the_SignUp_button() {
	   driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	 
		
	}
	@Then("Registration is displayed")
	public void registration_is_displayed() 
	{
	 System.out.println("Registration page")  ;
	}

	@Then("User enter the Username {string}")
	public void user_enter_the_Username(String string) 
	{
     driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Then("User enter the firstname {string}")
	public void user_enter_the_firstname(String string) 
	{
     driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@Then("User enter the lastname {string}")
	public void user_enter_the_lastname(String string) 
	{
		driver.findElement(By.id("lastName")).sendKeys(string);

	}

	@Then("User enter the password {string}")
	public void user_enter_the_password(String string)
	{
		driver.findElement(By.id("password")).sendKeys(string);

	}

	@Then("User enter the confirmed password {string}")
	public void user_enter_the_confirmed_password(String string)
	{

		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@Then("User click the Gender radio button {string}")
	public void user_click_the_Gender_radio_button(String string) 
	{
		
		 driver.findElement(By.xpath("//*[@id='gender']")).click();
		
		
	}

	@Then("User enter the Email  {string}")
	public void user_enter_the_Email(String string) 
	{

		 driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(string);
	}

	@Then("User enter the MObile No {string}")
	public void user_enter_the_MObile_No(String string)
   {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}
	

	@Then("User enter the DOB {string}")
	public void user_enter_the_DOB(String string)
	{
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string);
	}

	@Then("User enter the Address {string}")
	public void user_enter_the_Address(String string) 
	{
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@When("Click the sceurity question {string}")
	public void click_the_sceurity_question(String string)
	{
	
		  Select question = new Select(driver.findElement(By.id("securityQuestion")));
		   question.selectByValue(string);
	}

	@Then("User enter the Answer for security question {string}")
	public void user_enter_the_Answer_for_security_question(String string) {
		driver.findElement(By.id("answer")).sendKeys(string);
}
	
    @Then("Click the Register Button")
     public void click_the_Register_Button() {
    
	driver.findElement(By.name("Submit")).click();
}}