 package Resource_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibCtrls extends BaseClass {
	
	@Test
	public void testaddLibControls() throws InterruptedException {
		
//adding in bulk
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.xpath("(//a[text()='Controls'])[2]"));
		controlsTab.click();
		WebElement newControl = driver.findElement(By.xpath("//button[text()='Add new']"));
		newControl.click();
		WebElement liCntrl  = driver.findElement(By.xpath("//button[text()='Continue']"));
		liCntrl.click();
		Thread.sleep(5000);
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkAll' and @class='custom-control-input']"));
		checkBox.click();
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New controls added"));
		Thread.sleep(3000);
		
		// adding in single
		
		WebElement newControl1 = driver.findElement(By.xpath("//button[text()='Add new']"));
		newControl1.click();
		WebElement liCntrl1  = driver.findElement(By.xpath("//button[text()='Continue']"));
		liCntrl1.click();
		Thread.sleep(5000);
		WebElement create = driver.findElement(By.xpath("//button[text()='Create new']"));
		create.click();
		WebElement Key = driver.findElement(By.xpath("//div[@class=' css-1t445th-indicatorContainer']"));
		Key.click();
		WebElement selectKey = driver.findElement(By.xpath("//span[text()='Non Key']"));
		selectKey.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Test");
		WebElement desc = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		desc.sendKeys("Lorem Ipsum");
		WebElement clObj = driver.findElement(By.xpath("//span[text()='Control Objective']/..//div[@class='react-select__indicators css-1wy0on6']"));
		clObj.click();
		WebElement slObj = driver.findElement(By.xpath("//div[text()='COSO Principle 1']"));
		slObj.click();
//		WebElement clRef = driver.findElement(By.xpath("//span[text()='Reference']/..//div[@class='react-select__control css-qsjp3z-control']"));
//		clRef.click();
//		WebElement slRef = driver.findElement(By.xpath("//div[text()='------ID.AM-1']"));
//		slRef.click();
		WebElement clPolicies = driver.findElement(By.xpath("//span[text()='Policies']/..//div[@class='react-select__control css-16cmcg9-control']"));
		clPolicies.click();
		WebElement slPolicies = driver.findElement(By.xpath("//div[text()='General Information Security Policy']"));
		slPolicies.click();
		WebElement clType = driver.findElement(By.xpath("//span[text()='Type']/..//div[@class='react-select__control css-16cmcg9-control']"));
		clType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='NIST']"));
		slType.click();
		WebElement clApplicableNo = driver.findElement(By.xpath("//span[text()='Applicable Period']/..//div[@class='first-half mr-1']"));
		clApplicableNo.click();
		WebElement slApplicableNo = driver.findElement(By.xpath("//div[text()='5']"));
		slApplicableNo.click();
		WebElement clSelectPeriod = driver.findElement(By.xpath("//span[text()='Applicable Period']/..//div[@class='second-half']"));
		clSelectPeriod.click();
		WebElement slSelectPeriod = driver.findElement(By.xpath("//div[text()='Months']"));
		slSelectPeriod.click();
		WebElement clOwnerCircle = driver.findElement(By.xpath("//div[@class='circle'][1]"));
		clOwnerCircle.click();
		Thread.sleep(2000);
		WebElement slOwner = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/div[@title='Saket SK']"));
		slOwner.click();
		WebElement clReviewerCircle = driver.findElement(By.xpath("(//div[@class='circle'])[2]"));
		clReviewerCircle.click();
		Thread.sleep(2000);
		WebElement slReviewer = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/div[@title='Sandeep Akki']"));
		slReviewer.click();
		clOwnerCircle.click();
		WebElement submit = driver.findElement(By.xpath("//button[text()='Create']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success1 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success1).getText()
				.contains("New Control Added"));
		Thread.sleep(3000);
	}
}
