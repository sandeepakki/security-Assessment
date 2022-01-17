package Controls_Module.SecurityAssessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtrlObjective extends BaseClass {

	@Test
	public void testCreateCtrlObjective() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Controls Tab link
		WebElement ControlTab = driver.findElement(By.xpath("//a[@data-flag='admin-controls']"));
		ControlTab.click();
	 // Click controls module
		driver.navigate().to("https://sa.aristiun.com/app/controls/control-objective");
		WebElement ctrlObj = driver.findElement(By.xpath("//button[text()='Add New']"));
		ctrlObj.click();
		Thread.sleep(1000);
		WebElement Cancel = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		Cancel.click();
		ctrlObj.click();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Lorem Ipsum...!11");
		WebElement identifier = driver.findElement(By.name("control_obj_id"));
		identifier.sendKeys("OBJLi11");
		WebElement description = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		description.sendKeys("<p>Lorem ipsum dolor sit amet consectetur adipiscing elit auctor</p>");
		WebElement Add = driver.findElement(By.xpath("//button[@type='submit']"));
		Add.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("New Control Objective Added"));
		Thread.sleep(3000);
		
	}
}
