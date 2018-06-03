package com.lessonwork.LessonTwo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class test {
	@Test
	public void testDemo() throws AWTException, InterruptedException {
		//引用firefoxprofile类
		FirefoxProfile firefoxProfile = new FirefoxProfile(); 
		//设置火狐的默认下载文件夹，0表示桌面，1表示我的下载，2表示自定义文件夹
		firefoxProfile.setPreference("browser.download.folderList",2);
		//设置自定义文件夹位置
		firefoxProfile.setPreference("browser.download.dir","D:\\1 software");
        WebDriver driver = new FirefoxDriver(firefoxProfile);
        
		driver.get("http://rj.baidu.com/soft/detail/13478.html?ald");//打开下载notepad++页面
		driver.findElement(By.xpath(".//*[@id='softAbs']/a[2]")).click();//点击下载
		
		Robot rb = new Robot();//利用Robot类进行键盘模拟操作，点击确认
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);	
	}
}
