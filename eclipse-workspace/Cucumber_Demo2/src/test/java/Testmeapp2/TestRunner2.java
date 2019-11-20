package Testmeapp2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRunner2{
	WebDriver driver=null;
@Given("User opens the application")
public void user_opens_the_application() {
	
	System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\Chrome Driver\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    
}

@When("User clicks on login link")
public void user_clicks_on_login_link() {
	driver.findElement(By.linkText("SignIn")).click();
}

@When("User enters {string} and {string}")
public void user_enters_and(String username, String pwd) {
	driver.findElement(By.id("userName")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(pwd);
}

@Then("Message displayed Login Successfully")
public void message_displayed_Login_Successfully() {
	driver.findElement(By.name("Login")).click();
	 System.out.println("The page title is "+driver.getTitle());
	 Assert.assertTrue(driver.getTitle().contains("Home"));
	 driver.close();
}

}