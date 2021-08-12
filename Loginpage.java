package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Loginpage {

	//@Test
	public  static void initialization() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Campaign\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://dash.vinmail.io/autologin");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Usertest1@fineecho.com");
	driver.findElement(By.xpath("//*[@id=\"input-5\"]")).sendKeys("Usertest1#");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/button")).click();
	
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[@id=\"dropdownCreateCampaign__BV_button_\"]")).click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Abc@pvt.ltd");
	 
	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Demo Test");
	 driver.findElement(By.xpath("//*[@id=\"sname\"]")).sendKeys("TestUser");
	 
	 
	// WebElement drp =driver.findElement(By.xpath("//*[@id=\\\"groupFromId\\\"]/div[1]/div/div[2]"));
	// Select dropdown=new Select(drp);
	 //dropdown.selectByIndex();
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"groupFromId\"]/div[1]/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"groupFromId\"]/div[1]/div/div[1]/span/text()")).click();
	 
	
	 
	 
	 driver.findElement(By.xpath("//a[@id=\"btnChooseEmailTemplate\"]")).click();
	 
	
	}
	
	
	//@Test(priority=1)
	public void loginmailercloudaccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Campaign\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dash.vinmail.io/autologin");
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Usertest1@fineecho.com");
		driver.findElement(By.xpath("//*[@id=\"input-5\"]")).sendKeys("Usertest1#");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Audience\"]/div/ul/li[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id=\"dropdownCreateList__BV_button_\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"subName\"]")).sendKeys("Test User");		
		driver.findElement(By.xpath("//*[@id=\"btnConfirmAction\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"contactIndividual\"]/a/div/div/span")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"btnConfirmAction\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subName\"]")).sendKeys("Usertest@fineecho.com");
		driver.findElement(By.xpath("//*[@id=\"subFirstName\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"subLastName\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"subLastName\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"subPhone\"]")).sendKeys("9988776655");
		//driver.findElement(By.xpath("//*[@id=\"groupCountry\"]/div/div/div[1]")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"btnConfirmAction\"]")).click();
		
		driver.close();
	}
	
	
	//@Test(priority=2)
	public void mailercloudaccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Campaign\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dash.vinmail.io/autologin");
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Usertest1@fineecho.com");
		driver.findElement(By.xpath("//*[@id=\"input-5\"]")).sendKeys("Usertest1#");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Audience\"]/div/ul/li[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id=\"dropdownCreateList__BV_button_\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"subName\"]")).sendKeys("Test User1");		
		driver.findElement(By.xpath("//*[@id=\"btnConfirmAction\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"contactCopyPaste\"]/a/div/div/span")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id=\"btnConfirmAction\"]")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"textareaCopyPaste\"]")).sendKeys("test user");
		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"btnConfirmAction\"]")).click();
		
		driver.close();
	}
	
	
	
	
	@Test(priority=3)
	public void mailercloudaccountcontacts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Campaign\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dash.vinmail.io/autologin ");
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Usertest1@fineecho.com");
		driver.findElement(By.xpath("//*[@id=\"input-5\"]")).sendKeys("Usertest1#");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Campaigns\"]/div/ul/li[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"dropdownCreateCampaign__BV_button_\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Test User1");
		driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Demo application");
		driver.findElement(By.xpath("//*[@id=\"sname\"]")).sendKeys("NEW_user");
		
		
		
	}
	
	}


