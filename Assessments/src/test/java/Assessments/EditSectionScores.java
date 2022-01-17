package Assessments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditSectionScores extends BaseClass{
	
	@Test
	public void testEditSectionScore() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Assessments = driver.findElement(By.xpath("//a[@href='/app/assessments/assessment']"));
		Assessments.click();
		try {
			WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Report')]"));
			clTemp.click();
			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
		WebElement rc_menu = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		rc_menu.click();
		WebElement score = driver.findElement(By.xpath("//li[text()='Edit section scores']"));
		score.click();
		WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		WebElement rc_menu1 = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		rc_menu1.click();
		WebElement score1 = driver.findElement(By.xpath("//li[text()='Edit section scores']"));
		score1.click();
		List<WebElement> sections = driver.findElements(By.xpath("//div[@class='d-block mt-3']/input[@class='form-control field']"));
		for(WebElement e : sections) {
			e.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"4");
		}
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement rc_menu2 = driver.findElement(By.xpath("//button[@class='rc-menu-button']"));
		rc_menu2.click();
		WebElement score2 = driver.findElement(By.xpath("//li[text()='Edit section scores']"));
		score2.click();
		WebElement viewReport = driver.findElement(By.xpath("//button[text()='View in report']"));
		viewReport.click();
		List<WebElement> sections1 = driver.findElements(By.xpath("//h4[@class='edit-section-score']/span"));
		for(WebElement e : sections1) {
			System.out.println(e.getText());
		}
		WebElement aristiun = driver.findElement(By.xpath("//a[text()='Aristiun']"));
		aristiun.click();
		
	}
}
