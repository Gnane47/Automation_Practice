package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel 
{
	public WebDriver driver;
	@FindBy (xpath="//select[@id='location']")
	private WebElement location;
	
	public Search_Hotel(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation()
	{
		return location;
	}
	
}
