package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary 
{
	public static WebDriver driver;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout;
	
	public Summary(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout() 
	{
		return checkout;
		
	}
}