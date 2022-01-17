package Templates;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddSections extends BaseClass{
	

	@Test(dataProvider="Add Sections")
	public void testAddingSections(String sName,String sDesc,String fdml1,String fdml2,String fdml3,String fdml4,String fdml5,
			String ss1,String ss2,String ss3,String ss4,String ss5,String ns1,String ns2,String ns3,String ns4,String ns5) throws InterruptedException {
		
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
		String type = "Passing";
		if(type.equals("Maturity")) {
		WebElement addSection = driver.findElement(By.xpath("//button[@class='mb-3 add-section-white-btn btn btn-outline-secondary btn-lg']"));
		addSection.click();
		WebElement sectionName = driver.findElement(By.name("name"));
		sectionName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+sName);
		Thread.sleep(1000);
		WebElement clsectionDesc = driver.findElement(By.xpath("//span[text()='Manage Description']"));
		clsectionDesc.click();
		WebElement enterDesc = driver.findElement(By.xpath("//label[text()='Section Description']/..//div[@class='ql-editor ql-blank']"));
		Thread.sleep(1000);
		enterDesc.sendKeys(sDesc);
		WebElement clFeedbacks = driver.findElement(By.xpath("//button[text()='Manage Feedback']"));
		clFeedbacks.click();
		WebElement enterFeedML1 = driver.findElement(By.xpath("//textarea[@name='maturity_feedback_level_1']"));
		Thread.sleep(1000);
		enterFeedML1.sendKeys(fdml1);
		WebElement enterFeedML2 = driver.findElement(By.xpath("//textarea[@name='maturity_feedback_level_2']"));
		Thread.sleep(1000);
		enterFeedML2.sendKeys(fdml2);
		WebElement enterFeedML3 = driver.findElement(By.xpath("//textarea[@name='maturity_feedback_level_3']"));
		Thread.sleep(1000);
		enterFeedML3.sendKeys(fdml3);
		WebElement enterFeedML4 = driver.findElement(By.xpath("//textarea[@name='maturity_feedback_level_4']"));
		Thread.sleep(1000);
		enterFeedML4.sendKeys(fdml4);
		WebElement enterFeedML5 = driver.findElement(By.xpath("//textarea[@name='maturity_feedback_level_5']"));
		Thread.sleep(1000);
		enterFeedML5.sendKeys(fdml5);
		WebElement shortSumm1 = driver.findElement(By.name("maturity_short_summary_level_1"));
		Thread.sleep(1000);
		shortSumm1.sendKeys(ss1);
		WebElement shortSumm2 = driver.findElement(By.name("maturity_short_summary_level_2"));
		Thread.sleep(1000);
		shortSumm2.sendKeys(ss2);
		WebElement shortSumm3 = driver.findElement(By.name("maturity_short_summary_level_3"));
		Thread.sleep(1000);
		shortSumm3.sendKeys(ss3);
		WebElement shortSumm4 = driver.findElement(By.name("maturity_short_summary_level_4"));
		Thread.sleep(1000);
		shortSumm4.sendKeys(ss4);
		WebElement shortSumm5 = driver.findElement(By.name("maturity_short_summary_level_5"));
		Thread.sleep(1000);
		shortSumm5.sendKeys(ss5);
		WebElement NextSteps1 = driver.findElement(By.name("maturity_next_steps_level_1"));
		Thread.sleep(1000);
		NextSteps1.sendKeys(ns1);
		WebElement NextSteps2 = driver.findElement(By.name("maturity_next_steps_level_2"));
		Thread.sleep(1000);
		NextSteps2.sendKeys(ns2);
		WebElement NextSteps3 = driver.findElement(By.name("maturity_next_steps_level_3"));
		Thread.sleep(1000);
		NextSteps3.sendKeys(ns3);
		WebElement NextSteps4 = driver.findElement(By.name("maturity_next_steps_level_4"));
		Thread.sleep(1000);
		NextSteps4.sendKeys(ns4);
		WebElement NextSteps5 = driver.findElement(By.name("maturity_next_steps_level_5"));
		Thread.sleep(1000);
		NextSteps5.sendKeys(ns5);
		Thread.sleep(1000);
		WebElement clSave1 = driver.findElement(By.xpath("//button[@type='submit']"));
		clSave1.click();
		Thread.sleep(2000);
		}
		else {
			WebElement addSection = driver.findElement(By.xpath("//button[@class='mb-3 add-section-white-btn btn btn-outline-secondary btn-lg']"));
			addSection.click();
			WebElement sectionName = driver.findElement(By.name("name"));
			sectionName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+sName);
			Thread.sleep(1000);
			WebElement clsectionDesc = driver.findElement(By.xpath("//span[text()='Manage Description']"));
			clsectionDesc.click();
			WebElement enterDesc = driver.findElement(By.xpath("(//*[@class='ql-editor ql-blank'])[1]"));
			Thread.sleep(1000);
			enterDesc.sendKeys(sDesc);
			WebElement clFeedbacks = driver.findElement(By.xpath("//button[text()='Manage Feedback']"));
			clFeedbacks.click();
//			WebElement passFeed = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank' and @xpath='1']"));
//			passFeed.sendKeys(fdml1);
			WebElement failFeed = driver.findElement(By.xpath("(//*[@class='ql-editor ql-blank'])[2]"));
			failFeed.sendKeys(fdml2);
			WebElement passSumm = driver.findElement(By.name("passing_short_summary"));
			passSumm.sendKeys(ss1);
			WebElement failSumm = driver.findElement(By.name("failing_short_summary"));
			failSumm.sendKeys(ss2);
			WebElement passNS = driver.findElement(By.name("passing_next_step"));
			passNS.sendKeys(ns1);
			WebElement failNS = driver.findElement(By.name("failing_next_step"));
			failNS.sendKeys(ns2);
			Thread.sleep(2000);
			WebElement clSave1 = driver.findElement(By.xpath("//button[@class='btn-multiple-state flex-grow-1  btn btn-primary btn-lg']"));
			clSave1.click();
			
			}
		}

	@DataProvider(name="Add Sections")
	public String[][] getData() throws IOException {

		String path=".\\dataFiles\\AddSections.xlsx";
		ExcelUtils excel = new ExcelUtils(path);

		int totalrows= excel.getRowCount("Sheet1");
		int totalcols= excel.getCellCount("Sheet1",1);

		String loginData[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=excel.getCellData("Sheet1", i, j);
			}
		}	
		return loginData;
	
	}}
