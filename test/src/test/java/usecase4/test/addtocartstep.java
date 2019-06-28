package usecase4.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import usecase.test.utility;

public class addtocartstep {
	WebDriver driver;

	@Given("User has registered into testme app")
	public void user_has_registered_into_testme_app() {
		driver = utility.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	}

	@When("User search particular product like {string}")
	public void user_search_particular_product_like(String string) {
		 driver.findElement(By.id("userName")).sendKeys("Alexfranis");
		 driver.findElement(By.id("password")).sendKeys("Mercy131");
		 driver.findElement(By.name("Login")).click();
		 Assert.assertEquals("Home", driver.getTitle());
		 
		driver.findElement(By.name("products")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	
		
	}

	@When("Try to proceed to the payment without adding the any item in cart")
	public void try_to_proceed_to_the_payment_without_adding_the_any_item_in_cart() {
		  
		   Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText(),"Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
	}

	@Then("TestmeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
	    
		  System.out.println("TestMeapp dosen't displays the cart icon");
	}
	
	
	
	
	
	
	
	@Given("Alex signin   app")
	public void alex_signin_app() {
		driver = utility.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("enter search product")
	public void enter_search_product() {
		 driver.findElement(By.id("userName")).sendKeys("Alexfranis");
		 driver.findElement(By.id("password")).sendKeys("Mercy131");
		 driver.findElement(By.name("Login")).click();
		 Assert.assertEquals("Home", driver.getTitle());
		 
		driver.findElement(By.name("products")).sendKeys("head");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("User click the Add to cart button to adding a product")
	public void user_click_the_Add_to_cart_button_to_adding_a_product() {
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}
	
	@Then("click the cart icon for process to the payment")
	public void click_the_cart_icon_for_process_to_the_payment() {
	    
	    
	    driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
	    
	 
	    driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	     
	    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
	     
	    driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
	    
	     
	    driver.findElement(By.id("btn")).click();
	     
	    Assert.assertEquals(driver.getTitle(), "Payment Gateway");
	     
	    driver.findElement(By.name("username")).sendKeys("123456");
	     
	    driver.findElement(By.name("password")).sendKeys("Pass@456");
	     
	    driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	     
	    WebDriverWait waitt = new WebDriverWait(driver, 10);
	     waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
	     
	    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	     
	    driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	     
	    Assert.assertEquals(driver.getTitle(), "Order Details");

	}

	
	
}





