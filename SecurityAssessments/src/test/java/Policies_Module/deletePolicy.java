package Policies_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class deletePolicy extends BaseClass {
	
	@Test
	public void testDeletePolicy() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Policies Tab link
		WebElement Policy = driver.findElement(By.xpath("//a[@data-flag='admin-policies']"));
		Policy.click();
		// navigate to policies 
		driver.navigate().to("https://sa.aristiun.com/app/policies/policies");
		WebElement policy = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		policy.click();
		WebElement delete = driver.findElement(By.xpath("//button[@class='policy-delete-button d-flex align-items-center btn btn-outline-secondary btn-md']"));
		delete.click();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		cancel.click();
		Thread.sleep(1000);
		WebElement delete1 = driver.findElement(By.xpath("//button[@class='policy-delete-button d-flex align-items-center btn btn-outline-secondary btn-md']"));
		delete1.click();
		WebElement yes = driver.findElement(By.xpath("//button[@type = 'submit']"));
		yes.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Deleted policy"));
		Thread.sleep(3000);
	}
}
