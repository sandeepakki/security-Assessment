package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class CreatingRisk extends BaseClass{
	
	@Test
	public void testAddRisks() throws InterruptedException {
	

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Risks Tab link
		Thread.sleep(4000);
		driver.navigate().to("https://sa.aristiun.com/app/risks");
		// create risk
		WebElement create = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		create.click();
		WebElement type = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		type.click();
		WebElement lib = driver.findElement(By.xpath("//div[contains(text(),'Library risk')]"));
		lib.click();
		WebElement impact = driver.findElement(By.id("impact"));
		Select imp= new Select(impact);
		imp.selectByVisibleText("Medium");
		WebElement Likelihood = driver.findElement(By.id("likelihood"));
		Select Lik= new Select(Likelihood);
		Lik.selectByVisibleText("High");
		WebElement rating = driver.findElement(By.id("risk_rating"));
		Select rat = new Select(rating);
		rat.selectByVisibleText("Critical");
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("RISK !9");
		WebElement desc = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
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
	
