package Risks_Module;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Controls_Module.SecurityAssessments.BaseClass;

public class filterRisks extends BaseClass {
	
	@Test
	public void testFilterRisks() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Risks Tab link
		Thread.sleep(4000);
		driver.navigate().to("https://sa.aristiun.com/app/risks");
		WebElement clLiklihood = driver.findElement(By.xpath("//div[@class='react-select __indicators css-1wy0on6']"));
		clLiklihood.click();
		WebElement slLiklihood = driver.findElement(By.xpath("//div[text()='Medium']"));
		slLiklihood.click();
		WebElement clImpact = driver.findElement(By.xpath("(//div[@class='react-select __indicators css-1wy0on6'])[2]"));
		clImpact.click();
		WebElement slImpact = driver.findElement(By.xpath("//div[text()='High']"));
		slImpact.click();
		WebElement clRating = driver.findElement(By.xpath("(//div[@class='react-select __indicators css-1wy0on6'])[3]"));
		clRating.click();
		WebElement slRating = driver.findElement(By.xpath("//div[text()='Critical']"));
		slRating.click();
		WebElement clType = driver.findElement(By.xpath("(//div[@class='react-select __indicators css-1wy0on6'])[3]"));
		clType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='Register Risk']"));
		slType.click();
		WebElement filter = driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-sm']"));
		filter.click();
		Thread.sleep(1000);		
		Boolean risk = driver.findElement(By.xpath("//span[contains(text(),'RISK10')]")).isDisplayed();
		System.out.println(risk);
		WebElement Reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		Reset.click();
		List<WebElement> allRisks = driver.findElements(By.xpath("//span[@class='align-middle tag-label-without-weight']"));
		for(WebElement e : allRisks) {
			System.out.println(e.getText());
		}
	}
}
