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

public class DuplicateTemplate extends BaseClass {
	
	@Test
	public void testDuplicateTemplate() throws InterruptedException {
		
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
		 WebElement duplicate = driver.findElement(By.xpath("//button[text()='Duplicate Template']"));
		 duplicate.click();
		 WebElement Name = driver.findElement(By.name("name"));
		 Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Duplicated CSA");
		 WebElement AssessType = driver.findElement(By.xpath("//div[@class='react-select__value-container css-8sv6as']"));
		 AssessType.click();
		 WebElement Internal = driver.findElement(By.xpath("//div[text()='Internal Assessment']"));
		 Internal.click();
		 WebElement About = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		 About.sendKeys("This is test template...!");
//		 WebElement removeSec1 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='2520']"));
//		 removeSec1.click();
		 WebElement create = driver.findElement(By.xpath("//button[@type='submit']"));
		 create.click();
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
