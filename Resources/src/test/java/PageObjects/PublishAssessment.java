package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class PublishAssessment {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	public PublishAssessment(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	@FindBy(xpath="//span[text()='Amazon']")
	public WebElement ResName;
	
	@FindBy(linkText="Assessments")
	public WebElement clAssessmentTab;
	
	@FindBy(xpath="//button[text()='Publish']")
	public WebElement clPublishbtn;
	
	@FindBy(xpath="//div[@class='react-select__control css-yk16xz-control']")
	public WebElement TemplateDrDw;
	
	@FindBy(xpath="//div[text()='Ransomware Preparedness Assessment']")
	public WebElement SelectTemp;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	public WebElement clNext;
	
	@FindBy(xpath="//label[text()='Allow Editing']")
	public WebElement tickAllowEdit;
	
	@FindBy(xpath="//label[text()='Allow Partial Save']")
	public WebElement tickAllowPartialSave;
	
	@FindBy(xpath="//label[text()='Allow Categories']")
	public WebElement tickAllowCategories;
	
	@FindBy(name="category[0]['name']")
	public WebElement EnterNameC1;
	
	@FindBy(name="category[1]['name']")
	public WebElement EnterNameC2;
	
	@FindBy(name="category[3]['name']")
	public WebElement EnterNameC3;
	
	@FindBy(name="category[4]['name']")
	public WebElement EnterNameC4;
	
	@FindBy(xpath="//label[@for='assessment_restrict_access']")
	public WebElement tickMakeAssessPriv;
	
	@FindBy(name="limit_days")
	public WebElement limitDays;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	public WebElement enterReportSumm;
	
	@FindBy(xpath="//label[@for='assessment_show_question_descriptions']")
	public WebElement tickShowDesc;
	
	@FindBy(xpath="//label[@for='assessment_show_detailed_summary']")
	public WebElement tickShowSumm;
	
	@FindBy(xpath="//label[@for='assessment_show_detailed_next_steps']")
	public WebElement tickShowNS;
	
	@FindBy(xpath="//label[@for='assessment_show_detailed_nist_graph']")
	public WebElement tickShowHeatMap;
	
	@FindBy(xpath="//label[@for='assessment_show_super_section_descriptions']")
	public WebElement tickShowSuperSec;
	
	@FindBy(xpath="//label[@for='assessment_executive_report']")
	public WebElement tickGenerateExec;
	
	@FindBy(xpath="//div[@class='react-select__control css-yk16xz-control']")
	public WebElement slGraph;
	
	@FindBy(xpath="//div[text()='Radar']")
	public WebElement slRadar;
	
	@FindBy(xpath="//span[contains(text(),' Publish ')]")
	public WebElement clPublish;
	
	@FindBy(tagName="h4")
	public WebElement success;
	
	//Actions
	public void clickOnResource() {
		waithelper.WaitForElement(ResName,20);
		ResName.click();
	}
	
	public void clickOnAssessmentTab() {
		waithelper.WaitForElement(clAssessmentTab,20);
		ResName.click();
	}
	
	public void clickOnPublishBtn() {
		waithelper.WaitForElement(clPublishbtn,20);
		clPublishbtn.click();
	}
	
	public void clickOnTemplateDropDown() {
		waithelper.WaitForElement(TemplateDrDw,20);
		TemplateDrDw.click();
	}
	public void selectTemplate() {
		waithelper.WaitForElement(SelectTemp,20);
		SelectTemp.click();
	}
	
	public void clickonNext() {
		waithelper.WaitForElement(clNext,20);
		clNext.click();
	}
	public void clickOnAllowEdit() {
		waithelper.WaitForElement(tickAllowEdit,20);
		tickAllowEdit.click();
	}
	public void clickOnAllowPartialSave() {
		waithelper.WaitForElement(tickAllowPartialSave,20);
		tickAllowPartialSave.click();
	}
	public void clickOnAllowCategories() {
		waithelper.WaitForElement(tickAllowCategories,20);
		tickAllowCategories.click();
	}
	public void EnterNameC1() {
		waithelper.WaitForElement(EnterNameC1,20);
		EnterNameC1.sendKeys("Identify");
	}
	public void EnterNameC2() {
		waithelper.WaitForElement(EnterNameC2,20);
		EnterNameC2.sendKeys("Protect");
	}
	public void EnterNameC3() {
		waithelper.WaitForElement(EnterNameC3,20);
		EnterNameC3.sendKeys("Respond");
	}
	public void EnterNameC4() {
		waithelper.WaitForElement(EnterNameC4,20);
		EnterNameC4.sendKeys("Awareness");
	}
	public void clicktoMakeAssessmentPrivate() {
		waithelper.WaitForElement(tickMakeAssessPriv,20);
		tickMakeAssessPriv.click();
	}
	public void enterlimitDays(String Days) {
		waithelper.WaitForElement(limitDays,20);
		limitDays.sendKeys(Days);
	}

	public void enterReportSumm() {
		waithelper.WaitForElement(enterReportSumm,20);
		enterReportSumm.sendKeys("This is sample detailed report for a template");
	}
	public void clickOnShowDescription() {
		waithelper.WaitForElement(tickShowDesc,20);
		tickShowDesc.click();
	}
	public void clickOnShowSummary() {
		waithelper.WaitForElement(tickShowSumm,20);
		tickShowSumm.click();
	}
	public void clickOnShowNextSteps() {
		waithelper.WaitForElement(tickShowNS,20);
		tickShowNS.click();
	}
	public void clickOnShowHeatMap() {
		waithelper.WaitForElement(tickShowHeatMap,20);
		tickShowHeatMap.click();
	}
	public void clickOnShowSuperSection() {
		waithelper.WaitForElement(tickShowSuperSec,20);
		tickShowSuperSec.click();
	}
	public void clickOnGenerateExecReport() {
		waithelper.WaitForElement(tickGenerateExec,20);
		tickGenerateExec.click();
	}
	public void selectGraph() {
		waithelper.WaitForElement(slGraph,20);
		slGraph.click();
	}

	public void selectRadar() {
		waithelper.WaitForElement(slRadar,20);
		slRadar.click();
	}
	public void clickPublishAssessment() {
		waithelper.WaitForElement(clPublish,20);
		clPublish.click();
	}
	public void successmsg(String message) throws InterruptedException {
		waithelper.WaitForElement(success,20);
		Assert.assertTrue((success).getText()
				.contains(message));
	}
}
