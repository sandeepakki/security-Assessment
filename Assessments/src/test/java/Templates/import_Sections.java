package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class import_Sections extends BaseClass {
	
	@Test
	public void testImportSections() throws InterruptedException {
		
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
		WebElement importToggle = driver.findElement(By.xpath("//button[@type='button' and @class='dropdown-toggle-split dropdown-toggle-split-btn mb-3 dropdown-toggle btn btn-outline-secondary btn-lg']"));
		importToggle.click();
		WebElement impSections = driver.findElement(By.xpath("//button[text()='Import Section']"));
		impSections.click();
		Thread.sleep(1000);
		WebElement cancel = driver.findElement(By.xpath("//img[@alt='Close']"));
		cancel.click();
		Thread.sleep(1000);
		WebElement importToggle1 = driver.findElement(By.xpath("//button[@type='button' and @class='dropdown-toggle-split dropdown-toggle-split-btn mb-3 dropdown-toggle btn btn-outline-secondary btn-lg']"));
		importToggle1.click();
		WebElement impSections1 = driver.findElement(By.xpath("//button[text()='Import Section']"));
		impSections1.click();
		WebElement clDropdown = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		clDropdown.click();
		WebElement chooseTemp = driver.findElement(By.xpath("//div[text()='CSA - Cloud Security Controls assessment (CCM) - Test']"));
		chooseTemp.click();
		WebElement clDropdown2 = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[2]"));
		clDropdown2.click();
		WebElement chooseSection = driver.findElement(By.xpath("//div[text()='Interoperability and Portability - IPY']"));
		chooseSection.click();
		Thread.sleep(1000);
		WebElement importBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
		importBtn.click();
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(3000);		
	}
}
