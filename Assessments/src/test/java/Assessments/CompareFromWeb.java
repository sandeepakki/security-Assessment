package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CompareFromWeb extends BaseClass{
	
	@Test
	public void testCompareFromWebReport() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Assessments = driver.findElement(By.xpath("//a[@href='/app/assessments/assessment']"));
		Assessments.click();
		try {
			WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'TEST - MISSING DATA ON SWITCH')]"));
			clTemp.click();
			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
		String main = driver.getWindowHandle();
		WebElement Completed = driver.findElement(By.xpath("//span[text()='Completed']"));
		Completed.click();
		Set<String> assess = driver.getWindowHandles();
		for(String s : assess) {
			driver.switchTo().window(s);
		}
		WebElement ReportOptions = driver.findElement(By.xpath("//span[text()='Report Options']"));
		ReportOptions.click();
		
		try {
			WebElement csvFile = driver.findElement(By.xpath("//button[contains(text(),'Export to CSV')]"));
			csvFile.click();
			SoftAssert Assert = new SoftAssert();
			Thread.sleep(2000);
			WebElement success = driver.findElement(By.tagName("h4"));
			Assert.assertTrue((success).getText()
					.contains("Failed to download report"));
			Thread.sleep(2000);	
		}
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		WebElement compare = driver.findElement(By.xpath("//button[text()='Compare']"));
		compare.click();
		WebElement COMPARE = driver.findElement(By.xpath("//button[@class='compare-toggle-btn btn btn-secondary']"));
		COMPARE.click();
		Thread.sleep(1000);
		WebElement Submit = driver.findElement(By.xpath("//button[text()='Compare']"));
		Submit.click();	
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Comparison report created"));
		Thread.sleep(2000);	
		WebElement ReportOptions1 = driver.findElement(By.xpath("//span[text()='Report Options']"));
		ReportOptions1.click();
		WebElement detailedReport = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
		detailedReport.click();
		Thread.sleep(15000);
		WebElement reportOptions1 = driver.findElement(By.xpath("//span[text()='Report Options']"));
		reportOptions1.click();
		WebElement executiveReport = driver.findElement(By.xpath("//button[text()=' Download Executive Report']"));
		executiveReport.click();
		WebElement Aristiun = driver.findElement(By.linkText("Aristiun"));
		Aristiun.click();
		
		
		
	}
}
