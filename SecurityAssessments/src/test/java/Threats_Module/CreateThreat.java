package Threats_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class CreateThreat extends BaseClass{

	@Test
	public void testCreateThreat() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Threats Tab link
		WebElement Threat = driver.findElement(By.xpath("//a[@data-flag='admin-threats']"));
		Actions a = new Actions(driver);
		a.moveToElement(Threat).click().build().perform();
		// create Threat
		WebElement create = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		create.click();
		WebElement type = driver.findElement(By.xpath("//div[@class='react-select custom-select__indicator react-select custom-select__dropdown-indicator css-tlfecz-indicatorContainer']"));
		type.click();
		WebElement lib = driver.findElement(By.xpath("//div[contains(text(),'Library Threat')]"));
		lib.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Lorem Ipsum");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		description.sendKeys("Lorem Ipsum is a dummy text....!");
		WebElement severity = driver.findElement(By.xpath("//div[@class=' css-1t445th-indicatorContainer']"));
		severity.click();
		WebElement Level = driver.findElement(By.xpath("//span[text()='Medium']"));
		Level.click();
		WebElement create1 = driver.findElement(By.xpath("//button[@type='submit']"));
		create1.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New threat added"));
		Thread.sleep(3000);
	}
}
