package User_Module;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class ReInvite extends BaseClass {
	@Test
	public void testReinvite() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Users Tab link
		WebElement Users = driver.findElement(By.xpath("//a[@data-flag='admin-user-management']"));
		Actions a = new Actions(driver);
		a.moveToElement(Users).click().build().perform();
		//Re-Invite
		WebElement Invitation = driver.findElement(By.linkText("Invitations"));
		Invitation.click();
		WebElement Reinvite = driver.findElement(By.xpath("//span[text()='Reinvite']"));
		Reinvite.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Invitation Success"));
		Thread.sleep(3000);
		driver.navigate().to("https://www.mailinator.com/");
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("test");
		WebElement btn = driver.findElement(By.xpath("//button[@value='Search for public inbox for free']"));
		btn.click();
		WebElement aristiun = driver.findElement(By.xpath("//*[contains(text(),'Aristiun')][1]"));
		aristiun.click();
		String main = driver.getWindowHandle();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='html_msg_body']"));
		driver.switchTo().frame(iframe);
		WebElement Join = driver.findElement(By.xpath("//a[text()='JOIN']"));
		Join.click();
	Set<String> assess = driver.getWindowHandles();
	for(String s : assess) {
		driver.switchTo().window(s);
	}
	Boolean setPass = driver.findElement(By.xpath("//div[text()='Set Password']")).isDisplayed();
	System.out.println("Element displayed is:"+setPass);
	WebElement newPass = driver.findElement(By.name("newPassword"));
	newPass.sendKeys("Test@123");
	WebElement confirm = driver.findElement(By.name("newPasswordAgain"));
	confirm.sendKeys("Test@123");
	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("test@mailinator.com");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("Test@123");
	WebElement submit1 = driver.findElement(By.xpath("//button[@type='submit']"));
	submit1.click();
	String s =driver.getCurrentUrl();
	System.out.println(s);
	}
}
