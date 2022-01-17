package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReAssignUser extends BaseClass {
	
	@Test
	public void testReAssignReviewer() throws InterruptedException {
		
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
		WebElement ReassignUser = driver.findElement(By.xpath("//button[contains(text(),'Re-Assign User')]"));
		ReassignUser.click();
		WebElement close = driver.findElement(By.xpath("//button[text()='Cancel']"));
		close.click();
		WebElement ReportOptions1 = driver.findElement(By.xpath("//span[text()='Report Options']"));
		ReportOptions1.click();
		WebElement ReassignUser1 = driver.findElement(By.xpath("//button[contains(text(),'Re-Assign User')]"));
		ReassignUser1.click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		dropdown.click();
		WebElement user = driver.findElement(By.xpath("//div[text()='Sandeep Akki']"));
		user.click();
		WebElement message = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		message.sendKeys("This is test user");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary btn-lg']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Invitation Sent"));
		Thread.sleep(2000);	
		
		
		
		
		
	}
}
