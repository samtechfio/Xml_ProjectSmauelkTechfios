package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;



public class AddCustomerTest {
	
	WebDriver driver;
	
	
	
/*	//@Test
	@Parameters({"userName", "password", "FullName", "CompanyName", "Email", "Phone", "Address", "City", "State", "Zip", "Country"})
	public void validUserShouldBeAbleToCreateCustomer(String userName,String password,String fullname,String companyName,String email,String phone,String address,String city,String state,String zip, String country)
 {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  //create an object using PageFactory keyword
		
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.ClicksigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomersButton();
		dashboardPage.clickAddCustomersButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterFullName(fullname);
		addCustomerPage.enterCompany(companyName);
		addCustomerPage.enterEmail(email);
		addCustomerPage.enterPhone(phone);
		addCustomerPage.enterAdress(address);
		addCustomerPage.enterCity(city);
		addCustomerPage.enterState(state);
		addCustomerPage.enterZipcode(zip);
		addCustomerPage.enterCountry(country);
		addCustomerPage.clickSaveButtonOnAddContact();
		
		addCustomerPage.verifySummaryPage();
		dashboardPage.clickListCustomersButton();
		
		addCustomerPage.verifyEnteredNameAndDelete();
		
			
	}*/
	@Test
	@Parameters({"userName", "password", "FullName", "CompanyName", "Email", "Phone", "Address", "City", "State", "Zip", "Country"})
	public void validUserShouldBeAbleToAddCustomerOnListCustomerPage(String userName,String password,String fullname,String companyName,String email,String phone,String address,String city,String state,String zip, String country)
 {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  //create an object using PageFactory keyword
		
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.ClicksigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomersButton();
		dashboardPage.clickListCustomersButton();
		
				
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.clickAddCustomerOnListCustomerPage();
		addCustomerPage.enterFullName(fullname);
		addCustomerPage.enterCompany(companyName);
		addCustomerPage.enterEmail(email);
		addCustomerPage.enterPhone(phone);
		addCustomerPage.enterAdress(address);
		addCustomerPage.enterCity(city);
		addCustomerPage.enterState(state);
		addCustomerPage.enterZipcode(zip);
		addCustomerPage.enterCountry(country);
		addCustomerPage.clickSaveButtonOnAddContact();
		
		addCustomerPage.verifySummaryPage();
		dashboardPage.clickListCustomersButton();
		addCustomerPage.insertNameOnSearchBarOnListCustomer();
		addCustomerPage.verifySearchBarAndSummaryButtonOnListCustomer();
		addCustomerPage.verifySummaryPage();
		
		BrowserFactory.tearDown();
		
		
		
		
			
 	}
}	


