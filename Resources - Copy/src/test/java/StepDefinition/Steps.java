package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Create_Resource;
import PageObjects.Del_Using_Checkbox;
import PageObjects.Delete_Resource;
import PageObjects.LoginPage;
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
	public void user_opens_url(String url) {
		driver.get(url);
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
	@Then("click select type and click on website option")
	public void click_select_type_and_click_on_website_option() {
	   CR.clickonSelectType();
	   CR.SlType();
	}
	@Then("click on user circle")
	public void click_on_user_circle() {
	   CR.clickUserCircle();
	}
	@Then("select user from dropdown")
	public void select_user_from_dropdown() {
	  CR.selectUser();
	  CR.clickUserCircle();
	}
	
	@Then("Enter Name of Website")
	public void enter_name_of_website() {
	 CR.EnterName();
	}
	@Then("Enter URL of Website")
	public void enter_url_of_website() {
	 CR.EnterUrl();
	}

	@Then("Select state of website from dropdown as In Use")
	public void select_state_of_website_from_dropdown_as_in_use() {
	    CR.clickState();
	    CR.SelectState();
	}
	@Then("select protocol as https from dropdown")
	public void select_protocol_as_https_from_dropdown() {
	    CR.clickProtocol();
	    CR.selectProtocol();
	}
	@Then("select environment as Production from dropdown")
	public void select_environment_as_production_from_dropdown() {
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
	public void user_can_view_resource_created_msg(String string) throws InterruptedException {
		CR.successmsg();  
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
	
	@Then("click on resources")
	public void click_on_resources() {
		BD = new Del_Using_Checkbox(driver);
		   BD.clickonResourcesTab();
	}
	
	@Then("click on bulk checkbox to delete resource")
	public void click_on_bulk_checkbox_to_delete_resource() {
		BD.clickonCheckbox();
	}
	@Then("click on toggle dropown button to delete")
	public void click_on_toggle_dropown_button_to_delete() {
	  BD.clickonToggle();
	}
	@Then("click on delete to delete resource")
	public void click_on_delete_to_delete_resource() {
	   BD.clickonDeletebtn();
	}
//	@Then("user can see deleted msg {string}")
//	public void user_can_see_deleted_msg(String string) throws InterruptedException {
//	   DR.successmsg();
//	}
	

}
