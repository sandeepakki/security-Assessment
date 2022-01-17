package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class CreatingRisk extends BaseClass{
	
	@Test
	public void testAddRisks() throws InterruptedException {
	

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Risks Tab link
		WebElement RiskTab = driver.findElement(By.xpath("//a[@data-flag='admin-risks']"));
		RiskTab.click();
		// create risk
		WebElement create = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		create.click();
		WebElement type = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		type.click();
		WebElement lib = driver.findElement(By.xpath("//div[contains(text(),'Library risk')]"));
		lib.click();
		WebElement impact = driver.findElement(By.xpath("//span[text()='Impact']/..//div[@class='flag_section']"));
		impact.click();
		WebElement rating1 = driver.findElement(By.xpath("//li[text()='Medium']"));
		rating1.click();
		WebElement Liklihood = driver.findElement(By.xpath("//span[text()='Liklihood']/..//div[@class='flag_section']"));
		Liklihood.click();
		WebElement rating2 = driver.findElement(By.xpath("//li[text()='High']"));
		rating2.click();
		WebElement rating = driver.findElement(By.xpath("//span[text()='Rating']/..//div[@class='flag_section']"));
		rating.click();
		WebElement rating3 = driver.findElement(By.xpath("//li[text()='Critical']"));
		rating3.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("RISK !9");
		WebElement desc = driver.findElement(By.xpath("//textarea[@name='description']"));
		desc.sendKeys("this is test risk created...!");
		WebElement policies = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[2]"));
		policies.click();
		WebElement choice = driver.findElement(By.xpath("//div[contains(text(),'Technical Information Security Policy')]"));
		choice.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New risk added"));
		Thread.sleep(3000);
	}
	}
	
