package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner_Class_adactin extends Base_Class_adactin
{
	public static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		driver = getdriver("chrome");
		geturl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		input(username, "Gnane4797"); 
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		input(password, "J5Q6KE");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		click(login);
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		dropdown(location, "byindex", "1");
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		dropdown(hotels, "byvalue", "Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		dropdown(room, "byvisibletext", "Double");
		WebElement count = driver.findElement(By.xpath("//select[@id='room_nos']"));
		dropdown(count, "byvalue", "2");
		WebElement in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		clear(in); input(in, "16/10/2021");
		WebElement out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		clear(out); input(out, "20/10/2021");
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		dropdown(adult, "byvalue", "4");
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		dropdown(child, "byindex", "1");
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']")); 
		click(search);
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		click(radio);
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		click(cont);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		input(firstname, "Gnane");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		input(lastname, "N S");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		input(address, "Chennai - 600 021");
		WebElement num = driver.findElement(By.xpath("//input[@name='cc_num']"));
		input(num, "1234567812345678");
		WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		dropdown(type, "byvisibletext", "VISA");
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		dropdown(month, "byindex", "6");
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		dropdown(year, "byindex", "6");
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		input(cvv, "123");
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		click(booknow);
		implicit(20);
		WebElement Itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']")); 
		scroll(Itinerary); thread(1500);
		click(Itinerary);
		scrsh("1");
		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		scroll(logout); thread(1500);
		click(logout);
		WebElement click_here = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
		click(click_here);
	}
}
