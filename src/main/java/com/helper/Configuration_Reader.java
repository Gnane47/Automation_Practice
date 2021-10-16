package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader 
{
	public static Properties p;
	public Configuration_Reader() throws Throwable 
	{
		File f = new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\src\\main\\java\\com\\configuration\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String geturl() throws Throwable 
	{
		String url = p.getProperty("url");
		return url;
	}
	public String getusername() throws Throwable 
	{
		String username = p.getProperty("username");
		return username;
	}
	public String getpassword() throws Throwable 
	{
		String password = p.getProperty("password");
		return password;
		
	}
}
