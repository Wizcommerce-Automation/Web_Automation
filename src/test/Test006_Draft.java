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
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pomPages.POM2_Product_Page;

//@Listeners(Listener.class)
public class Test006_Draft extends BaseTest {

	@Epic("Draft")
	@Feature("Draft to submit Order")

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
		//span/img[@src="/assets/cart_icon-e88b9cca.svg"]
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

	@Test(priority = 9, description = "Copy Id")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Copy Id Test")
	@Story("Story Name: To check Id copied")
	public void copyOrderIdTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order copy = new pomPages.POM4_Convert_Quote_To_Order();
		copy.copyOrderId();
	}

	@Test(priority = 10, description = "Selecting save for later to submit quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating save for later to submit quote Test")
	@Story("Story Name: To check save for later to submit quote")
	public void selectSaveForLater() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order save = new pomPages.POM4_Convert_Quote_To_Order();
		save.clickSaveForLaterButton();
	}

	@Test(priority = 11, description = "Paste Id in reference textbox")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating paste Id in reference textbox Test")
	@Story("Story Name: To check paste Id in reference textbox")
	public void pasteOrderIdTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order paste = new pomPages.POM4_Convert_Quote_To_Order();
		paste.pasteOrderId();
	}

	@Test(priority = 12, description = "Get type status")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Get type status Test")
	@Story("Story Name: To check Get type status")
	public void getTypeStatusTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order type = new pomPages.POM4_Convert_Quote_To_Order();
		type.getTypeStatus();
	}

	@Test(priority = 13, description = "Get status")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Get status Test")
	@Story("Story Name: To check Get status")
	public void getDarftStatusTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order status = new pomPages.POM4_Convert_Quote_To_Order();
		status.getDarftStatus();
	}

	@Test(priority = 14, description = "Get customer name")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating get customer name Test")
	@Story("Story Name: To check customer name")
	public void customerNameVerificationTest() throws Exception {
		pomPages.POM7_Draft cus = new pomPages.POM7_Draft();
		cus.customerNameVerification();
	}

	@Test(priority = 15, description = "Click on Drafts button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Drafts button Test")
	@Story("Story Name: To check click on Drafts button")
	public void clickDarftTest() throws Exception {
		pomPages.POM7_Draft draft = new pomPages.POM7_Draft();
		draft.clickDarft();
	}

	@Test(priority = 16, description = "Paste Id in reference textbox on Drafts")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating paste Id in reference textbox on Drafts Test")
	@Story("Story Name: To check paste Id in reference textbox on Drafts")
	public void pasteOrderIdOnDraftsTest() throws Exception {
		pomPages.POM7_Draft paste = new pomPages.POM7_Draft();
		paste.pasteOrderIdOnDrafts();
	}

	@Test(priority = 17, description = "Get type status on drafts")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Get type status on drafts Test")
	@Story("Story Name: To check Get type status on drafts")
	public void getDarftTypeStatusTest() throws Exception {
		pomPages.POM7_Draft type = new pomPages.POM7_Draft();
		type.getDarftTypeStatus();
	}

	@Test(priority = 18, description = "Get status on drafts")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Get status on drafts Test")
	@Story("Story Name: To check Get status on drafts")
	public void getStatusOnDraftTest() throws Exception {
		pomPages.POM7_Draft status = new pomPages.POM7_Draft();
		status.getStatusOnDraft();
	}

	@Test(priority = 19, description = "Get customer name")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating get customer name Test")
	@Story("Story Name: To check customer name")
	public void customerNameVerificationOnDraftTest() throws Exception {
		pomPages.POM7_Draft cus = new pomPages.POM7_Draft();
		cus.customerNameVerificationOnDraft();
	}

	@Test(priority = 20, description = "Click on mainID")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on mainID Test")
	@Story("Story Name: To check click on mainID")
	public void clickmainIdTest() throws Exception {
		pomPages.POM7_Draft id = new pomPages.POM7_Draft();
		id.clickmainId();
	}

	@Test(priority = 21, description = "Click on Submit Quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Submit Quote Test")
	@Story("Story Name: To check click on Submit Quote")
	public void clickSubmitQuoteTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickSubmitQuote();
		submit.clickOnSubmitButton();
	}

	@Test(priority = 22, description = "Click on convert to order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on convert to order Test")
	@Story("Story Name: To check click on convert to order")
	public void clickConvertToOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order convert = new pomPages.POM4_Convert_Quote_To_Order();
		convert.clickConvertToOrder();
	}

	@Test(priority = 22, description = "Handling check box 1")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 1 Test")
	@Story("Story Name: To check handling check box 1")
	public void handlingCheckbox1Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox1();
	}

	@Test(priority = 23, description = "Click on submit order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit order Test")
	@Story("Story Name: To check click on submit order")
	public void clickSubmitOrderButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickSubmitOrderButton();
	}

	@Test(priority = 24, description = "Handling check box 2")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 2 Test")
	@Story("Story Name: To check handling check box 2")
	public void handlingCheckbox2Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox2();
	}

}
