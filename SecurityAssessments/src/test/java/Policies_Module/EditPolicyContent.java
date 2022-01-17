package Policies_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class EditPolicyContent extends BaseClass{

	@Test
	public void testEditPolicyContent() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Policies Tab link
		WebElement Policy = driver.findElement(By.xpath("//a[@data-flag='admin-policies']"));
		Policy.click();
		// navigate to policies 
		driver.navigate().to("https://sa.aristiun.com/app/policies/policies-content");
		WebElement policyCon = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		policyCon.click();
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		WebElement polContent = driver.findElement(By.name("name"));
		polContent.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Serem");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		description.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum is a dummy text..!edited");
		WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
		update.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Policy Content Updated"));
		Thread.sleep(3000);
		WebElement editedCon = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		editedCon.click();
		Boolean Displayed = driver.findElement(By.xpath("//div[text()='Lorem Serem']")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
	}
}
