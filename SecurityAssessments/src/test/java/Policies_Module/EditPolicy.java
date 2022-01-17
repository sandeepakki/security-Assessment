package Policies_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class EditPolicy extends BaseClass {
	
	@Test
	public void testEditPolicy() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Policies Tab link
		WebElement Policy = driver.findElement(By.xpath("//a[@data-flag='admin-policies']"));
		Policy.click();
		// navigate to policies 
		driver.navigate().to("https://sa.aristiun.com/app/policies/policies");
		WebElement policy = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		policy.click();
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		WebElement policyName = driver.findElement(By.name("name"));
		policyName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Serem");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		description.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum is a dummy text..!edited");
		WebElement file = driver.findElement(By.name("attachment"));
		file.sendKeys("C:\\Users\\sande\\eclipse-workspace\\Assystant\\SecurityAssessments\\dataFiles\\detailed.docx");
		WebElement clearContent = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
		clearContent.click();
		WebElement objective = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		objective.click();
		WebElement content = driver.findElement(By.xpath("//div[text()='Content 2']"));
		content.click();
		Thread.sleep(1000);
		WebElement clearControl = driver.findElement(By.xpath("//label[text()='Controls']/..//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
		clearControl.click();
		WebElement controls = driver.findElement(By.xpath("//label[text()='Controls']/..//div[@class='react-select__indicator react-select__dropdown-indicator css-tlfecz-indicatorContainer']"));
		controls.click();
		Thread.sleep(1000);
		WebElement choice = driver.findElement(By.xpath("//div[text()='Application Inventory']"));
		choice.click();
		Thread.sleep(2000);
		WebElement clearRisks = driver.findElement(By.xpath("//label[text()='Risks']/..//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
		clearRisks .click();
		WebElement Risks = driver.findElement(By.xpath("//label[text()='Risks']/..//div[@class='react-select__indicator react-select__dropdown-indicator css-tlfecz-indicatorContainer']"));
		Risks.click();
		WebElement choice1 = driver.findElement(By.xpath("//div[text()='Lack of a firewall'][1]"));
		choice1.click();
		WebElement Add = driver.findElement(By.xpath("//button[@type='submit']"));
		Add.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Policy Updated"));
		Thread.sleep(3000);
		WebElement editedPol = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		editedPol.click();
		Boolean Displayed = driver.findElement(By.linkText("detailed.docx")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
		
	}
}
