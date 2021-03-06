package Resource_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlEdit extends BaseClass{

	@Test()
	public void testEditControl() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		// Single Resource delete
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.xpath("(//a[text()='Controls'])[2]"));
		controlsTab.click();
		// Edit Control
		WebElement clControl =driver.findElement(By.xpath("//span[text()='Control1']"));
		clControl.click();
		WebElement editControl = driver.findElement(By.xpath("//button[@class='mx-2 btn btn-secondary']"));
		editControl.click();
		WebElement keys =driver.findElement(By.xpath("//div[@class=' css-1t445th-indicatorContainer']"));
		keys.click();
		WebElement k1 = driver.findElement(By.xpath("//span[text()='Key']"));
		k1.click();
//		WebElement k2 = driver.findElement(By.xpath("//span[text()='Non Key']"));
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Control1");
		WebElement desc = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		desc.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem ipsum");
		WebElement clObj = driver.findElement(By.xpath("//span[text()='Control Objective']/..//div[@class='react-select__control css-aucphg-control']"));
		clObj.click();
		WebElement slObj = driver.findElement(By.xpath("//div[text()='COSO Principle 2']"));
		slObj.click();
//		WebElement clRef = driver.findElement(By.xpath("//span[text()='Reference']/..//div[@class='react-select__control css-qsjp3z-control']"));
//		clRef.click();
//		WebElement slRef = driver.findElement(By.xpath("//div[text()='------ID.AM-1']"));
//		slRef.click();
		WebElement clPolicies = driver.findElement(By.xpath("//span[text()='Policies']/..//div[@class='react-select__control css-aucphg-control']"));
		clPolicies.click();
		WebElement slPolicies = driver.findElement(By.xpath("//div[text()='Technical Information Security Policy']"));
		slPolicies.click();
		WebElement clType = driver.findElement(By.xpath("//span[text()='Type']/..//div[@class='react-select__control css-aucphg-control']"));
		clType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='SOC']"));
		slType.click();
		WebElement clApplicableNo = driver.findElement(By.xpath("//span[text()='Applicable Period']/..//div[@class='first-half mr-3']"));
		clApplicableNo.sendKeys("5");
//		WebElement slApplicableNo = driver.findElement(By.xpath("//div[text()='1']"));
//		slApplicableNo.click();
		WebElement clSelectPeriod = driver.findElement(By.xpath("//span[text()='Applicable Period']/..//div[@class='second-half']"));
		clSelectPeriod.click();
		WebElement slSelectPeriod = driver.findElement(By.xpath("//div[text()='Months']"));
		slSelectPeriod.click();
		try {

			WebElement avatar = driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatarGroup-avatar avatar-list MuiAvatar-colorDefault'][1]"));
			avatar.click();
			WebElement cluser = driver.findElement(By.xpath("//i[@class='simple-icon-close']"));
			cluser.click();
			WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
			close.click();
		}catch(NoSuchElementException e) {
			System.out.println("No Such Element Present");
		}
		WebElement clOwnerCircle = driver.findElement(By.xpath("//div[@class='circle'][1]"));
		clOwnerCircle.click();
		Thread.sleep(2000);
		WebElement slOwner = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/div[@title='Nick Kirtley']"));
		slOwner.click();
		try {

			WebElement avatar = driver.findElement(By.xpath("(//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatarGroup-avatar avatar-list MuiAvatar-colorDefault'])[2]"));
			avatar.click();
			WebElement cluser = driver.findElement(By.xpath("//i[@class='simple-icon-close']"));
			cluser.click();
			WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
			close.click();
		}catch(NoSuchElementException e) {
			System.out.println("No Such Element Present");
		}
		WebElement clReviewerCircle = driver.findElement(By.xpath("(//div[@class='circle'])[2]"));
		clReviewerCircle.click();
		Thread.sleep(2000);
		WebElement slReviewer = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/div[@title='Tej Singh']"));
		slReviewer.click();
		clOwnerCircle.click();
		WebElement submit = driver.findElement(By.xpath("//button[text()='Update']"));
		submit.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Control Updated"));
		Thread.sleep(3000);
	}
}
