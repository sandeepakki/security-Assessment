package Resource_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssessmentsTab extends BaseClass{
	
	@Test
	public void testPublishAssessments() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		// Single Resource delete
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement Assessments = driver.findElement(By.xpath("(//a[text()='Assessments'])[2]"));
		Assessments.click();
		WebElement Publish = driver.findElement(By.xpath("//button[text()='Publish']"));
		Publish.click();
		WebElement template = driver.findElement(By.xpath("//label[text()='Template']/..//div[@class='react-select__control css-yk16xz-control']"));
		template.click();
		WebElement CSA = driver.findElement(By.xpath("//div[text()='CSA - Cloud Security Controls assessment (CCM) - Test']"));
		CSA.click();
		WebElement cancelBtn = driver.findElement(By.xpath("//button[text()='Cancel']"));
		cancelBtn.click();
		WebElement Publish1 = driver.findElement(By.xpath("//button[text()='Publish']"));
		Publish1.click();
		WebElement template1 = driver.findElement(By.xpath("//label[text()='Template']/..//div[@class='react-select__control css-yk16xz-control']"));
		template1.click();
		WebElement CSA1 = driver.findElement(By.xpath("//div[text()='CSA - Cloud Security Controls assessment (CCM) - Test']"));
		CSA1.click();
		WebElement Next = driver.findElement(By.xpath("//button[@type='submit']"));
		Next.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"CSA-TEST TEMPLATE");
		WebElement tempHeading = driver.findElement(By.xpath("//span[@class='ql-picker-label']"));
		tempHeading.click();
		WebElement Heading2 = driver.findElement(By.xpath("//span[@data-value='2']"));
		Heading2.click();
		WebElement tempIntro = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		tempIntro.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum Is a dummy text..!");
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
		WebElement clNext = driver.findElement(By.xpath("//span[text()=' Next ']"));
		clNext.click();
		WebElement clPrevious = driver.findElement(By.xpath("//span[text()='Previous']"));
		clPrevious.click();
		WebElement reportSummary = driver.findElement(By.xpath("//div[@class='ql-editor']"));
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
		clNext.click();
		WebElement generateExecReport = driver.findElement(By.xpath("//label[@for='assessment_executive_report']"));
		generateExecReport.click();
		WebElement clgraph = driver.findElement(By.xpath("//label[text()='Select graph to display in executive file']/..//div[@class='react-select__control css-11tf2le']"));
		clgraph.click();
		WebElement Radar = driver.findElement(By.xpath("//div[text()='Radar']"));
		Radar.click();
		WebElement Publish2 = driver.findElement(By.xpath("//span[text()=' Publish ']"));
		Publish2.click();
		Thread.sleep(4000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Assessment Published Successfully."));
		Thread.sleep(10000);
		
	}
}
