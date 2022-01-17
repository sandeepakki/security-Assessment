package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Del_Using_Checkbox {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Del_Using_Checkbox(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//a[text()='Resources']")
	public WebElement ResourcesTab;
	
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
	
	public void clickonCheckbox() {
		waithelper.WaitForElement(clCheckbox,30);
		clCheckbox.click();
	}
	public void clickonToggle() {
		waithelper.WaitForElement(clToggleDropdown,20);
		clToggleDropdown.click();
	}
	
	public void clickonDeletebtn() {
		waithelper.WaitForElement(clDeletebtn,20);
		clDeletebtn.click();
	}
	
	public void successmsg() throws InterruptedException {
		waithelper.WaitForElement(success,20);
		Assert.assertTrue((success).getText()
				.contains("Deleting Resource"));
	}
}
