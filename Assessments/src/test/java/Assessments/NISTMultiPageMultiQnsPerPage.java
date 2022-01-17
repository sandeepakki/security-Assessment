package Assessments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NISTMultiPageMultiQnsPerPage extends BaseClass {
	@Test
	public void testMultiPage() throws InterruptedException{
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
		//Qns
		WebElement chSelection1 = driver.findElement(By.xpath("(//div[@class='d-flex choice-button-mul text-left py-4 px-5 mx-3 mb-3 white-background'])[3]"));
		chSelection1.click();
		WebElement chSelection2 = driver.findElement(By.xpath("(//div[@class='d-flex choice-button-mul text-left py-4 px-5 mx-3 mb-3 white-background'])[5]"));
		chSelection2.click();
		WebElement chSelection3 = driver.findElement(By.xpath("(//div[@class='d-flex choice-button-mul text-left py-4 px-5 mx-3 mb-3 white-background'])[7]"));
		chSelection3.click();
		WebElement Next1 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next1.click();
		Thread.sleep(2000);
		//Business Environment
		//QNs
		WebElement chSelection4 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[1]"));
		chSelection4.click();
		WebElement chSelection5 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[3]"));
		chSelection5.click();
		WebElement Next2 = driver.findElement(By.xpath("//button[@type='button'][2]"));
		Next2.click();
		Thread.sleep(2000);
		//Governance
		//QNs
				WebElement chSelection6 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[1]"));
				chSelection6.click();
				WebElement chSelection7 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[3]"));
				chSelection7.click();
				WebElement chSelection8 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[5]"));
				chSelection8.click();
				WebElement chSelection9 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[7]"));
				chSelection9.click();
				WebElement chSelection10 = driver.findElement(By.xpath("(//div[@class='choice-button-control-mul'])[9]"));
				chSelection10.click();
				WebElement Next3 = driver.findElement(By.xpath("//button[@type='button'][2]"));
				Next3.click();
				Thread.sleep(2000);
		
		
	
	}
}
