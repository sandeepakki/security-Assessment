package Reports;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class ControlReport extends BaseClass {
	
	@Test
	public void testGeneratingControlReport() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Standards Tab link
		WebElement Reports = driver.findElement(By.xpath("//a[@data-flag='admin-reports']"));
		Reports.click();
		WebElement control_reports = driver.findElement(By.linkText("Control Reports"));
		control_reports.click();
		WebElement createNew = driver.findElement(By.xpath("//button[text()='Create new']"));
		createNew.click();
		WebElement slResource = driver.findElement(By.xpath("//div[@class='react-select__control css-16cmcg9-control']"));
		slResource.click();
		WebElement clResource = driver.findElement(By.xpath("//div[text()='Company X']"));
		clResource.click();
		WebElement report = driver.findElement(By.xpath("//span[text()='Create report']"));
		report.click();
		Thread.sleep(3000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(3000);
		WebElement Controls = driver.findElement(By.xpath("//span[text()='Controls']"));
		Controls.click();
		List<WebElement> Ctrl = driver.findElements(By.xpath("//span[@class='report-side-control-name text-white']"));
		for(WebElement e : Ctrl) {
			System.out.println(e.getText());
			e.click();
		}
		Actions a = new Actions(driver);
		WebElement report1 = driver.findElement(By.xpath("//button[@title='Download Options']"));
		a.moveToElement(report1).click().build().perform();
		WebElement detailed = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
		detailed.click();
		WebElement Aristiun = driver.findElement(By.linkText("Aristiun"));
		Aristiun.click();
		
	}
}
