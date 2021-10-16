package org.Maven_Tasks;

import java.io.File;
import java.util.concurrent.TimeUnit;	
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sign_in 
{
		public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			signin.click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)");
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("gnani9448@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
			boolean enabled = driver.findElement(By.xpath("//input[@id='passwd']")).isEnabled(); System.out.println(enabled);
			password.sendKeys("Gnane@47");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement go = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
			go.click();
			WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));		
			dress.click();

			Actions ac = new Actions(driver);
//			ac.moveToElement(dress); 
			
			WebElement evening = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[3]"));
			evening.click();
			WebElement view = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
			ac.click(view).perform();
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(frame);
			WebElement add = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			int i=1;
			while(i<=9)
			{
				add.click(); i++;
			}					
			WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
			Select s1 = new Select(size); Thread.sleep(3000);
			s1.selectByIndex(2); Thread.sleep(1000);
			WebElement color = driver.findElement(By.xpath("//a[@name='Pink']"));
			color.click(); 
//			boolean selected = driver.findElement(By.xpath("//a[@name='Pink']")).isSelected(); System.out.println(selected);
//			boolean displayed = driver.findElement(By.xpath("//a[@name='Pink']")).isDisplayed(); System.out.println(displayed);
			Thread.sleep(1000);
			driver.findElement(By.name("Submit")).click(); Thread.sleep(1000);
			driver.switchTo().defaultContent();
			WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			proceed.click();
			
			jse.executeScript("window.scrollBy(0,300)");
			TakesScreenshot sc = (TakesScreenshot) driver;
			File from = sc.getScreenshotAs(OutputType.FILE);
			File to = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\snapshot.png");
			FileUtils.copyFile(from, to);
			
			driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
			jse.executeScript("window.scrollBy(0,700)");
			TakesScreenshot sc1 = (TakesScreenshot) driver;
			File a1 = sc1.getScreenshotAs(OutputType.FILE);
			File a2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today1.png");
			FileUtils.copyFile(a1, a2);
			driver.findElement(By.xpath("//button[@name='processAddress']")).click(); Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='cgv']")).click();
			jse.executeScript("window.scrollBy(0,300)");
			TakesScreenshot sc2 = (TakesScreenshot) driver;
			File b1 = sc2.getScreenshotAs(OutputType.FILE);
			File b2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today2.png");
			FileUtils.copyFile(b1, b2); Thread.sleep(1000);

			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
			jse.executeScript("window.scrollBy(0,800)");
			TakesScreenshot sc3 = (TakesScreenshot) driver;
			File c1 = sc3.getScreenshotAs(OutputType.FILE);
			File c2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today3.png");
			FileUtils.copyFile(c1, c2); Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
			jse.executeScript("window.scrollBy(0,350)");
			TakesScreenshot sc4 = (TakesScreenshot) driver;
			File d1 = sc4.getScreenshotAs(OutputType.FILE);
			File d2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today4.png");
			FileUtils.copyFile(d1, d2); Thread.sleep(1000);
			
			driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
			
			
			driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();

			jse.executeScript("window.scrollBy(0,400)");
			
			// purchasing 2nd product
			
			WebElement dress1 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
			Actions acts = new Actions(driver);
			acts.click(dress1).perform();
			WebElement f2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(f2);
			WebElement inc = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			int a=1;
			while(a<=9)
			{
				inc.click(); a++;
			}
			WebElement size2 = driver.findElement(By.xpath("//select[@name='group_1']"));
			Select sel = new Select(size2); Thread.sleep(3000);
			sel.selectByValue("3"); Thread.sleep(1000);
			WebElement color1 = driver.findElement(By.xpath("//a[@title='Blue']"));
			color1.click(); Thread.sleep(2000);				
			driver.findElement(By.xpath("//button[@name='Submit']")).click();
			driver.switchTo().defaultContent();
			WebElement second = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			second.click();
			jse.executeScript("window.scrollBy(0,300)");
			TakesScreenshot sc5 = (TakesScreenshot) driver;
			File e1 = sc5.getScreenshotAs(OutputType.FILE);
			File e2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today5.png");
			FileUtils.copyFile(e1, e2); 
			driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click(); Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@name='processAddress']")).click();
			jse.executeScript("window.scrollBy(0,300)");
			TakesScreenshot sc6 = (TakesScreenshot) driver;
			File f1 = sc6.getScreenshotAs(OutputType.FILE);
			File ff2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today6.png");
			FileUtils.copyFile(f1, ff2); Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='cgv']")).click();
			jse.executeScript("window.scrollBy(0,300)");
			TakesScreenshot sc7 = (TakesScreenshot) driver;
			File g1 = sc7.getScreenshotAs(OutputType.FILE);
			File g2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today7.png");
			FileUtils.copyFile(g1, g2); Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
			jse.executeScript("window.scrollBy(0,800)");
			TakesScreenshot sc8 = (TakesScreenshot) driver;
			File h1 = sc7.getScreenshotAs(OutputType.FILE);
			File h2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today8.png");
			FileUtils.copyFile(h1, h2); Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
			jse.executeScript("window.scrollBy(0,350)");
			TakesScreenshot sc9 = (TakesScreenshot) driver;
			File i1 = sc9.getScreenshotAs(OutputType.FILE);
			File i2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today9.png");
			FileUtils.copyFile(i1, i2); Thread.sleep(1000);
			
			driver.findElement(By.linkText("My orders")).click();
			jse.executeScript("window.scrollBy(0,350)");
			TakesScreenshot sc10 = (TakesScreenshot) driver;
			File j1 = sc10.getScreenshotAs(OutputType.FILE);
			File j2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\today90.png");
			FileUtils.copyFile(j1, j2); Thread.sleep(1000);
			
		}	
}

