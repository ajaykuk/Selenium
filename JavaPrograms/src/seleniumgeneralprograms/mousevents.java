package seleniumgeneralprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mousevents {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver;
	 driver = new ChromeDriver();
	 
	 Actions action = new Actions(driver);
	 WebElement ele1 = driver.findElement(By.id("id"));
	 WebElement ele2 = driver.findElement(By.id("id"));
	 action.dragAndDrop(ele1,ele2);
	 action.moveToElement(ele1);
	 	 
	 
	 driver.switchTo().alert().accept();
	 driver.switchTo().alert().dismiss();
	 driver.switchTo().alert().sendKeys("arg0");
	 
	 
     Select sel1 = new Select(driver.findElement(By.xpath("xpathExpression")));
     
     sel1.getFirstSelectedOption();
     
	 /* how to execute javascript */
     
     
	
	 
	 
	 
	 
	 
	 
	 
	}

}
