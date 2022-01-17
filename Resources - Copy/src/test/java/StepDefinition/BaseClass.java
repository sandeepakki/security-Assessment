package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.Create_Resource;
import PageObjects.Del_Using_Checkbox;
import PageObjects.Delete_Resource;
import PageObjects.LoginPage;
import PageObjects.Update_Resource;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public Create_Resource CR;
	public Update_Resource UR;
	public Delete_Resource DR;
	public Del_Using_Checkbox BD;

}
