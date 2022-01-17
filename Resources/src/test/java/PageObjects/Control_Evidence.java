package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Control_Evidence {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Control_Evidence(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}

	@FindBy(xpath="//a[text()='Resources']")
	public WebElement ResourcesTab;
	
	@FindBy(xpath="//span[text()='Prostoo.com']")
	public WebElement clResource;
	
	@FindBy(linkText="Controls")
	public WebElement clControls;
	
	@FindBy(xpath="//span[text()='Perform change & test Management']")
	public WebElement clControlPerform;
	
	@FindBy(linkText="Review")
	public WebElement clReviewTab;
	
	@FindBy(xpath="//button[text()='Upload new evidence']")
	public WebElement clUploadEvidence;
	
	@FindBy(xpath="//div[@class='react-select__control css-1szhd4z-control']")
	public WebElement clSelectStatus;
	
	@FindBy(xpath="//div[text()='Non Compliant']")
	public WebElement slComplianceState;
	
	@FindBy(xpath="//textarea[@placeholder='Type Something']")
	public WebElement enterRemarks;
	
	@FindBy(xpath="//h3[text()='Drag and drop or browse to choose files']")
	public WebElement UploadEvidence;
	
	@FindBy(xpath="//span[text()='Submit']")
	public WebElement clSubmit;
	
	//Actions
	public void clickOnResources() {
		waithelper.WaitForElement(ResourcesTab,20);
		ResourcesTab.click();
	}
	public void clickOnProstooRes() {
		waithelper.WaitForElement(clResource,20);
		clResource.click();
	}
	public void clickOnControls() {
		waithelper.WaitForElement(clControls,20);
		clControls.click();
	}
	public void clickOnControlPerform() {
		waithelper.WaitForElement(clControlPerform,20);
		clControlPerform.click();
	}
	public void clickOnReview() {
		waithelper.WaitForElement(clReviewTab,20);
		clReviewTab.click();
	}
	public void clickUploadButton() {
		waithelper.WaitForElement(clUploadEvidence,20);
		clUploadEvidence.click();
	}
	public void clickSelectStatus() {
		waithelper.WaitForElement(clSelectStatus,20);
		clSelectStatus.click();
	}
	public void selectCompliance() {
		waithelper.WaitForElement(slComplianceState,20);
		slComplianceState.click();
	}
	public void EnterRemarks() {
		waithelper.WaitForElement(enterRemarks,20);
		enterRemarks.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry."+
		" Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"+
				" when an unknown printer took a galley of type and scrambled it to make a type specimen book."+Keys.TAB);
	}
	public void uploadEvidenceFile() throws AWTException, InterruptedException {
		waithelper.WaitForElement(UploadEvidence,20);
		Actions a = new Actions(ldriver);
		a.moveToElement(UploadEvidence).click().build().perform();
		Robot robot = new Robot();
		//Store Path of the file to upload 
		StringSelection path = new StringSelection("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\chart.pdf");
		//Copy Above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
		//Press Ctrl
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//Press V
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		//Release V
		robot.keyRelease(KeyEvent.VK_V);
		//Release CTRL
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickSubmit() throws InterruptedException {
		waithelper.WaitForElement(clSubmit,20);
		clSubmit.click();
		Thread.sleep(5000);
	}
}
