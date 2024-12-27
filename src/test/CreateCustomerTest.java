package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pomPages.CreateCustomerPage;


public class CreateCustomerTest extends BaseTest   {

	CreateCustomerTest createcustomertest;
	
	
	//public static WebDriver driver;

	public CreateCustomerTest() {
		//super();
		//createcustomertest = new CreateCustomerTest();
	}
	
	 
     
	@Test(priority=1, description = "Verify that title should be the same as wizcommerce")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify login")
	public void loginPageTitleTest() {
		String title = CreateCustomerPage.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "WizCommerce");
	}
     
     
     
     @Story("verify that user should be able to enter email")
 	//@Test(priority = 2,description = "validating user should be able to enter email and password")
     @Severity(SeverityLevel.MINOR)
     public void logintest() throws Exception {
    	 
    			pomPages.CreateCustomerPage email_field = new pomPages.CreateCustomerPage();
    			email_field.login();
    			
     }
    
     
     @Test(priority=3, description = "user should be able to click on customers tab")
 	@Severity(SeverityLevel.BLOCKER)
 	@Description("redirecting to user page")
     public void click_customer_tab() throws Exception {
    	 
    	 pomPages.CreateCustomerPage click_customer_tab = new pomPages.CreateCustomerPage();
    	 
    	 click_customer_tab.click_customer_tab();
    	 
     }
     
     
     @Test(priority=5, description = "Create customer button should be display")
     @Severity(SeverityLevel.BLOCKER)
     public void create_customer_button_display(){
    	 pomPages.CreateCustomerPage create_customer_button_display = new pomPages.CreateCustomerPage();
    	 create_customer_button_display.create_customer_button_isdisplay();
 		
 	}
 	
 	
     @Test(priority=6, description = "Create customer button should be clickable")
     @Severity(SeverityLevel.BLOCKER)
 	public void create_customer_button_enabled(){
 			
 		pomPages.CreateCustomerPage create_customer_button_enabled = new pomPages.CreateCustomerPage();	
 		create_customer_button_enabled.create_customer_button_isenabled();		
 		
 	}
 	
 	
     @Test(priority=7, description = "To check create customer spelling is correct")
     @Severity(SeverityLevel.CRITICAL)
 	   public void create_customer_button_spelling_check() {
 		   
 		  pomPages.CreateCustomerPage create_customer_button_spelling_checks = new pomPages.CreateCustomerPage();   
 		 create_customer_button_spelling_checks.create_customer_button_spelling_check();
 		   
 		   
 	   }
     
    
     @Test(priority=8, description = "to check create button is clicked")
     @Severity(SeverityLevel.CRITICAL)
     public void create_customer_button_click() throws Exception {
    	 
    	 pomPages.CreateCustomerPage create_customer_button = new pomPages.CreateCustomerPage();
    	 
    	 create_customer_button.click_create_customer_button();
    	 
    	 
     }
     
     
     
     @Test(priority=9, description = "to check heading should be add customer of customer form")
     @Severity(SeverityLevel.NORMAL)
     public void verify_add_customer_title() {
    	 
    	 pomPages.CreateCustomerPage addcustomer_title = new pomPages.CreateCustomerPage();
    	 addcustomer_title.addcustomer_title();
    	
     }
     
     @Test(priority=10, description = "to check basic details heading is display on not")
     @Severity(SeverityLevel.MINOR)
     public void verify_basic_details_heading() {
    	 
    	 pomPages.CreateCustomerPage basic_details_heading = new pomPages.CreateCustomerPage();
    	 basic_details_heading.basic_details_heading_isdisplay();
     }
     
     
     @Test(priority=11, description = "To check Basic Details spelling is correct or not")
     @Severity(SeverityLevel.MINOR)
     public void verify_basic_details_spelling() {
    	 
    	 pomPages.CreateCustomerPage basic_details_spelling = new pomPages.CreateCustomerPage();
    	 basic_details_spelling.basic_details_heading_spelling_check();
     }
     
     
     @Test(priority=12, description = "user should ber able to enter company name ")
     @Severity(SeverityLevel.BLOCKER)
     public void company_name() {
    	pomPages.CreateCustomerPage CompanyName =  new pomPages.CreateCustomerPage(); 
    	CompanyName.enter_company_name();
    	 
     }
     
     
     @Test(priority=13, description = "user should ber able to click on catalog dropdown")
     @Severity(SeverityLevel.BLOCKER)
     public void click_catalog_dropdown() {
    	pomPages.CreateCustomerPage catalogdropdown =  new pomPages.CreateCustomerPage(); 
    	catalogdropdown.click_catalog();
    	 
     }
     
     
     
     @Test(priority=14, description = "user should ber able to select value from catalog dropdown")
     @Severity(SeverityLevel.BLOCKER)
     public void select_catalog() throws Exception {
    	pomPages.CreateCustomerPage catalogselect =  new pomPages.CreateCustomerPage(); 
    	catalogselect.select_catalog();
    	 
     }
     
     
     @Test(priority=15, description = "user should ber able to click on add contact button ")
     @Severity(SeverityLevel.BLOCKER)
     public void click_addcontactc() throws Exception {
    	pomPages.CreateCustomerPage click_addcontactc =  new pomPages.CreateCustomerPage(); 
    	click_addcontactc.click_add_contact_button();
    	 
     }
     
     
     

     @Test(priority=16, description = "user should ber able to select value from catalog dropdown")
     @Severity(SeverityLevel.BLOCKER)
     public void verify_Elemnts_OnPage_Test() throws Exception {
    	pomPages.CreateCustomerPage elements_onpage =  new pomPages.CreateCustomerPage(); 
    	elements_onpage.verifyElemntsOnPageTest();
     }
     
     
     @Test(priority=17, description = "user should ber able to select value from catalog dropdown")
     @Severity(SeverityLevel.BLOCKER)
     public void emptyAllFiledsTest() throws Exception {
    	pomPages.CreateCustomerPage empty_AllFiledsTest =  new pomPages.CreateCustomerPage(); 
    	empty_AllFiledsTest.emptyAllFiledsTest();
     }
     
     
     @Test(priority=18, description = "verify email and phone error message")
     @Severity(SeverityLevel.BLOCKER)
     public void Emailandphoneerrortest() throws Exception {
    	pomPages.CreateCustomerPage Emailandphoneerror =  new pomPages.CreateCustomerPage(); 
    	Emailandphoneerror.emptyEmailtest();
     }
     
     @Test(priority=19, description = "verify that save button is appear and clickable ")
     @Severity(SeverityLevel.BLOCKER)
     public void click_save_buttontest() throws Exception {
    	pomPages.CreateCustomerPage save_details =  new pomPages.CreateCustomerPage(); 
    	save_details.click_save_button();
     }
     
     
     @Test(priority=20, description = "verify that all the element are displaying on ad customer")
     @Severity(SeverityLevel.BLOCKER)
     public void verify_elements_on_addcustomer() throws Throwable {
    	 
    	pomPages.CreateCustomerPage elements =  new pomPages.CreateCustomerPage();
    	elements.verifyElemntsOnAddCustomer();
    	 
    	 
     }
     @Test(priority=21, description = "verify that add details button should be clickale ")
     @Severity(SeverityLevel.BLOCKER)
     public void verify_add_details_button() throws Throwable {
    	 
    	pomPages.CreateCustomerPage AddDetailsButton =  new pomPages.CreateCustomerPage();
    	AddDetailsButton.add_details_button_click();
     
     
     }
     
     @Test(priority=22, description = "verify that all headers should be there or not ")
     @Severity(SeverityLevel.BLOCKER)
     public void Verify_addDetailsHeaders() {
    	 
    	 pomPages.CreateCustomerPage Headers = new pomPages.CreateCustomerPage();
    			 Headers.verifyHeadersOnAddDetails();
    	 
     }
     
     
     
     @Test(priority=23, description = "verify that all headers should be there or not ")
     @Severity(SeverityLevel.BLOCKER)
     public void Verify_addDetailsHeadersEnabled() {
    	 
    	 pomPages.CreateCustomerPage HeadersEnabled = new pomPages.CreateCustomerPage();
    	 HeadersEnabled.verifyheadersenabled();
    	 
     }
     
     @Test(priority=24, description = "verify that all headers should be clickable")
     @Severity(SeverityLevel.BLOCKER)
     public void CheckHeadersClickable() throws Exception {
    	 
    	 pomPages.CreateCustomerPage HeadersEnabled = new pomPages.CreateCustomerPage();
    	 HeadersEnabled.checkheadersclicked();
    	 
     }
     
}
     




