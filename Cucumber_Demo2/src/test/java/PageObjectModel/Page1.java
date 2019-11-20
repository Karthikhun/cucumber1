package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page1{
public static void main(String args[]) {
System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\Chrome Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
PageClass PObject=new PageClass(driver);
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
PObject.clicklink();
String username=null;
PObject.typeuname(username);
String password=null;
PObject.typepassword(password);
PObject.clickonloginlyn();
System.out.println("title of the page is"+driver.getTitle());
}
}