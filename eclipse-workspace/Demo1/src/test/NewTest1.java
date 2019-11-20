package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest1 {
  @Test(dataProvider = "inputCredentials")
  public void f(String username, String pwd) {
	  System.out.println("username is "+username);
	  System.out.println("password is "+pwd);
	  
	  String expected="User and password is wrong here";
	  String actual="User and password is wrong here";
	  
	  Assert.assertNotEquals(actual,expected);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In after Method");
  }


  @DataProvider
  public Object[][] inputCredentials() {
     Object[][] data= {
       { "Lalitha", "password123" },
       { "Admin", "password456" },
       { "abcd", "ghfgh" }
    };
     return data;
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("In Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In After Class");
	  
  }

}
