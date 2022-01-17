package Assessments;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NISTOnePagerOneQnsPerPage extends BaseClass {
	
	@Test
	public void testInviteUser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement AssessmentTab = driver.findElement(By.linkText("Assessments"));
		AssessmentTab.click();
		WebElement Assessments = driver.findElement(By.xpath("//a[@href='/app/assessments/assessment']"));
		Assessments.click();
		try {
			WebElement clTemp = driver.findElement(By.xpath("//div[contains(text(),'Test')]"));
			clTemp.click();
			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
		WebElement Invite = driver.findElement(By.xpath("//button[contains(text(),'Invite')]"));
		Invite.click();
		WebElement invitees = driver.findElement(By.xpath("//label[text()='Invitees']/..//div[@class='react-select__control css-yk16xz-control']"));
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
			//Asset Management
		WebElement Next1 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next1.click();
		Thread.sleep(2000);
		//Q1
			WebElement chselection1 = driver.findElement(By.xpath("(//div[@class='choice-button-control'])[2]"));
			chselection1.click();
			WebElement AdditionalJustify = driver.findElement(By.xpath("//textarea[@name='sections[0].questions[0].explanation']"));
			AdditionalJustify.sendKeys("Lorem Ipsum is a dummy text.....!");
			WebElement Next2 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next2.click();
			Thread.sleep(2000);
		//Q2
			WebElement chselection2 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection2.click();
			WebElement Next3 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next3.click();
			Thread.sleep(2000);
		//Q3
			WebElement chselection3 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection3.click();
			WebElement Next4 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next4.click();
			Thread.sleep(2000);
		//Business environment
			WebElement Next5 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next5.click();
			Thread.sleep(2000);
		//Q1
			WebElement chselection4 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection4.click();
			WebElement Next6 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next6.click();
			Thread.sleep(2000);
	   //Q2
			WebElement chselection5 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection5.click();
			WebElement Next7 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next7.click();
			Thread.sleep(2000);
		//Governance
			WebElement Next8 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next8.click();
			Thread.sleep(2000);
		//Q1
			WebElement chselection6 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection6.click();
			WebElement Next9 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next9.click();
			Thread.sleep(2000);
		//Q2	
			WebElement chselection7 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection7.click();
			WebElement Next10 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next10.click();
			Thread.sleep(2000);
		//Q3
			WebElement chselection8 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection8.click();
			WebElement Next11 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next11.click();
			Thread.sleep(2000);
		//Q4
			WebElement chselection9 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection9.click();
			WebElement Next12 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next12.click();
			Thread.sleep(2000);
		//Q5
			WebElement chselection10 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection10.click();
			WebElement Next13 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next13.click();
			Thread.sleep(2000);
		//Risk Assessment
			WebElement Next14 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next14.click();
			Thread.sleep(2000);
		//Q1
			WebElement chselection11 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection11.click();
			WebElement Next15 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next15.click();
			Thread.sleep(2000);
		//Q2
			WebElement chselection12 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection12.click();
			WebElement Next16 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next16.click();
			Thread.sleep(2000);
		//Q3
			WebElement chselection13 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection13.click();
			WebElement Next17 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next17.click();
			Thread.sleep(2000);
	   //Risk Management Strategy
			WebElement Next18 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next18.click();
			Thread.sleep(2000);
		//Q1
			WebElement chselection14 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection14.click();
			WebElement Next19 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next19.click();
			Thread.sleep(2000);
		//Q2
			WebElement chselection15 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection15.click();
			WebElement Next20 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next20.click();
			Thread.sleep(2000);
		//Supply Chain Risk Management
			WebElement Next21 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next21.click();
			Thread.sleep(2000);
		//Q1
			WebElement chselection16 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection16.click();
			WebElement Next22 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next22.click();
			Thread.sleep(2000);
		//Q2
			WebElement chselection17 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection17.click();
			WebElement Next23 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next23.click();
			Thread.sleep(2000);
		//Q3
			WebElement chselection18 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection18.click();
			WebElement Next24 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next24.click();
			Thread.sleep(2000);
		//Q4
			WebElement chselection19 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection19.click();
			WebElement Next25 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next25.click();
			Thread.sleep(2000);
		//Q5
			WebElement chselection20 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection20.click();
			WebElement Next26 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next26.click();
			Thread.sleep(2000);
		//Q6
			WebElement chselection21 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection21.click();
			WebElement Next27 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next27.click();
			Thread.sleep(2000);
		//Identity Management, Authentication and Access Control	
			WebElement Next28 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next28.click();
			Thread.sleep(2000);
			//Q1
			WebElement chselection22 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection22.click();
			WebElement Next29 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next29.click();
			Thread.sleep(2000);
		//Q2
			WebElement chselection23 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection23.click();
			WebElement Next30 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next30.click();
			Thread.sleep(2000);
		//Q3
			WebElement chselection24 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection24.click();
			WebElement Next31 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next31.click();
			Thread.sleep(2000);
		//Q4
			WebElement chselection25 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection25.click();
			WebElement Next32 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next32.click();
			Thread.sleep(2000);
		//Q5
			WebElement chselection26 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection26.click();
			WebElement Next33 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next33.click();
			Thread.sleep(2000);
		//Q6
			WebElement chselection27 = driver.findElement(By.xpath("//label[text()='Yes']"));
			chselection27.click();
			WebElement Next34 = driver.findElement(By.xpath("//button[@type='button'][2]"));
			Next34.click();
			Thread.sleep(2000);	
			
			WebElement switchQns = driver.findElement(By.xpath("//div[@class='react-select__control css-yk16xz-control']"));
			switchQns.click();
			WebElement QnsNo = driver.findElement(By.xpath("//div[text()='90']"));
			QnsNo.click();
			WebElement submit1 = driver.findElement(By.xpath("//span[text()=' Submit ']"));
			submit1.click();
			// view report
			WebElement report = driver.findElement(By.xpath("//button[text()='View Report']"));
			report.click();
			Thread.sleep(10000);
			WebElement ReportOptions = driver.findElement(By.xpath("//span[text()='Report Options']"));
			ReportOptions.click();
			WebElement detailedReport = driver.findElement(By.xpath("//button[text()=' Download Detailed Report']"));
			detailedReport.click();
			WebElement csvFile = driver.findElement(By.xpath("//button[contains(text(),'Export to CSV')]"));
			csvFile.click();
//			Thread.sleep(15000);
//			WebElement reportOptions1 = driver.findElement(By.xpath("//span[text()='Report Options']"));
//			reportOptions1.click();
//			WebElement executiveReport = driver.findElement(By.xpath("//button[text()=' Download Executive Report']"));
//			executiveReport.click();
			
	}
	
}
