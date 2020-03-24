package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelUtility.ExcelData;

public class login {

	static WebDriver driver;
	By Administration= By.xpath("/html/body/table/tbody/tr[2]/td[3]/a/img");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver","C:\\javaexamples\\Project_Taskmanager\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//System.out.println(driver.getTitle());
	}
	public void open()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
		driver.findElement(Administration).click();
	
	}
	public void Username_Password(int i) throws InterruptedException, IOException
	
	{
		ExcelData c=new ExcelData();
		driver.findElement(Username).sendKeys(c.Username(i));
		driver.findElement(Password).sendKeys(c.Password(i));
	
		driver.close();
	}
		
	public void click()
	{
	/*	driver.findElement(Login).click();
		driver.close();*/
	}
}
