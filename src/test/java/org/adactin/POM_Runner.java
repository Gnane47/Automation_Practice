package org.adactin;

import org.openqa.selenium.WebDriver;

public class POM_Runner extends Base_Class_adactin
{
	public static WebDriver driver = Base_Class_adactin.getdriver("firefox");
	public static Login_Page lp = new Login_Page(driver);
	public static Search_Hotel sh = new Search_Hotel(driver);
	public static void main(String[] args) 
	{
		geturl("http://adactinhotelapp.com/index.php");
		input(lp.getUsername(), "Gnane4797");
		input(lp.getPassword(), "J5Q6KE");
		click(lp.getLogin());
		dropdown(sh.getLocation(), "byindex", "2");
	}
}
