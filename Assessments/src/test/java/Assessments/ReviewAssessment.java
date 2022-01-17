package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReviewAssessment extends BaseClass{
	
	@Test
	public void testReviewAssessment() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement reviews = driver.findElement(By.xpath("(//a[text()='Pending'])[2]"));
		reviews.click();
		String main = driver.getWindowHandle();
		WebElement assessment = driver.findElement(By.xpath("//div[text()='CSA - Test'][1]"));
		assessment.click();
		Set<String> assess = driver.getWindowHandles();
		for(String s : assess) {
			driver.switchTo().window(s);
		}
		WebElement start = driver.findElement(By.xpath("//button[text()='Review Assessment']"));
		start.click();
			//section 1
		WebElement response = driver.findElement(By.xpath("(//label[text()='Response']/..//div[@class='react-select__control css-yk16xz-control'])[23]"));
		response.click();
		WebElement comment = driver.findElement(By.xpath("//div[text()='Partially approved with comments']"));
		comment.click();
		WebElement Next1 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next1.click();
		Thread.sleep(2000);
		//Section 2
			WebElement Next2 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next2.click();
			Thread.sleep(2000);
		//sections 3
			WebElement Next3 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next3.click();
			Thread.sleep(2000);
		//sections 4
			WebElement Next4 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next4.click();
			Thread.sleep(2000);
		//sections 5
			WebElement Next5 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next5.click();
			Thread.sleep(2000);
		//sections 6
			WebElement Next6 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next6.click();
			Thread.sleep(2000);
	   //sections 7
			WebElement Next7 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next7.click();
			Thread.sleep(2000);
		//sections 8
			WebElement Next8 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next8.click();
			Thread.sleep(2000);
		//sections 9
			WebElement Next9 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next9.click();
			Thread.sleep(2000);
		//sections 10	
			WebElement Next10 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next10.click();
			Thread.sleep(2000);
		//sections 11
			WebElement Next11 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next11.click();
			Thread.sleep(2000);
		//sections 12
			WebElement Next12 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next12.click();
			Thread.sleep(2000);
		//sections 13
			WebElement Next13 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next13.click();
			Thread.sleep(2000);
		//sections 14
			WebElement Next14 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next14.click();
			Thread.sleep(2000);
		//sections 15
			WebElement Next15 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next15.click();
			Thread.sleep(2000);
		//sections 16
			WebElement Next16 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next16.click();
			Thread.sleep(2000);
		//sections 17	
			WebElement Next17 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next17.click();
			Thread.sleep(2000);
			
			WebElement response2 = driver.findElement(By.xpath("//label[text()='Response']/..//div[@class='react-select__control css-yk16xz-control']"));
			response2.click();
			WebElement comment2 = driver.findElement(By.xpath("//div[text()='Partially approved with comments']"));
			comment2.click();
			WebElement additionalComments = driver.findElement(By.name("reviewer_comment"));
			additionalComments.sendKeys("Partially approved with comments");
			WebElement Next18 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next18.click();
			Thread.sleep(5000);
			// view report
						WebElement report = driver.findElement(By.xpath("//button[text()='View Report']"));
						report.click();
						Thread.sleep(2000);
		
	}
}
