package Assessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditDate extends BaseClass {
	
	@Test
	public void testDateofAssessment() throws InterruptedException {
		
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
		WebElement rc_menu = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		rc_menu.click();
		WebElement Date = driver.findElement(By.xpath("//li[text()='Edit applicable date']"));
		Date.click();
		WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		WebElement rc_menu1 = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		rc_menu1.click();
		WebElement Date1 = driver.findElement(By.xpath("//li[text()='Edit applicable date']"));
		Date1.click();
		WebElement slDate = driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']"));
		slDate.click();
		Thread.sleep(1000);
		WebElement NextMonth = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
		NextMonth.click();
		Thread.sleep(1000);
		WebElement PreviousMonth = driver.findElement(By.xpath("//button[@aria-label='Previous Month']"));
		PreviousMonth.click();
		PreviousMonth.click();
		WebElement actualDate = driver.findElement(By.xpath("//div[text()='20']"));
		actualDate.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);
		
		
		
		
	}

}
