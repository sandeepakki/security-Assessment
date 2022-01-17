package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class Create_Resource {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public Create_Resource(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}

	@FindBy(xpath="//a[text()='Resources']")
	public WebElement ResourcesTab;
	
	@FindBy(xpath="//button[text()='Add New']")
	public WebElement AddNewBtn;
	
	@FindBy(xpath="//div[@class='react-select__control css-yk16xz-control']")
	public WebElement SelectType;
	
	@FindBy(xpath="//div[text()='Website']")
	public WebElement Website;
	
	@FindBy(name="name")
	public WebElement WebName;
	
	@FindBy(name="url")
	public WebElement EnterUrl;
	
	@FindBy(xpath="//label[text()='State']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement ClState;
	
	@FindBy(xpath="//div[text()='In Use']")
	public WebElement SlState;
	
	@FindBy(xpath="//div[@class='circle']")
	public WebElement clCircle;
	
	@FindBy(xpath="//div[@class='d-flex align-items-center justify-content-start users-list']/..//span[text()='Sandeep Akki']")
	public WebElement slUser;
	
	@FindBy(xpath="//label[text()='Protocol']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement ClProtocol;
	
	@FindBy(xpath="//div[text()='HTTPS']")
	public WebElement SlProtocol;
	
	@FindBy(xpath="//label[text()='Environment']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clEnvironment;
	
	@FindBy(xpath="//div[text()='Production']")
	public WebElement SlEnvironment;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank' and @contenteditable='true']")
	public WebElement EnterDescription;
	
	@FindBy(xpath="//label[text()='Parent Resource']/..//div[@class='react-select__control css-yk16xz-control']")
	public WebElement clParent;
	
	@FindBy(xpath="//div[text()='Prostoo']")
	public WebElement slParent;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement AddBtn;
	
	@FindBy(tagName="h4")
	public WebElement success;
	
	// Actions
	
	public void clickonResourcesTab() {
		waithelper.WaitForElement(ResourcesTab,20);
		ResourcesTab.click();
	}
	
	public void clickonAddNewBtn() {
		waithelper.WaitForElement(AddNewBtn,20);
		AddNewBtn.click();
	}
	
	public void clickonSelectType() {
		waithelper.WaitForElement(SelectType,20);
		SelectType.click();
	}
	
	public void clickUserCircle() {
		waithelper.WaitForElement(clCircle,20);
		clCircle.click();
	}
	public void selectUser() {
		waithelper.WaitForElement(slUser,20);
		slUser.click();
	}
	
	public void SlType() {
		waithelper.WaitForElement(Website,20);
		Website.click();
	}
	
	public void EnterName() {
		waithelper.WaitForElement(WebName,20);
		WebName.sendKeys("Prostoo");
	}
	
	public void EnterUrl() {
		waithelper.WaitForElement(EnterUrl,20);
		EnterUrl.sendKeys("https://www.prostoo.com/");
	}
	
	public void clickState() {
		waithelper.WaitForElement(ClState,20);
		ClState.click();
	}
	
	public void SelectState() {
		waithelper.WaitForElement(SlState,20);
		SlState.click();
	}
	
	public void clickProtocol() {
		waithelper.WaitForElement(ClProtocol,20);
		ClProtocol.click();
	}
	public void selectProtocol() {
		waithelper.WaitForElement(SlProtocol,20);
		SlProtocol.click();
	}
	public void clickEnvironment() {
		waithelper.WaitForElement(clEnvironment,20);
		clEnvironment.click();
	}
	public void selectEnvironment() {
		waithelper.WaitForElement(SlEnvironment,20);
		SlEnvironment.click();
	}

	public void InputDescription() {
		waithelper.WaitForElement(EnterDescription,20);
		EnterDescription.sendKeys("INTRODUCTION\r\n"
				+ "Prostoo is a business consulting firm offering services in devising business strategy, enhancing operational efficiency and delivering market performance.\r\n"
				+ "\r\n"
				+ "Prostoo stands for an imaginative combination of People-Process-Services-Strategies-Tools as a business consulting partner for start-ups.\r\n"
				+ "\r\n"
				+ "Prostoo works towards creating specific solutions for emerging enterprises for accelerated growth and business expansion.");
	}
	public void clickParent() {
		waithelper.WaitForElement(clParent,20);
		clParent.click();
	}
	
	public void selectParent() {
		waithelper.WaitForElement(slParent,20);
		slParent.click();
	}
	
	public void submit() {
		waithelper.WaitForElement(AddBtn,20);
		AddBtn.click();
	}
	
	public void successmsg() throws InterruptedException {
		waithelper.WaitForElement(success,20);
		Assert.assertTrue((success).getText()
				.contains("New Resource added successfully."));
	}	


}
