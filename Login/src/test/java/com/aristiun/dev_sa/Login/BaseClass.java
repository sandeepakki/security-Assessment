package com.aristiun.dev_sa.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

public static WebDriver driver;

@BeforeTest
public void OpenBrowser() {
	String browser ="Chrome";
	if(browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
}
@AfterTest
public void CloseBrowser() {
	driver.close();
	driver.quit();
}
}
