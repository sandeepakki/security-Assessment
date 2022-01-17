package Assessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReassignResource extends BaseClass {
	
	@Test
	public void testReassignResource() throws InterruptedException {
		
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
		WebElement ReRes = driver.findElement(By.xpath("//li[text()='Reassign Resource']"));
		ReRes.click();
		WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
//		WebElement removeOld = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
//		removeOld.click();
		rc_menu.click();
		ReRes.click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__dropdown-indicator css-tlfecz-indicatorContainer']"));
		dropdown.click();
		WebElement res = driver.findElement(By.xpath("//div[text()='Scott Hughes']"));
		res.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type ='submit']"));
		submit.click();
		Thread.sleep(1000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);
		
		
	}
}
