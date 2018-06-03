package generalprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotations3 {
  @Test
  public void f() {
	  
	  System.out.println(" In 1st  Test ");
  }
	  
	  @Test
	  public void f2() {
		  
		  System.out.println(" In 2nd Test ");
  }
	  
	  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" Before Method ");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" after Method ");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println(" before Class ");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After Class ");
  }

  @BeforeTest
  public void beforeTest() {
  
	  System.out.println(" Before Test ");
  }
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println(" after Test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println(" Before Suite ");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println(" After Suite ");
  }

}
