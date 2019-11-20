package Testmeapp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Testmeapp1 {
	WebDriver driver=null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    
	    
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	    
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("password123");
	    
	}

	@Then("user  finds testmeapp homepage")
	public void user_finds_testmeapp_homepage() {
		 driver.findElement(By.name("Login")).click();
		 System.out.println("The page title is "+driver.getTitle());
		 Assert.assertTrue(driver.getTitle().contains("Home"));
	}
}
