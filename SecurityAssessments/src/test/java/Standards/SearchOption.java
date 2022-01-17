package Standards;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class SearchOption extends BaseClass {
	
	@Test
	public void testSearchStandards() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Standards Tab link
		WebElement standard = driver.findElement(By.xpath("//a[@data-flag='admin-standards']"));
		standard.click();
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		Thread.sleep(2000);
		search.sendKeys("NIST");
		Thread.sleep(1000);
		search.clear();
		search.sendKeys("SOC");
		WebElement SOC = driver.findElement(By.xpath("//div[text()='SOC']"));
		SOC.click();
		WebElement RiskMitigation = driver.findElement(By.xpath("//div[text()='Risk Mitigation']"));
		RiskMitigation.click();
		
		
	}

}
