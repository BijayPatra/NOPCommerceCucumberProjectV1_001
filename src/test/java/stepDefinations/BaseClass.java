package stepDefinations;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addcust;

	public static String randomString()
	{
		String randomEmail=RandomStringUtils.randomAlphanumeric(5);
		return randomEmail;
	}
}