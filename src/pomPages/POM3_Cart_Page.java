package pomPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import generic.BaseTest;
import io.qameta.allure.Step;

public class POM3_Cart_Page extends BaseTest {

	@FindBy(xpath = "//button[starts-with(text(),\"Create order\")]")
	WebElement createOrderBtn1;

	@FindBy(xpath = "//div[@class=\"MuiBox-root css-v2imwf\"]//button[2]")
	WebElement chooseCustomerBtn;

	@FindBy(xpath = "//input[@id='buyer_search']")
	WebElement customerSearchTextbox;

//wizcom_automate
	@FindBy(xpath = "//p[normalize-space()='Heman Test']")
	WebElement HemanTest_Customer;
//Zenith Technologies	
	@FindBy(xpath = "//p[normalize-space()='Qa team']")
	WebElement QA_Customer;

//	WebElement keepExisting_ReplaceCheckbox;
	@FindBy(xpath = "//button[starts-with(text(),'Replace')]")
	WebElement replaceBtn;

	@FindBy(xpath = "//button[starts-with(text(),\"Keep existing\")]")
	WebElement keepExistingBtn;

	@FindBy(xpath = "(//div[@id='f1f1a84d-adad-45ce-a20b-bd381f427c9b']/div)[2]")
	WebElement cartIconOnHemanTestCustomer;

	@FindBy(xpath = "(//div[@id=\"33223ce2-8f38-440d-9cb8-ef7cfd3e310c\"]/div)[2]")
	WebElement cartIconOnQACustomer;

	@FindBy(xpath = "//button[text()=\"Create order\"]")
	WebElement createOrderBtn2;

	@FindBy(xpath = "//button[starts-with(text(),\"Proceed\")]")
	WebElement proceedBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Submit order')]")
	WebElement submitOrderBtn;

	@FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
	WebElement submitBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/div/p")
	WebElement user;
	
	//Three dots for cancel drop down option
	@FindBy(xpath = "//div[@id='order-management-header-menu']")
	WebElement threeDots;
	
	//Cancel button
	@FindBy(xpath = "//span[contains(.,'Cancel')]")
	WebElement cancelBtn;
	
	//Cancel order button
	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	WebElement cancelOrderBtn;
	
	// Cancel order verification
	@FindBy(xpath = "//p[normalize-space()='Order cancelled']")
	WebElement orderCancelled;
	
	@FindBy(xpath="//button[normalize-space()='Send for approval']")
	WebElement sendForApprovalButton;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Send for approval'])[2]")
	WebElement sendForApprovalPopup;

	public POM3_Cart_Page() {
		PageFactory.initElements(driver.get(), this);
	}

// Click on create order button in the cart page
	@Step("Click on create order button")
	public void clickCreateOrderBtn1() throws Exception {
		Thread.sleep(5000);
		Assert.assertTrue(createOrderBtn1.isEnabled(), "Both actual and expected are not same");
		createOrderBtn1.click();
		Thread.sleep(3000);

	}

// Click on the choose customer button from the checkbox appears after clicking on create order
	@Step("Click on choose customer button")
	public void clickchooseCustomerBtn() throws Exception {
		Assert.assertTrue(chooseCustomerBtn.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(3000);
		chooseCustomerBtn.click();
		Thread.sleep(5000);
	}

// Search customer by passing a particular customer name and select customer 
	@Parameters("name")
	@Step("Click on Customer Search Text box")
	public void clickCustomerSearchTextbox() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			customerSearchTextbox.sendKeys(getDataFromExcell(1, 3));
			Thread.sleep(5000);
			if (cartIconOnHemanTestCustomer.isDisplayed() == false) {
				Assert.assertTrue(HemanTest_Customer.isDisplayed(), "Both actual and expected are not same");
				HemanTest_Customer.click();
				Thread.sleep(5000);
			} else {
				HemanTest_Customer.click();
				Thread.sleep(5000);
				Assert.assertTrue(keepExistingBtn.isEnabled(), "Both actual and expected are not same");
				Assert.assertTrue(replaceBtn.isEnabled(), "Both actual and expected are not same");
				replaceBtn.click();
				Thread.sleep(8000);
			}
		} else if(user.getText().equals("QT"))
		{
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			customerSearchTextbox.sendKeys(getDataFromExcell(1, 3));
			Thread.sleep(5000);
			if (cartIconOnQACustomer.isDisplayed() == false) {
				Assert.assertTrue(QA_Customer.isDisplayed(), "Both actual and expected are not same");
				QA_Customer.click();
				Thread.sleep(5000);
			} else {
				QA_Customer.click();
				Thread.sleep(5000);
				Assert.assertTrue(keepExistingBtn.isEnabled(), "Both actual and expected are not same");
				Assert.assertTrue(replaceBtn.isEnabled(), "Both actual and expected are not same");
				replaceBtn.click();
				Thread.sleep(8000);
			}
		}
		Thread.sleep(5000);
	}

// Click again on create order button after selecting customer
	@Step("Click on Create Order Button")
	public void clickCreateOrder2Button() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(createOrderBtn2.isEnabled(), "Both actual and expected are not same");
		createOrderBtn2.click();
		Thread.sleep(5000);
	}

// Click on the proceed button appears in checkbox
	@Step("Click on Proceed Button")
	public void clickProceedButton() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(4));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[starts-with(text(),\"Proceed\")]")));
		Assert.assertTrue(proceedBtn.isEnabled(), "Both actual and expected are not same");
		proceedBtn.click();
		Thread.sleep(5000);
	}

// Click on submit order button
	@Step("Click On Submit Order Button")
	public void clickSubmitOrderButton() throws Exception {
		try {
	        if (sendForApprovalButton.isDisplayed()) {
	            sendForApprovalButton.click();
	            Thread.sleep(1000);
	            sendForApprovalPopup.click();
	        }
	    } catch (NoSuchElementException e) {
	        Assert.assertTrue(submitOrderBtn.isEnabled(), "Submit Order Button is not enabled");
	        submitOrderBtn.click();
	        Thread.sleep(5000);
	    }
	}

// Again click on submit button
	@Step("Click on Submit Button")
	public void clickSubmitButton() throws Exception {
		Thread.sleep(3000);
		try {
			Assert.assertTrue(submitBtn.isEnabled(), "Both actual and expected are not same");
			submitBtn.click();
			Thread.sleep(5000);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	@Step("Click on Three dots")
	public void clickThreeDots() throws Exception {
		Actions action = new Actions(driver.get());
		action.moveToElement(threeDots).click().build().perform();
		Thread.sleep(3000);
	}
	
	@Step("Click on Cancel Button")
	public void clickCancelBtn() throws Exception {
		Assert.assertTrue(cancelBtn.isEnabled(), "Both actual and expected are not same");
		cancelBtn.click();
		Thread.sleep(3000);
	}
	
	@Step("Click on Cancel Order Button")
	public void clickCancelOrderBtn() throws Exception {
		Assert.assertTrue(cancelOrderBtn.isEnabled(), "Both actual and expected are not same");
		cancelOrderBtn.click();
		Thread.sleep(3000);
	}
	
	@Step("Verify Order Cancelled")
	public void verifyOrderCancelled() throws Exception {
		Assert.assertTrue(orderCancelled.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(3000);
	}
	

}
