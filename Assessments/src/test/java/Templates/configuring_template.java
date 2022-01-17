package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class configuring_template extends BaseClass {
	
	@Test
	public void testConfigure() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Templates = driver.findElement(By.linkText("Templates"));
		Templates.click();
		try {
		WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Lorem Ipsum')]"));
		clTemp.click();
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		WebElement configure = driver.findElement(By.xpath("//button[text()='Configure']"));
		configure.click();
		WebElement tempName = driver.findElement(By.name("name"));
		tempName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum-Test");
		WebElement clAssessType = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[1]"));
		clAssessType.click();
		WebElement slAssessmentType = driver.findElement(By.xpath("//div[contains(text(),'Internal Assessment')]"));
		slAssessmentType.click();
		WebElement clScorePatt = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[3]"));
		clScorePatt.click();
		WebElement slScoringPattern = driver.findElement(By.xpath("//div[text()='Sum']"));
		slScoringPattern.click();
		WebElement changeState = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[4]"));
		changeState.click();
		WebElement slState = driver.findElement(By.xpath("//div[text()='Under Review']"));
		slState.click();
		WebElement update = driver.findElement(By.xpath("//span[text()='Update']"));
		update.click();
//		WebElement Cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
//		Cancel.click();
		Thread.sleep(2000);
		try {
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Template Updated"));
		Thread.sleep(3000);
		}
		catch(NoSuchElementException e) {
			e.getStackTrace();
		}
		
	}
}
