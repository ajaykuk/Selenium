package generalprograms;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions1 {
  @Test
  public void method1() {
	  
	  Assert.assertEquals("Ajay", "Ajay");
	  Assert.assertTrue(true, "This is true");
	  }
  
  @DataProvider
  public Object testData1()
  {
	Object [][] data1 = new Object[2][2];
	data1[0][0] = "Test1";
	data1[0][1] = "Test2";
	data1[1][0] = "Test3";
	data1[1][1] = "Test4";
	return data1;
		  
  }
    
  @DataProvider
  public Object testData2()
  {
	Object [][] data2 = new Object[3][2];
	data2[0][0] = 1;
	data2[0][1] = 2;
	
	data2[1][0] = 3;
	data2[1][1] = 4;
	
	data2[2][0] = 5;
	data2[2][1] = 6;
	
	return data2;
	}
  
  @Test(dataProvider="testData1")
  public void testmethod1(Object s1, Object s2)
  
  {
	  System.out.println(s1+ " "+ s2);
  }
  
  
  @Test(dataProvider="testData2")
  public void testmethod2(Object s3, Object s4)
  
  {
	  System.out.println( s3 + " "+ s4 );
  }
  
  
  
  
}
