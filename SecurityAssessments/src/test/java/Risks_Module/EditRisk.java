package Risks_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class EditRisk extends BaseClass {
	
	@Test
	public void testEditRisk() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		Thread.sleep(4000);
		driver.navigate().to("https://sa.aristiun.com/app/risks");
		// Edit Risk
		WebElement risk = driver.findElement(By.xpath("//span[contains(text(),'RISK !9')]"));
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
		WebElement impact = driver.findElement(By.id("impact"));
		Select imp= new Select(impact);
		imp.selectByVisibleText("High");
		WebElement Likelihood = driver.findElement(By.id("likelihood"));
		Select Lik= new Select(Likelihood);
		Lik.selectByVisibleText("Medium");
		WebElement rating = driver.findElement(By.id("risk_rating"));
		Select rat = new Select(rating);
		rat.selectByVisibleText("Critical");
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"RISK10");
		WebElement desc = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		desc.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"this is test risk created...");
		WebElement polClear = driver.findElement(By.xpath("(//div[@class='react-select__indicator react-select__clear-indicator css-tlfecz-indicatorContainer'])[2]"));
		polClear.click();
		WebElement policy = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[2]"));
		policy.click();
		WebElement choice = driver.findElement(By.xpath("//div[text()='General Information Security Policy']"));
		choice.click();
		WebElement resources = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-1wy0on6'])[3]"));
		resources.click();
		WebElement SelectRes = driver.findElement(By.xpath("//div[text()='Company X']"));
		SelectRes.click();
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary btn-lg']"));
		submit.click();
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Risk Updated"));
		driver.navigate().to("https://sa.aristiun.com/app/resources");
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("Company X");
		WebElement filterType = driver.findElement(By.xpath("//div[@class='react-select __indicators css-1wy0on6']"));
		filterType.click();
		WebElement Business = driver.findElement(By.xpath("//div[text()='Business']"));
		Business.click();
		WebElement filter = driver.findElement(By.xpath("//button[text()='Search']"));
		filter.click();
		Thread.sleep(2000);
		WebElement resource = driver.findElement(By.xpath("//span[text()='Company X']"));
		resource.click();
		WebElement viewSecurityStats = driver.findElement(By.xpath("//button[text()='View Security Status']"));
		viewSecurityStats.click();
		WebElement ActiveRisks = driver.findElement(By.linkText("ACTIVE RISKS"));
		ActiveRisks.click();
		Boolean Displayed = driver.findElement(By.xpath("//div[text()='RISK10']")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
		WebElement close =  driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
}
