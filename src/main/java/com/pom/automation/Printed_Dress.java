package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress 
{	
	public static WebDriver driver;
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement printed;
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement quick;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quantity;
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	@FindBy(xpath="//a[@name='Pink']")
	private WebElement color;
	@FindBy(name="Submit")
	private WebElement addto;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	public Printed_Dress(WebDriver driver2) 
	{
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPrinted() 
	{
		return printed;	
	}
	public WebElement getQuick() 
	{
		return quick;
	}
	public WebElement getQuantity() 
	{
		return quantity;
	}
	public WebElement getSize() 
	{
		return size;
	}
	public WebElement getColor() 
	{
		return color;
	}
	public WebElement getAddto()
	{
		return addto;
	}
	public WebElement getProceed()
	{
		return proceed;		
	}
}	
