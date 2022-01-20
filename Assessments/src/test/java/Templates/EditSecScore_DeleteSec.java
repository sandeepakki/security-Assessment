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

public class EditSecScore_DeleteSec extends BaseClass {
	
	@Test
	public void testEditSectionScore() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/templates");
		try {
		WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Lorem Ipsum')]"));
		clTemp.click();
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		WebElement clEdit = driver.findElement(By.xpath("//img[@alt='Edit']"));
		clEdit.click();
			WebElement chName=	driver.findElement(By.name("name"));
		chName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Identify");
		WebElement clPassScore = driver.findElement(By.name("passing_score"));
		clPassScore.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"6");
		WebElement save = driver.findElement(By.xpath("//button[@class='btn-multiple-state flex-grow-1 mr-2  btn btn-primary btn-lg']"));
		save.click();
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(2000);
		WebElement clEdit2 = driver.findElement(By.xpath("//img[@alt='Edit']"));
		clEdit2.click();
		WebElement delete = driver.findElement(By.xpath("//button[@class='btn-multiple-state flex-grow-1 mr-2  btn btn-outline-danger btn-lg']"));
		delete.click();
		Thread.sleep(1000);
		WebElement success1 = driver.findElement(By.tagName("h4"));
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOf(success1));
		Assert.assertTrue((success1).getText()
				.contains("Success"));
		Thread.sleep(3000);
		
	}
}
