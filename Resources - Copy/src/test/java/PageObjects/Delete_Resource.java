package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Delete_Resource {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Delete_Resource(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//a[text()='Resources']")
	public WebElement ResourcesTab;
	
	@FindBy(xpath="//span[text()='Prostoo']")
	public WebElement clResource;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement clDelete;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement ConfirmDelete;
	
	@FindBy(xpath="//label[@for='check_79']")
	public WebElement clCheckbox;
	
	@FindBy(xpath="button[@class='dropdown-toggle-split btn-md dropdown-toggle btn btn-primary']")
	public WebElement clToggleDropdown;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement clDeletebtn;
	
	
	@FindBy(tagName="h4")
	public WebElement success;
	
	// Actions 
	
	public void clickonResourcesTab() {
		waithelper.WaitForElement(ResourcesTab,20);
		ResourcesTab.click();
	}
	
	public void clickonProstooRes() {
		waithelper.WaitForElement(clResource,20);
		clResource.click();
	}
	
	public void clickonDelete() {
		waithelper.WaitForElement(clDelete,20);
		clDelete.click();
	}
	
	public void confirmDeletion() {
		waithelper.WaitForElement(ConfirmDelete,20);
	ConfirmDelete.click();
	}
	
	public void successmsg() throws InterruptedException {
		waithelper.WaitForElement(success,20);
		Assert.assertTrue((success).getText()
				.contains("Deleting Resource"));
	}

	
}
