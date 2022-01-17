package Assessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyResponse extends BaseClass {
	
	@Test
	public void testCopyResponse() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Assessments = driver.findElement(By.xpath("//a[@href='/app/assessments/assessment']"));
		Assessments.click();
		try {
			WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Test')]"));
			clTemp.click();
			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
		try {
			
			WebElement copy = driver.findElement(By.xpath("//img[@alt='Copy']"));
			copy.click();
			Thread.sleep(2000);
			WebElement success = driver.findElement(By.tagName("h4"));
			Assert.assertTrue((success).getText()
					.contains("Success"));
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.getMessage();
			System.out.println("The Invitation for an assessment is in pending state");
		}
	}
}
