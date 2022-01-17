package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Comparison_Reports extends BaseClass{
	
	@Test
	public void testComparisonReports() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement AllResponses = driver.findElement(By.linkText("All responses"));
		AllResponses.click();
		WebElement searchAssessment1 = driver.findElement(By.id("search"));
		searchAssessment1.sendKeys(""+Keys.TAB+"Completed"+Keys.TAB);
		WebElement button1 = driver.findElement(By.xpath("//button[text()='Filter']"));
		button1.click();
		String main = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement compareBtn = driver.findElement(By.xpath("//button[text()='Compare'][1]"));
		compareBtn.click();
		Set<String> assess = driver.getWindowHandles();
		for(String s : assess) {
			driver.switchTo().window(s);
		}
		Thread.sleep(2000);
				WebElement searchAssessment2 = driver.findElement(By.id("search"));
				searchAssessment2.sendKeys(""+Keys.TAB+"Resource"+Keys.TAB);
				WebElement button2 = driver.findElement(By.xpath("//button[text()='Filter']"));
				button2.click();
				Thread.sleep(2000);
				WebElement COMPARE = driver.findElement(By.xpath("//button[@class='compare-toggle-btn btn btn-secondary']"));
				COMPARE.click();
				Thread.sleep(1000);
				WebElement Submit = driver.findElement(By.xpath("//button[text()='Compare']"));
				Submit.click();	
				Thread.sleep(2000);
				WebElement ReportOptions = driver.findElement(By.xpath("//span[text()='Report Options']"));
				ReportOptions.click();
				WebElement detailedReport = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
				detailedReport.click();
				Thread.sleep(15000);
				WebElement reportOptions1 = driver.findElement(By.xpath("//span[text()='Report Options']"));
				reportOptions1.click();
				WebElement executiveReport = driver.findElement(By.xpath("//button[text()=' Download Executive Report']"));
				executiveReport.click();
				
	}
}
