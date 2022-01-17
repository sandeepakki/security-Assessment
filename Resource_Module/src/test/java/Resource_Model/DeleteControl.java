package Resource_Model;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteControl extends BaseClass{

	@Test
	public void testDeleteControl() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		// Single Resource delete
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.xpath("(//a[text()='Controls'])[2]"));
		controlsTab.click();
		WebElement clControl =driver.findElement(By.xpath("//span[text()='Control4']"));
		clControl.click();
		WebElement deleteControl = driver.findElement(By.xpath("//button[@class='custom-delete-button btn btn-outline-secondary btn-md']"));
		deleteControl.click();
		Thread.sleep(1000);
		WebElement cancel = driver.findElement(By.xpath("//button[text()='Cancel']"));
		cancel.click();
		Thread.sleep(1000);
		deleteControl.click();
		WebElement confirm = driver.findElement(By.xpath("//span[text()='Yes, Delete']"));
		confirm.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Control deleted"));
		Thread.sleep(3000);
	}
}
