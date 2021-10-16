package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_confirm 
{
	public static WebDriver driver;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement address;
	
	public Address_confirm(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress()
	{
		return address;
	}
}
