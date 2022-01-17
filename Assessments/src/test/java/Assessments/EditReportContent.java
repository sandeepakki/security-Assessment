package Assessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditReportContent extends BaseClass{
	
	@Test
	public void testEditReportContent() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/assessment");
		try {
			WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'TEST')]"));
			clTemp.click();
			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
		WebElement rc_menu = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		rc_menu.click();
		WebElement content = driver.findElement(By.xpath("//li[text()='Edit report content']"));
		content.click();
		WebElement hideRadar = driver.findElement(By.xpath("//span[@class='ShowRadarChart']"));
		hideRadar.click();
		WebElement hideLine = driver.findElement(By.xpath("//span[@class='ShowLineChart']"));
		hideLine.click();
		WebElement hideSummary = driver.findElement(By.xpath("//span[@class='ShowDetailedSummary']"));
		hideSummary.click();
		WebElement hideNxtSteps = driver.findElement(By.xpath("//span[@class='ShowDetailedNextSteps']"));
		hideNxtSteps.click();
		WebElement hideHeatMap = driver.findElement(By.xpath("//span[@class='ShowNistChart']"));	
		hideHeatMap.click();
		WebElement hideSuperSections = driver.findElement(By.xpath("//span[@class='ShowSuperSection']"));
		hideSuperSections.click();
		WebElement section1 = driver.findElement(By.xpath("//span[contains(text(),'STA')]"));
		section1.click();
		WebElement section2 = driver.findElement(By.xpath("//span[contains(text(),'TVM')]"));
		section2.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);	
	}
}
