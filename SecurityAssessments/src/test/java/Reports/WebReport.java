package Reports;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class WebReport extends BaseClass {
	
	@Test
	public void testWebReport() throws InterruptedException {
	//   Click on Standards Tab link
			WebElement Reports = driver.findElement(By.xpath("//a[@data-flag='admin-reports']"));
			Reports.click();
			String main = driver.getWindowHandle();
			WebElement comparison_reports = driver.findElement(By.linkText("Comparison reports"));
			comparison_reports.click();
			Thread.sleep(1000);
			WebElement web = driver.findElement(By.xpath("//div[@class='align-self-center d-flex flex-column flex-md"+
			"-row justify-content-between min-width-zero align-items-md-center card-body']"));
			web.click();
			Set<String> assess = driver.getWindowHandles();
			for(String s : assess) {
				driver.switchTo().window(s);
			}
			WebElement ReportOptions = driver.findElement(By.xpath("//button[@title='Download Options']"));
			ReportOptions.click();
			WebElement CopyLink = driver.findElement(By.xpath("//button[text()='Copy Link']"));
			CopyLink.click();
			Thread.sleep(2000);	
			WebElement success = driver.findElement(By.tagName("h4"));
			Assert.assertTrue((success).getText()
					.contains("Link Copied"));
			Thread.sleep(3000);
			WebElement ReportOptions1 = driver.findElement(By.xpath("//button[@title='Download Options']"));
			ReportOptions1.click();
			WebElement DetailedReport = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
			DetailedReport.click();
			Thread.sleep(10000);
			WebElement ReportOptions2 = driver.findElement(By.xpath("//button[@title='Download Options']"));
			ReportOptions2.click();
			WebElement ExecutiveReport = driver.findElement(By.xpath("//button[text()=' Download Executive Report']"));
			ExecutiveReport.click();
			Thread.sleep(10000);
			driver.switchTo().window(main);
			
	}

}
