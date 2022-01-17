package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchReport extends BaseClass{
	@Test
	public void testSwitchReport() throws InterruptedException {
		
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
		WebElement Switch = driver.findElement(By.xpath("//button[contains(text(),'Switch report template')]"));
		Switch.click();
		try {
			Boolean tick = driver.findElement(By.xpath("//span[text()='Detailed Report']/..//span[@class='bg-white d-flex justify-content-center align-content-center simple-icon-check text-primary']")).isSelected();
				WebElement singlePage = driver.findElement(By.xpath("//span[text()='Single Page Detailed Report']"));
				singlePage.click();
			}
	catch(Exception e) {
		Boolean tick = driver.findElement(By.xpath("//span[text()='Single Page Detailed Report']/..//span[@class='bg-white d-flex justify-content-center align-content-center simple-icon-check text-primary']")).isSelected();
		WebElement tick1 = driver.findElement(By.xpath("//span[text()='Detailed Report']"));
		tick1.click();
	}
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);	
		WebElement Aristiun = driver.findElement(By.linkText("Aristiun"));
		Aristiun.click();
		
		}	
	}

