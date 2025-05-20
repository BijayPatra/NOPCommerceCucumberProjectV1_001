package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	public WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	By linkCustomers_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By linkCustomers_menuItem=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	
	By btnAddnew= By.xpath("//a[@class='btn btn-primary']");
	By txtemail=By.xpath("//input[@id='Email']");
	By txtpword=By.xpath("//input[@id='Password']");
	By txtfname=By.xpath("//input[@id='FirstName']");
	By txtlname=By.xpath("//input[@id='LastName']");
	By gender_male=By.xpath("//input[@id='Gender_Male']");
	By gender_female=By.xpath("//input[@id='Gender_Female']");
	By dateOfbirth=By.xpath("//input[@id='DateOfBirth']");
	By company_name=By.xpath("//input[@id='Company']");
	By isTax_exempt=By.xpath("//input[@id='IsTaxExempt']");
	By news_letter=By.xpath("//span[@aria-expanded='true']//input[@role='searchbox']");
	By customer_role=By.xpath("//span[@aria-expanded='true']//input[@role='searchbox']");
	
	By customer_admin=By.xpath("//li[@id='select2-SelectedCustomerRoleIds-result-mzxg-1']");
	By customer_formodurator=By.xpath("//li[@id='select2-SelectedCustomerRoleIds-result-5e68-2']");
	By customer_register=By.xpath("//li[@id='select2-SelectedCustomerRoleIds-result-sw34-3']");
	By company_guest=By.xpath("//li[@id='select2-SelectedCustomerRoleIds-result-feof-4']");
	By manager_vendor=By.xpath("//select[@id='VendorId']");
	By manager_testrole=By.xpath("//li[@id='select2-SelectedCustomerRoleIds-result-3tan-6']");
	By active=By.xpath("//input[@id='Active']");
	By admincomment=By.xpath("//textarea[@id='AdminComment']");
	//li[@title='Vendors']
	//Action Methods
	public String getTitle() {
		String title=ldriver.getTitle();
		return title;
	}
	public void clickOnCustomersMenu() {
		ldriver.findElement(linkCustomers_menu).click();
	}
	public void clickOnCustomersMenuItem() {
		ldriver.findElement(linkCustomers_menuItem).click();
	}
	public void clickOnAddnewButton() {
		ldriver.findElement(btnAddnew).click();
	}
	public void setEmail(String email) {
		ldriver.findElement(txtemail).sendKeys(email);
	}
	public void setPword(String pword) {
		ldriver.findElement(txtpword).sendKeys(pword);
	}
	public void setCustomerRoles(String role) throws InterruptedException {
		if(!role.equals("Vendors"))
		{
			ldriver.findElement(By.xpath("//span[@aria-expanded='true']//input[@role='searchbox']"));
		}
		ldriver.findElement(customer_role).click();
		WebElement listitem;
		Thread.sleep(3000);
		
		if(role.equals("Administrators"))
		{
			listitem=ldriver.findElement(customer_admin);
		}
		else if(role.equals("Guests"))
		{
			listitem=ldriver.findElement(company_guest);
		}
		else if(role.equals("Registered"))
		{
			listitem=ldriver.findElement(customer_register);
		}
		else if(role.equals("Vendors"))
		{
			listitem=ldriver.findElement(manager_vendor);
		}
		else
		{
			listitem=ldriver.findElement(company_guest);
		}
		listitem.click();
		
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listitem);
		
	}
	public void setManagerOfVendor(String value)
	{
		Select drop=new Select(ldriver.findElement(manager_vendor));
		drop.selectByVisibleText(value);
	}
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			ldriver.findElement(gender_male).click();
		}
		if(gender.equals("Female"))
		{
			ldriver.findElement(gender_female).click();
		}
		else
		{
			ldriver.findElement(gender_male).click();//default
		}
	}
	public void setFirstName(String fname)
	{
		ldriver.findElement(txtfname).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		ldriver.findElement(txtlname).sendKeys(lname);
	}
	
}
