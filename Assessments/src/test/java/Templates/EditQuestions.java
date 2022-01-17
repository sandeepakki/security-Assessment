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

public class EditQuestions extends BaseClass {
	
	@Test
	public void testEditQuestions() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/templates");
		 try {
			 WebElement CSA_Info = driver.findElement(By.xpath("(//div[text()='More Info'])[1]"));
			 CSA_Info.click();
		 }
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		 Thread.sleep(1000);
		WebElement editQns = driver.findElement(By.xpath("//button[@class='mr-2 btn btn-outline-primary btn-sm']"));
		editQns.click();
		WebElement Qns = driver.findElement(By.xpath("(//div[@class='d-flex flex-grow-1 min-width-zero'])[1]"));
		Qns.click();
		WebElement qns1 = driver.findElement(By.name("questions.[0].question"));
		qns1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"This is sample test to edit Question");
		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));
		save.click();
		 Thread.sleep(2000);
		 WebElement success = driver.findElement(By.tagName("h4"));
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(success));
			Assert.assertTrue((success).getText()
					.contains("Data updated successfully."));
			Thread.sleep(3000);
		
		
	}
}
