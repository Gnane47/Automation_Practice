package org.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_adactin 
{
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/");
		
		boolean selected = driver.findElement(By.xpath("//a[text()='New User Register Here']")).isSelected(); System.out.println(selected);
		boolean displayed = driver.findElement(By.xpath("//a[text()='New User Register Here']")).isDisplayed(); System.out.println(displayed);
		
//		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Gnane4797");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcd@1234");
//		driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("Abcd@1234");
//		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Gnanesh");
//		driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys("testingpurpose9317@gmail.com");
//		driver.findElement(By.xpath("//input[@id='tnc_box']")).click();
//		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gnane4797");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("J5Q6KE");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s1 = new Select(location); s1.selectByValue("Brisbane"); Thread.sleep(1000);
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(hotels); s2.selectByVisibleText("Hotel Creek"); Thread.sleep(1000);	
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s3 = new Select(room); s3.selectByValue("Deluxe"); Thread.sleep(1000);	
		WebElement count = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s4 = new Select(count); s4.selectByVisibleText("2 - Two"); Thread.sleep(1000);	
		WebElement in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		in.clear(); in.sendKeys("20/10/2021"); Thread.sleep(1000);	
		WebElement out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		out.clear(); out.sendKeys("21/10/2021"); Thread.sleep(1000);	
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s5 = new Select(adult); s5.selectByValue("4"); Thread.sleep(1000);
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s6 = new Select(child); s6.selectByVisibleText("1 - One"); 
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Gnane");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("NS");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567812345678");
		WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s7 = new Select(type); s7.selectByValue("AMEX");
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s8 = new Select(month); s8.selectByValue("4");
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s9 = new Select(year); s9.selectByValue("2021");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
//		boolean logout = driver.findElement(By.xpath("//input[@name='logout']")).isSelected(); System.out.println(logout);
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		
	}
}
