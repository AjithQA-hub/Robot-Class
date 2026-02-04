package org.rob;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotTask2 {
	
	public static void main(String[] args) throws AWTException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ajith\\eclipse-workspace\\RobotClass\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
			Actions a=new Actions(driver);
			
			Robot r=new Robot();
			
			WebElement email = driver.findElement(By.id("email"));
//			email.sendKeys("inmakes");
			
			a.keyDown(Keys.SHIFT).sendKeys(email,"Inmakes").keyUp(Keys.SHIFT).perform();
		    
			
			
			a.doubleClick(email).perform();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			
			r.keyPress(KeyEvent.VK_TAB); 
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			driver.close();
				
	}

}
