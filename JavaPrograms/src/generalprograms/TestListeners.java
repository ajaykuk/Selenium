package generalprograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestListeners implements ITestListener{
  @Test
  public void f() {
  }

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Staring Test"+ result.getMethod());
	Reporter.log("Staring Test"+ result.getMethod());
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test success"+ result.getMethod());
	Reporter.log("Test success"+ result.getMethod());
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test failure"+ result.getMethod());
	Reporter.log("Test failure"+ result.getMethod());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Test skipped"+ result.getMethod());
	Reporter.log("Test skipped"+ result.getMethod());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("All Test started"+ context.getAllTestMethods());
	Reporter.log("All Test Finished"+ context.getAllTestMethods());
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("Test finished"+ context.getAllTestMethods());
	Reporter.log("Test finished"+ context.getAllTestMethods());
}
}
