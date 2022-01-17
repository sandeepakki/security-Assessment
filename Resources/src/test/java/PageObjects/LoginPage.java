package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(name="email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//span[text()='LOGIN']")
	@CacheLookup
	WebElement clickLogin;
	
	@FindBy(xpath="//span[@class='name mr-3']")
	WebElement clickUsericon;
	
	@FindBy(xpath="//button[@type='button'][3]")
	@CacheLookup
	WebElement clickSignout;
	
	public void setUsername(String uname) {
		
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
		
	}
	public void clickLogin() {
		
	clickLogin.click();
	
	}
	
	public void clickUsericon() {
		
		clickUsericon.click();
		
		}

	
	public void clickSignout() {
	
		clickSignout.click();
	}


}
