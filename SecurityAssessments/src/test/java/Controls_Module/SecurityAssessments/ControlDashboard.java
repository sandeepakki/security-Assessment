package Controls_Module.SecurityAssessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ControlDashboard extends BaseClass {
	
	@Test
	public void testControlDashboard() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		WebElement ControlTab = driver.findElement(By.xpath("//a[@data-flag='admin-controls']"));
		ControlTab.click();
	 // Click controls module
		driver.navigate().to("https://sa.aristiun.com/app/controls/dashboard");
		WebElement totalControls = driver.findElement(By.xpath("//p[text()='Total Controls']"));
		totalControls.click();
		WebElement AllCtrls = driver.findElement(By.xpath("//div[text()='All Controls']"));
		AllCtrls.click();
		WebElement compliantCtrl = driver.findElement(By.xpath("//div[text()='Compliant Controls']"));
		compliantCtrl.click();
		WebElement Days = driver.findElement(By.xpath("//div[@class='react-select__control css-yk16xz-control']"));
		Days.click();
		WebElement days7= driver.findElement(By.xpath("//div[text()='7']"));
		days7.click();
		WebElement Keys = driver.findElement(By.xpath("//div[text()='Keys']"));
		Keys.click();
		WebElement key= driver.findElement(By.xpath("//div[text()='Key']"));
		key.click();
		WebElement filter = driver.findElement(By.xpath("//button[@class='btn-shadow mr-2 btn-multiple-state  btn btn-primary']"));
		filter.click();
		Thread.sleep(3000);
		WebElement clear = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		clear.click();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("Test");
		filter.click();
		WebElement close = driver.findElement(By.xpath("//img[@alt='Close']"));
		close.click();
		
		
	}

}
