package com.pages;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;








public class print {

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
	public void open2()
	{
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a/img")).click();
	}

	public void print() throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\javaexamples\\Project_Taskmanager\\screenshot\\print1.jpg"));	
	}
}
