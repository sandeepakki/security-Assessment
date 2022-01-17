package Resource_Model;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Create_Resource extends BaseClass {


	@Test(dataProvider="Create Resource")
	public void testCreateResource(String ResName,String ResUrl,String IpAdd,String Description,
			String Website,String PhNo,String ContactName,String Address,String Service,String Responsibility) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String type = "Website";
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		if(type.equals("Website")) {
			//   Click on Add Resource
			WebElement AddNewBtn = driver.findElement(By.xpath("//button[text()='Add New']"));
			AddNewBtn.click();	
			//Click to Create Resource with Type
			WebElement s1= driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
			s1.click();
			Thread.sleep(1000);
			WebElement type1 = driver.findElement(By.xpath("//div[text()='Website']"));
			type1.click();
			Thread.sleep(1000);
			//Enter Resource Name
			WebElement Name = driver.findElement(By.name("name"));
			Name.sendKeys(ResName);
			//	Enter Resource URl
			WebElement rUrl = driver.findElement(By.name("url"));
			rUrl.sendKeys(ResUrl);
			// Choose Owner
			WebElement s5 = driver.findElement(By.xpath("//div[@class='circle']"));
			s5.click();
			WebElement slUser = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/..//div[@title='Nick Kirtley']"));
			slUser.click();
			s5.click();
			// Select State
			WebElement s2= driver.findElement(By.xpath("//label[text()='State']/..//div[@class='react-select__control css-94hfsm-control']"));
			s2.click();
			WebElement State = driver.findElement(By.xpath("//div[text()='In Use']"));
			State.click();
			// Select Protocal
			WebElement s3= driver.findElement(By.xpath("//label[text()='Protocal']/..//div[@class='react-select__control css-94hfsm-control']"));
			s3.click();
			WebElement Protocol = driver.findElement(By.xpath("//div[text()='HTTPS']"));
			Protocol.click();
			// Select Environment
			WebElement s4=driver.findElement(By.xpath("//label[text()='Environment']/..//div[@class='react-select__control css-94hfsm-control']"));
			s4.click();
			WebElement Environment = driver.findElement(By.xpath("//div[text()='Production']"));
			Environment.click();
			//Enter Desription 
//			WebElement desc = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
//			desc.sendKeys(Description);
		}
		else if(type.equals("Server") || type.equals("Network Device")) {
			//   Click on Add Resource
			WebElement AddNewBtn = driver.findElement(By.xpath("//button[text()='Add New']"));
			AddNewBtn.click();	
			//Click to Create Resource with Type
			WebElement s1= driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
			s1.click();
			Thread.sleep(1000);
//			WebElement type1 = driver.findElement(By.xpath("//div[text()='Network Device']"));
//			type1.click();
						WebElement type1 = driver.findElement(By.xpath("//div[text()='Server']"));
						type1.click();
			Thread.sleep(1000);
			//Enter Resource Name
			WebElement Name = driver.findElement(By.name("name"));
			Name.sendKeys(ResName);
			//Enter Ip Address
			WebElement ip = driver.findElement(By.name("ip_address"));
			ip.sendKeys(IpAdd);
			// Select State
			WebElement s2= driver.findElement(By.xpath("//label[text()='State']/..//div[@class='react-select__control css-94hfsm-control']"));
			s2.click();
			WebElement State = driver.findElement(By.xpath("//div[text()='Planned']"));
			State.click();
			// Select Device Type
//			WebElement s5= driver.findElement(By.xpath("//label[text()='Device Type']/..//div[@class='react-select__control css-94hfsm-control']"));
//			s5.click();
//			WebElement Device = driver.findElement(By.xpath("//div[text()='Router']"));
//			Device.click();
			// Select OS Type
			WebElement s3= driver.findElement(By.xpath("//label[text()='OS Type']/..//div[@class='react-select__control css-94hfsm-control']"));
			s3.click();
			WebElement OS = driver.findElement(By.xpath("//div[text()='Linux']"));
			OS.click();
			// Select Environment
			WebElement s4=driver.findElement(By.xpath("//label[text()='Environment']/..//div[@class='react-select__control css-94hfsm-control']"));
			s4.click();
			WebElement Environment = driver.findElement(By.xpath("//div[text()='Production']"));
			Environment.click();
			//Enter Desription 
//			WebElement desc = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
//			desc.sendKeys(Description);
		}
		else if(type.equals("Third Party") || type.equals("Team") || type.equals("Business") || type.equals("Department")) {
			//   Click on Add Resource
			WebElement AddNewBtn = driver.findElement(By.xpath("//button[text()='Add New']"));
			AddNewBtn.click();	
			//Click to Create Resource with Type
			WebElement s1= driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
			s1.click();
			Thread.sleep(1000);
			WebElement type1 = driver.findElement(By.xpath("//div[text()='Third Party']"));
			type1.click();
			//			WebElement type1 = driver.findElement(By.xpath("//div[text()='Team']"));
			//			type1.click();
			//			WebElement type1 = driver.findElement(By.xpath("//div[text()='Business']"));
			//			type1.click();
			//			WebElement type1 = driver.findElement(By.xpath("//div[text()='Department']"));
			//			type1.click();
			Thread.sleep(1000);
			//Enter Resource Name
			WebElement Name = driver.findElement(By.name("name"));
			Name.sendKeys(ResName);
			//			Enter Resource website
			WebElement website = driver.findElement(By.name("website"));
			website.sendKeys(Website);
			//Enter the Phone Number
			WebElement Ph = driver.findElement(By.name("phone"));
			Ph.sendKeys(PhNo);
			// Select State
			WebElement s2= driver.findElement(By.xpath("//label[text()='State']/..//div[@class='react-select__control css-94hfsm-control']"));
			s2.click();
			WebElement State = driver.findElement(By.xpath("//div[text()='Planned']"));
			State.click();
			//Enter contact person
			WebElement contact = driver.findElement(By.name("contact_person"));
			contact.sendKeys(ContactName);
			//Enter the Address
			WebElement add = driver.findElement(By.xpath("//label[text()='Address']/..//div[@class='ql-editor ql-blank']"));
			add.sendKeys(Address);
			//Enter Desription 
			WebElement desc = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor ql-blank']"));
			desc.sendKeys(Description);
			//Enter the service
			WebElement serv = driver.findElement(By.xpath("//label[text()='Service']/..//div[@class='ql-editor ql-blank']"));
			serv.sendKeys(Service);
			//Enter the Responsibility
			//			WebElement resp = driver.findElement(By.xpath("//label[text()='Responsibility']/..//div[@class='ql-editor ql-blank']"));
			//			resp.sendKeys(Responsibility);
		}
		// Click to Add Resource
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New Resource added successfully"));
		Thread.sleep(3000);
		
	}

	@DataProvider(name="Create Resource")
	public String[][] getData() throws IOException {

		String path=".\\dataFiles\\ResourceCreate.xlsx";
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
