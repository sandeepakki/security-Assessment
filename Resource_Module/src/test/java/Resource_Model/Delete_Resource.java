package Resource_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Delete_Resource extends BaseClass {

	@Test()
	public void testDeleteResource() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
	 // Single Resource delete
		try {
		WebElement Res = driver.findElement(By.xpath("//span[text()='claz']"));
		Res.click();
			WebElement delete = driver.findElement(By.xpath("//button[text()='Delete']"));
			delete.click();
			Thread.sleep(1000);
		WebElement cancel = driver.findElement(By.xpath("//button[text()='Cancel']"));
		cancel.click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
			
		}
		try {
			driver.navigate().refresh();
			WebElement delete1 = driver.findElement(By.xpath("//button[text()='Delete']"));
			delete1.click();
			Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("//span[text()='Yes, Delete']"));
		confirm.click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
	}
		Thread.sleep(3000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Deleting Resource"));
		Thread.sleep(3000);
//			Bulk Delete 
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			WebElement BulkCheck =driver.findElement(By.xpath("//input[@id='checkAll' and @class='custom-control-input']"));
//			executor.executeScript("arguments[0].scrollIntoView(true);", BulkCheck);    
//			BulkCheck.click();
//			WebElement toggle = driver.findElement(By.xpath("//span[text()='Toggle Dropdown']"));
//			executor.executeScript("arguments[0].scrollIntoView(true);", toggle); 
//			Thread.sleep(5000);
//			try {
//				WebElement bulkDelete = driver.findElement(By.xpath("//button[text()='Delete']"));
//				executor.executeScript("arguments[0].scrollIntoView(true);", bulkDelete); 
//				bulkDelete.click();
//				Thread.sleep(2000);
//			}catch(StaleElementReferenceException e) {
//				System.out.println(e);
//			}
			
			
	}}
