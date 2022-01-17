package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignReviewer extends BaseClass {
	@Test
	public void testAssignReviewer() throws InterruptedException {
		
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
		WebElement AssignReviewer = driver.findElement(By.xpath("//button[text()=' Assign Reviewer']"));
		AssignReviewer.click();
		WebElement clearOld = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
		clearOld.click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		dropdown.click();
		WebElement addReviewer = driver.findElement(By.xpath("//div[text()='Sandeep Akki']"));
		addReviewer.click();
		WebElement Add = driver.findElement(By.xpath("//button[@type = 'submit']"));
		Add.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Reviewer assigned"));
		Thread.sleep(2000);	
		WebElement Aristiun = driver.findElement(By.linkText("Aristiun"));
		Aristiun.click();
	}
}
