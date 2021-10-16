package com.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class 
{
	public static WebDriver driver; 
	public static WebDriver getdriver(String type)
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (type.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void geturl(String url)
	{
		driver.get(url);
	}
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void login_details(WebElement element, String name)
	{
		element.sendKeys(name);	
	}
	public static void scroll(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();" , element);
	}
	public static void scroll2()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
	}
	public static void js(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();" , element);
	}
	public static void actions(WebElement element, String options)
	{
		Actions ac = new Actions(driver);
		if(options.equalsIgnoreCase("click"))
		{
			ac.click(element).build().perform();
		}		
	}
	
	public static void frames(WebElement element, String type)
	{
		if(type.equalsIgnoreCase("one"))
		{
			driver.switchTo().frame(element);
		}
		else if(type.equalsIgnoreCase("out"))
		{
			driver.switchTo().defaultContent();
		}
	}
	public static void framebyIndex(int index) 
	{
		driver.switchTo().frame(index);
	}
	public static void framebyString(String str) 
	{
		driver.switchTo().frame(str);
	}
	public static void frameout()
	{
		driver.switchTo().defaultContent();
	}
	public static void dropdown(WebElement element, String type, String value)
	{
		Select s = new Select(element);
		if(type.equalsIgnoreCase("byindex"))
		{
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);	
		}
		else if(type.equalsIgnoreCase("byvalue"))
		{
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("byvisibletext"))
		{
			s.selectByVisibleText(value);
		}
	}
	public static void robot() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void robot_e() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void thread(int value) throws Exception 
	{
		Thread.sleep(value);
	}
	public static void implicit(int value)
	{
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}
	public static void scrsh(String filename) throws IOException
	{		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\screenshots\\snap" 
				+ filename + ".png"));	
		
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File from = sc.getScreenshotAs(OutputType.FILE);
//		File to = new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\screenshots");
//		FileUtils.copyFile(from, to);
	}
	
}
