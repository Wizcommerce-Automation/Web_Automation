package pomPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import io.qameta.allure.Step;

public class POM4_Convert_Quote_To_Order extends BaseTest {

	@FindBy(xpath = "//button[starts-with(text(),\"Create quote\")]")
	WebElement createQuoteBtn1;

	@FindBy(xpath = "//button[starts-with(text(),'Choose customer')]")
	WebElement chooseCustomerBtn;

	@FindBy(xpath = "//input[@id=\"outlined-adornment\"]")
	WebElement customerSearchTextbox;

	@FindBy(xpath = "//button[starts-with(text(),\"Create quote\")]")
	WebElement createQuoteBtn2;

	@FindBy(xpath = "//button[starts-with(text(),\"Proceed\")]")
	WebElement proceedBtn;

	@FindBy(xpath = "//button[starts-with(text(),\"Save for later\")]")
	WebElement saveForLaterBtn;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-1wxaqej\"]/nav/ol/li)[5]")
	WebElement orderId;

//	@FindBy(xpath = "//input[@id=\"ag-215-input\"]")
	@FindBy(xpath = "(//input[@aria-label=\"Reference ID Filter Input\"])[2]")
	WebElement referenceIDTextbox;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-inherit css-z48z1h'])[1]")
	WebElement draft;

	@FindBy(xpath = "(//span//div[contains(text(),'quote')])[1]")
	WebElement quote;

	@FindBy(xpath = "((//div[@aria-rowindex=\"3\"])/div/a)[2]")
	WebElement mainID;

	@FindBy(xpath = "//button[contains(text(),'Submit quote')]")
	WebElement submitQuoteBtn;

	@FindBy(xpath = "//button[starts-with(text(),\"Convert to order\")]")
	WebElement convertToOrderBtn;

//	@FindBy(xpath = "//button[starts-with(text(),'No, Edit quote')]")
	@FindBy(xpath = "//button[starts-with(text(),'Cancel')]")
	WebElement goBack;
	
	@FindBy(xpath = "//button[starts-with(text(),'Edit quote')]")
	WebElement editQuoteBtn;

//	@FindBy(xpath = "//button[starts-with(text(),'Yes, Convert to order')]")
	@FindBy(xpath = "//button[text()=\"Convert\"]")
	WebElement yesConvertToOrderBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Submit order')]")
	WebElement submitOrderBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Cancel')]")
	WebElement goBackBtn;

	@FindBy(xpath = "(//button[starts-with(text(),'Submit')])[2]")
	WebElement submitBtn;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5.5 MuiGrid-grid-sm-5 MuiGrid-grid-md-5 css-3y30c\"])[1]")
	WebElement customerDetailsOnQuote;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5.5 MuiGrid-grid-sm-5 MuiGrid-grid-md-5 css-3y30c\"])[2]")
	WebElement billingAddressOnQuote;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5.5 MuiGrid-grid-sm-5 MuiGrid-grid-md-5 css-3y30c\"])[3]")
	WebElement shippingAddressOnQuote;

	@FindBy(xpath = "//p[normalize-space()='test@wi.xom']")
	WebElement mailIdQuotePage;

//	@FindBy(xpath = "(//div[@class=\"_iconContainer_oq70p_37 MuiBox-root css-0\"])[1]")
//	@FindBy(xpath = "(//div[@class=\"_iconContainer_1jtxk_37 MuiBox-root css-0\"])[1]")
	@FindBy(xpath = "(//text)[2]/div[1]")
	WebElement tearSheetIcon;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> tearSheetIconDd;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-1m2qg1i\"]/p)[2]")
	WebElement totalPriceValue;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"])[2]/p[2]")
	WebElement amountPendingValue;

//	@FindBy(xpath = "(//div[@class=\"_iconContainer_oq70p_37 MuiBox-root css-0\"])[2]")
//	@FindBy(xpath = "(//div[@class=\"_iconContainer_1jtxk_37 MuiBox-root css-0\"])[2]")
	@FindBy(xpath = "(//text)[3]/div")
	WebElement threeDotsBtn;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsDd;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"])[4]/button[1]")
	@FindBy(xpath = "//button[text()=\"Go back\"]")
	WebElement cancelBoxGoBackBtn;

	@FindBy(xpath = "//button[text()=\"Cancel Quote\"]")
	WebElement cancelQuoteBtn;

	@FindBy(xpath = "(//div[@class=\"MuiBox-root css-0\"])[2]")
	WebElement cusDetailsOrderPage;

	@FindBy(xpath = "(//div[@class=\"MuiBox-root css-0\"])[3]")
	WebElement billingAddressOrderPage;

	@FindBy(xpath = "(//div[@class=\"MuiBox-root css-0\"])[4]")
	WebElement shippingAddressOrderPage;

	@FindBy(xpath = "(//div[@class=\"_iconContainer_oq70p_37 MuiBox-root css-0\"])[2]")
	WebElement threeDotsBtnOrderPage;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnOrderPageDd;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"])[3]/button[1]")
	@FindBy(xpath = "//button[text()=\"Go back\"]")
	WebElement cancelOrderBoxGoBackBtn;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"])[3]/button[2]")
	@FindBy(xpath = "//button[text()=\"Cancel order\"]")
	WebElement cancelOrderBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"]/p[2]")
	WebElement cartTotalValueOrderPage;

	@FindBy(xpath = "//div[@class=\"MuiBox-root css-759u60\"]")
	WebElement viewLinkedQuoteBtn;

//	@FindBy(xpath = "(//div[@class=\"_iconContainer_oq70p_37 MuiBox-root css-0\"])[1]")
	@FindBy(xpath = "(//div[@class=\"_iconContainer_1jtxk_37 MuiBox-root css-0\"])[1]")
	WebElement tearSheetIconOrderPage;

	@FindBy(xpath = "//p[normalize-space()='Products']/parent::div")
	WebElement productInfo;

	@FindBy(xpath = "(//p[text()=\"Customer Details\"]//parent::div//parent::div)[3]/div/p[3]")
	WebElement mailIdOrderPage;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/div/p")
	WebElement user;

	public POM4_Convert_Quote_To_Order() {
		PageFactory.initElements(driver.get(), this);
	}

// Click on create quote button in the cart page
	@Step("Click on Create Quote Button")
	public void clickCreateQuoteBtn1() throws Exception {
		Assert.assertTrue(createQuoteBtn1.isEnabled(), "Both actual and expected are not same");
		createQuoteBtn1.click();
		Thread.sleep(5000);
	}


// Click on create quote button after selecting customer
	@Step("Click on Create Quote Button")
	public void clickCreateQuoteBtn2Button() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(createQuoteBtn2.isEnabled(), "Both actual and expected are not same");
		createQuoteBtn2.click();
		Thread.sleep(5000);
	}

// Verifying customer details after quote creation
	@Step("Get Customer Details On Quote Value")
	public void verifyCustomerDetailsOnQuote() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerDetailsOnQuote.isDisplayed(), "Both actual and expected are not same");
			String text_demo = customerDetailsOnQuote.getText();
			System.out.println(text_demo);
			String text1_demo = text_demo.replaceAll("\\s", "");
			System.out.println("Customer details on Quote:-" + text1_demo);
			String a_demo = "\r\n" + "Wizcom Automate\r\n" + "\r\n" + "mdshad@wizcommerce.com--\r\n" + "\r\n" + "QA\r\n"
					+ "\r\n" + "Option1label";
			String expe_demo = a_demo.replaceAll("\\s", "");
			softAssert.assertEquals(text1_demo, expe_demo, "Both actual and expected are not same");
			Thread.sleep(4000);
		} else if(user.getText().equals("QT")){
			Assert.assertTrue(customerDetailsOnQuote.isDisplayed(), "Both actual and expected are not same");
			String text_qa = customerDetailsOnQuote.getText();
			System.out.println(text_qa);
			String text1_qa = text_qa.replaceAll("\\s", "");
			System.out.println("Customer details on Quote:-" + text1_qa);
			String a_qa = getDataFromExcell(1,5);
			String expe_qa = a_qa.replaceAll("\\s", "");
			Assert.assertEquals(text1_qa, expe_qa, "Both actual and expected are not same");
			Thread.sleep(4000);
		}

	}

// Verifying customer billing address details after quote creation
	@Step("Get Billing Details On Quote")
	public void verifyBillingDetailsOnQuote() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		if (user.getText().equals("DC")) {
			Assert.assertTrue(billingAddressOnQuote.isDisplayed(), "Both actual and expected are not same");
			String text_demo = billingAddressOnQuote.getText();
			System.out.println(text_demo);
			String text1_demo = text_demo.replaceAll("\\s", "");
			System.out.println("Customer Billing details on Quote:-" + text1_demo);
			String s_demo = "wizcom automate mdshad@wiz.com\r\n" + "\r\n" + "5401 N Elston Ave\r\n" + "\r\n" + "Chicago, Illinois," +"\r\n"
					+ "60630" + "\r\n" +"United States of America\r\n";
			String expe_demo = s_demo.replaceAll("\\s", "");
			softAssert.assertEquals(text1_demo, expe_demo, "Both actual and expected are not same");
			Thread.sleep(4000);
		} else if (user.getText().equals("QT")){
			Assert.assertTrue(billingAddressOnQuote.isDisplayed(), "Both actual and expected are not same");
			String text_qa = billingAddressOnQuote.getText();
			System.out.println(text_qa);
			String text1_qa = text_qa.replaceAll("\\s", "");
			System.out.println("Customer Billing details on Quote:-" + text1_qa);
			String s_qa = getDataFromExcell(2,5);
			String expe_qa = s_qa.replaceAll("\\s", "");
			Assert.assertEquals(text1_qa, expe_qa, "Both actual and expected are not same");
			Thread.sleep(4000);

		}
	}

// Verifying customer shipping address details after quote creation
	@Step("Get Shipping Details on Quote")
	public void verifyShippingDetailsOnQuote() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(shippingAddressOnQuote.isDisplayed(), "Both actual and expected are not same");
			String text_demo = shippingAddressOnQuote.getText();
			System.out.println(text_demo);
			String text1_demo = text_demo.replaceAll("\\s", "");
			System.out.println("Customer Shipping details on Quote:-" + text1_demo);
			String s_demo = "\r\n" + "wizcom automate\r\n" + "\r\n" + "mdshad@wiz.com" + "\r\n" + "5401 Elston Ave\r\n" + "\r\n" +  "Oakland, California, 94602United States of America\r\n";
			String expe_demo = s_demo.replaceAll("\\s", "");
			Assert.assertEquals(text1_demo, expe_demo, "Both actual and expected are not same");
			Thread.sleep(4000);
		} else if (user.getText().equals("QT")) {
			Assert.assertTrue(shippingAddressOnQuote.isDisplayed(), "Both actual and expected are not same");
			String text_qa = shippingAddressOnQuote.getText();
			System.out.println(text_qa);
			String text1_qa = text_qa.replaceAll("\\s", "");
			System.out.println("Customer Shipping details on Quote:-" + text1_qa);
			String s_qa = getDataFromExcell(3, 5);
			String expe_qa = s_qa.replaceAll("\\s", "");
			Assert.assertEquals(text1_qa, expe_qa, "Both actual and expected are not same");
			Thread.sleep(4000);
		}
	}

// Verifying customer mailId details after quote creation
	@Step("Get Mail Id On Quote Page")
	public void getMailIdOnQuotePage() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(mailIdQuotePage.isDisplayed(), "Both actual and expected are not same");
			String text_demo = mailIdQuotePage.getText();
			System.out.println(text_demo);
			Assert.assertEquals(text_demo, "mdshad@wizcommerce.com", "Both actual and expected are not same");
			Thread.sleep(3000);
		} else if (user.getText().equals("DC")) {
			Assert.assertTrue(mailIdQuotePage.isDisplayed(), "Both actual and expected are not same");
			String text_qa = mailIdQuotePage.getText();
			System.out.println(text_qa);
			Assert.assertEquals(text_qa, getDataFromExcell(4, 5), "Both actual and expected are not same");
			Thread.sleep(3000);
		}
	}

// Click on tear sheet icon in quote page
	@Step("Click Tear Sheet Icon")
	public void clickTearSheetIcon() throws Exception {
		Assert.assertTrue(tearSheetIcon.isEnabled(), "Both actual and expected are not same");
		tearSheetIcon.click();
		Thread.sleep(4000);
	}

// Downloading excelsheet by clicking on excel sheet in the tear sheet icon dropdown
	@Step("Click on Excel Sheet")
	public void clickExcelSheet() throws Exception {
		for (int i = 0; i < tearSheetIconDd.size(); i++) {
			String text = tearSheetIconDd.get(i).getText();
			if (text.equalsIgnoreCase("Excel sheet")) {
				tearSheetIconDd.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
	}

// Click on tear sheet icon again in quote page
	@Step("Click Tear Sheet Icon")
	public void clickTearSheetIconAgain() throws Exception {
		Assert.assertTrue(tearSheetIcon.isEnabled(), "Both actual and expected are not same");
		tearSheetIcon.click();
		Thread.sleep(4000);
	}

// Downloading PDF file by clicking on PDF in the tear sheet icon dropdown
	@Step("Click on PDF")
	public void clickPDF() throws Exception {
		for (int i = 0; i < tearSheetIconDd.size(); i++) {
			String text = tearSheetIconDd.get(i).getText();
			if (text.equalsIgnoreCase("PDF")) {
				tearSheetIconDd.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
	}

// Verifying total amount with pending amount
	@Step("Get Total Price value, amount pending value")
	public void verifyTotalAndPendingAmt() throws Exception {
		Assert.assertTrue(totalPriceValue.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(amountPendingValue.isDisplayed(), "Both actual and expected are not same");
		String text1 = totalPriceValue.getText();
		String text2 = amountPendingValue.getText();
		System.out.println(text1);
		System.out.println(text2);
		boolean verify = text1.contains(text2);
		Assert.assertTrue(verify, "Both actual and expected are not same");
		Thread.sleep(4000);

	}

// Click on three dots icon on quote page
	@Step("Click on Three Dots")
	public void clickThreeDots() throws Exception {
		Assert.assertTrue(threeDotsBtn.isEnabled(), "Both actual and expected are not same");
		threeDotsBtn.click();
		Thread.sleep(4000);
	}

// Select cancel quote from the dropdown appears after clicking on three dots icon
	@Step("Click on Cancel Quote")
	public void threeDotsDropdown() throws Exception {
		for (int i = 0; i < threeDotsDd.size(); i++) {
			String text = threeDotsDd.get(i).getText();
			if (text.equalsIgnoreCase("Cancel quote")) {
				threeDotsDd.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
	}

// Verifying cancel quote checkbox and click on go back button
	@Step("Click on cancel box go back button")
	public void handlingCancelQuoteCheckbox() throws Exception {
		Assert.assertTrue(cancelBoxGoBackBtn.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(cancelQuoteBtn.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(2000);
		cancelBoxGoBackBtn.click();
		Thread.sleep(8000);
	}

	@Step("Copy Order Id")
	public void copyOrderId() throws Exception {
	    Thread.sleep(5000); // Optional, use WebDriverWait for better reliability
	    Actions a = new Actions(driver.get());
	    Assert.assertTrue(orderId.isEnabled(), "Order ID element is not enabled");

	    // Get the text from the orderId element directly
	    String orderText = orderId.getText();
	    System.out.println("Order ID copied: " + orderText);

	    // Copy to the system clipboard
	    StringSelection stringSelection = new StringSelection(orderText);
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, null); // Set the clipboard content
	}

// Click save for later button on quote page
	@Step("Click on save for later button")
	public void clickSaveForLaterButton() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(saveForLaterBtn.isEnabled(), "Both actual and expected are not same");
		saveForLaterBtn.click();
		Thread.sleep(5000);

	}

// Paste order Id on referance Id textbox opens after clicking on save later button and press enter 
	@Step("Paste order Id on referance Id textbox opens after clicking on save later button and press enter")
	public void pasteOrderId() throws Exception {
	    Thread.sleep(1000); // Optional, use WebDriverWait for better reliability

	    // Find and click the button that opens the reference ID textbox
	    driver.get().findElement(By.xpath("//button[2]")).click();
	    Thread.sleep(3000);

	    // Wait for the textbox to be ready
	    Assert.assertTrue(referenceIDTextbox.isEnabled(), "Reference ID textbox is not enabled");

	    // Click on the reference ID textbox to focus
	    referenceIDTextbox.click();
	    Thread.sleep(3000);

	    // Paste using the clipboard content (Ctrl + V)
	    referenceIDTextbox.sendKeys(Keys.CONTROL + "v");

	    // Wait for a moment to ensure the text is entered
	    Thread.sleep(4000);

	    // Press Enter to submit
	    referenceIDTextbox.sendKeys(Keys.ENTER);

	    Thread.sleep(6000); // Optional, adjust based on the application load time
	}

// Verify type status
	@Step("get type status")
	public void getTypeStatus() throws Exception {
		Assert.assertTrue(quote.isDisplayed(), "Both actual and expected are not same");
		String text = quote.getText();
		Thread.sleep(3000);
		System.out.println(text);
		Assert.assertEquals(text, "Quote", "Both actual and expected are not same");
	}

// Verify status
	@Step("Get draft status")
	public void getDarftStatus() throws Exception {
		Assert.assertTrue(draft.isDisplayed(), "Both actual and expected are not same");
		String text = draft.getText();
		Thread.sleep(3000);
		System.out.println(text);
		Assert.assertEquals(text, "Draft", "Both actual and expected are not same");
	}

// Click on the first Id from the table that appears after pasting ID and press enter key
	@Step("Click on main id")
	public void clickmainId() throws Exception {
		Assert.assertTrue(mainID.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(3000);
		mainID.click();
	}

// Click on submit quote button after navigating to quote page that opens by click on first ID previously
	@Step("Click on submit quote")
	public void clickSubmitQuote() throws Exception {
		Assert.assertTrue(submitQuoteBtn.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(3000);
		submitQuoteBtn.click();
	}
	
//Click on submit button after clicking on Submit Quote button
	@Step("Click on submit")
	public void clickOnSubmitButton() throws InterruptedException {
		Assert.assertTrue(submitBtn.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(3000);
		submitBtn.click();
	}

// Click on convert to order button
	@Step("Click on convert to order")
	public void clickConvertToOrder() throws Exception {
		Assert.assertTrue(convertToOrderBtn.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(3000);
		convertToOrderBtn.click();
	}

// Verifying checkbox appears after clicking on convert to order button and click on yes convert to order button on checkbox
	@Step("click on yes convert to order button on checkbox")
	public void handlingCheckbox1() throws Exception {
		Assert.assertTrue(goBack.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(yesConvertToOrderBtn.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(3000);
		yesConvertToOrderBtn.click();
		Thread.sleep(8000);
	}

// Click on submit order button
	@Step("Click on submit order button")
	public void clickSubmitOrderButton() throws Exception {
		Assert.assertTrue(submitOrderBtn.isEnabled(), "Both actual and expected are not same");
		submitOrderBtn.click();
		Thread.sleep(5000);
	}

// Verifying checkbox appears after clicking on submit order button and click on submit button
	@Step("click on submit button")
	public void handlingCheckbox2() throws Exception {
		Assert.assertTrue(goBackBtn.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(submitBtn.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(2000);
		submitBtn.click();
		Thread.sleep(8000);
	}

// Verifying customer details after submit order
	@Step("Get customer details on order page")
	public void getCustomerDetailsOnOrderPage() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		if (user.getText().equals("DC")) {
			Assert.assertTrue(cusDetailsOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_demo = cusDetailsOrderPage.getText();
			System.out.println(text_demo);
			String text1_demo = text_demo.replaceAll("\\s", "");
			System.out.println("Customer details on Order:-" + text1_demo);
			String a_demo = "Wizcom Automate\r\n" + "\r\n" + "mdshad@wizcommerce.com\r\n" + "\r\n" + "QA\r\n" + "\r\n"
					+ "Option 1 label";
			String expe_demo = a_demo.replaceAll("\\s", "");
			softAssert.assertEquals(text1_demo, expe_demo, "Both actual and expected are not same");
			Thread.sleep(4000);
		} else if (user.getText().equals("QT")) {
			Assert.assertTrue(cusDetailsOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_qa = cusDetailsOrderPage.getText();
			System.out.println(text_qa);
			String text1_qa = text_qa.replaceAll("\\s", "");
			System.out.println("Customer details on Order:-" + text1_qa);
			String a_qa = getDataFromExcell(1, 6);
			String expe_qa = a_qa.replaceAll("\\s", "");
			softAssert.assertEquals(text1_qa, expe_qa, "Both actual and expected are not same");
			Thread.sleep(4000);
		}
	}

// Verifying customer billing details after submit order
	@Step("Get  billing address on order page")
	public void getBillingAddressOnOrderPage() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		if (user.getText().equals("DC")) {
			Assert.assertTrue(billingAddressOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_demo = billingAddressOrderPage.getText();
			System.out.println(text_demo);
			String text1_demo = text_demo.replaceAll("\\s", "");
			System.out.println("Customer Billing details on Order:-" + text1_demo);
			String s_demo = "wizcom automate\r\n" + "\r\n" + "5401 N Elston Ave\r\n"
					+ "\r\n" + "Chicago, Illinois, 60630\r\n" + "\r\n" + "United States of America ";
			String expe_demo = s_demo.replaceAll("\\s", "");
			softAssert.assertEquals(text1_demo, expe_demo, "Both actual and expected are not same");
			Thread.sleep(4000);
		} else if (user.getText().equals("DC")) {
			Assert.assertTrue(billingAddressOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_qa = billingAddressOrderPage.getText();
			System.out.println(text_qa);
			String text1_qa = text_qa.replaceAll("\\s", "");
			System.out.println("Customer Billing details on Order:-" + text1_qa);
			String s_qa = getDataFromExcell(2, 6);
			String expe_qa = s_qa.replaceAll("\\s", "");
			softAssert.assertEquals(text1_qa, expe_qa, "Both actual and expected are not same");
			Thread.sleep(4000);
		}
	}

// Verifying customer shipping details after submit order
	@Step("Get shipping address on order page")
	public void getShippingAddressOnOrderPage() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		if (user.getText().equals("DC")) {
			Assert.assertTrue(shippingAddressOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_demo = shippingAddressOrderPage.getText();
			System.out.println(text_demo);
			String text1_demo = text_demo.replaceAll("\\s", "");
			System.out.println("Customer Shipping details on Order:-" + text1_demo);
			String s_demo = "wizcom automate\r\n" + "\r\n" + "5401 Elston Ave\r\n"
					+ "\r\n" + "Oakland, California, 94602\r\n" + "\r\n" + "United States of America";
			String expe_demo = s_demo.replaceAll("\\s", "");
			softAssert.assertEquals(text1_demo, expe_demo, "Both actual and expected are not same");
			Thread.sleep(4000);
		} else if (user.getText().equals("DC")){
			Assert.assertTrue(shippingAddressOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_qa = shippingAddressOrderPage.getText();
			System.out.println(text_qa);
			String text1_qa = text_qa.replaceAll("\\s", "");
			System.out.println("Customer Shipping details on Order:-" + text1_qa);
			String s_qa = getDataFromExcell(3, 6);
			String expe_qa = s_qa.replaceAll("\\s", "");
			softAssert.assertEquals(text1_qa, expe_qa, "Both actual and expected are not same");
			Thread.sleep(4000);
		}
	}

// Click on three dots icon on order page
	@Step("Click on three dots icon on order page")
	public void clickThreeDotsOnOrderPage() throws Exception {
		Assert.assertTrue(threeDotsBtn.isEnabled(), "Both actual and expected are not same");
		threeDotsBtn.click();
		Thread.sleep(5000);
	}

	// Select cancel from the dropdown appears after clicking on three dots icon
	@Step("Select cancel  from the dropdown appears after clicking on three dots icon")
	public void threeDotsDropdownOrderPage() throws Exception {
		for (int i = 0; i < threeDotsBtnOrderPageDd.size(); i++) {
			String text = threeDotsBtnOrderPageDd.get(i).getText();
			if (text.equalsIgnoreCase("Cancel")) {
				threeDotsBtnOrderPageDd.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
	}

// Verifying cancel order checkbox and click on go back button
	@Step("Verifying cancel order checkbox and click on go back button")
	public void handlingCancelOrderCheckbox() throws Exception {
		Assert.assertTrue(cancelOrderBoxGoBackBtn.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(cancelOrderBtn.isDisplayed(), "Both actual and expected are not same");
		boolean displayed1 = cancelOrderBoxGoBackBtn.isDisplayed();
		Thread.sleep(2000);
		cancelOrderBoxGoBackBtn.click();
		Thread.sleep(8000);
	}

// Verifying total cart value on order page
	@Step("Get total value from cart")
	public void verifyCartTotalOnOrderPage() throws Exception {
		Assert.assertTrue(cartTotalValueOrderPage.isDisplayed(), "Both actual and expected are not same");
		String text = cartTotalValueOrderPage.getText();
		Thread.sleep(4000);
	}

// Verifying view linked quote button on the order page
	@Step("Verifying view linked quote button on the order page")
	public void verifyViewLinkedQuoteButton() throws Exception {
		Assert.assertTrue(viewLinkedQuoteBtn.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(4000);
	}

// Verifying tear sheet icon on the order page
	@Step("Verifying tear sheet icon on the order page")
	public void verifyTearSheetIconOrderPage() throws Exception {
		Assert.assertTrue(tearSheetIcon.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(4000);
	}

// Verifying products information after ordering products
	@Step("Verifying products information after ordering products")
	public void verifyProductInfo() throws Exception {
		Assert.assertTrue(productInfo.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(4000);
	}

// Verifying customer mailId details after ordering product
	@Step("Verifying customer mailId details after ordering product")
	public void getMailIdOnOrderPage() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(mailIdOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_demo = mailIdOrderPage.getText();
			System.out.println(text_demo);
			Assert.assertEquals(text_demo, "mdshad@wizcommerce.com", "Both actual and expected are not same");
			Thread.sleep(3000);
		} else if (user.getText().equals("QT")) {
			Assert.assertTrue(mailIdOrderPage.isDisplayed(), "Both actual and expected are not same");
			String text_qa = mailIdOrderPage.getText();
			System.out.println(text_qa);
			Assert.assertEquals(text_qa, getDataFromExcell(4, 6), "Both actual and expected are not same");
			Thread.sleep(3000);
		}
	}

}
