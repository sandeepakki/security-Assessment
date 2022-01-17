package Controls_Module.SecurityAssessments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateControl extends BaseClass {

	@Test(priority =1,dataProvider="Create Control")
	public void test_Control_Review_Flow(String Name, String Description) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		WebElement ControlTab = driver.findElement(By.xpath("//a[@data-flag='admin-controls']"));
		ControlTab.click();
	 // Click controls module
		driver.navigate().to("https://sa.aristiun.com/app/controls/controls");
		WebElement newControl = driver.findElement(By.xpath("//button[text()='Add New']"));
		newControl.click();
		WebElement Key = driver.findElement(By.xpath("//div[@class=' css-1t445th-indicatorContainer']"));
		Key.click();
		WebElement selectKey = driver.findElement(By.xpath("//span[text()='Non Key']"));
		selectKey.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Name);
		WebElement desc = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		desc.sendKeys(Description);
		WebElement clObj = driver.findElement(By.xpath("//span[text()='Control Objective']/..//div[@class='react-select__indicators css-1wy0on6']"));
		clObj.click();
		WebElement slObj = driver.findElement(By.xpath("//div[text()='COSO Principle 1']"));
		slObj.click();
//		WebElement clRef = driver.findElement(By.xpath("//span[text()='Type']/..//div[@class='react-select__control css-16cmcg9-control']"));
//		clRef.click();
//		WebElement slRef = driver.findElement(By.xpath("//div[text()='NIST']"));
//		slRef.click();
		WebElement clPolicies = driver.findElement(By.xpath("//span[text()='Policies']/..//div[@class='react-select__control css-16cmcg9-control']"));
		clPolicies.click();
		WebElement slPolicies = driver.findElement(By.xpath("//div[text()='General Information Security Policy']"));
		slPolicies.click();
		WebElement clType = driver.findElement(By.xpath("//span[text()='Type']/..//div[@class='react-select__control css-16cmcg9-control']"));
		clType.click();
		WebElement slType = driver.findElement(By.xpath("//div[text()='NIST']"));
		slType.click();
		WebElement clApplicableNo = driver.findElement(By.xpath("//span[text()='Applicable Period']/..//div[@class='first-half mr-1']"));
		clApplicableNo.click();
		WebElement slApplicableNo = driver.findElement(By.xpath("//div[text()='5']"));
		slApplicableNo.click();
		WebElement clSelectPeriod = driver.findElement(By.xpath("//span[text()='Applicable Period']/..//div[@class='second-half']"));
		clSelectPeriod.click();
		WebElement slSelectPeriod = driver.findElement(By.xpath("//div[text()='Months']"));
		slSelectPeriod.click();
		WebElement clOwnerCircle = driver.findElement(By.xpath("//div[@class='circle'][1]"));
		clOwnerCircle.click();
		Thread.sleep(2000);
		WebElement slOwner = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/div[@title='Saket SK']"));
		slOwner.click();
		WebElement clReviewerCircle = driver.findElement(By.xpath("(//div[@class='circle'])[2]"));
		clReviewerCircle.click();
		Thread.sleep(2000);
		WebElement slReviewer = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/div[@title='Sandeep Akki']"));
		slReviewer.click();
		clOwnerCircle.click();
		WebElement submit = driver.findElement(By.xpath("//button[text()='Create']"));
		submit.click();
		Thread.sleep(5000);
	}	
	@DataProvider(name="Create Control")
	public String[][] getData() throws IOException {

		String path=".\\dataFiles\\CreateControl.xlsx";
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
