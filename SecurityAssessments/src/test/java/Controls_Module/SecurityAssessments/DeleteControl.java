package Controls_Module.SecurityAssessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteControl extends BaseClass {
	
	@Test
	public void testControlDeletion() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		WebElement ControlTab = driver.findElement(By.xpath("//a[@data-flag='admin-controls']"));
		ControlTab.click();
		// Click controls module
		driver.navigate().to("https://sa.aristiun.com/app/controls/controls");
		// Edit Control
		WebElement clControl =driver.findElement(By.xpath("//span[text()='Test']"));
		clControl.click();
		WebElement deleteControl = driver.findElement(By.xpath("//button[@class='custom-delete-button btn btn-outline-secondary btn-md']"));
		deleteControl.click();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		Thread.sleep(1000);
		cancel.click();
		deleteControl.click();
		Thread.sleep(1000);
		WebElement Delete = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary btn-lg']"));
		Delete.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Deleting Controls Success"));
		Thread.sleep(3000);
	}
}
