package Policies_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class PolicyContent extends BaseClass {
	
	@Test
	public void testAddContent() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Policies Tab link
		WebElement Policy = driver.findElement(By.xpath("//a[@data-flag='admin-policies']"));
		Policy.click();
		// navigate to policies 
		driver.navigate().to("https://sa.aristiun.com/app/policies/policies-content");
		WebElement Add = driver.findElement(By.xpath("//button[@class='top-right-button mr-1 btn btn-primary btn-lg']"));
		Add.click();
		Thread.sleep(1000);
		WebElement close = driver.findElement(By.xpath("//div[@class='close-section touch-pointer']"));
		close.click();
		Thread.sleep(1000);
		Add.click();
		WebElement Name = driver.findElement(By.name("name"));
		Name.sendKeys("Lorem Ipsum");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		description.sendKeys("Lorem ipsum is a dummy text..!");
		WebElement create = driver.findElement(By.xpath("//button[@type='submit']"));
		create.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New Policy Content Added"));
		Thread.sleep(3000);
		
		
	}

}
