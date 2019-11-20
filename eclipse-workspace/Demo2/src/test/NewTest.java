package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeClass
	 public void x() {
		  System.out.println("this is before class");
	 }
	
	@AfterClass
	 public void m() {
		  System.out.println("this is after class");
	 }
	
	@BeforeMethod
 public void b() {
	  System.out.println("before testing app");
 }
 @AfterMethod
 public void a() {
	  System.out.println("after testing app");
 }
 
	
	@Test(priority=4)
  public void testfacebook() {
	  System.out.println("test facebook app");
  }
  
  @Test(priority=1)
  public void testTwitter() {
	  System.out.println("test twitter app");
  }
  
  @Test(priority=2,enabled=false)
  public void testGoogle() {
	  System.out.println("test Google app");
  }
  
  @Test(priority=3)
  public void testTestMe() {
	  System.out.println("test testme app");
  }
}
