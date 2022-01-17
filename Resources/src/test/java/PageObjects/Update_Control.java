package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Update_Control {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Update_Control(WebDriver rdriver) {
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
	
	@FindBy(xpath="//i[@class='simple-icon-pencil overview-icons overview-pencil-icon mr-2']")
	public WebElement clPencil;
	
	@FindBy(xpath="//div[@class='d-flex align-items-center']")
	public WebElement clKey;
	
	@FindBy(xpath="//input[@value='non_key']/..//span[text()='Non Key']")
	public WebElement slKey;
	
	@FindBy(xpath="//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clObjective;
	
	@FindBy(xpath="//div[text()='Lorem Ipsum']")
	public WebElement slObjective;
	
	@FindBy(xpath="(//div[@class='circle'])[2]")
	public WebElement clReviewer;
	
	@FindBy(xpath="//span[text()='Sandeep Akki']")
	public WebElement slReviewer;

	@FindBy(xpath="//button[text()='Update']")
	public WebElement clUpdate;
	
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
	public void clickOnEdit() {
		waithelper.WaitForElement(clPencil,20);
		clPencil.click();
	}
	public void clickOnKey() {
		waithelper.WaitForElement(clKey,20);
		clKey.click();
	}
	public void selectKey() {
		waithelper.WaitForElement(slKey,20);
		slKey.click();
	}
	public void clickObjective() {
		waithelper.WaitForElement(clObjective,20);
		clObjective.click();
	}
	public void selectObjective() {
		waithelper.WaitForElement(slObjective,20);
		slObjective.click();
	}
	public void clickReviewer() {
		waithelper.WaitForElement(clReviewer,20);
		clReviewer.click();
	}
	public void selectReviewer() {
		waithelper.WaitForElement(slReviewer,20);
		slReviewer.click();
	}
	public void clickUpdate() {
		waithelper.WaitForElement(clUpdate,20);
		clUpdate.click();
	}

}
