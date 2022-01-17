package User_Module;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class EditUser extends BaseClass {

	@Test
	public void testEditUser() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Users Tab link
		WebElement Users = driver.findElement(By.xpath("//a[@data-flag='admin-user-management']"));
		Actions a = new Actions(driver);
		a.moveToElement(Users).click().build().perform();
		// Edit user details
		List<WebElement> AllUsers = driver.findElements(By.xpath("//td[@class='list-item-heading w-30']"));
		String user = "Test";
		if(AllUsers.contains(user)) {
			WebElement test = driver.findElement(By.xpath("//td[text()='Test Test']"));
			test.click();
		}
		else {
			WebElement next = driver.findElement(By.xpath("//button[@class='next page-link']"));
			next.click();
			WebElement test = driver.findElement(By.xpath("//td[text()='Test Test']"));
			test.click();
		}	
		WebElement fName = driver.findElement(By.name("first_name"));
		fName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Tester");
		WebElement lName = driver.findElement(By.name("last_name"));
		lName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Tester");
		WebElement inactiveAcc = driver.findElement(By.xpath("(//button[@class='rc-switch custom-switch custom-switch-primary rc-switch-checked'])[2]"));
		inactiveAcc.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Profile updated"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
		WebElement UserAvatar = driver.findElement(By.xpath("//div[@class='navbar-right']"));
		UserAvatar.click();
		 WebElement logout=driver.findElement(By.xpath("//button[@type='button'][3]"));
		 logout.click();
		 WebElement txtEmail =driver.findElement(By.name("email"));
			txtEmail.clear();
			txtEmail.sendKeys("test@mailinator.com");
			WebElement txtPassword = driver.findElement(By.name("password"));
			txtPassword.clear();
			txtPassword.sendKeys("Test@123");
			WebElement Login = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
			Login.click();
			Thread.sleep(1000);
			WebElement success1 = driver.findElement(By.tagName("h4"));
			Assert.assertTrue((success1).getText()
					.contains("Login Error"));
			Thread.sleep(3000);
			driver.navigate().refresh();
			 WebElement txtEmail1 =driver.findElement(By.name("email"));
				txtEmail1.clear();
				txtEmail1.sendKeys("saket@travelder.com");
				WebElement txtPassword1 = driver.findElement(By.name("password"));
				txtPassword1.clear();
				txtPassword1.sendKeys("dev_aristiun");
				WebElement login1 = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
				login1.click();
		
		
	}
	
}
