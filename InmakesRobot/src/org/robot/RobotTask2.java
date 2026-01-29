package org.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotTask2 {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesRobot\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			driver.manage().window().maximize();
			
			Actions a=new Actions(driver);
			WebElement Google= driver.findElement(By.xpath("//div[@class='RNNXgb']"));
			//Google.sendKeys("Inmakes_Infotech");
			
			a.keyDown(Keys.SHIFT).sendKeys(Google,"Inmakes").keyUp(Keys.SHIFT).perform();
			
			a.doubleClick(Google).perform();
			//a.contextClick(Google).perform();
			
	}

}
