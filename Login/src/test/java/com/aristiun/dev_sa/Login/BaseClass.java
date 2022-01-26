package com.aristiun.dev_sa.Login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {
		String browser ="firefox";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://sa.aristiun.com/login"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		driver.quit();
	}
	
	@BeforeClass
	public void login() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement txtEmail =driver.findElement(By.name("email"));
		txtEmail.clear();
		txtEmail.sendKeys("saket@travelder.com");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.clear();
		txtPassword.sendKeys("dev_aristiun");
		WebElement Login = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
		Login.click();
}
	
	@AfterClass
	public void logout() {
			driver.close();
			driver.quit();
	}
}
