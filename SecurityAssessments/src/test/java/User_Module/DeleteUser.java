package User_Module;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class DeleteUser extends BaseClass {
	
	@Test
	public void testDeleteUser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Users Tab link
		WebElement Users = driver.findElement(By.xpath("//a[@data-flag='admin-user-management']"));
		Actions a = new Actions(driver);
		a.moveToElement(Users).click().build().perform();
		// Edit user details
		List<WebElement> AllUsers = driver.findElements(By.xpath("//td[@class='list-item-heading w-30']"));
		String user = "Tester";
		if(AllUsers.contains(user)) {
			WebElement test = driver.findElement(By.xpath("//td[text()='Tester Tester']"));
			test.click();
		}
		else {
			WebElement next = driver.findElement(By.xpath("//button[@class='next page-link']"));
			next.click();
			WebElement test = driver.findElement(By.xpath("//td[text()='Tester Tester']"));
			test.click();
			WebElement ActiveAcc = driver.findElement(By.xpath("//button[@class='rc-switch custom-switch custom-switch-primary']"));
			ActiveAcc.click();
		}	
		WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		delete.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("User deleted"));
		Thread.sleep(3000);
		WebElement txtEmail1 =driver.findElement(By.name("email"));
		txtEmail1.clear();
		txtEmail1.sendKeys("test@mailinator.com");
		WebElement txtPassword1 = driver.findElement(By.name("password"));
		txtPassword1.clear();
		txtPassword1.sendKeys("Test@123");
		WebElement login1 = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
		login1.click();
		Thread.sleep(1000);
		WebElement success1 = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success1).getText()
				.contains("Login Error"));
		Thread.sleep(3000);
		
	}

}
