package Assessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FilteringAssessments extends BaseClass{

	@Test
	public void testFilterAssessment() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement AllResponses = driver.findElement(By.linkText("All responses"));
		AllResponses.click();
		//Filtering Pending Assessments
		WebElement searchAssessment = driver.findElement(By.id("search"));
		searchAssessment.sendKeys("NIST"+Keys.TAB+"Pending"+Keys.TAB);
		WebElement button = driver.findElement(By.xpath("//button[text()='Filter']"));
		button.click();
		Thread.sleep(5000);
		//Filtering Completed Assessments
		WebElement reset = driver.findElement(By.xpath("//button[@type='reset']"));
		reset.click();
		Thread.sleep(5000);
		WebElement searchAssessment1 = driver.findElement(By.id("search"));
		searchAssessment1.sendKeys("Ransomware"+Keys.TAB+"Completed"+Keys.TAB);
		WebElement button1 = driver.findElement(By.xpath("//button[text()='Filter']"));
		button1.click();
		Thread.sleep(5000);
	}
}
