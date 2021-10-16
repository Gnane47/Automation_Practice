package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class Pom_Runner_automation extends Base_Class 
{
	public static WebDriver driver = Base_Class.getdriver("chrome");
	public static Main_Page mp = new Main_Page(driver);
	public static Login_Page lp = new Login_Page(driver);
	public static Dresses d = new Dresses(driver);
	public static Printed_Dress pd = new Printed_Dress(driver);
	public static Summary s = new Summary(driver);
	public static Address_confirm addc = new Address_confirm(driver); 
	public static Shipping sh = new Shipping(driver);
	public static Payment p = new Payment(driver);
	public static Payment_Confirm pc = new Payment_Confirm(driver);
	public static Tshirts ts = new Tshirts(driver);
	public static Tshirt_purchase tsp = new Tshirt_purchase(driver);
	public static Summary2 s2 = new Summary2(driver);
	public static Address_confirm2 addc2 = new Address_confirm2(driver);
	public static Shipping2 sh2 = new Shipping2(driver);
	public static Payment2 p2 = new Payment2(driver);
	public static Payment_Confirm2 pc2 = new Payment_Confirm2(driver);
	
	public static void main(String[] args) throws Exception 
	{
		geturl("http://automationpractice.com/index.php");
		click(mp.getSignin());
		login_details(lp.getUsername(), "gnani9448@gmail.com");
		login_details(lp.getPassword(), "Gnane@47");
		click(lp.getlogin());
		click(d.getDresses()); click(d.getEvening());
		click(pd.getPrinted());
		js(pd.getQuick()); thread(2000);
		framebyIndex(0); thread(2000);
		for(int i=0; i<=9;i++)
		{
			click(pd.getQuantity()); 
		}
		dropdown(pd.getSize(), "byindex", "1");
		click(pd.getColor());
		click(pd.getAddto());
		frameout(); thread(2000);
		click(pd.getProceed());
		click(s.getCheckout());
		click(addc.getAddress());
		click(sh.getCheckbox()); click(sh.getProceed());
		click(p.getPay());
		click(pc.getPay_con()); click(pc.getLogo());
	
		//  2nd product purchasing
		
		click(ts.getTshirts());
		click(tsp.getTshirt());
		js(tsp.getQuick()); thread(2000);
		framebyIndex(0); thread(2000);
		for(int i=0;i<=8;i++)
		{
			click(tsp.getQuantity());
		}
		dropdown(tsp.getSize(), "byindex", "2");
		click(tsp.getColor());
		click(tsp.getAddto());
		frameout(); thread(2000);
		click(tsp.getProceed());
		click(s2.getCheckout());
		click(addc2.getAddress());
		click(sh2.getCheckbox()); click(sh2.getProceed());
		click(p2.getPay());
		click(pc2.getPay_con());
		scroll(pc2.getBackto()); thread(3000);
		click(pc2.getOrders());
		scroll(pc2.getTracking());
	}
}
