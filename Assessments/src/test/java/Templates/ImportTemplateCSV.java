package Templates;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImportTemplateCSV extends BaseClass {
	
	@Test
	public void testImportTemplateCSV() throws InterruptedException {
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
		WebElement Import = driver.findElement(By.xpath("//button[contains(text(),'Import')]"));
		Import.click();
		WebElement close = driver.findElement(By.xpath("//div[@class='_close-modal touch-pointer']"));
		close.click();
		Import.click();
		WebElement DownloadSample = driver.findElement(By.xpath("//span[@class='download-link touch-pointer']"));
		DownloadSample.click();
		WebElement uploadCSV = driver.findElement(By.name("file_upload"));
		uploadCSV.sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Passing.csv");
		WebElement Upload = driver.findElement(By.xpath("//span[text()='Upload']"));
		Upload.click();
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(3000);
	}
}
