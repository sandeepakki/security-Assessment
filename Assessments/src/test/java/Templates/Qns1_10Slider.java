package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Qns1_10Slider extends BaseClass {
	
	@Test
	public void testAddQuestions() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/templates");
		try {
		WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Lorem Ipsum')]"));
		clTemp.click();
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		// 1- 10 Slider
		WebElement addQnsBtn = driver.findElement(By.xpath("//button[text()='Add Question ']"));
		addQnsBtn.click();
		WebElement qns = driver.findElement(By.name("questions.[0].question"));
		qns.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Qns1");
		WebElement desc = driver.findElement(By.xpath("//span[text()='Manage Description']"));
		desc.click();
		WebElement enDsc = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
		enDsc.sendKeys("Lorem Ipsum is a dummy text()");
		WebElement ansType = driver.findElement(By.xpath("//label[text()='Answer Type']/..//div[@class='react-select__control css-yk16xz-control']"));
		ansType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='1-10 Slider']"));
		slType.click();
		WebElement standards = driver.findElement(By.xpath("//label[text()='Standards']/..//div[@class='react-select__control css-yk16xz-control']"));
		standards.click();
		WebElement standard1 = driver.findElement(By.xpath("//div[text()='NIST CSF']"));
		standard1.click();
		WebElement justification1 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[0].choices[0].requires_explanation']"));
		justification1.click();
		WebElement fileUpload1 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[0].choices[0].requires_file']"));
		fileUpload1.click();
		WebElement justification2 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[0].choices[1].requires_explanation']"));
		justification2.click();
		WebElement fileUpload2 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[0].choices[1].requires_file']"));
		fileUpload2.click();
		WebElement justification3 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[0].choices[2].requires_explanation']"));
		justification3.click();
		WebElement fileUpload3 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[0].choices[2].requires_file']"));
		fileUpload3.click();
		WebElement justification4 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[0].choices[3].requires_explanation']"));
		justification4.click();
		WebElement fileUpload4 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[0].choices[3].requires_file']"));
		fileUpload4.click();
		WebElement justification5 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[0].choices[4].requires_explanation']"));
		justification5.click();
		WebElement fileUpload5 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[0].choices[4].requires_file']"));
		fileUpload5.click();
		WebElement clResponseType = driver.findElement(By.xpath("//input[@name='questions[0].choices[9].response_type']/..//div[@class='react-select__control css-yk16xz-control']"));
		clResponseType.click();
		WebElement slResponse = driver.findElement(By.xpath("//div[text()='Positive']"));
		slResponse.click();
		WebElement chFeed = driver.findElement(By.xpath("(//button[text()='Manage Feedback'])[10]"));
		chFeed.click();
		Thread.sleep(2000);
		WebElement enterFeed = driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[10]"));
		enterFeed.sendKeys("Positive");
		WebElement Save = driver.findElement(By.xpath("//button[@class='mr-3 btn-multiple-state flex-grow-1  btn btn-primary btn-lg']"));
		Actions a = new Actions(driver);
		a.moveToElement(Save).click().build().perform();
		WebElement collapse = driver.findElement(By.xpath("//button[@class='icon-button ml-1 edit-button btn btn-outline-theme-3']"));
		collapse.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Data updated successfully."));
		Thread.sleep(3000);
		
	
	}
}