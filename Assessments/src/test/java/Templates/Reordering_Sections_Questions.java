package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reordering_Sections_Questions extends BaseClass {
	
	@Test
	public void testReordering() throws InterruptedException {
		//Reordering of Sections inside CSA template
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Templates = driver.findElement(By.linkText("Templates"));
		Templates.click();
		WebElement csa = driver.findElement(By.xpath("//div[contains(text(),'CSA - Cloud Security Controls')]"));
		csa.click();
		WebElement Reorder = driver.findElement(By.xpath("//button[text()='Reorder']"));
		Thread.sleep(5000);
		Reorder.click();
		Thread.sleep(2000);
		WebElement cursor1 = driver.findElement(By.xpath("(//button[@class='icon-button ml-1 view-button no-border section-handle move_btn btn btn-outline-theme-3'])[17]"));
		WebElement cursor2 = driver.findElement(By.xpath("(//button[@class='icon-button ml-1 view-button no-border section-handle move_btn btn btn-outline-theme-3'])[1]"));
		Actions a = new Actions(driver);
		a.clickAndHold(cursor1).dragAndDrop(cursor1, cursor2).build().perform();
		Thread.sleep(3000);
		WebElement Save = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Save).click().perform();
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(3000);
		
		//Reorder Questions
		WebElement Reorder1 = driver.findElement(By.xpath("//button[text()='Reorder']"));
		Thread.sleep(5000);
		Reorder1.click();
		Thread.sleep(5000);
		WebElement ReorderQns = driver.findElement(By.linkText("Reorder Questions"));
		ReorderQns.click();
		Thread.sleep(10000);
		WebElement cursor3 = driver.findElement(By.xpath("(//button[@class='icon-button ml-1 view-button no-border question-handle move_btn btn btn-outline-theme-3'])[260]"));
		WebElement cursor4 = driver.findElement(By.xpath("(//button[@class='icon-button ml-1 view-button no-border question-handle move_btn btn btn-outline-theme-3'])[1]"));
		Actions a2 = new Actions(driver);
		a2.clickAndHold(cursor3).dragAndDrop(cursor3, cursor4).build().perform();
		Thread.sleep(5000);
		WebElement Save1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Actions a3 = new Actions(driver);
		a3.moveToElement(Save1).click().perform();
		WebElement success1 = driver.findElement(By.tagName("h4"));
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOf(success1));
		Assert.assertTrue((success1).getText()
				.contains("Success"));
		Thread.sleep(5000);
	}
}
