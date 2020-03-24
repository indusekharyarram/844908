package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filldatails {
static WebDriver driver;
	
	public void abcd() {
		By Username=By.name("login");
		By Password=By.name("password");
		By Login=By.name("DoLogin");
		System.setProperty("webdriver.chrome.driver","C:\\javaexamples\\Project_Taskmanager\\Driver\\chromedriver.exe                                             ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
		driver.get("http://examples.codecharge.com/TaskManager/Login.php?Logout=True");
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
	public void click()
	{
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a/img")).click();
	}
	public void  select()
	{
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[4]")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input")).click();
	}
	public void fill()
	{
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[11]/td[1]/a")).click();
		By Task=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
		driver.findElement(Task).sendKeys("TaskManagement");
		By Description=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/textarea");
		driver.findElement(Description).sendKeys("TaskManagement Website");
		By Project=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[3]");
		driver.findElement(Project).click();
		By Priority=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]");
		driver.findElement(Priority).click();
		By Status=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[3]");
		driver.findElement(Status).click();
		By Type=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select/option[2]");
		driver.findElement(Type).click();
		By AssignedTo=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[7]/td/select/option[16]");
		driver.findElement(AssignedTo).click();
			
	}
	public void Send()
	{
		By Add=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[10]/td/input[1]");
		driver.findElement(Add).click();
		
	}
	
}
