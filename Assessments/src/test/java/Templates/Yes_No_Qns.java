package Templates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Yes_No_Qns extends BaseClass {
	
	@Test
	public void test() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Templates = driver.findElement(By.linkText("Templates"));
		Templates.click();
		try {
		WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Lorem Ipsum')]"));
		clTemp.click();
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		// Yes or No
		Thread.sleep(2000);
		WebElement addQnsBtn = driver.findElement(By.xpath("//button[text()='Add Question ']"));
		addQnsBtn.click();
		WebElement qns = driver.findElement(By.name("questions.[1].question"));
		qns.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Qns2");
		WebElement desc = driver.findElement(By.xpath("(//span[text()='Manage Description'])[2]"));
		desc.click();
		WebElement enDsc = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
		enDsc.sendKeys("Lorem Ipsum is a dummy text()");
		WebElement ansType = driver.findElement(By.xpath("(//label[text()='Answer Type']/..//div[@class='react-select__control css-yk16xz-control'])[2]"));
		ansType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='Yes or No']"));
		slType.click();
		WebElement standards = driver.findElement(By.xpath("(//label[text()='Standards']/..//div[@class='react-select__control css-yk16xz-control'])[2]"));
		standards.click();
		WebElement standard1 = driver.findElement(By.xpath("//div[text()='Sample']"));
		standard1.click();
		WebElement score1 = driver.findElement(By.name("questions[1].choices[0].score"));
		score1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"10");
		WebElement score2 = driver.findElement(By.name("questions[1].choices[1].score"));
		score2.sendKeys("1");
		WebElement justification1 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[1].choices[0].requires_explanation']"));
		justification1.click();
		WebElement fileUpload1 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[1].choices[0].requires_file']"));
		fileUpload1.click();
		WebElement justification2 = driver.findElement(By.xpath("//label[text()='Ask for additional justification?']/..//input[@id='questions[1].choices[1].requires_explanation']"));
		justification2.click();
		WebElement fileUpload2 = driver.findElement(By.xpath("//label[text()='File Upload']/..//input[@id='questions[1].choices[1].requires_file']"));
		fileUpload2.click();
		WebElement Save = driver.findElement(By.xpath("//button[@class='mr-3 btn-multiple-state flex-grow-1  btn btn-primary btn-lg']"));
		Actions a = new Actions(driver);
		a.moveToElement(Save).click().build().perform();
		WebElement collapse = driver.findElement(By.xpath("//button[@class='icon-button ml-1 edit-button btn btn-outline-theme-3']"));
		collapse.click();
	}
}
