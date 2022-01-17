package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Update_Resource {
		
		public WebDriver ldriver;
		WaitHelper waithelper;
		
		public Update_Resource(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(ldriver,this);
			waithelper=new WaitHelper(ldriver);
		}
		
		@FindBy(xpath="//a[text()='Resources']")
		public WebElement ResourcesTab;
		
		@FindBy(xpath="//span[text()='Prostoo'][1]")
		public WebElement clResource;
		
		@FindBy(xpath="//button[text()='Edit']")
		public WebElement clEdit;
		
		@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatarGroup-avatar MuiAvatarGroup-avatar MuiAvatar-colorDefault']")
		public WebElement clAvatar;
		
		@FindBy(xpath="//i[@class='simple-icon-close']")
		public WebElement clearUser;
		
		@FindBy(xpath="//button[@class='close']")
		public WebElement closeAvtar;
		
		@FindBy(xpath="//div[@class='circle']")
		public WebElement clCircle;
		
		@FindBy(xpath="//div[@class='d-flex align-items-center justify-content-start users-list']/..//span[text()='Saket SK']")
		public WebElement slUser;
		
		@FindBy(name="name")
		public WebElement WebName;
		
		@FindBy(xpath="//label[text()='State']/..//div[@class='react-select__control css-yk16xz-control']")
		public WebElement clState;
		
		@FindBy(xpath="//div[text()='Marked for Decommissioning']")
		public WebElement slState;
		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement clUpdate;
		
		@FindBy(tagName="h4")
		public WebElement success;
		
		//Actions
		
		public void clickonResourcesTab() {
			waithelper.WaitForElement(ResourcesTab,20);
			ResourcesTab.click();
		}
		
		public void clickonProstooRes() {
			waithelper.WaitForElement(clResource,20);
			clResource.click();
		}
		
		public void clickonEditBtn() {
			waithelper.WaitForElement(clEdit,20);
			clEdit.click();
		}
		
		public void clickonOwner() {
			waithelper.WaitForElement(clAvatar,20);
			clAvatar.click();
		}
		
		public void clearOwner() {
			waithelper.WaitForElement(clearUser,20);
			clearUser.click();
		}
		public void closeAvatar() {
			waithelper.WaitForElement(closeAvtar,20);
			closeAvtar.click();
		}
		
		public void clickUserCircle() {
			waithelper.WaitForElement(clCircle,20);
			clCircle.click();
		}
		public void selectUser() {
			waithelper.WaitForElement(slUser,20);
			slUser.click();
		}
		public void EnterName() {
			waithelper.WaitForElement(WebName,20);
			WebName.sendKeys(".com");
		}
		
		public void clickState() {
			waithelper.WaitForElement(clState,20);
			clState.click();
		}
		
		public void selectState() {
			waithelper.WaitForElement(slState,20);
			slState.click();
		}
		
		public void clickonUpdate() {
			waithelper.WaitForElement(clUpdate,20);
			clUpdate.click();
		}
		
		public void successmsg() throws InterruptedException {
			waithelper.WaitForElement(success,20);
			Assert.assertTrue((success).getText()
					.contains("Resource updated successfully"));
		}	
		
}
