package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Review_Control_Evidence {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Review_Control_Evidence(WebDriver rdriver) {
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
	
	@FindBy(xpath="//span[text()='In Progress']")
	public WebElement clStatus;
	
	@FindBy(linkText="All attachments")
	public WebElement clAllattachments;
	
	@FindBy(xpath="//img[@alt='Evidence'][1]")
	public WebElement clickFile;
	
	@FindBy(xpath="//div[@class='list-type-custom']")
	public WebElement clToViewList;
	
	@FindBy(xpath="//div[@class='align-self-center d-flex flex-column flex-md-row"+
	" justify-content-between min-width-zero align-items-md-center card-body'][1]")
	public WebElement clEvidence;
	
	@FindBy(linkText="Activity")
	public WebElement clActivityTab;
	
	@FindBy(xpath="//div[@class='react-select__control css-1szhd4z-control']")
	public WebElement clSelectStatus;
	
	@FindBy(xpath="//div[text()='Compliant']")
	public WebElement slComplianceState;
	
	@FindBy(xpath="//textarea[@placeholder='Type Something']")
	public WebElement enterRemarks;
	
	@FindBy(xpath="//span[text()='Submit']")
	public WebElement clSubmit;
	
	@FindBy(xpath="//span[text()='Mark as Done']")
	public WebElement clMarkDone;
	
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
	public void clickInProgress() {
		waithelper.WaitForElement(clStatus,20);
		clStatus.click();
	}
	public void clickAllAttachments() {
		waithelper.WaitForElement(clAllattachments,20);
		clAllattachments.click();
	}
	public void clickFile() {
		waithelper.WaitForElement(clickFile,20);
		clickFile.click();
	}
	public void clickListView() {
		waithelper.WaitForElement(clToViewList,20);
		clToViewList.click();
	}
	public void clickOnEvidence() {
		waithelper.WaitForElement(clEvidence,20);
		clEvidence.click();
	}
	public void clickOnActivityTab() {
		waithelper.WaitForElement(clActivityTab,20);
		clActivityTab.click();
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
		enterRemarks.sendKeys("Evidence File Verified..!"+Keys.TAB);
	}
	public void clickSubmit() throws InterruptedException {
		waithelper.WaitForElement(clSubmit,20);
		clSubmit.click();
		Thread.sleep(5000);
	}
	public void clickMarkAsDone() {
		waithelper.WaitForElement(clMarkDone,20);
		clMarkDone.click();
	}
}
