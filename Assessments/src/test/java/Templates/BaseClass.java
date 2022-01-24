package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
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
		WebElement UserAvatar = driver.findElement(By.xpath("//div[@class='navbar-right']"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(UserAvatar));
		UserAvatar.click();
		 WebElement logout=driver.findElement(By.xpath("//button[@type='button'][3]"));
		 logout.click();
	}

}
