package com.lessonwork.LessonTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenIE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\plugin\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			WebDriver driver = new FirefoxDriver();
		
			driver.manage().window().maximize();  
	        
	        driver.get("https://www.baidu.com");  
	        
	        
	        Thread.sleep(2);  
	       WebElement searchbar = driver.findElement(By.xpath(".//*[@id='kw']"));
	       driver.findElement(By.xpath(".//*[@id='su']"));
	        searchbar.sendKeys("helloworld");
	        System.out.println(driver.getTitle());
	        //driver.findElement(By.cssSelector("//body")).sendKeys(Keys.TAB+"t");
	         String s1 = driver.getWindowHandle();
	         System.out.println(s1);
	        JavascriptExecutor jsr = (JavascriptExecutor) driver;
	        jsr.executeScript("window.open('https://www.jd.com','newwindow');");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getWindowHandles());
	         driver.switchTo().window("newwindow");
	         Thread.sleep(1000);
	        System.out.println(driver.getTitle());
	         
	    
	        
	        Thread.sleep(3000);
		driver.quit();
	}

	
}
