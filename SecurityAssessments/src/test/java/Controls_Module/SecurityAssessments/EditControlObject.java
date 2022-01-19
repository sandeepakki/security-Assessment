package Controls_Module.SecurityAssessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditControlObject extends BaseClass{
	
	@Test
	public void testEditCtrlObj() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		Actions a = new Actions(driver);
		WebElement ControlTab = driver.findElement(By.xpath("//*[text()='Controls']"));
		a.moveToElement(ControlTab).click().build().perform();
		Thread.sleep(1000);
	 // Click controls module
		driver.navigate().to("https://sa.aristiun.com/app/controls/control-objective");
		WebElement obj1=driver.findElement(By.xpath("//span[contains(text(),'Lorem')]"));
		obj1.click();
		WebElement edit = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		edit.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"Lorem Ipsum..");
		WebElement identifier = driver.findElement(By.name("control_obj_id"));
		identifier.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)+"COBJ1");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor']"));
		description.sendKeys("<p>Lorem ipsum dolor</p>");
		WebElement Add = driver.findElement(By.xpath("//button[@type='submit']"));
		Add.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Control Objective Updated"));
		Thread.sleep(3000);
		
		
		//Delete Control Objective
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox.click();
		WebElement toggle = driver.findElement(By.xpath("//button[@class='dropdown-toggle-split btn-lg delete_arrow dropdown-toggle btn btn-']"));
		toggle.click();
		WebElement delete = driver.findElement(By.xpath("//button[text()='Delete']"));
		delete.click();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		cancel.click();
		WebElement toggle1 = driver.findElement(By.xpath("//button[@class='dropdown-toggle-split btn-lg delete_arrow dropdown-toggle btn btn-']"));
		toggle1.click();
		WebElement delete1 = driver.findElement(By.xpath("//button[text()='Delete']"));
		delete1.click();
		WebElement yes = driver.findElement(By.xpath("//button[@class='btn-shadow btn-multiple-state  btn btn-primary btn-lg']"));
		yes.click();
		
	}
}
