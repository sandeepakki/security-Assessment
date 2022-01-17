package User_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class Invite extends BaseClass {

	@Test
	public void testInviteUser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Users Tab link
		WebElement Users = driver.findElement(By.xpath("//a[@data-flag='admin-user-management']"));
		Actions a = new Actions(driver);
		a.moveToElement(Users).click().build().perform();
		//Invite
		WebElement invite = driver.findElement(By.xpath("//button[text()='INVITE']"));
		invite.click();
		WebElement close = driver.findElement(By.xpath("//div[@class='close-box touch-pointer']"));
		close.click();
		WebElement invite1 = driver.findElement(By.xpath("//button[text()='INVITE']"));
		invite1.click();
		WebElement fName = driver.findElement(By.name("first_name"));
		fName.sendKeys("Test");
		WebElement lName = driver.findElement(By.name("last_name"));
		lName.sendKeys("Test");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("test@mailinator.com");
		WebElement role = driver.findElement(By.xpath("//button[@role='switch']"));
		role.click();
		WebElement message = driver.findElement(By.name("message"));
		message.sendKeys("This is test User Invited..");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Invitation Success"));
		Thread.sleep(3000);
	
	}
}
