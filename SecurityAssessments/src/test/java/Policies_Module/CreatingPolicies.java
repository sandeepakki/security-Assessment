package Policies_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class CreatingPolicies extends BaseClass {
	
	@Test
	public void testCreatePolicy() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Policies Tab link
		WebElement Policy = driver.findElement(By.xpath("//a[@data-flag='admin-policies']"));
		Policy.click();
		// navigate to policies 
		driver.navigate().to("https://sa.aristiun.com/app/policies/policies");
		WebElement create = driver.findElement(By.xpath("//button[@class='top-right-button mr-1 btn btn-primary btn-lg']"));
		create.click();
		WebElement policyName = driver.findElement(By.name("name"));
		policyName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum..");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		description.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum is a dummy text..!");
		WebElement file = driver.findElement(By.name("attachment"));
		file.sendKeys("C:\\Users\\sande\\eclipse-workspace\\Assystant\\SecurityAssessments\\dataFiles\\Detailed Report.pdf");
		WebElement objective = driver.findElement(By.xpath("//div[@class='react-select__control css-nrsw37-control']"));
		objective.click();
		WebElement content = driver.findElement(By.xpath("//div[text()='Content 1']"));
		content.click();
		Thread.sleep(1000);
		WebElement controls = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[2]"));
		controls.click();
		WebElement choice = driver.findElement(By.xpath("//div[text()='Security Awareness']"));
		choice.click();
		WebElement Risks = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[3]"));
		Risks.click();
		WebElement choice1 = driver.findElement(By.xpath("//div[text()='Lack of a firewall'][1]"));
		choice1.click();
		WebElement Add = driver.findElement(By.xpath("//button[@type='submit']"));
		Add.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New Policy Added"));
		Thread.sleep(3000);
	}
}
