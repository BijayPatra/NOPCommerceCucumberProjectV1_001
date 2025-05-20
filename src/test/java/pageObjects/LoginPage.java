package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public  LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="Email")
	WebElement txtEmail;

	@FindBy(id="Password")
	WebElement txtPassword;

	@FindBy(xpath="//button[.='Log in']")
	WebElement btnLogin;
	
	@FindBy(linkText ="Logout")
	WebElement lnkLogout;
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	public void setPassWord(String pword) {
		txtPassword.clear();
		txtPassword.sendKeys(pword);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	public void clickLogout() {
		lnkLogout.click();
	}
}
