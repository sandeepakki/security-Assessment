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
	
	@FindBy(xpath="//div[@class='d-flex align-items-center justify-content-start users-list']/..//span[contains(text(),'Nick Kirt')]")
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
	public void selectUser() throws InterruptedException {
		waithelper.WaitForElement(slUser,20);
		slUser.click();
	}
	
	public void SlType() {
		waithelper.WaitForElement(Website,20);
		Website.click();
	}
	
	public void EnterName(String parentName) {
		waithelper.WaitForElement(WebName,20);
		WebName.sendKeys(parentName);
	}
	
	public void EnterUrl(String parentUrl) {
		waithelper.WaitForElement(EnterUrl,20);
		EnterUrl.sendKeys(parentUrl);
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
		EnterDescription.sendKeys("Amazon is guided by four principles: customer"+
		" obsession rather than competitor focus, passion for invention,"+
				" commitment to operational excellence, and long-term thinking."+
		" Amazon strives to be Earth’s most customer-centric company, Earth’s best employer,"+
				" and Earth’s safest place to work. Customer reviews,"+
		" 1-Click shopping, personalized recommendations, Prime, Fulfillment by Amazon,"+
				" AWS, Kindle Direct Publishing, Kindle, Career Choice, Fire tablets, Fire TV,"+
		" Amazon Echo, Alexa, Just Walk Out technology, Amazon Studios, and The Climate Pledge are some of the things pioneered by Amazon.");
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
	
	public void successmsg(String message) throws InterruptedException {
		waithelper.WaitForElement(success,20);
		Assert.assertTrue((success).getText()
				.contains(message));
	}	


}
