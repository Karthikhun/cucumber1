package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest {
  
@Test
public void f() {
	System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\Chrome Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	PageClass2 locateElements =PageFactory.initElements(driver, PageClass2.class);
	locateElements.loginMethod("aravind.guggilla57@gmail.com","aravind");
	
	
  }
}
