package Resource_Model;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GenerateControlReport extends BaseClass{
	
	@Test
	public void testGenerateControlReport() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//   Click on Resource Tab link
		WebElement ResLink = driver.findElement(By.xpath("//a[@data-flag='admin-asset']"));
		ResLink.click();
	 // Single Resource delete
		WebElement Res = driver.findElement(By.xpath("//span[text()='TM-Pro']"));
		Res.click();
		WebElement controlsTab = driver.findElement(By.xpath("(//a[text()='Controls'])[2]"));
		controlsTab.click();
		WebElement Generate = driver.findElement(By.xpath("//span[contains(text(),'Generate Report')]"));
		Thread.sleep(3000);
		Generate.click();
		Thread.sleep(2000);	
		WebElement success = driver.findElement(By.tagName("h4"));
		Assert.assertTrue((success).getText()
				.contains("Success"));
		Thread.sleep(3000);
		WebElement Controls = driver.findElement(By.xpath("//span[text()='Controls']"));
		Controls.click();
		List<WebElement> Ctrl = driver.findElements(By.xpath("//span[@class='report-side-control-name text-white']"));
		for(WebElement e : Ctrl) {
			System.out.println(e.getText());
			e.click();
		}
		WebElement report = driver.findElement(By.xpath("//button[@title='Download Options']"));
		report.click();
		WebElement detailed = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
		detailed.click();
		WebElement Aristiun = driver.findElement(By.linkText("Aristiun"));
		Aristiun.click();
	}

}
