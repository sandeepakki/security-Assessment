package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class deleteRisk extends BaseClass {
	
	@Test
	public void testDeleteRisk() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Risks Tab link
		WebElement RiskTab = driver.findElement(By.xpath("//a[@data-flag='admin-risks']"));
		RiskTab.click();
		// Delete Risk
		WebElement risk = driver.findElement(By.xpath("//span[contains(text(),'Risk !9')]"));
		risk.click();
		WebElement delete = driver.findElement(By.xpath("//button[text()='Delete']"));
		delete.click();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		cancel.click();
		Thread.sleep(1000);
		WebElement delete1 = driver.findElement(By.xpath("//button[text()='Delete']"));
		delete1.click();
		WebElement yes = driver.findElement(By.xpath("//button[@type = 'submit']"));
		yes.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Deleting Risk Success"));
		Thread.sleep(3000);
	}
}
