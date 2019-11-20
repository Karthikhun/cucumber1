package TestMeApp;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.BeforeMethod;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
WebDriver driver;

 ExtentHtmlReporter HtmlRep;
ExtentReports Rep;
ExtentTest Tes;

private Scanner s;

  @Test(enabled=false)
  public void testregistration() {
 driver.get(" http://10.232.237.143:443/TestMeApp/fetchcat.htm");
 driver.findElement(By.xpath("//a[contains(text(),'\n" + 
 		"											SignUp')]")).click();
 driver.findElement(By.id("userName")).sendKeys("LoginCheck");
 Assert.assertEquals("Available", "Available");
 driver.findElement(By.id("firstName")).sendKeys("Test");
 driver.findElement(By.id("lastName")).sendKeys("case01");
 driver.findElement(By.id("password")).sendKeys("asdf1234");
 driver.findElement(By.id("pass_confirmation")).sendKeys("asdf123");
 driver.findElement(By.xpath("//input[@value='Male']")).click();
 driver.findElement(By.id("emailAddress")).sendKeys("logincheck@test.com");
 driver.findElement(By.id("mobileNumber")).sendKeys("7784555412");
 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")).click();
 driver.findElement(By.id("address")).sendKeys("brookfied , divya shree tech park.");
 Select cat= new Select(driver.findElement(By.id("securityQuestion")));
 cat.selectByVisibleText("What is your Pet Name?");
 driver.findElement(By.id("answer")).sendKeys("sumanc");
 driver.findElement(By.xpath("//input[@value='Register']")).click();
}
  @Test(priority=1)
  public void TestLogin() {
 Tes = Rep.createTest("TestReport");
 driver.get(" http://10.232.237.143:443/TestMeApp/fetchcat.htm");
 driver.findElement(By.xpath("//a[contains(text(),'\n" + 
 		"											SignIn')]")).click();
 
 driver.findElement(By.id("userName")).sendKeys("LoginCheck");
 driver.findElement(By.id("password")).sendKeys("asdf1234");
 driver.findElement(By.xpath("//input[@value='Login']")).click();
 Assert.assertEquals(driver.getTitle(), "Home");
 
  }
  @Test(priority=2)
  public void TestCart() {
 Tes = Rep.createTest("TestReport");
 Actions demo = new Actions(driver);
demo.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All\n" + 
		"										Categories')]")))
.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().build().perform();
driver.findElement(By.xpath("//span[contains(text(),'Travel Kit')]")).click();
driver.findElement(By.xpath("//a[contains(text(),' Add to cart')]")).click();
driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
Assert.assertEquals("Gift Set", "Gift Set");

  }
  @Test(priority=4)
  public void TestPayment() {
 Tes = Rep.createTest("TestReport");
 driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
 driver.findElement(By.id("add1")).sendKeys("brookfied , divya shree tech park.");
 driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
 driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
 driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
 driver.findElement(By.name("username")).sendKeys("123457");
 driver.findElement(By.name("password")).sendKeys("Pass@457");
 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
 driver.findElement(By.xpath("//input[@value='PASSWORD']")).sendKeys("Trans@457");
 driver.findElement(By.xpath("//input[@value='PayNow']")).click();
 Assert.assertEquals("Your order has been confirmed", "Your order has been confirmed");
 driver.findElement(By.xpath("//a[contains(text(),' SignOut')]")).click();
 
 }
 
 

  @AfterMethod
  public void getresult(ITestResult result) {
 if (result.getStatus()==ITestResult.SUCCESS) {
 Tes.log(Status.PASS,"test method passed:" +result.getName());
 }
 else if (result.getStatus()==ITestResult.FAILURE) {
 Tes.log(Status.FAIL,"test method failed:" +result.getName());
 }
 else if (result.getStatus()==ITestResult.SKIP) {
 Tes.log(Status.SKIP,"test method skipped:" +result.getName());
 }
 
  }



  @BeforeTest
public void startbrowser(){
   s = new Scanner(System.in);
System.out.println("enter name");
String n= s.next();
driver=BrowserLauncher.utility(n);

HtmlRep= new ExtentHtmlReporter(System.getProperty("user.dir")+"/exRep/Rep01.html");
 Rep= new ExtentReports();
 Rep.attachReporter(HtmlRep);

}

  @AfterTest
  public void afterTest() {
 Rep.flush();
 driver.close();
  }

}