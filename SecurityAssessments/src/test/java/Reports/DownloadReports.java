package Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class DownloadReports extends BaseClass {
	
	@Test
	public void testDownloadingReports() throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Standards Tab link
		WebElement Reports = driver.findElement(By.xpath("//a[@data-flag='admin-reports']"));
		Reports.click();
		WebElement comparison_reports = driver.findElement(By.linkText("Comparison reports"));
		comparison_reports.click();
		WebElement menuBtn = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		menuBtn.click();
		WebElement  detailedReport = driver.findElement(By.xpath("//li[text()='Download Detailed Report']"));
		detailedReport.click();
		Thread.sleep(5000);
		WebElement menuBtn1 = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		menuBtn1.click();
		WebElement executiveReport = driver.findElement(By.xpath("//li[text()='Download Executive Report']"));
		executiveReport.click();
		Thread.sleep(5000);
	}

}
