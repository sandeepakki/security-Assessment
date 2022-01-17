package Threats_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class detachResource extends BaseClass {

	@Test
	public void testDetachResource() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Threats Tab link
		WebElement Threat = driver.findElement(By.xpath("//a[@data-flag='admin-threats']"));
		Actions a = new Actions(driver);
		a.moveToElement(Threat).click().build().perform();
		//Edit Threat
		WebElement lorem = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		lorem.click();
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		Thread.sleep(1000);
		WebElement detach = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
		detach.click();
		WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
		update.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Threat Updated"));
		Thread.sleep(3000);
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("Corporate");
		WebElement filter = driver.findElement(By.xpath("//button[text()='Search']"));
		filter.click();
		WebElement resource = driver.findElement(By.xpath("//span[text()='Corporate']"));
		resource.click();
		WebElement viewSecurityStats = driver.findElement(By.xpath("//button[text()='View Security Status']"));
		viewSecurityStats.click();
		WebElement Threats = driver.findElement(By.linkText("THREAT HISTORY"));
		Threats.click();
		Thread.sleep(2000);
		Boolean Displayed = driver.findElement(By.xpath("//div[text()='Lorem Serem']")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
		WebElement close =  driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		Thread.sleep(1000);
		
	}
}
