package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class publish_without_DetailedExecReports extends BaseClass{
	
	@Test
	public void testPublishTemp() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement csa = driver.findElement(By.xpath("//span[text()='CSA - Cloud Security Controls assessment (CCM) - Test']"));
		csa.click();
		WebElement publish = driver.findElement(By.xpath("//button[text()='Publish']"));
		publish.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"CSA-TEST TEMPLATE");
		WebElement tempIntro = driver.findElement(By.xpath("//label[text()='Template Introduction']/..//div[@class='ql-editor']"));
		tempIntro.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum Is a dummy text..!");
		WebElement clresurce = driver.findElement(By.xpath("//label[text()='Resources']/..//div[@class='react-select__control css-yk16xz-control']"));
		clresurce.click();
		WebElement slresurce = driver.findElement(By.xpath("//div[text()='Scott Huges']"));
		slresurce.click();
		WebElement clreviewer = driver.findElement(By.xpath("//label[text()='Reviewers']/..//div[@class='react-select__control css-yk16xz-control']"));
		clreviewer.click();
		WebElement slreviewer = driver.findElement(By.xpath("//div[text()='Saket SK']"));
		slreviewer.click();
		WebElement tickAllowEditing = driver.findElement(By.xpath("//label[@for='assessment_allow_editing']"));
		tickAllowEditing.click();
		WebElement tickAllowPartial = driver.findElement(By.xpath("//label[@for='assessment_allow_partial_save']"));
		tickAllowPartial.click();
		WebElement untickSendEmail = driver.findElement(By.xpath("//label[@for='assessment_auto_completion_email']"));
		untickSendEmail.click();
		WebElement restrictAssessment = driver.findElement(By.xpath("//label[@for='assessment_restrict_access']"));
		restrictAssessment.click();
		WebElement limitDays = driver.findElement(By.name("limit_days"));
		limitDays.sendKeys("1");
		WebElement tickAllowMultipleQns = driver.findElement(By.xpath("//label[@for='assessment_allow_multiple_questions']"));
		tickAllowMultipleQns.click();
		WebElement clNext = driver.findElement(By.xpath("//span[text()=' Next ']"));
		clNext.click();
		WebElement clPrevious = driver.findElement(By.xpath("//span[text()='Previous']"));
		clPrevious.click();
		WebElement clGeneratesReport = driver.findElement(By.xpath("//input[@id='assessment_generates_report']"));
		clGeneratesReport.click();
		clNext.click();
		WebElement generateExecReport = driver.findElement(By.xpath("//label[@for='assessment_executive_report']"));
		generateExecReport.click();
		WebElement clgraph = driver.findElement(By.xpath("//label[text()='Select graph to display in executive file']/..//div[@class='react-select__control css-yk16xz-control']"));
		clgraph.click();
		WebElement Radar = driver.findElement(By.xpath("//div[text()='Heat-Map']"));
		Radar.click();
		WebElement Publish = driver.findElement(By.xpath("//span[text()=' Publish ']"));
		Publish.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Assessment published successfully."));
		Thread.sleep(10000);

		
	}

}
