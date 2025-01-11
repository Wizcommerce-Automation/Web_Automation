package test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Listener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pomPages.POM2_Product_Page;

//@Listeners(Listener.class)
public class Test003_Convert_Quote_To_Order extends BaseTest {

	@Epic("Convert Quote To Order Flow")
	@Feature("Creating quote to submit order")

	@Test(priority = 1, description = "Click on product button")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating product button Test")
	@Story("Story Name: To check product button")
	public void productButtonTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		button.clickProduct();
	}

	@Test(priority = 2, description = "Adding products to cart")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating adding products to cart Test")
	@Story("Story Name: To check adding products to cart")
	
	public void selectProduct() throws Exception {
		pomPages.POM2_Product_Page productPage = new pomPages.POM2_Product_Page();
		productPage.searchProductBox();
		productPage.selectProduct1();
		productPage.selectProduct2();
	}

	@Test(priority = 3, description = "Moving towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCart() throws Exception {
		pomPages.POM2_Product_Page cart = new pomPages.POM2_Product_Page();
		cart.clickCartIcon();
	}

	@Test(priority = 4, description = "clicking on Create quote button on cart page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Create quote button on cart page Test")
	@Story("Story Name: To check Create quote button on cart page")
	public void clickCreateOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order cartPage = new pomPages.POM4_Convert_Quote_To_Order();
		cartPage.clickCreateQuoteBtn1();
	}

	@Test(priority = 5, description = "clicking on Choose customer button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Choose customer button Test")
	@Story("Story Name: To check Choose customer button")
	public void clickChooseCustomerTest() throws Exception {
		pomPages.POM3_Cart_Page choose = new pomPages.POM3_Cart_Page();				
		choose.clickchooseCustomerBtn();
	}

	@Test(priority = 6, description = "Searching customer")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search Test")
	@Story("Story Name: To check customer search textbox")
	public void customerSearchTest() throws Exception {
		pomPages.POM3_Cart_Page cus = new pomPages.POM3_Cart_Page();
		cus.clickCustomerSearchTextbox();
	}

	@Test(priority = 7, description = "Click on create quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on create quote Test")
	@Story("Story Name: To check click on create quote")
	public void clickCreateOrder2ButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order quote = new pomPages.POM4_Convert_Quote_To_Order();
		quote.clickCreateQuoteBtn2Button();
	}

	@Test(priority = 8, description = "Click on proceed button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on proceed button Test")
	@Story("Story Name: To check click on proceed button")
	public void clickProceedButtonTest() throws Exception {
		pomPages.POM3_Cart_Page proceed = new pomPages.POM3_Cart_Page();
		proceed.clickProceedButton();
	}

	@Test(priority = 9, description = "Verify customer details")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer details Test")
	@Story("Story Name: To check customer details")
	public void verifyCustomerDetailsOnQuoteTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order details = new pomPages.POM4_Convert_Quote_To_Order();
		details.verifyCustomerDetailsOnQuote();
	}

	@Test(priority = 10, description = "Verify billing address details on quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating billing address details on quote Test")
	@Story("Story Name: To check billing address details on quote")
	public void verifyBillingDetailsOnQuoteTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order billAddress = new pomPages.POM4_Convert_Quote_To_Order();
		billAddress.verifyBillingDetailsOnQuote();
	}

	@Test(priority = 11, description = "Verify shipping address details on quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating shipping address details on quote Test")
	@Story("Story Name: To check shipping address details on quote")
	public void verifyShippingDetailsOnQuoteTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order shippingAddress = new pomPages.POM4_Convert_Quote_To_Order();
		shippingAddress.verifyShippingDetailsOnQuote();
	}

	@Test(priority = 12, description = "Verify mailId details on quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating mailId details on quote Test")
	@Story("Story Name: To check mailId details on quote")
	public void getMailIdOnQuotePageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order mail = new pomPages.POM4_Convert_Quote_To_Order();
		mail.getMailIdOnQuotePage();
	}

	@Test(priority = 13, description = "Click on tear sheet icon")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on tear sheet icon Test")
	@Story("Story Name: To check click on tear sheet icon")
	public void clickTearSheetIconTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order icon = new pomPages.POM4_Convert_Quote_To_Order();
		icon.clickTearSheetIcon();
	}

	@Test(priority = 14, description = "Click on Excel Sheet for downloading")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Excel Sheet for downloading Test")
	@Story("Story Name: To check click on Excel Sheet for downloading")
	public void clickExcelSheet() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order sheet = new pomPages.POM4_Convert_Quote_To_Order();
		sheet.clickExcelSheet();
	}

	@Test(priority = 15, description = "Click on tear sheet icon again")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on tear sheet icon Test again")
	@Story("Story Name: To check click on tear sheet icon again")
	public void clickTearSheetIconAgainTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order icon1 = new pomPages.POM4_Convert_Quote_To_Order();
		icon1.clickTearSheetIconAgain();
	}

	@Test(priority = 16, description = "Click on PDF for downloading")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on PDF for downloading Test")
	@Story("Story Name: To check click on PDF for downloading")
	public void clickPDFTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order pdf = new pomPages.POM4_Convert_Quote_To_Order();
		pdf.clickPDF();
	}

	@Test(priority = 17, description = "Verify total and pending amount")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating total and pending amount Test")
	@Story("Story Name: To check total and pending amount")
	public void verifyTotalAndPendingAmtTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order amt = new pomPages.POM4_Convert_Quote_To_Order();
		amt.verifyTotalAndPendingAmt();
	}

	@Test(priority = 18, description = "Click on three dots button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on three dots button Test")
	@Story("Story Name: To check click on three dots button")
	public void clickThreeDotsTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order dots = new pomPages.POM4_Convert_Quote_To_Order();
		dots.clickThreeDots();
	}

	@Test(priority = 19, description = "Click on Cancel quote from dropdown")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on cancel quote from dropdown Test")
	@Story("Story Name: To check click on Cancel quote from dropdown")
	public void threeDotsDropdownTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order dots = new pomPages.POM4_Convert_Quote_To_Order();
		dots.threeDotsDropdown();
	}

	@Test(priority = 20, description = "Handling cancel quote check box")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling cancel quote check box Test")
	@Story("Story Name: To check handling cancel quote check box")
	public void handlingCancelQuoteCheckboxTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCancelQuoteCheckbox();
	}

	@Test(priority = 21, description = "Copy Id")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Copy Id Test")
	@Story("Story Name: To check Id copied")
	public void copyOrderIdTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order copy = new pomPages.POM4_Convert_Quote_To_Order();
		copy.copyOrderId();
	}

	@Test(priority = 22, description = "Selecting save for later to submit quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating save for later to submit quote Test")
	@Story("Story Name: To check save for later to submit quote")
	public void selectSaveForLater() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order save = new pomPages.POM4_Convert_Quote_To_Order();
		save.clickSaveForLaterButton();
	}

	@Test(priority = 23, description = "Paste Id in reference textbox")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating paste Id in reference textbox Test")
	@Story("Story Name: To check paste Id in reference textbox")
	public void pasteOrderIdTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order paste = new pomPages.POM4_Convert_Quote_To_Order();
		paste.pasteOrderId();
	}

	@Test(priority = 24, description = "Get type status")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Get type status Test")
	@Story("Story Name: To check Get type status")
	public void getTypeStatusTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order type = new pomPages.POM4_Convert_Quote_To_Order();
		type.getTypeStatus();
	}

	@Test(priority = 25, description = "Get status")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Get status Test")
	@Story("Story Name: To check Get status")
	public void getDarftStatusTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order status = new pomPages.POM4_Convert_Quote_To_Order();
		status.getDarftStatus();
	}

	@Test(priority = 26, description = "Click on mainID")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on mainID Test")
	@Story("Story Name: To check click on mainID")
	public void clickmainIdTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order id = new pomPages.POM4_Convert_Quote_To_Order();
		id.clickmainId();
	}

	@Test(priority = 27, description = "Click on Submit Quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Submit Quote Test")
	@Story("Story Name: To check click on Submit Quote")
	public void clickSubmitQuoteTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickSubmitQuote();
	}
	
	@Test(priority = 28, description = "Click on Submit Quote Popup")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Submit Quote popup Test")
	@Story("Story Name: To check click on Submit Button from Quote popup")
	public void clickOnSubmit() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickOnSubmitButton();
	}

	@Test(priority = 29, description = "Click on convert to order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on convert to order Test")
	@Story("Story Name: To check click on convert to order")
	public void clickConvertToOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order convert = new pomPages.POM4_Convert_Quote_To_Order();
		convert.clickConvertToOrder();
	}

	@Test(priority = 30, description = "Handling check box 1")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 1 Test")
	@Story("Story Name: To check handling check box 1")
	public void handlingCheckbox1Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox1();
	}

	@Test(priority = 31, description = "Click on submit order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit order Test")
	@Story("Story Name: To check click on submit order")
	public void clickSubmitOrderButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickSubmitOrderButton();
	}

	@Test(priority = 32, description = "Handling check box 2")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 2 Test")
	@Story("Story Name: To check handling check box 2")
	public void handlingCheckbox2Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox2();
	}

	@Test(priority = 33, description = "Verify customer details")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer details Test")
	@Story("Story Name: To check customer details")
	public void getCustomerDetailsOnOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order details = new pomPages.POM4_Convert_Quote_To_Order();
		details.getCustomerDetailsOnOrderPage();
	}

	@Test(priority = 34, description = "Verify billing address details")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating billing address details Test")
	@Story("Story Name: To check billing address details")
	public void getBillingAddressOnOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order billAddress = new pomPages.POM4_Convert_Quote_To_Order();
		billAddress.getBillingAddressOnOrderPage();
	}

	@Test(priority = 35, description = "Verify shipping address details")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating shipping address details Test")
	@Story("Story Name: To check shipping address details")
	public void getShippingAddressOnOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order shippingAddress = new pomPages.POM4_Convert_Quote_To_Order();
		shippingAddress.getShippingAddressOnOrderPage();
	}

	@Test(priority = 36, description = "Click on three dots button on order page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on three dots button on order page Test")
	@Story("Story Name: To check click on three dots button on order page")
	public void clickThreeDotsOnOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order dots = new pomPages.POM4_Convert_Quote_To_Order();
		dots.clickThreeDotsOnOrderPage();
	}

	@Test(priority = 37, description = "Click on cancel order on dropdown")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on cancel order on dropdown Test")
	@Story("Story Name: To check click on cancel order on dropdown")
	public void threeDotsDropdownOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order dots = new pomPages.POM4_Convert_Quote_To_Order();
		dots.threeDotsDropdownOrderPage();
	}

	@Test(priority = 38, description = "Handling cancel order check box")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling cancel order check box Test")
	@Story("Story Name: To check handling cancel order check box")
	public void handlingCancelOrderCheckboxTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCancelOrderCheckbox();
	}

	@Test(priority = 39, description = "Verify total amount on order page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating total amount on order page Test")
	@Story("Story Name: To check total amount on order page")
	public void verifyCartTotalOnOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order total = new pomPages.POM4_Convert_Quote_To_Order();
		total.verifyCartTotalOnOrderPage();
	}

	@Test(priority = 40, description = "Verify view linked quote button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating view linked quote button Test")
	@Story("Story Name: To check view linked quote button")
	public void verifyViewLinkedQuoteButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order view = new pomPages.POM4_Convert_Quote_To_Order();
		view.verifyViewLinkedQuoteButton();
	}

	@Test(priority = 41, description = "Verify tear sheet icon on order page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating tear sheet icon on order page Test")
	@Story("Story Name: To check tear sheet icon on order page")
	public void verifyTearSheetIconOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order tear = new pomPages.POM4_Convert_Quote_To_Order();
		tear.verifyTearSheetIconOrderPage();
	}

	@Test(priority = 42, description = "Verify product info on order page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product info on order page Test")
	@Story("Story Name: To check product info on order page")
	public void verifyProductInfoTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order pro = new pomPages.POM4_Convert_Quote_To_Order();
		pro.verifyProductInfo();
	}

	@Test(priority = 43, description = "Verify mailId details")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating mailId details Test")
	@Story("Story Name: To check mailId details")
	public void getMailIdOnOrderPageTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order mail = new pomPages.POM4_Convert_Quote_To_Order();
		mail.getMailIdOnOrderPage();
	}
	
	@Test(priority = 44, description = "cancel order verification")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating cancel order verification Test")
	@Story("Story Name: To check cancel order verification")
	public void orderCancelledTest() throws Exception {
		Test002_Create_Order cancelOrder = new Test002_Create_Order();
		cancelOrder.cancelOrderTest();
	}

}
