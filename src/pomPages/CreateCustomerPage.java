package pomPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import generic.BaseTest;
import io.qameta.allure.Step;


public class CreateCustomerPage extends BaseTest {

	Logger logger;
	
	//public static WebDriver driver;
	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	
	     //user name on login page 
		@FindBy(xpath = "(//input[@id=\"outlined-basic\"])[1]")
		WebElement username;
	
		//password field for login
		@FindBy(xpath = "(//input[@id=\"outlined-basic\"])[2]")
		WebElement password;
	
		//login button on login page
		@FindBy(xpath = "//button[text()=\"Login\"]")
		WebElement loginBtn;
		
		
		//Cusmoer tab from side bar 
		@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0\"][4]")
		 WebElement customers_tab;
		
		
		//create customer button on customer page 
		@FindBy(xpath = "//*[contains(text(),'Create Customer')]")
		WebElement create_customer_button;
		
		// add cutomer title 
		@FindBy(xpath = "//*[contains(text(),'Add Customer')]")
		WebElement add_customer_string;
		
		
		//back icon button
		@FindBy(xpath = "//div[@class=\"MuiGrid-root css-1urrgf5\"]")
		WebElement Back_Icon_Button;
		
		
		//Basic details heading xpath
		@FindBy(xpath = "//*[contains(text(),'Basic Details')]")
		WebElement basic_details_heading;
		
		//company name text field
		@FindBy(name = "company_name")
	   WebElement company_name;
		
		
		//sales rep field 
		@FindBy(id = "select-id")
		WebElement Sales_rep;
		
		
		//catalog drop down
		@FindBy(id = "mui-component-select-catalog_group")
		WebElement select_catalog_dropdown;
		
		
		//dealer value from dropdown
		@FindBy(xpath = "//*[contains (text(), 'Dealer')]")
		WebElement Dealer;
		
		//Designer value from dropdown
		@FindBy(xpath = "//*[contains (text(), 'Designer')]")
		WebElement Designer;
		
		//Wholesale value from dropdown
		@FindBy(xpath = "//*[contains (text(), 'Wholesale')]")
		WebElement Wholesale;
		
		
		//xpath for Primary contact string 
		@FindBy(xpath = "//*[contains (text(), 'Primary contact')]")
		WebElement primary_contact_title;
		
		
		//xpath for Add contact button 
		@FindBy(xpath = "//*[contains (text(), 'Add contact')]")
		WebElement add_contact_button;
		
		
		//side sheet 
		@FindBy(xpath = "//*[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-elevation16 MuiDrawer-paper MuiDrawer-paperAnchorRight css-1ryhpzo\"]")
		WebElement add_contact_sidesheet;
		
		//add contact heading 
		@FindBy(xpath = "(//*[contains (text(), 'Add contact')])[2]")
		WebElement add_contact_form_heading;
		
		//first name field 
		@FindBy(name = "first_name")
		WebElement first_name_textfield;
		
		//last name field 
		@FindBy(name = "last_name")
		WebElement last_name_textfield;
		
		//phone number field
		@FindBy(name = "Phone number")
		WebElement Phone_number_textfiled;
		
		//phone number field 
		@FindBy(xpath = "//div[@class=\"selected-flag\"]")
		WebElement country_dropdown;
		
		//designation field
		@FindBy(name = "designation")
		WebElement designation_textfield;
		
		//email filed
		@FindBy(name = "email")
		WebElement email_textfiled;
		
		//checkbox
		@FindBy(xpath = "//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
		WebElement set_primary_checkbox;
		
		//set as primary 
		@FindBy(xpath = "//*[contains (text(), 'Set as primary')]")
		WebElement Setas_primary_String;
		
		//cancel button for add details page and side bar
		@FindBy(xpath = "//*[contains (text(), 'Cancel')]")
		WebElement cancel_button;
		
		//Submit button
		@FindBy(xpath = "//button[@type='submit']")
		WebElement submit_button;
		
		
		//xpath for Primary addresses_section_title string 
		@FindBy(xpath = "//*[contains (text(), 'Addresses')]")
		WebElement addresses_section_title;
		
		
		
		        //xpath for Billing_Address_heading 
			@FindBy(xpath = "//*[contains (text(), 'Billing Address')]")
			WebElement Billing_Address_heading;
		
		      //xpath for Add billing address button 
			@FindBy(xpath = "//*[contains (text(), 'Add billing address')]")
			WebElement Add_billing_address_button;
		
		
			
		       //xpath for Shipping_Address_Heading 
		    @FindBy(xpath = "//*[contains (text(), 'Shipping Address')]")
			WebElement Shipping_Address_Heading;
			
	
		          //xpath for Add shipping address button 
				@FindBy(xpath = "//*[contains (text(), 'Add shipping address')]")
				WebElement Add_shipping_address_button;
		
		
		           //xpath for Preferences Heading
		         @FindBy(xpath = "//*[contains (text(), 'Preferences')]")
		         WebElement Preferences_Heading;
		
		
		          //Add details button 
				@FindBy(xpath ="//*[contains (text(), 'Add Details')]")
				WebElement Add_Details_button;
			
			
				  // Quick Add button
				@FindBy(xpath ="//*[contains (text(), 'Quick Add')]")
				WebElement Quick_Add_button;
		
		
				
				//reight_terms dropdown
	            @FindBy(xpath = "//input[@name=\"freight_terms\"]")
	            WebElement freight_terms_dropdown;
				
				
	          //shipping_method dropdown
	            @FindBy(xpath = "//input[@name=\"shipping_method\"]")
	            WebElement shipping_method_dropdown;
				
		
	            
	            //Edit page xpaths start from here 
	            
	            //Contact header
	            @FindBy(xpath = "(//*[contains (text(), \"Contact\")])[1]")
	            WebElement contact_header;  
	            
	            //Address Header
	            @FindBy(xpath = "(//*[contains (text(), \"Address\")])[1]")
	            WebElement Address_header;
	            
	            //Preferences_Headers
				@FindBy(xpath = "(//*[contains (text(), \"Preferences\")])[1]")
				WebElement Preferences_Headers;
				
				//Other_Details_Header
				@FindBy(xpath = "(//*[contains (text(), \"Other Details\")])[1]")
				WebElement Other_Details_Header;
				
				
				
				//Save button add details page
				@FindBy(xpath = "//*[contains (text(), 'Save')]")
				WebElement Save_button;
				
				
				//Basic details section
				@FindBy(id = "Basic Details")
				WebElement BasicDetailsForm;
				
				
				//Contact section 
				@FindBy(id = "Contacts")
				WebElement ContactFormSection;
				
				//Address Form Section
				@FindBy(id = "Addresses")
				WebElement AddressFormSection;
				
				
				//Preferences section 
				@FindBy(id = "Preferences")
				WebElement PreferencesSection;
				
				
				//Other Details
				@FindBy(id = "Other Details")
				WebElement OtherDetailsSection;
				
	
	public CreateCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	@Step("Get Login Page Title")
	public static String validateLoginPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	@Step("Enter Login email and password")
	public void login() throws Exception {
		
	
		Thread.sleep(10000);
		username.sendKeys("qateam@wizcommerce.com");
		
		Thread.sleep(2000);
		password.sendKeys("admin");
		
		loginBtn.click();
		
	}
	
	@Step("Click on customer tab")
	public void click_customer_tab() throws Exception {
		// TODO Auto-generated method stub
      
		// Create object of SimpleDateFormat class and decide the format
				 
				
		
		
		Thread.sleep(5000);	

      customers_tab.click();
		
	}
	
	@Step("Check create customer button is displayed")
	public void create_customer_button_isdisplay(){
		
		boolean button_display = create_customer_button.isDisplayed();
		Assert.assertEquals(button_display, true);
		
		if(button_display==false) {
			
			
			System.out.println("create customer button is not displaying");
			
			
		}else {
			
			System.out.println("customer button button is displaying");
		}
		
		
		
		
		
		
	}
	
	@Step("Check create customer button is enabled")
	public void create_customer_button_isenabled(){
			
		boolean button_enabled = create_customer_button.isEnabled();	
		Assert.assertEquals(button_enabled, true);
	if(button_enabled==false) {
				
				
				System.out.println("create customer button is not clickable");
				
				
			}else {
				
				System.out.println("create customer button button is displaying");
			}
			
		
			
		}
	
	   @Step("Get text of create customer button")
	   public void create_customer_button_spelling_check() {
		   
		   String actual = create_customer_button.getText();
		   
		   String Expected = "Create Customer";
		   
		   assertEquals(actual,Expected);
		   
		   
		   
	   }
	
	@Step("Click on create customer button")
	public void click_create_customer_button() throws Exception {
		
		Thread.sleep(5000);
		create_customer_button.click();
		//logger.info("working");
		
		
		
	}
	    @Step("get add customer title")
		public void addcustomer_title() {
			
			String actual = add_customer_string.getText();
			   
			   String Expected = "Add Customer";
			   
			   assertEquals(actual,Expected);
			
		}
	    
	    @Step("check basic details is displayed")
		public void basic_details_heading_isdisplay(){
			
			boolean button_display = basic_details_heading.isDisplayed();
			Assert.assertEquals(button_display, true);
			
			if(button_display==false) {
				
				
				System.out.println("Basic Details Heading is not displaying");
				
				
			}else {
				
				System.out.println("Basic Details Heading is displaying");
			}
			
		}
		
		@Step("Get text of basic details heading")
		public void basic_details_heading_spelling_check() {
			   
			   String actual = basic_details_heading.getText();
			   
			   String Expected = "Basic Details";
			   
			   assertEquals(actual,Expected);
			  
		   }

		@Step("Enter company name")
		public void enter_company_name() {
			
		
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			 
			 //get current date time with Date()
			 Date date = new Date();
			 
			 // Now format the date
			 String date1= dateFormat.format(date);
			 System.out.println(date1);
			
		String	ComapanyName  = company_name.getAttribute("value");
		System.out.println(ComapanyName);
		
		
		
		
		if(ComapanyName=="") 	
			
		
		 
		 company_name.sendKeys("wizcom" + date1);
		
		
		else
			System.out.print(ComapanyName + "   default comapany name already added");
			
		}
		
		@Step("Click on catalog")
		public void click_catalog() {
			
			select_catalog_dropdown.click();
			
		}
		
		  @Step("Click on catalog options")
	      public void select_catalog() throws Exception {
			
	    	  Thread.sleep(1000);
	    	  
	    	//select dealer from dropdown
			Dealer.click();	
			
			 Thread.sleep(1000);
			//click on dropdown
			click_catalog();
			
			 Thread.sleep(1000);
			//select designer 
			Designer.click();
			click_catalog();
			
			 Thread.sleep(1000);
			//select Wholesale
			Wholesale.click();
				
			}	
	      
	      public void primary_contact_heading_isdisplay(){
				
				boolean button_display = primary_contact_title.isDisplayed();
				Assert.assertEquals(button_display, true);
				
				if(button_display==false) {
					
					
					System.out.println("primary_contact_title Heading is not displaying");
					
					
				}else {
					
					System.out.println("primary_contact_title Heading is displaying");
				}
				
	      }
	    
	    @Step("Click on add contact button")
	    public void click_add_contact_button() {
	    	
	    	add_contact_button.click();	
	    
	    }
	    
	    
	   @Step("Verify Elements on contact page")
	  public void verifyElemntsOnPageTest() throws Exception {
		  Thread.sleep(1000);
		   add_contact_sidesheet.isDisplayed();
			
		   Thread.sleep(1000);
			add_contact_form_heading.isDisplayed();
			
			Thread.sleep(1000);
			first_name_textfield.isDisplayed();
			
			Thread.sleep(1000);
			last_name_textfield.isDisplayed();
			
			Thread.sleep(1000);
			 Phone_number_textfiled.isDisplayed();
			
			 Thread.sleep(1000);
			 country_dropdown.isDisplayed();
			
			 Thread.sleep(1000);
			 designation_textfield.isDisplayed();
			
			 Thread.sleep(1000);
			 email_textfiled.isDisplayed();
			
			 Thread.sleep(1000);
			set_primary_checkbox.isDisplayed();
			
			Thread.sleep(1000);
			Setas_primary_String.isDisplayed();
			
			Thread.sleep(1000);
			cancel_button.isDisplayed();
			
			Thread.sleep(1000);
			submit_button.isDisplayed();
			
		  
	  }
	     
	  @Step("Empty all Fields") 
	  public void emptyAllFiledsTest() throws Exception {
		  
		  String expectedNameErrorMsg = "First Name is required";
		  String expectedEmailErrorMsg = "Email ID is required";
		  
		  first_name_textfield.sendKeys("");
		  
		  last_name_textfield.sendKeys("");
		  
		  Phone_number_textfiled.sendKeys("");
		  
		  Phone_number_textfiled.sendKeys("");
		  
		  email_textfiled.sendKeys("");
		  
		  
		  
		  submit_button.click();
		  
		  
		 // driver.findElement(By.xpath(""));
		  
		  WebElement exp = driver.findElement(By.xpath("(//p[@class=\"MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-54guny\"])[1]"));
	        String actualNameErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualNameErrorMsg, expectedNameErrorMsg);
	        
	        
	        Thread.sleep(10000);
	        WebElement emailexp = driver.findElement(By.xpath("(//p[@class=\"MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-54guny\"])[2]"));
	        String actualEmailErrorMsg = emailexp.getText();
	        		
	        Assert.assertEquals(actualEmailErrorMsg, expectedEmailErrorMsg);
	         
	        
	  }
	  
	  @Step("Empty Email")
	  public void emptyEmailtest() throws Exception {
		  
		  String expectedphoneErrorMsg = "Invalid number";
		  String expectedEmailErrorMsg = "Email ID is required";
		  String wrong_emai_error_Msg = "Email must be a valid address";
		  
		  first_name_textfield.sendKeys("Md.");
		  
		  last_name_textfield.sendKeys("test");
		  
		  Phone_number_textfiled.sendKeys("9");
		  
		  Thread.sleep(2000);
		  WebElement exp = driver.findElement(By.xpath("(//*[contains(text(),'Invalid number')])[1]"));
	        String actualpphoneErrorMsg = exp.getText();
	        
	        System.out.println(actualpphoneErrorMsg);
	        
		  
		     email_textfiled.sendKeys("");
	        Thread.sleep(2000);
		  
		  
		  submit_button.click();
		//div[@class="MuiGrid-root css-1ofvkra"]/p
		  
		 // driver.findElement(By.xpath(""));
		  
		  
	        		
	        Assert.assertEquals(actualpphoneErrorMsg, expectedphoneErrorMsg);
	        
	        
	        Thread.sleep(1000);
        WebElement emailexp = driver.findElement(By.xpath("//*[contains(text(),'Email ID is required')]"));
	        String actualEmailErrorMsg = emailexp.getText();
	        System.out.println(actualEmailErrorMsg);
	        
	        
	        Assert.assertEquals(actualEmailErrorMsg, expectedEmailErrorMsg);
	        
	        //wrong email id verification
	        email_textfiled.sendKeys("mdshadwizcommerce.co");
	        WebElement wrong_emailexp = driver.findElement(By.xpath("//*[contains(text(),'Email must be a valid address')]"));
	        String actualwrongEmailErrorMsg = wrong_emailexp.getText();
	        System.out.println(actualwrongEmailErrorMsg);
	        
	        Assert.assertEquals(actualwrongEmailErrorMsg, wrong_emai_error_Msg);
	        
	  
	  }
	  
	@Step("Click on save button")
	public void click_save_button() throws Exception {
		
		
		//first_name_textfield.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 
		
		while(!first_name_textfield.getAttribute("value").equals("")){
			first_name_textfield.sendKeys(Keys.BACK_SPACE);
	    }
		first_name_textfield.sendKeys("Md.shad");
		 Thread.sleep(1000);
		 
		 
		while(!last_name_textfield.getAttribute("value").equals("")) {
			last_name_textfield.sendKeys(Keys.BACK_SPACE);
		}
		 
		
		last_name_textfield.sendKeys("khan");
		  Thread.sleep(1000);
		  
		  
		  
		  
		  while(!Phone_number_textfiled.getAttribute("value").equals("")) {
			  Phone_number_textfiled.sendKeys(Keys.BACK_SPACE);
			}
		  Thread.sleep(1000);
		  
		  //last_name_textfield.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		  Phone_number_textfiled.sendKeys("+919555570932");
		  Thread.sleep(1000);
		  
		  designation_textfield.sendKeys("QA sales men");
		  Thread.sleep(2000);
		  
		  
		  while(!email_textfiled.getAttribute("value").equals("")) {
			  email_textfiled.sendKeys(Keys.BACK_SPACE);
			}
		  email_textfiled.sendKeys("mdshad@wizcommerce.com");
	        Thread.sleep(2000);
		  
		  //save contact details 
		  submit_button.click();
		
	}
	
	@Step("Check all fields are displayed")
	public void verifyElemntsOnAddCustomer() throws Exception {
		
		Thread.sleep(2000);
		boolean BillingAddressdisplay = Billing_Address_heading.isDisplayed();
		Assert.assertEquals(BillingAddressdisplay, true);
		Thread.sleep(1000);
		
		boolean BillingAddressButtondisplay = Add_billing_address_button.isDisplayed();
		Assert.assertEquals(BillingAddressButtondisplay, true);
		Thread.sleep(1000);
		
		boolean ShippingAddressdisplay = Shipping_Address_Heading.isDisplayed();
		Assert.assertEquals(ShippingAddressdisplay, true);
		Thread.sleep(1000);
		
		boolean ShippingAddressButtondisplay = Add_shipping_address_button.isDisplayed();
		Assert.assertEquals(ShippingAddressButtondisplay, true);
		Thread.sleep(1000);
		
		boolean PreferencesHeading = Preferences_Heading.isDisplayed();
		Assert.assertEquals(PreferencesHeading, true);
		Thread.sleep(2000);
		
		// scroll 
		Actions action = new Actions(driver);
		WebElement list = driver.findElement(By.xpath("//*[contains (text(), 'Add contact')]")); 
		action.moveToElement(list);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
	
		
	boolean FreightTermsDropdown = freight_terms_dropdown.isDisplayed();
       Assert.assertEquals(FreightTermsDropdown, false);
		Thread.sleep(1000);
	
    boolean ShippingMethodDropdown = shipping_method_dropdown.isDisplayed();
	Assert.assertEquals(ShippingMethodDropdown, false);
		Thread.sleep(1000);
		
		
	}
	
	@Step("Click on add details button")
	public void add_details_button_click() throws Exception {
		// TODO Auto-generated method stub
		
		
		Add_Details_button.click();
		Thread.sleep(2000);
		
		
	}
	
	
	@Step("Verify all Headers Details")
	public void verifyHeadersOnAddDetails() {
		
		boolean Basic_details_header = basic_details_heading.isDisplayed();
		assertEquals(Basic_details_header, true);
		
		
        boolean Contact_header = contact_header.isDisplayed();
		assertEquals(Contact_header, true);
		
		
		boolean Address_Header = Address_header.isDisplayed();
		 assertEquals(Address_Header, true);
		 
		 boolean Preferences_headers = Preferences_Headers.isDisplayed();
		 assertEquals(Preferences_headers, true);
		
		 boolean Other_Details_header = Other_Details_Header.isDisplayed();
		 assertEquals(Other_Details_header, true);
	}
	
	@Step("Verify headers are enabled")
	public void verifyheadersenabled() {
		
		boolean Basic_details_header = basic_details_heading.isEnabled();
		assertEquals(Basic_details_header, true);
		
		
//		Basic_details_header = basic_details_heading.isSelected();
//		assertEquals(Basic_details_header, true);
		
		boolean Contact_header = contact_header.isEnabled();
		assertEquals(Contact_header, true);
		
		
		boolean Address_Header = Address_header.isEnabled();
		 assertEquals(Address_Header, true);
		 
		 boolean Preferences_headers = Preferences_Headers.isEnabled();
		 assertEquals(Preferences_headers, true);
		
		 boolean Other_Details_header = Other_Details_Header.isEnabled();
		 assertEquals(Other_Details_header, true);
		
		
	}

	@Step("Click on headers")
	public void checkheadersclicked() throws Exception {
		// TODO Auto-generated method stub
		
		basic_details_heading.click();
		
		boolean basicdetailsform = BasicDetailsForm.isDisplayed();
		Assert.assertEquals(basicdetailsform, true);
		
		//click on contact 
		Thread.sleep(1000);
		ContactFormSection.click();
		boolean cntctform = ContactFormSection.isDisplayed();
		Assert.assertEquals(cntctform, true);
		
		//clickon Address
		AddressFormSection.click();
		boolean addrsssec = AddressFormSection.isDisplayed();
		Assert.assertEquals(addrsssec, true);
		
		//ClickOnAddress
		PreferencesSection.click();
		boolean prefrences = PreferencesSection.isDisplayed();
		Assert.assertEquals(prefrences, true);
		
		//click on other details
		OtherDetailsSection.click();
		boolean othrdetails = OtherDetailsSection.isDisplayed();
		Assert.assertEquals(othrdetails, true);
		
	}
	
	
	
	
}
