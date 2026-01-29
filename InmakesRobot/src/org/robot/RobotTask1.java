package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotTask1 {
	
	public static void main(String[] args) throws AWTException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesRobot\\Drivers\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
			Actions a=new Actions(driver);
			
			WebElement FaceBook = driver.findElement(By.id("email"));
			FaceBook.sendKeys("Ajith");
			
			a.doubleClick(FaceBook).perform();
			a.contextClick(FaceBook).perform();
			
			Robot r=new Robot();
			
			for (int i = 0; i < 2; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				WebElement PassWord = driver.findElement(By.name("pass"));
				a.contextClick(PassWord).perform();
				

				for (int j = 0; j <4 ; j++) 
				{
					
	                   r.keyPress(KeyEvent.VK_DOWN);
	                   r.keyPress(KeyEvent.VK_DOWN);
				}
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);	
			
	}

}}
