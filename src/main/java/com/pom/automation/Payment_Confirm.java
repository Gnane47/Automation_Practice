package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Confirm 
{
	public static WebDriver driver;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement pay_con;
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement logo;
	
	public Payment_Confirm(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPay_con()
	{
		return pay_con;
	}
	public WebElement getLogo()
	{
		return logo;
	}
}
