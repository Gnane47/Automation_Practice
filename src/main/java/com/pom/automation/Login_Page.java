package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{	
	public WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement login;
	
	public Login_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() 
	{
		return username;
	}
	public WebElement getPassword() 
	{
		return password;
	}
	public WebElement getlogin() 
	{
		return login;
	}
	
	
	
	
	
	
	
	
	
	
}
