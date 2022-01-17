package Resource_Model;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Update_Resource extends BaseClass {
	
	@Test(dataProvider = "Edit Resource")
	public void testUpdateResource(String ResName,String ResUrl,String IpAdd,String Description,
			String Website,String PhNo,String ContactName,String Address,String Service,String Responsibility) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
	 // Click on Resource to Update
		WebElement Res = driver.findElement(By.xpath("//span[text()='santa']"));
		Res.click();
		WebElement Edit = driver.findElement(By.xpath("//button[text()='Edit']"));
		Edit.click();
		Thread.sleep(5000);
		WebElement Name = driver.findElement(By.name("name"));
		Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+ResName);
		//	Enter Resource URl
		WebElement rUrl = driver.findElement(By.name("url"));
		rUrl.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+ResUrl);
		// add owner
//		WebElement clcir = driver.findElement(By.xpath("//div[@class='circle']"));
//		clcir.click();
//		WebElement chUs = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/..//div[@title='Tej Singh']"));
//		chUs.click();
//		clcir.click();
		try {
		WebElement clAvatar = driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatarGroup-avatar MuiAvatarGroup-avatar MuiAvatar-colorDefault']"));
		clAvatar.click();
		WebElement cluser = driver.findElement(By.xpath("//i[@class='simple-icon-close'][1]"));
		cluser.click();
		WebElement closePopup = driver.findElement(By.xpath("//button[@class='close']"));
		closePopup.click();
		// Choose Owner
		WebElement s5 = driver.findElement(By.xpath("//div[@class='circle']"));
		s5.click();
		WebElement slUser = driver.findElement(By.xpath("//div[@class='d-flex align-items-center justify-content-start users-list']/..//div[@title='Tej Singh']"));
		slUser.click();
		s5.click();
		}catch (Exception e)
		{
			System.out.println("No Owner");
		}
		// Select State
		WebElement s2= driver.findElement(By.xpath("//label[text()='State']/..//div[@class='react-select__control css-94hfsm-control']"));
		s2.click();
		WebElement State = driver.findElement(By.xpath("//div[text()='Planned']"));
		State.click();
		// Select Protocal
		WebElement s3= driver.findElement(By.xpath("//label[text()='Protocol']/..//div[@class='react-select__control css-94hfsm-control']"));
		s3.click();
		WebElement Protocol = driver.findElement(By.xpath("//div[text()='HTTP']"));
		Protocol.click();
		// Select Environment
		WebElement s4=driver.findElement(By.xpath("//label[text()='Environment']/..//div[@class='react-select__control css-94hfsm-control']"));
		s4.click();
		WebElement Environment = driver.findElement(By.xpath("//div[text()='Testing']"));
		Environment.click();
		//Enter Desription 
//		WebElement desc = driver.findElement(By.xpath("//label[text()='Description']/..//div[@class='ql-editor']"));
//		desc.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+Description);
		Thread.sleep(5000);
		WebElement Update = driver.findElement(By.xpath("//span[text()='Update']"));
		Update.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Resource updated successfully"));
		Thread.sleep(3000);
	}
	
	@DataProvider(name="Edit Resource")
	public String[][] getData() throws IOException {

		String path=".\\dataFiles\\Edit.xlsx";
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
