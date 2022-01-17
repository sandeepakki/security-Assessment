package Policies_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class delPolicyContent extends BaseClass {
	
@Test
public void testDeleteContent() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//   Click on Policies Tab link
	WebElement Policy = driver.findElement(By.xpath("//a[@data-flag='admin-policies']"));
	Policy.click();
	// navigate to policies 
	driver.navigate().to("https://sa.aristiun.com/app/policies/policies-content");
	WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	checkbox.click();
	WebElement toggle = driver.findElement(By.xpath("//button[@class='dropdown-toggle-split btn-lg dropdown-toggle btn btn-primary']"));
	toggle.click();
	WebElement delete= driver.findElement(By.xpath("//button[text()='Delete']"));
	delete.click();
	WebElement cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
	cancel.click();
	WebElement toggle1 = driver.findElement(By.xpath("//button[@class='dropdown-toggle-split btn-lg dropdown-toggle btn btn-primary']"));
	toggle1.click();
	WebElement delete1= driver.findElement(By.xpath("//button[text()='Delete']"));
	delete1.click();
	WebElement yes = driver.findElement(By.xpath("//button[@type = 'submit']"));
	yes.click();
	Thread.sleep(2000);	
	WebElement success = driver.findElement(By.tagName("h4"));
	Assert.assertTrue((success).getText()
			.contains("Selected Policies content are deleted"));
	Thread.sleep(3000);	
}
}
