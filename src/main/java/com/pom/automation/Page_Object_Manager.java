package com.pom.automation;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager 
{
	public 	WebDriver driver;
	private Main_Page mp;
	private Login_Page lp;
	private Dresses ds;
	private Printed_Dress pd;
	private Summary sum;
	private Address_confirm add;
	private Shipping sh;
	private Payment p;
	private Payment_Confirm pc;
	private Tshirts ts;
	private Tshirt_purchase tsp;
	private Summary sum2;
	private Address_confirm2 add2;
	private Shipping2 sh2;
	private Payment2 p2;
	private Payment_Confirm2 pc2;
	
	public Page_Object_Manager(WebDriver driver2)
	{
		this.driver=driver2;		
	}
	
	public Main_Page getInstancemp() 
	{
		mp = new Main_Page(driver);
		return mp;		
	}
	public Login_Page getInstancelp()
	{
		lp = new Login_Page(driver);
		return lp;
	}
	public Dresses getInstanceds()
	{
		ds = new Dresses(driver);
		return ds;
	}
	public Printed_Dress getInstancepd()
	{
		pd = new Printed_Dress(driver);
		return pd;
	}
	public Summary getInstancesum()
	{
		sum= new Summary(driver);
		return sum;	
	}
	public Address_confirm getInstanceadd()
	{
		add=new Address_confirm(driver);
		return add;
	}
	public Shipping getInstancesh()
	{
		sh = new Shipping(driver);
		return sh;
	}
	public Payment getInstancep()
	{
		p = new Payment(driver);
		return p;
	}
	public Payment_Confirm getInstancepc()
	{
		pc = new Payment_Confirm(driver);
		return pc;
	}
	public Tshirts getInstancets()
	{
		ts = new Tshirts(driver);
		return ts;
	}
	public Tshirt_purchase getInstancetsp()
	{
		tsp = new Tshirt_purchase(driver);
		return tsp;
	}
	public Summary getInstancesum2()
	{
		sum2 = new Summary(driver);
		return sum2;
	}
	public Address_confirm2 getInstanceadd2()
	{
		add2 = new Address_confirm2(driver);
		return add2;
	}
	public Shipping2 getInstancesh2()
	{
		sh2 = new Shipping2(driver);
		return sh2;
	}
	public Payment2 getInstancep2()
	{
		p2 = new Payment2(driver);
		return p2;
	}
	public Payment_Confirm2 getInstancepc2()
	{
		pc2 = new Payment_Confirm2(driver);
		return pc2;
	}
}
