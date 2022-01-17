package Resource_Model;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class controlFromStandard extends BaseClass {
	
	@Test(priority = 1)
	public void testStandardcontrol() throws InterruptedException {
		//Adding control that is not present before in the resource
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.xpath("(//a[text()='Controls'])[2]"));
		controlsTab.click();
		WebElement newControl = driver.findElement(By.xpath("//button[text()='Add new']"));
		newControl.click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		dropdown.click();
		WebElement standard = driver.findElement(By.xpath("//div[text()='Standard']"));
		standard.click();
		WebElement cont = driver.findElement(By.xpath("//button[text()='Continue']"));
		cont.click();
		WebElement SOC = driver.findElement(By.xpath("//span[text()='SOC']"));
		SOC.click();
		Thread.sleep(1000);
		WebElement CE = driver.findElement(By.xpath("//span[text()='Control Environment']"));
		CE.click();
		WebElement ctrl = driver.findElement(By.id("check_SOC060"));
		ctrl.click();
		Thread.sleep(1000);
		WebElement Add = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
		Add.click();
			Thread.sleep(2000);
			WebElement success = driver.findElement(By.tagName("h4"));
			SoftAssert sa = new SoftAssert();
			sa.assertTrue((success).getText()
					.contains("New control added"));
			Boolean control = driver.findElement(By.xpath("//span[text()='Evaluates Competence and Addresses Shortcomings']")).isDisplayed();
			System.out.println(control);
			
	}
	@Test(priority=2)
	public void testStandardControl() throws InterruptedException {
		//Adding control that is present before in the resource
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
		WebElement Res = driver.findElement(By.xpath("//span[text()='Scott Hughes']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.xpath("(//a[text()='Controls'])[2]"));
		controlsTab.click();
		WebElement newControl = driver.findElement(By.xpath("//button[text()='Add new']"));
		newControl.click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		dropdown.click();
		WebElement standard = driver.findElement(By.xpath("//div[text()='Standard']"));
		standard.click();
		WebElement cont = driver.findElement(By.xpath("//button[text()='Continue']"));
		cont.click();
		WebElement SOC = driver.findElement(By.xpath("//span[text()='SOC']"));
		SOC.click();
		Thread.sleep(1000);
		WebElement CE = driver.findElement(By.xpath("//span[text()='Control Environment']"));
		CE.click();
		WebElement ctrl = driver.findElement(By.id("check_SOC060"));
		ctrl.click();
		Thread.sleep(1000);
		WebElement Add = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
		Add.click();
			Thread.sleep(2000);
			WebElement success = driver.findElement(By.tagName("h4"));
			SoftAssert sa = new SoftAssert();
			sa.assertTrue((success).getText()
					.contains("Few Controls already exists"));
			Boolean control = driver.findElement(By.xpath("//span[text()='Evaluates Competence and Addresses Shortcomings']")).isDisplayed();
			System.out.println(control);
	}	
}