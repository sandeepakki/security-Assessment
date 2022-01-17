package Threats_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class deleteThreat extends BaseClass {
	@Test
	public void testDeleteThreat() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Threats Tab link
		WebElement Threat = driver.findElement(By.xpath("//a[@data-flag='admin-threats']"));
		Actions a = new Actions(driver);
		a.moveToElement(Threat).click().build().perform();
		//Edit Threat
		WebElement lorem = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		lorem.click();
		WebElement delete = driver.findElement(By.xpath("//button[@class='threat-delete-button d-flex align-items-center btn btn-outline-secondary btn-md']"));
		delete.click();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		cancel.click();
		Thread.sleep(2000);
		WebElement delete1 = driver.findElement(By.xpath("//button[@class='threat-delete-button d-flex align-items-center btn btn-outline-secondary btn-md']"));
		delete1.click();
		WebElement yes = driver.findElement(By.xpath("//button[@type='submit']"));
		yes.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Deleting Threat Success"));
		Thread.sleep(3000);
			
	}
}
