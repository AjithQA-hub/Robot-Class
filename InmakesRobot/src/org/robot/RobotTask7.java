package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotTask5 {
	
	public static void main(String[] args) throws AWTException {
		
           System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesRobot\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		WebElement email = driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct '])[1]"));
		//email.sendKeys("inmakes");
		
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		
		for (int j = 0; j <2 ; j++) {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyPress(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		  
	}

}
