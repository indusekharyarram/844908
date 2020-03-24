package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtask {
	
	static WebDriver driver;
	
		public void launch3()
		{
		System.setProperty("webdriver.chrome.driver","C:\\javaexamples\\Project_Taskmanager\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
	}
		
		public void open1()
		{
			driver.get("http://examples.codecharge.com/TaskManager/Default.php");
		}
		/*By Username=By.name("login");
		By Password=By.name("password");
		By Login=By.name("DoLogin");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT0199\\eclipse-workspace\\1.finalProject_TaskManager_Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.get("http://examples.codecharge.com/TaskManager/Login.php?Logout=True");
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();*/
	

	public void click()
	{
	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a/img")).click();
		
	}
	public void  select()
	{
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[4]")).click();
	}
	public void  search()
	{
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input")).click();
	}
	
}
