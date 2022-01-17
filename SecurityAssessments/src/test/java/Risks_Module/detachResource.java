package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class detachResource extends BaseClass {

	@Test
	public void testDetachResourceFromRisk() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement RiskTab = driver.findElement(By.xpath("//a[@data-flag='admin-risks']"));
		RiskTab.click();
		// Edit Risk
		WebElement risk = driver.findElement(By.xpath("//span[contains(text(),'Risk !9')]"));
		risk.click();
		//Remove Resource
		WebElement edit = driver.findElement(By.xpath("//button[@class='mx-2 btn btn-secondary']"));
		edit.click();
		Thread.sleep(1000);
		WebElement resClear = driver.findElement(By.xpath("(//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer'])[3]"));
		resClear.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Risk Updated"));
		Thread.sleep(3000);
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("Company X");
		WebElement filter = driver.findElement(By.xpath("//button[text()='Search']"));
		filter.click();
		WebElement resource = driver.findElement(By.xpath("(//span[text()='Company X'])[2]"));
		resource.click();
		WebElement viewSecurityStats = driver.findElement(By.xpath("//button[text()='View Security Status']"));
		viewSecurityStats.click();
		WebElement ActiveRisks = driver.findElement(By.linkText("ACTIVE RISKS"));
		ActiveRisks.click();
		Thread.sleep(2000);
		WebElement RiskHistory = driver.findElement(By.linkText("RISK HISTORY"));
		RiskHistory.click();
		Thread.sleep(2000);
		Boolean Displayed = driver.findElement(By.xpath("//div[text()='Risk !9']")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
		WebElement close =  driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		
		
	}
}
