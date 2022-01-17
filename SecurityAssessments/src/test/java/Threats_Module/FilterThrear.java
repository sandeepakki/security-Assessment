package Threats_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class FilterThrear extends BaseClass {
	
	@Test
	public void testFilterThreat() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Threats Tab link
		WebElement Threat = driver.findElement(By.xpath("//a[@data-flag='admin-threats']"));
		Actions a = new Actions(driver);
		a.moveToElement(Threat).click().build().perform();
		WebElement type = driver.findElement(By.xpath("//div[@class='react-select custom-select__indicator react-select custom-select__dropdown-indicator css-1k6zb5f-indicatorContainer']"));
		type.click();
		WebElement selectType = driver.findElement(By.xpath("//div[text()='Register Threat']"));
		selectType.click();
		Thread.sleep(2000);
		WebElement severity = driver.findElement(By.xpath("(//div[@class='react-select custom-select__indicator react-select custom-select__dropdown-indicator css-1k6zb5f-indicatorContainer'])[2]"));
		severity.click();
		WebElement selectSev = driver.findElement(By.xpath("//div[text()='High']"));
		selectSev.click();
		WebElement filter = driver.findElement(By.xpath("//button[text()='Filter']"));
		filter.click();
		Thread.sleep(2000);
		Boolean Displayed = driver.findElement(By.xpath("//span[contains(text(),'Nation')]")).isDisplayed();
		System.out.println("Element displayed is:"+Displayed);
		WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		reset.click();
		
	}
}
