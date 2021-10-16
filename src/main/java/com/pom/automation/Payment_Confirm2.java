package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Confirm2 
{
	public static WebDriver driver;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement pay_con;
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement backto;
	@FindBy(xpath="//a[@title='My orders']")
	private WebElement orders;
	@FindBy(xpath="(//a[@class='color-myaccount'])[2]")
	private WebElement tracking;
	
	public Payment_Confirm2(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPay_con()
	{
		return pay_con;
	}
	public WebElement getBackto()
	{
		return backto;
	}
	public WebElement getOrders()
	{
		return orders;
	}
	public WebElement getTracking()
	{
		return tracking;
	}
}
