package Resource_Model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlEvidence extends BaseClass {

	@Test
	public void testTemp_Review() throws AWTException, InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ResLink = driver.findElement(By.xpath("//a[text()='Resources']"));
		ResLink.click();
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.linkText("Controls"));
		controlsTab.click();
		WebElement clControl =driver.findElement(By.xpath("//span[text()='Control 5']"));
		clControl.click();
		WebElement clCtlActivity = driver.findElement(By.linkText("Control Activity"));
		clCtlActivity.click();
		WebElement uploadEvi = driver.findElement(By.xpath("//button[text()='Upload New Evidence']"));
		uploadEvi.click();
		WebElement remarks = driver.findElement(By.name("remarks"));
		remarks.sendKeys("");
		WebElement setCompliantState = driver.findElement(By.xpath("//label[text()='Partially Compliant']"));
		setCompliantState.click();
		WebElement uploadFile= driver.findElement(By.xpath("//div[@class='image-upload-wrap']"));
		uploadFile.click();
		//script to upload
		Robot robot = new Robot();
		//Store Path of the file to upload 
		StringSelection path = new StringSelection("C:\\Users\\sande\\Documents\\AristiunTestCases.xlsx");
		//Copy Above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
		//Press Ctrl
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//Press V
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		//Release V
		robot.keyRelease(KeyEvent.VK_V);
		//Release CTRL
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Review submitted successfully"));
		Thread.sleep(3000);
	}
	 public boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
}
