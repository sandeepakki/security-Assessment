package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class EditRisk extends BaseClass {
	
	@Test
	public void testEditRisk() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		WebElement RiskTab = driver.findElement(By.xpath("//a[@data-flag='admin-risks']"));
		RiskTab.click();
		// Edit Risk
		WebElement risk = driver.findElement(By.xpath("//span[contains(text(),'Risk !9')]"));
		risk.click();
		WebElement edit = driver.findElement(By.xpath("//button[@class='mx-2 btn btn-secondary']"));
		edit.click();
		Thread.sleep(1000);
		WebElement clearLib = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer']"));
		clearLib.click();
		WebElement type = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		type.click();
		WebElement reg = driver.findElement(By.xpath("//div[contains(text(),'Registry risk')]"));
		reg.click();
		WebElement impact = driver.findElement(By.xpath("//span[text()='Impact']/..//div[@class='flag_section']"));
		impact.click();
		WebElement rating1 = driver.findElement(By.xpath("//li[text()='Low']"));
		rating1.click();
		WebElement Liklihood = driver.findElement(By.xpath("//span[text()='Liklihood']/..//div[@class='flag_section']"));
		Liklihood.click();
		WebElement rating2 = driver.findElement(By.xpath("//li[text()='High']"));
		rating2.click();
		WebElement rating = driver.findElement(By.xpath("//span[text()='Rating']/..//div[@class='flag_section']"));
		rating.click();
		WebElement rating3 = driver.findElement(By.xpath("//li[text()='Medium']"));
		rating3.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"RISK10");
		WebElement desc = driver.findElement(By.xpath("//textarea[@name='description']"));
		desc.sendKeys("this is test risk created...!");
		WebElement polClear = driver.findElement(By.xpath("(//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer'])"));
		polClear.click();
		WebElement policy = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[2]"));
		policy.click();
		WebElement choice = driver.findElement(By.xpath("//div[text()='General Information Security Policy']"));
		choice.click();
		WebElement resources = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[3]"));
		resources.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Risk Updated"));
		Thread.sleep(3000);

	}
	

}
