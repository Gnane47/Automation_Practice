package org.adactin;

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
import org.openqa.selenium.support.ui.Select;

public class Base_Class_adactin 
{
	public static WebDriver driver;
	public static WebDriver getdriver(String type)
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\ChromeDriver.exe");
			driver = new ChromeDriver();
		}
		if (type.equalsIgnoreCase("firefox")) 
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
	public static void input(WebElement element, String name)
	{
		element.sendKeys(name);
	}
	public static void click(WebElement element)
	{
		element.click();
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
	public static void clear(WebElement element)
	{
		element.clear();
	}
	public static void scroll(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();" , element);
	}
	public static void implicit(int value)
	{
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}
	public static void thread (int value) throws Exception
	{
		Thread.sleep(value);
	}
	public static void scrsh(String filename) throws IOException
	{		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Snaps\\ad" 
				+ filename + ".png"));
	}
		
}
