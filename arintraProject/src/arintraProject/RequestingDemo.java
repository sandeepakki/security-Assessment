package arintraProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RequestingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://arintra.com/");
		WebElement Request = driver.findElement(By.xpath("//button[@class='Button__BaseButton-kFnpUo Button__ButtonPrimary-edMJcx Button__ButtonPrimarySmall-bKjkdu iGHgUb fSGnFW fuKyBz']"));
		Request.click();
		WebElement Name = driver.findElement(By.id("Name"));
		Name.sendKeys("Sandeep Kumar");
		WebElement Org = driver.findElement(By.id("Organisation"));
		Org.sendKeys("Assystant");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("sandeepakki03@gmail.com");
		WebElement selectCountry = driver.findElement(By.xpath("//select[@class='PhoneInputCountrySelect']"));
		Select s = new Select(selectCountry);
		s.selectByVisibleText("India");
		WebElement Phone = driver.findElement(By.id("Phone"));
		Phone.sendKeys("9502627001");
		WebElement Message = driver.findElement(By.id("Message"));
		Message.sendKeys("This is sample demo request");
		WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Schedule a demo')]"));
		submit.click();

	}
}
