package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class Steps extends BaseClass {
	
	@Given("User Lunch Chrome Browser")
	public void user_lunch_chrome_browser() {
	  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver=new ChromeDriver();
	   lp=new LoginPage(driver);
	
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pword) {
		lp.setUserName(email);
		lp.setPassWord(pword);
	   
	}

	@When("Click login")
	public void click_login() throws InterruptedException {
	   lp.clickLogin();
	   Thread.sleep(2000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful."))
	   {
		  driver.close();
		  Assert.assertTrue(false);
	   }
	   else {
		   Assert.assertEquals(title,driver.getTitle());
	   }
	}

	@When("User click on logout Link")
	public void user_click_on_logout_link() throws InterruptedException {
	    lp.clickLogout();
	    Thread.sleep(2000);
	}
	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	   
	}


}
