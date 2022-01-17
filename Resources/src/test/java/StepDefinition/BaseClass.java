package StepDefinition;

import org.openqa.selenium.WebDriver;

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

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public Create_Resource CR;
	public Update_Resource UR;
	public Delete_Resource DR;
	public Del_Using_Checkbox BD;
	public Control_Creation CC;
	public Update_Control UC;
	public Control_Evidence CE;
	public Review_Control_Evidence RCE;
	public PublishAssessment PA;
}
