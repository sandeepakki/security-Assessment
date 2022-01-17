package StepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Control_Creation;
import PageObjects.Control_Evidence;
import PageObjects.Create_Resource;
import PageObjects.Del_Using_Checkbox;
import PageObjects.Delete_Resource;
import PageObjects.LoginPage;
import PageObjects.PublishAssessment;
import PageObjects.Review_Control_Evidence;
import PageObjects.Update_Control;
import PageObjects.Update_Resource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		lp=new LoginPage(driver);
	}
	
	@When("user opens url {string}")
	public void user_opens_url(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) throws InterruptedException {
		Thread.sleep(3000);
		lp.setUsername(email);
		lp.setPassword(password);
	}

	@When("click on LOGIN")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {

		Assert.assertEquals(title,driver.getTitle());

	}

	@Then("click on user icon")
	public void click_on_user_icon() throws InterruptedException {
		lp.clickUsericon();
		Thread.sleep(1000);
	}

	@When("user click on Sign Out link")
	public void user_click_on_sign_out_link() {
		lp.clickSignout();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}

	//create resource 
	 @Then("click on resources tab")
		public void click_on_resources_tab() {
			CR = new Create_Resource(driver);
			   CR.clickonResourcesTab();
		}
		@Then("click on create resource")
		public void click_on_create_resource() {
			 CR.clickonAddNewBtn();
		}
	
	@Then("click select Resource type as Website")
	public void click_select_resource_type_as_Website() {
		 CR.clickonSelectType();
		   CR.SlType();
	}
	@Then("click on user circle")
	public void click_on_user_circle() {
		CR.clickUserCircle();
	}
	@Then("select user from dropdown")
	public void select_user_from_dropdown() throws InterruptedException {
		CR.selectUser();
		  CR.clickUserCircle();
	}
	@Then("Enter Name {string} of Website")
	public void enter_name_of_website(String parentName) {
		CR.EnterName(parentName);
	}
	@Then("Enter URL {string} of Website")
	public void enter_url_of_website(String parentUrl) {
		CR.EnterUrl(parentUrl);
	}
	@Then("Select state of website from dropdown")
	public void select_state_of_website_from_dropdown() {
		 CR.clickState();
		    CR.SelectState();
	}
	@Then("select protocol  as https from dropdown")
	public void select_protocol_as_https_from_dropdown() {
		 CR.clickProtocol();
		    CR.selectProtocol();
	}
	@Then("select environment from dropdown")
	public void select_environment_from_dropdown() {
		  CR.clickEnvironment();
		    CR.selectEnvironment();
	}
	@Then("Enter Description of the website")
	public void enter_description_of_the_website() {
		CR.InputDescription();
	}
	@Then("select Parent from dropdown")
	public void select_parent_from_dropdown() {
	    CR.clickParent();
	    CR.selectParent();
	}
	@Then("click on createBtn")
	public void click_on_create_btn() {
		 CR.submit();
	}
	@Then("user can view Resource Created msg {string}")
	public void user_can_view_resource_created_msg(String message) throws InterruptedException {
		CR.successmsg(message);  
	}	
		
	//Edit Resource
	
	@Then("click on Prostoo Resource")
	public void click_on_prostoo_resource() {
		UR = new Update_Resource(driver);
		UR.clickonProstooRes();
	}
	@Then("click on Edit button")
	public void click_on_edit_button() {
	    UR.clickonEditBtn();
	}
	@Then("Remove existing user and add new user")
	public void remove_existing_user_and_add_new_user() {
	   UR.clickonOwner();
	   UR.clearOwner();
	   UR.closeAvatar();
	   UR.clickUserCircle();
	   UR.selectUser();
	}
	@Then("Edit Name, State")
	public void edit_name_state() {
		UR.EnterName();
		UR.clickState();
		UR.selectState();
	   
	}
	@Then("click on Update")
	public void click_on_update() {
	    UR.clickonUpdate();
	}
	@Then("user can see updated msg {string}")
	public void user_can_see_updated_msg(String string) throws InterruptedException {
	   UR.successmsg();
	}
//Deleting Resource
	@Then("click on Resource")
	public void click_on_resource() {
		DR = new Delete_Resource(driver);
		DR.clickonProstooRes();
	}
	
	@Then("click on delete button")
	public void click_on_delete_button() {
	    DR.clickonDelete();
	}
	@Then("Click on yes,delete")
	public void click_on_yes_delete() {
	    DR.confirmDeletion();
	}
	@Then("user can see deleted msg {string}")
	public void user_can_see_deleted_msg(String string) throws InterruptedException {
	   DR.successmsg();
	}
	// Deleting control from main page using bulk delete option
	
	@Then("click on delete to delete resource")
	public void click_on_delete_to_delete_resource() throws InterruptedException {
		BD = new Del_Using_Checkbox(driver);
	   BD.clickonDeletebtn();
	}
	
	//Creating Control From Template
	@Then("click on ProstooRes")
	public void click_on_prostoo_res() {
		   CC = new Control_Creation(driver);
		   CC.clickOnProstooRes();
	}
	
	@Then("click on Controls")
	public void click_on_controls() {
	   CC.clickOnControls();
	}
	@Then("click on AddNew button")
	public void click_on_add_new_button() {
	   CC.clickOnAddNew();
	}
	@Then("click on Continue")
	public void click_on_continue() {
		CC.clickOnContinue();
	}
	@Then("click on Add")
	public void click_on_add() throws InterruptedException {
	  CC.clickOnAdd();
	}
	@Then("Click on perform Control")
	public void click_on_perfrom_control() {
	CC.clickOnControlPerform();
	}
	
	//Edit Control
	
	@Then("click on Pencil to Edit control")
	public void click_on_pencil_to_edit_control() {
	    UC = new Update_Control(driver);
	    UC.clickOnEdit();
	}
	@Then("change key value to Non Key")
	public void change_key_value_to_non_key() {
	  UC.clickOnKey();
	  UC.selectKey();
	}
	@Then("click on obejective and select objective")
	public void click_on_obejective_and_select_objective() {
		UC.clickObjective();
		UC.selectObjective();
	}
	@Then("select Reviewer")
	public void select_reviewer() {
	 UC.clickReviewer();
	 UC.selectReviewer();
	 UC.clickReviewer();
	}
	@Then("click on Update control")
	public void click_on_update_control() {
	 UC.clickUpdate();  
	}

	//Attach Evidence file
	
	@Then("Go to Review tab and Click on it")
	public void go_to_review_tab_and_click_on_it() {
	    CE = new Control_Evidence(driver);
	    CE.clickOnReview();
	}
	@Then("click on upload new evidence")
	public void click_on_upload_new_evidence() {
	    CE.clickUploadButton();
	}
	@Then("select compliance status and enter remarks")
	public void select_compliance_status_and_enter_remarks() {
	    CE.clickSelectStatus();
	    CE.selectCompliance();
	    CE.EnterRemarks();
	}
	@Then("upload Evidence")
	public void upload_evidence_and_click_submit() throws InterruptedException, AWTException {
	   CE.uploadEvidenceFile();
	   CE.clickSubmit();
	}
	@Then("click Submit")
	public void click_Submit() throws InterruptedException {
	   CE.clickSubmit();
	}
	
	//Verify attached file as reviewer
	@Then("click on in progress state")
	public void click_on_in_progress_state() {
	   RCE = new Review_Control_Evidence(driver);
	   RCE.clickInProgress();
	}
	
	@Then("click on All attachments tab")
	public void click_on_all_attachments_tab() {
	    RCE.clickAllAttachments();
	}
	@Then("click to download attachment")
	public void click_to_download_attachment() {
	   RCE.clickFile();
	}
	@Then("click to show all attachments as List view")
	public void click_to_show_all_attachments_as_list_view() {
	  RCE.clickListView();
	}
	@Then("again click on file to download")
	public void again_click_on_file_to_download() {
	    RCE.clickOnEvidence();
	}
	@Then("click on Activity tab")
	public void click_on_activity_tab() {
	 RCE.clickOnActivityTab();
	}
	@Then("change the compliance state and enter description")
	public void change_the_compliance_state_and_enter_description() {
	RCE.clickSelectStatus();
	RCE.selectCompliance();
	RCE.EnterRemarks();
	}
	@Then("submit the form")
	public void submit_the_form() throws InterruptedException {
	   RCE.clickSubmit();
	}	
	@Then("Mark as Done")
	public void mark_as_done() {
	    RCE.clickInProgress();
	    RCE.clickMarkAsDone();
	}
	
	//Publishing Assessment from Resource
	
	@Then("click on any resource {string}")
	public void click_on_any_resource(String string) {
	    PA = new PublishAssessment(driver);
	    PA.clickOnResource();
	}
	@Then("click on Assessments Tab")
	public void click_on_assessments_tab() {
	    PA.clickOnAssessmentTab();
	}
	@Then("click on Publish Button")
	public void click_on_publish_button() {
	    PA.clickOnPublishBtn();
	}
	@Then("Select Template from dropdown")
	public void select_template_from_dropdown() {
	   PA.clickOnTemplateDropDown();
	}
	@Then("click Next")
	public void click_next() {
	    PA.clickonNext();
	}
	@Then("click Allow Editing")
	public void click_allow_editing() {
	  PA.clickOnAllowEdit();
	}
	@Then("click Allow Partial Save")
	public void click_allow_partial_save() {
		PA.clickOnAllowPartialSave();
	}
	@Then("click on Make Assessment Private")
	public void click_on_make_assessment_private() {
	   
	}
	@Then("Enter Limit No.of Days {string}")
	public void enter_limit_no_of_days(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("enter Report Summary")
	public void enter_report_summary() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click on show descriptions")
	public void click_on_show_descriptions() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click on show summary")
	public void click_on_show_summary() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click next steps in report")
	public void click_next_steps_in_report() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click on heap map")
	public void click_on_heap_map() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click super section")
	public void click_super_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click Generate Executive report")
	public void click_generate_executive_report() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("select dropdown for radar or heatmap on executive")
	public void select_dropdown_for_radar_or_heatmap_on_executive() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click Publish assessment")
	public void click_publish_assessment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user can see the successfully publish {string}")
	public void user_can_see_the_successfully_publish(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	
	
}
