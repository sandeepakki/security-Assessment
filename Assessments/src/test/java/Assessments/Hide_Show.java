package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hide_Show extends BaseClass{
	
	@Test(priority=1)
	public void testReportContentHide() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/assessment");
		SoftAssert Assert = new SoftAssert();
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
		
		WebElement HideRadar = driver.findElement(By.xpath("(//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		HideRadar.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		
		WebElement HideLine = driver.findElement(By.xpath("(//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		HideLine.click();
		Thread.sleep(2000);
		WebElement success1 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success1).getText()
				.contains("Success"));
		
		WebElement HideCapability = driver.findElement(By.xpath("(//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		HideCapability.click();
		Thread.sleep(2000);
		WebElement success2 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success2).getText()
				.contains("Success"));
		
		WebElement HideSummary = driver.findElement(By.xpath("(//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		HideSummary.click();
		Thread.sleep(2000);
		WebElement success3 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success3).getText()
				.contains("Success"));
		
		WebElement HideNxtSteps = driver.findElement(By.xpath("//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer']"));
		HideNxtSteps.click();
		Thread.sleep(2000);
		WebElement success4 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success4).getText()
				.contains("Success"));
		//Responses
		WebElement HideSection1 = driver.findElement(By.xpath("//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer align-self-end mb-3']"));
		HideSection1.click();
		Thread.sleep(2000);
		WebElement success5 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success5).getText()
				.contains("Success"));
		Thread.sleep(5000);
		WebElement ReportOptions = driver.findElement(By.xpath("//span[text()='Report Options']"));
		ReportOptions.click();
		WebElement detailedReport = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
		detailedReport.click();
		Thread.sleep(5000);
		driver.switchTo().window(main);	
	}
	@Test(priority=2)
	public void testReportContentShow() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/assessment");
		SoftAssert Assert = new SoftAssert();
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
		
		WebElement ShowRadar = driver.findElement(By.xpath("(//div[@class='section-show-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		ShowRadar.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement ShowLine = driver.findElement(By.xpath("(//div[@class='section-show-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		ShowLine.click();
		Thread.sleep(2000);
		WebElement success1 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success1).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement ShowSummary = driver.findElement(By.xpath("(//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer'])[1]"));
		ShowSummary.click();
		Thread.sleep(2000);
		WebElement success3 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success3).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement ShowNxtSteps = driver.findElement(By.xpath("//div[@class='section-hide-status-wrapper d-flex align-items-center touch-pointer']"));
		ShowNxtSteps.click();
		Thread.sleep(2000);
		WebElement success4 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success4).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement ShowSection = driver.findElement(By.xpath("//div[@class='section-show-status-wrapper d-flex align-items-center touch-pointer align-self-end mb-3']"));
		ShowSection.click();
		Thread.sleep(2000);
		WebElement success5 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success5).getText()
				.contains("Success"));
		Thread.sleep(2000);
		driver.switchTo().window(main);
	}
}
