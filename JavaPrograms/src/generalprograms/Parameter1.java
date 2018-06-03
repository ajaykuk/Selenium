package generalprograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
  @Test
  @Parameters({"classmatesname"})
  public void f(@Optional("default")  String classmatesname) {
	  System.out.println(classmatesname);
	  
	  
  }
}
