package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditAssessment extends BaseClass {
	
	@Test
	public void testEditAssessment() {
		
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
		String main = driver.getWindowHandle();
		WebElement Edit = driver.findElement(By.xpath("//button[text()='Edit']"));
		Edit.click();
		Set<String> assess = driver.getWindowHandles();
		for(String s : assess) {
			driver.switchTo().window(s);
		}
		WebElement start = driver.findElement(By.xpath("//button[text()='Start Assessment']"));
		start.click();
		WebElement Next1 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next1.click();
		WebElement Next2 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next2.click();
		WebElement Next3 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next3.click();
		WebElement Next4 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next4.click();
		WebElement Next5 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next5.click();
		WebElement Next6 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next6.click();
		driver.switchTo().window(main);
		
	}

}
