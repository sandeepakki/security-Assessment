package com.aristiun.dev_sa.Login;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	public static final String currentDir = System.getProperty("user.dir");

	@Test(dataProvider="LoginData")
	public void testLoginFeature(String Username,String Password,String exp,String landingPage,String ActResult,String Index) throws InterruptedException, IOException {
		
		driver.get("https://sa.aristiun.com/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement txtEmail =driver.findElement(By.name("email"));
		txtEmail.clear();
		txtEmail.sendKeys(Username);
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.clear();
		txtPassword.sendKeys(Password);
	
		WebElement Login = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
		Login.click();
		Thread.sleep(5000);
		String actPage = driver.getCurrentUrl();
		int i=Integer.parseInt(Index); 
		String path=currentDir+"\\dataFiles\\LoginData.xlsx";
		ExcelUtils excel = new ExcelUtils(path);
			
		 if(exp.equals("Pass"))
		 {
			 if(landingPage.equals(actPage)) {
				 excel.setCellData("Sheet1", i, 4, "Pass");
				 driver.findElement(By.xpath("//div[@class='navbar-right']")).click();
				 driver.findElement(By.xpath("//button[@type='button'][3]")).click();
				 Assert.assertTrue(true);
			   }
			 else{
				 excel.setCellData("Sheet1", i, 4, "Fail");
				 Assert.assertTrue(false); 
			    }
			 }
			 else if(exp.equals("Fail"))
			 {
				 if(landingPage.equals(actPage)) {
					 excel.setCellData("Sheet1", i, 4, "Fail");
					 driver.findElement(By.xpath("//div[@class='navbar-right']")).click();
					 driver.findElement(By.xpath("//button[text()='button'][3]")).click();
					 Assert.assertTrue(false);
				 }
				 else
				 {
					 excel.setCellData("Sheet1", i, 4, "Fail");
					 Assert.assertTrue(true);
				 }
			 }
		 System.out.println();
		 
		 }
						
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException {
		
		String path=currentDir+"\\dataFiles\\LoginData.xlsx";
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
