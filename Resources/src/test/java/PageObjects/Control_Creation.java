package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Control_Creation {

	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Control_Creation(WebDriver rdriver) {
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
	
	@FindBy(xpath="//button[text()='Add new']")
	public WebElement clAddNew;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement clContinue;
	
//	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
//	public WebElement clCheckbox;
	
	@FindBy(xpath="//button[text()='Add']")
	public WebElement clAdd;
	
	@FindBy(xpath="//span[text()='Perform change & test Management']")
	public WebElement clControlPerform;
	
	// Actions
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
	public void clickOnAddNew() {
		waithelper.WaitForElement(clAddNew,20);
		clAddNew.click();
	}
	public void clickOnContinue() {
		waithelper.WaitForElement(clContinue,20);
		clContinue.click();
	}
//	public void clickOnCheckbox() throws InterruptedException {
//		Thread.sleep(10000);
//		try {
//		waithelper.WaitForElement(clCheckbox,20);
//		clCheckbox.click();
//		}catch(TimeoutException e) {
//			e.printStackTrace();
//		}
//	}
	public void clickOnAdd() throws InterruptedException {
	Thread.sleep(15000);
		waithelper.WaitForElement(clAdd,20);
		clAdd.click();
	}
	public void clickOnControlPerform() {
		waithelper.WaitForElement(clControlPerform,20);
		clControlPerform.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		for(int i=0;i<=1;i++) {
		js.executeScript("window.scrollBy(0,-1250)");
		}
	}
	
}
