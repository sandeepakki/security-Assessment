package Resource_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewEvidence extends BaseClass {
	
	@Test
	public void testReviewEvidence() throws InterruptedException {
		

		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement UserAvatar = driver.findElement(By.xpath("//span[@class='name mr-3']"));
		UserAvatar.click();
		 WebElement logout=driver.findElement(By.xpath("//button[@type='button'][3]"));
		 logout.click();
		 WebElement txtEmail =driver.findElement(By.name("email"));
			txtEmail.clear();
			txtEmail.sendKeys("sandeep.akki@assystant.com");
			WebElement txtPassword = driver.findElement(By.name("password"));
			txtPassword.clear();
			txtPassword.sendKeys("San@300494");
			WebElement Login = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
			Login.click();
			WebElement ResLink = driver.findElement(By.xpath("//a[text()='Resources']"));
			ResLink.click();
			WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
			Res.click();
			WebElement controlsTab = driver.findElement(By.linkText("Controls"));
			controlsTab.click();
			WebElement clControl =driver.findElement(By.xpath("//span[text()='Test Ctrl']"));
			clControl.click();
			WebElement clCtlActivity = driver.findElement(By.linkText("Control Activity"));
			clCtlActivity.click();
			WebElement reviewBtn = driver.findElement(By.xpath("//button[@class='upload-btn btn btn-secondary btn-lg']"));
			reviewBtn.click();
			WebElement file = driver.findElement(By.linkText("All attachments"));
			file.click();
			WebElement download1 = driver.findElement(By.xpath("//img[@alt='Evidence'][1]"));
			download1.click();
			WebElement listView = driver.findElement(By.xpath("//div[@class='list-type-custom']"));
			listView.click();
			WebElement download2 = driver.findElement(By.xpath("//div[@class='align-self-center d-flex flex-column flex-md-row"+
			" justify-content-between min-width-zero align-items-md-center card-body'][1]"));
			download2.click();
			WebElement clCtlActivity2 = driver.findElement(By.linkText("Activity"));
			clCtlActivity2.click();
			WebElement remarks = driver.findElement(By.name("remarks"));
			remarks.sendKeys("Lorem Ipsum");
			WebElement setCompliantState = driver.findElement(By.xpath("//label[text()='Compliant']"));
			setCompliantState.click();
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			WebElement success = driver.findElement(By.tagName("h4"));
			Assert.assertTrue((success).getText()
					.contains("Review submitted successfully"));
			Thread.sleep(3000);
			WebElement reviewBtn2 = driver.findElement(By.xpath("//button[@class='upload-btn btn btn-secondary btn-lg']"));
			reviewBtn2.click();
			WebElement dropdown = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));
			dropdown.click();
			WebElement setState = driver.findElement(By.xpath("//span[text()='Compliant']"));
			setState.click();
			WebElement no = driver.findElement(By.xpath("//button[text()='No']"));
			no.click();
			Thread.sleep(1000);
			WebElement setState1 = driver.findElement(By.xpath("//span[text()='Partially Compliant']"));
			setState1.click();
			WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
			yes.click();
			String status = driver.findElement(By.xpath("//span[text()='Partially Compliant']")).getText();
			Assert.assertEquals(status,"Partially Compliant");
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
