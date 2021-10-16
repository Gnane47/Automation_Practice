package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	public WebDriver driver;
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	@FindBy (xpath="//input[@type='Submit']")
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
	public WebElement getLogin()
	{
		return login;
	}
	
}
