package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {
	static WebDriver driver;
 By administration=By.xpath("/html/body/table[2]/tbody/tr/td/table[1]/tbody/tr/th");
 By logout=By.xpath(" /html/body/p/a");
	
 
 public void launch3()
	{
	System.setProperty("webdriver.chrome.driver","C:\\javaexamples\\Project_Taskmanager\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//System.out.println(driver.getTitle());
}
	public void open3()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}
	public void  admin()
	{
		driver.findElement(administration).click();
	}
	public void Logout()
	{
		driver.findElement(logout).click();
	}
}
