package org.runner;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class Runner extends Base_Class
{
	public static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		driver = getdriver("firefox");
		geturl("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		click(signin);
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		login_details(username, "gnani9448@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		login_details(password, "Gnane@47");
		WebElement go1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		click(go1);
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		click(dress);
//		scrolldown(null);
		WebElement evening = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[3]"));
		click(evening);
		WebElement view = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		click(view);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frames(frame, "one"); Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//i[@class='icon-plus']")); 
		for(int i=1; i<=9; i++)
		{
			click(add);
		}
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		actions(size, "click");
		robot(); robot(); robot_e(); thread(1000);
		WebElement color = driver.findElement(By.xpath("//a[@name='Pink']"));
		actions(color, "click"); thread(1000);
		driver.findElement(By.name("Submit")).click(); thread(1000);
		frames(frame, "out"); thread(1000);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		scroll(proceed); click(proceed); 
		
		scrsh("1");
		WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(checkout); 
		scrsh("2");
		WebElement checkout1 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		click(checkout1);
		
		
		WebElement terms = driver.findElement(By.xpath("//input[@name='cgv']"));
		click(terms); 
		scrsh("3");
		WebElement checkout2 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		click(checkout2);
		
		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		click(pay); 
		scrsh("4");
		WebElement checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(checkout3);
		scrsh("5");
		
		WebElement payment = driver.findElement(By.xpath("//span[text() = ' Payment']"));
		scroll(payment);
		scrsh("6");
		thread(2500);
		
//		-----purchasing 2nd product
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
		click(logo);
		WebElement TS = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		click(TS);
		WebElement dress1 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		click(dress1);
		WebElement f2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frames(f2, "one");
		Thread.sleep(1000);
		WebElement inc = driver.findElement(By.xpath("//i[@class='icon-plus']")); 
		for(int i=1; i<=9; i++)
		{
			click(inc);
		}
		WebElement size2 = driver.findElement(By.xpath("//select[@name='group_1']"));
		actions(size2, "click");
		robot(); robot(); robot_e(); thread(1000);
		WebElement color1 = driver.findElement(By.xpath("//a[@title='Blue']"));
		actions(color1, "click"); thread(1000);
		driver.findElement(By.name("Submit")).click(); thread(1000);
		frames(frame, "out"); thread(1000);
		WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click(proceed1);
		
		scrsh("7");
		WebElement checkout4 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(checkout4);
		scrsh("8");
		WebElement checkout5 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		click(checkout5);
				
				
		WebElement terms1 = driver.findElement(By.xpath("//input[@name='cgv']"));
		click(terms1);
		scrsh("9");
		WebElement checkout6 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		click(checkout6);
				
		WebElement pay1 = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		click(pay1);
		scrsh("10");
		WebElement checkout7 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(checkout7);
		scrsh("11");
				
		WebElement payment1 = driver.findElement(By.xpath("//span[text() = ' Payment']"));
		scroll(payment1);
		scrsh("12");
		thread(2500);

		
	}
}
