package Assessments;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CSAMultiPageMultiQnsPerPage extends BaseClass {
	@Test
	public void testMultiPage() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		driver.navigate().to("https://sa.aristiun.com/app/assessments/assessment");
		try {
			WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'CSA-TEST Multiple Qns Per Page')]"));
			clTemp.click();
			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
		WebElement Invite = driver.findElement(By.xpath("//button[contains(text(),'Invite')]"));
		Invite.click();
		WebElement invitees = driver.findElement(By.xpath("//div[@class='react-select__indicators css-1wy0on6']"));
		invitees.click();
		WebElement user = driver.findElement(By.xpath("//span[text()='Sandeep Akki']"));
		user.click();
		WebElement message = driver.findElement(By.xpath("//label[text()='Message']/..//div[@class='ql-editor ql-blank']"));
		message.sendKeys("This is test message");
		WebElement slDate = driver.findElement(By.xpath("//input[@placeholder='Select a date']"));
		slDate.click();
		WebElement clDay = driver.findElement(By.xpath("//div[text()='30']"));
		clDay.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		String main = driver.getWindowHandle();
		WebElement pending = driver.findElement(By.xpath("//div[@class='d-flex flex-column flex-md-row align-self-center justify-content-between min-width-zero align-items-md-center']"+
		"/..//span[text()='Pending'][1]"));
		pending.click();
	Set<String> assess = driver.getWindowHandles();
	for(String s : assess) {
		driver.switchTo().window(s);
	}
		WebElement start = driver.findElement(By.xpath("//button[text()='Start Assessment']"));
		start.click();
		Thread.sleep(2000);
			//IVS
		//Qns
		WebElement chSelection1_1 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection1_1.click();
				WebElement chSelection1_2 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection1_2.click();
				WebElement chSelection1_3 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection1_3.click();
				WebElement chSelection1_4 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection1_4.click();
				WebElement chSelection1_5 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection1_5.click();
				WebElement chSelection1_6 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection1_6.click();
				WebElement Next1 = driver.findElement(By.xpath("//button[@type='button'][2]"));
				Next1.click();
				Thread.sleep(2000);
				
		//LOG
		//QNs
		WebElement chSelection2_1 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		chSelection2_1.click();
		WebElement chSelection2_2 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		chSelection2_2.click();
		WebElement chSelection2_3 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection2_3.click();
				WebElement chSelection2_4 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
						chSelection2_4.click();		
		WebElement Next2 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next2.click();
		Thread.sleep(2000);
		//SEF
		//QNs
				WebElement chSelection3_1 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection3_1.click();
				WebElement chSelection3_2 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection3_2.click();
				WebElement chSelection3_3 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection3_3.click();
				WebElement Next3 = driver.findElement(By.xpath("//button[@type='button'][2]"));
				Next3.click();
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement sideBarNav = driver.findElement(By.xpath("(//div[@class='sidebar-section-box section-name touch-pointer'])[16]"));
				js.executeScript("arguments[0].scrollIntoView();", sideBarNav);
				sideBarNav.click();
				Thread.sleep(2000);
		//IPY
				//Qns
				WebElement chSelection17_1 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection17_1.click();
				WebElement chSelection17_2 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection17_2.click();
				WebElement chSelection17_3 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection17_3.click();
				WebElement chSelection17_4 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
				chSelection17_4.click();
				WebElement Next4 = driver.findElement(By.xpath("//button[@type='button'][2]"));
				Next4.click();
		//View Report
				WebElement viewReport = driver.findElement(By.xpath("//button[@class='assessment-main-btn btn btn-secondary btn-lg']"));
				viewReport.click();
				Boolean ReportOptions = driver.findElement(By.xpath("//span[text()='Report Options']")).isEnabled();
				driver.switchTo().window(main);
				
	
	}
}
