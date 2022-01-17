package Templates;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Create_Template extends BaseClass{
	
	@Test(dataProvider ="Create Template")
	public void testCreateTemplate(String tName,String tIntro,String exIntro,String passSum,String failSum,String passNS,String failNS,
			String avgsumm1,String avgsumm2,String avgsumm3,String avgsumm4,String avgsumm5,String avgNS1,String avgNS2,String avgNS3,String avgNS4,String avgNS5,String aboutTemp) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String type = "Passing";
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Templates = driver.findElement(By.linkText("Templates"));
		Templates.click();
		WebElement AddTemp = driver.findElement(By.xpath("//button[contains(text(),'Add New')]"));
		AddTemp.click();
		WebElement tempName = driver.findElement(By.name("name"));
		tempName.sendKeys(tName);
		WebElement clAssessType = driver.findElement(By.xpath("//div[@class='react-select__control css-11tf2le'][1]"));
		clAssessType.click();
		WebElement slAssessmentType = driver.findElement(By.xpath("//div[contains(text(),'Consulting Assessment')]"));
		slAssessmentType.click();
		if(type.equals("Passing")) {
			WebElement clfdbType = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-uitvrg'])[2]"));
			clfdbType.click();
			WebElement slfdbType = driver.findElement(By.xpath("//div[contains(text(),'Passing Feedback')]"));
			slfdbType.click();
			WebElement scorePattern = driver.findElement(By.xpath("//div[contains(text(),'Sum')]"));
			scorePattern.click();
			WebElement tempIntro = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
			tempIntro.sendKeys(tIntro);
			WebElement execIntro = driver.findElement(By.xpath("//label[text()='Executive Introduction']/..//div[@class='ql-editor ql-blank']"));
			execIntro.sendKeys(exIntro);
			WebElement passSumm = driver.findElement(By.xpath("//label[text()='Passing Summary']/..//div[@class='ql-editor ql-blank']"));
			passSumm.sendKeys(passSum);
			WebElement failSumm = driver.findElement(By.xpath("//label[text()='Failing Summary']/..//div[@class='ql-editor ql-blank']"));
			failSumm.sendKeys(failSum);
			WebElement passNxtSteps = driver.findElement(By.xpath("//label[text()='Passing Next Steps']/..//div[@class='ql-editor ql-blank']"));
			passNxtSteps.sendKeys(passNS);
			WebElement failNxtSteps = driver.findElement(By.xpath("//label[text()='Failing Next Steps']/..//div[@class='ql-editor ql-blank']"));
			failNxtSteps.sendKeys(failNS);
		}
		else {
			WebElement clfdbType = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-uitvrg'])[2]"));
			clfdbType.click();
			WebElement slfdbType = driver.findElement(By.xpath("//div[contains(text(),'Maturity Feedback')]"));
			slfdbType.click();
			WebElement clScorePatt = driver.findElement(By.xpath("(//div[@class='react-select__indicators css-uitvrg'])[3]"));
			clScorePatt.click();
			WebElement slscorePattern = driver.findElement(By.xpath("//div[contains(text(),'Sum')]"));
			slscorePattern.click();
			WebElement tempIntro = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
			tempIntro.sendKeys(tIntro);
			WebElement execIntro = driver.findElement(By.xpath("//label[text()='Executive Introduction']/..//div[@class='ql-editor ql-blank']"));
			execIntro.sendKeys(exIntro);
			WebElement avgSumm1 = driver.findElement(By.xpath("//label[text()='Summary for Average Maturity Level 1']/..//div[@class='ql-editor ql-blank']"));
			avgSumm1.sendKeys(avgsumm1);
			WebElement avgSumm2 = driver.findElement(By.xpath("//label[text()='Summary for Average Maturity Level 2']/..//div[@class='ql-editor ql-blank']"));
			avgSumm2.sendKeys(avgsumm2);
			WebElement avgSumm3 = driver.findElement(By.xpath("//label[text()='Summary for Average Maturity Level 3']/..//div[@class='ql-editor ql-blank']"));
			avgSumm3.sendKeys(avgsumm3);
			WebElement avgSumm4 = driver.findElement(By.xpath("//label[text()='Summary for Average Maturity Level 4']/..//div[@class='ql-editor ql-blank']"));
			avgSumm4.sendKeys(avgsumm4);
			WebElement avgSumm5 = driver.findElement(By.xpath("//label[text()=' Summary for Average Maturity Level 5']/..//div[@class='ql-editor ql-blank']"));
			avgSumm5.sendKeys(avgsumm5);
			WebElement avgNxtsteps1 = driver.findElement(By.xpath("//label[text()='Next Steps for Average Maturity Level 1']/..//div[@class='ql-editor ql-blank']"));
			avgNxtsteps1.sendKeys(avgNS1);
			WebElement avgNxtsteps2 = driver.findElement(By.xpath("//label[text()='Next Steps for Average Maturity Level 2']/..//div[@class='ql-editor ql-blank']"));
			avgNxtsteps2.sendKeys(avgNS2);
			WebElement avgNxtsteps3 = driver.findElement(By.xpath("//label[text()='Next Steps for Average Maturity Level 3']/..//div[@class='ql-editor ql-blank']"));
			avgNxtsteps3.sendKeys(avgNS3);
			WebElement avgNxtsteps4 = driver.findElement(By.xpath("//label[text()='Next Steps for Average Maturity Level 4']/..//div[@class='ql-editor ql-blank']"));
			avgNxtsteps4.sendKeys(avgNS4);
			WebElement avgNxtsteps5 = driver.findElement(By.xpath("//label[text()='Next Steps for Average Maturity Level 5']/..//div[@class='ql-editor ql-blank']"));
			avgNxtsteps5.sendKeys(avgNS5);
		}
		WebElement abtTemp = driver.findElement(By.xpath("//label[text()='About Template']/..//div[@class='ql-editor ql-blank']"));
		abtTemp.sendKeys(aboutTemp);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
//		WebElement submit1 = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
//		submit1.click();
	}
	@DataProvider(name="Create Template")
	public String[][] getData() throws IOException {

		String path=".\\dataFiles\\CreateTemplates.xlsx";
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
	}
}
