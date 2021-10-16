package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses 
{
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	@FindBy(xpath="(//a[@title='Evening Dresses'])[3]")
	private WebElement evening;
	
	public Dresses(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDresses() 
	{
		return dresses;
	}
	public WebElement getEvening() 
	{
		return evening;
	}
	
	
		
	
	
	
}
