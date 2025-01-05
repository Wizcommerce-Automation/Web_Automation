package pomPages;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.common.io.Files;

import io.qameta.allure.Step;

public class POM1_Login_Logout_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='login_email']")
	WebElement username;

	@FindBy(xpath = "//input[@id='login_password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='login_submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//img[@class=\"[object Object]\"]")
	WebElement pageImg;

	@FindBy(xpath = "//p[starts-with(text(),\"Crafting digital experiences for B2B sales & sourcing\")]")
	WebElement pageHeading;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1rohvu8\"]")
	WebElement passwordEyeBtn;

	@FindBy(xpath = "//button[starts-with(text(),\"Forgot Password?\")]")
	WebElement forgotPasswordBtn;

	@FindBy(xpath = "//p[starts-with(text(),\"New to WizCommerce?\")]")
	WebElement bottomLine;

	@FindBy(xpath = "//button[starts-with(text(),\"Book a Demo\")]")
	WebElement bookADemoBtn;

	@FindBy(xpath = "//button[@id='sidebar-item-19']")
	WebElement logoutBtn;

	public POM1_Login_Logout_Page() {
		PageFactory.initElements(driver, this);
	}

	// Verifying login page title
	@Step("Get title of login page")
	public String validateLoginPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	// Verifying login page Logo
	@Step("Get page Logo")
	public boolean validateLogo() throws InterruptedException {
		Thread.sleep(1000);
		boolean pageLogo = pageImg.isDisplayed();
		return pageLogo;
	}

	// Verifying login Page Heading
	@Step("Get page heading")
	public boolean validatePageHeading() {
		boolean pageHeadings = pageHeading.isDisplayed();
		return pageHeadings;
	}

	// Verifying Password Eye Button
	@Step("password Eye Button is displayed")
	public boolean validatePasswordEyeButton() {
		boolean eye = passwordEyeBtn.isEnabled();
		return eye;
	}

	// Verifying Forgot Password Button
	@Step("Validate Forgot Password Button")
	public boolean validateForgotPasswordButton() {
		boolean forgotPass = forgotPasswordBtn.isEnabled();
		return forgotPass;
	}

	// Verifying Bottom Line
	@Step("Bottom Line Button is displayed")
	public boolean validateBottomLine() {
		boolean btm = bottomLine.isDisplayed();
		return btm;
	}

	// Verifying Book A Demo Button
	@Step("Book a demo button is displayed")
	public boolean validateBookADemoButton() {
		boolean bookDemo = bookADemoBtn.isEnabled();
		return bookDemo;
	}

	// Enter Username
	@Step("Enter user name")
	public void enterUsername(String uname) throws Exception {
		while(!username.getAttribute("value").equals("")){
			username.sendKeys(Keys.BACK_SPACE);
	    }
		username.sendKeys(uname);
		Thread.sleep(2000);
	}

	// Enter Password
	@Step("Enter password")
	public void enterPassword(String pass) throws Exception {
		//password.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		while(!password.getAttribute("value").equals("")){
			password.sendKeys(Keys.BACK_SPACE);
	    }
		password.sendKeys(pass);
		Thread.sleep(2000);
	}

	// Click on Login Button
	@Step("Click on login button")
	public void clickLogin() throws Exception {
		loginBtn.click();
		Thread.sleep(4000);
	}

	// Click on Logout Button
	@Step("Click on logout button")
	public void clickLogout() throws Exception {
		logoutBtn.click();
		Thread.sleep(3000);

	}

}
