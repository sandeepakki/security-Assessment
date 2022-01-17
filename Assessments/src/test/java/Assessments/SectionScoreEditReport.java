package Assessments;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SectionScoreEditReport extends BaseClass {
	
	@Test
	public void testEditSectionScorefromReport() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/assessment");
		SoftAssert Assert = new SoftAssert();
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
		List<WebElement> sectionScores = driver.findElements(By.xpath("//h4[contains(text(),'Section Score')]/span"));
		System.out.println(sectionScores.size());
		for(WebElement e : sectionScores) {
		String s = e.getText();
		System.out.println(s);
		}
		WebElement EditScore = driver.findElement(By.xpath("(//h5[text()='Edit score'])[1]"));
		EditScore.click();
		WebElement override = driver.findElement(By.xpath("//input[@name='sections[0].section_user_overriden_score_per_5']"));
		override.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"3");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement EditScore1 = driver.findElement(By.xpath("(//h5[text()='Edit score'])[2]"));
		EditScore1.click();
		WebElement override1 = driver.findElement(By.xpath("//input[@name='sections[1].section_user_overriden_score_per_5']"));
		override1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"3");
		WebElement cancel = driver.findElement(By.xpath("//button[@class='custom-cancel-btn btn btn-secondary']"));
		cancel.click();
		driver.switchTo().window(main);
	}
}
