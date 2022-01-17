package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class filterRisks extends BaseClass {
	
	@Test
	public void testFilterRisks() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Risks Tab link
		WebElement RiskTab = driver.findElement(By.xpath("//a[@data-flag='admin-risks']"));
		RiskTab.click();
		WebElement clLiklihood = driver.findElement(By.xpath("//div[@class='react-select __indicators css-1wy0on6']"));
		clLiklihood.click();
		WebElement slLiklihood = driver.findElement(By.xpath("//div[text()='Low']"));
		slLiklihood.click();
		WebElement clImpact = driver.findElement(By.xpath("(//div[@class='react-select __indicators css-1wy0on6'])[2]"));
		clImpact.click();
		WebElement slImpact = driver.findElement(By.xpath("//div[text()='Critical']"));
		slImpact.click();
		WebElement clRating = driver.findElement(By.xpath("(//div[@class='react-select __indicators css-1wy0on6'])[3]"));
		clRating.click();
		WebElement slRating = driver.findElement(By.xpath("//div[text()='Critical']"));
		slRating.click();
		WebElement clType = driver.findElement(By.xpath("(//div[@class='react-select __indicators css-1wy0on6'])[3]"));
		clType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='Register Risk']"));
		slType.click();
		WebElement filter = driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm']"));
		filter.click();
		Thread.sleep(1000);		
	}
}
