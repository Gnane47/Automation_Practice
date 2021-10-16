package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page 
{
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement signin;
	public Main_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSignin() 
	{
		return signin;
	}
}
