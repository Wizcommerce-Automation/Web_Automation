package test;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import generic.Libraries;
import generic.Listener;
//import generic.ListenerForTest001;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pomPages.POM1_Login_Logout_Page;

//@Listeners(ListenerForTest001.class)
//@Listeners(Listener.class)
public class Test001_Login_Logout extends POM1_Login_Logout_Page  {

	@Epic("Sign In flow")
	@Feature("Login form")
	@Parameters("browserName")
	@Test(priority = 1, description = "Launching browser and open URL")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Verifying launching the browser and opening the URL")
	@Story("Story Name: To check Browser launched and URL opens")
	public void openBrowser(String browserName) throws Exception {
		System.out.println("Your OS version -> " + System.getProperty("os.name"));
		String osname = System.getProperty("os.name");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.toString().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if(browserName.toString().equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		System.out.println("Browser launched");
		driver.get(Libraries.fetchPropertyValue("TestURL").toString());
		//driver.get(Libraries.fetchPropertyValue("ProdURL").toString());
		System.out.println("URL launched");
		driver.manage().window().maximize();
		System.out.println("browser maximized sucessfully");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

//	
//	 @Story("verify that user should be able to enter email")
//	 	@Test(priority = 2,description = "validating user should be able to enter email and password")
//	     @Severity(SeverityLevel.MINOR)
//	     public void logintest() throws Exception {
//	    	 
//	    	 
//	    			pomPages.CreateCustomerPage email_field = new pomPages.CreateCustomerPage();
//	    			email_field.login();
//	    			
//	     }
//	
//	
	
	@Test(priority = 2, description = "Validating Login Page Title")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Login Page Title Test")
	@Story("Story Name: To check Login Page Title")
	public void loginPageTitleTest() throws Exception {
		pomPages.POM1_Login_Logout_Page title = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(title.validateLoginPageTitle(), "WizCommerce");
	}

	@Test(priority = 3, description = "Validating Page Logo")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Page Logo Test")
	@Story("Story Name: To check Page Logo")
	public void logoTest() throws Exception {
		pomPages.POM1_Login_Logout_Page logo = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(logo.validateLogo(), true, "logo is visible");
	}

	@Test(priority = 4, description = "Validating Page Heading")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Page Heading Test")
	@Story("Story Name: To check Page Heading")
	public void headingTest() throws Exception {
		pomPages.POM1_Login_Logout_Page head = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(head.validatePageHeading(), true, "Heading is visible");
	}

	@Test(priority = 5, description = "Validating Password Eye Button")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Password Eye Button Test")
	@Story("Story Name: To check Password Eye Button")
	public void passwordEyeTest() throws Exception {
		pomPages.POM1_Login_Logout_Page eye = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(eye.validatePasswordEyeButton(), true, "Eye button is visible and clickable");
	}

	@Test(priority = 6, description = "Validating Forgot Password Button")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Forgot Password Button Test")
	@Story("Story Name: To check Forgot Password Button")
	public void forgotPassTest() throws Exception {
		pomPages.POM1_Login_Logout_Page forgotPass = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(forgotPass.validateForgotPasswordButton(), true, "Forgot button is visible and clickable");
	}

	@Test(priority = 7, description = "Validating Bottom Line Title")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Bottom Line Title Test")
	@Story("Story Name: To check Bottom Line Title")
	public void bottomLineTest() throws Exception {
		pomPages.POM1_Login_Logout_Page btmLine = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(btmLine.validateBottomLine(), true, "Bottom line is visible");
	}

	@Test(priority = 8, description = "Validating Book a Demo Button")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Book a Demo Button Test")
	@Story("Story Name: To check Book a Demo Button")
	public void bookaDemoTest() throws Exception {
		pomPages.POM1_Login_Logout_Page bookDemo = new pomPages.POM1_Login_Logout_Page();
		Assert.assertEquals(bookDemo.validateBookADemoButton(), true, "Book a Demo is clickable");

	}

	@Test(dataProvider = "credentials", description = "Login Cases", priority = 9)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Login Cases Test")
	@Story("Story Name: To Login with invalid and valid credentials")
	public void loginAllCasesTest(String uname, String pass) throws Exception {
		pomPages.POM1_Login_Logout_Page login = new pomPages.POM1_Login_Logout_Page();
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickLogin();
	}

	@DataProvider(name = "credentials")
	public Object[][] testDataGenerator() throws Exception {
		System.out.println("Your OS version -> " + System.getProperty("os.name"));
		String osname = System.getProperty("os.name");
		File f;
		if(osname.toLowerCase().contains("windows 11")){
		    f = new File(System.getProperty("user.dir")+"/ExcelData/wizcom.xlsx");
		}
		else {
			f = new File(System.getProperty("/Users/user/automation-testing/ExcelData"));
		}
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet loginSheet = book.getSheet("Login_Data");
		int rowCount = loginSheet.getPhysicalNumberOfRows();
		Object testData[][] = new Object[5][2];
		for (int i = 0; i < 5; i++) {
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testData[i][0] = username.getStringCellValue();
			testData[i][1] = password.getStringCellValue();
		}
		book.close();
		return testData;
	}

	@Test(dependsOnMethods = "loginAllCasesTest", priority = 10, description = "Logout")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Logout Test")
	@Story("Story Name: To Check Logout")
	public void logoutTest() throws Exception {
		pomPages.POM1_Login_Logout_Page lgt = new pomPages.POM1_Login_Logout_Page();
		lgt.clickLogout();
	}

	@Test(priority = 11, description = "Closing browser")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Verifying closing the browser")
	@Story("Story Name: To check Browser closed")
	public void closeBrowser() throws Exception {
		Thread.sleep(5000);
		driver.quit();
		// driver.close();
		System.out.println("browser closed");
	}

}
