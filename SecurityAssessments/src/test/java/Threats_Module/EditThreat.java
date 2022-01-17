package Threats_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class EditThreat extends BaseClass{

	@Test
	public void testEditThreat() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Threats Tab link
		WebElement Threat = driver.findElement(By.xpath("//a[@data-flag='admin-threats']"));
		Actions a = new Actions(driver);
		a.moveToElement(Threat).click().build().perform();
		//Edit Threat
		WebElement lorem = driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		lorem.click();
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		Thread.sleep(1000);
		WebElement clear = driver.findElement(By.xpath("//div[@class='react-select custom-select__indicator react-select custom-select__clear-indicator css-tlfecz-indicatorContainer']"));
		clear.click();
		Thread.sleep(1000);
		WebElement type = driver.findElement(By.xpath("//div[@class='react-select custom-select__placeholder css-1wa3eu0-placeholder']"));
		type.click();
		Thread.sleep(2000);
		WebElement reg = driver.findElement(By.xpath("//div[contains(text(),'Register Threat')]"));
		reg.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Serem");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		description.sendKeys("Lorem Ipsum is a dummy text....!EDITED");
		WebElement severity = driver.findElement(By.xpath("//div[@class=' css-1t445th-indicatorContainer']"));
		severity.click();
		WebElement Level = driver.findElement(By.xpath("//span[text()='High']"));
		Level.click();
		WebElement res = driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__dropdown-indicator css-tlfecz-indicatorContainer']"));
		res.click();
		WebElement s1 = driver.findElement(By.xpath("//div[text()='Corporate']"));
		s1.click();
		WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
		update.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Threat Updated"));
		Thread.sleep(3000);
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("Corporate");
		WebElement filter = driver.findElement(By.xpath("//button[text()='Search']"));
		filter.click();
		WebElement resource = driver.findElement(By.xpath("//span[text()='Corporate']"));
		resource.click();
		WebElement viewSecurityStats = driver.findElement(By.xpath("//button[text()='View Security Status']"));
		viewSecurityStats.click();
		WebElement Threats = driver.findElement(By.linkText("THREATS"));
		Threats.click();
		Thread.sleep(2000);
		Boolean Displayed = driver.findElement(By.xpath("//div[text()='Lorem Serem']")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
		WebElement close =  driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		Thread.sleep(1000);
	}
}
