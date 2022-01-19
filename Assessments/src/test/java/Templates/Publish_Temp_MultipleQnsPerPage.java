package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Publish_Temp_MultipleQnsPerPage extends BaseClass{
	
	@Test
	public void testMultipleQnsPerPage() throws InterruptedException {
		
		//Publishing template with all the available options to show on web, detailed and executive reports.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/templates");
		WebElement csa = driver.findElement(By.xpath("//div[contains(text(),'CSA - Cloud Security Controls')]"));
		csa.click();
		WebElement publish = driver.findElement(By.xpath("//button[text()='Publish']"));
		publish.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"CSA-TEST Multiple Qns Per Page");
//		WebElement textHeading = driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-3']"));
//		textHeading.click();
//		WebElement Heading3 = driver.findElement(By.xpath("//span[@data-value='3']"));
//		Heading3.click();
		WebElement tempIntro = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		tempIntro.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum Is a dummy text..!");
		WebElement clresurce = driver.findElement(By.xpath("//label[text()='Resources']/..//div[@class='react-select__control css-11tf2le']"));
		clresurce.click();
		WebElement slresurce = driver.findElement(By.xpath("//div[text()='Scott Hughes']"));
		slresurce.click();
		WebElement clreviewer = driver.findElement(By.xpath("//label[text()='Reviewers']/..//div[@class='react-select__control css-11tf2le']"));
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
		WebElement clNext = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary']"));
		clNext.click();
		WebElement clPrevious = driver.findElement(By.xpath("//button[@class='mr-3 btn-shadow  btn btn-outline-primary']"));
		clPrevious.click();
		WebElement clresurce1 = driver.findElement(By.xpath("//label[text()='Resources']/..//div[@class='react-select__control css-11tf2le']"));
		clresurce1.click();
		WebElement slresurce1 = driver.findElement(By.xpath("//div[text()='Scott Hughes']"));
		slresurce1.click();
		WebElement clNext1 = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary']"));
		clNext1.click();
		WebElement reportSummary = driver.findElement(By.xpath("//label[text()='Report Summary']/..//div[@class='ql-editor']"));
		reportSummary.sendKeys("Lorem Ipsum is a dummy text");
		WebElement showQnsDesc = driver.findElement(By.xpath("//label[@for='assessment_show_question_descriptions']"));
		showQnsDesc.click();
		WebElement showSumminReport = driver.findElement(By.xpath("//label[@for='assessment_show_detailed_summary']"));
		showSumminReport.click();
		WebElement showNextSteps = driver.findElement(By.xpath("//label[@for='assessment_show_detailed_next_steps']"));
		showNextSteps.click();
		WebElement showHeatMap = driver.findElement(By.xpath("//label[@for='assessment_show_detailed_nist_graph']"));
		showHeatMap.click();
		WebElement showSupersec = driver.findElement(By.xpath("//label[@for='assessment_show_super_section_descriptions']"));
		showSupersec.click();
		WebElement clNext2 = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary']"));
		clNext2.click();
		WebElement generateExecReport = driver.findElement(By.xpath("//label[@for='assessment_executive_report']"));
		generateExecReport.click();
		WebElement clgraph = driver.findElement(By.xpath("//label[text()='Select graph to display in executive file']/..//div[@class='react-select css-2b097c-container']"));
		clgraph.click();
		WebElement Radar = driver.findElement(By.xpath("//div[text()='Radar']"));
		Radar.click();
		WebElement Publish = driver.findElement(By.xpath("//span[text()=' Publish ']"));
		Publish.click();
		WebElement success = driver.findElement(By.tagName("h4"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(success));
		Assert.assertTrue((success).getText()
				.contains("Assessment Published Successfully."));
		Thread.sleep(5000);
	}

}
