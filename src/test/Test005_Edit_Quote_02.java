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
public class Test005_Edit_Quote_02 extends BaseTest {

	@Epic("Edit Quote Case 2")
	@Feature("Edit Quote and Submit Order")

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

	@Test(priority = 9, description = "Click on submit quote button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit quote Test")
	@Story("Story Name: To check click on submit quote")
	public void clickSubmitQuoteTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 submit = new pomPages.POM6_Edit_Quote_02();
		submit.clickSubmitQuote();
	}

	@Test(priority = 10, description = "Click on edit quote button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on edit quote Test")
	@Story("Story Name: To check click on edit quote")
	public void clickEditQuotebuttonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 edit = new pomPages.POM6_Edit_Quote_02();
		edit.clickEditQuotebutton();
	}

	@Test(priority = 11, description = "Click on edit button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on edit Test")
	@Story("Story Name: To check click on edit")
	public void clickEditButtonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 edit = new pomPages.POM6_Edit_Quote_02();
		edit.clickEditButton();
	}

	@Test(priority = 12, description = "Click on Add product button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Add product Test")
	@Story("Story Name: To check click on Add product")
	public void clickAddProductsButtonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 edit = new pomPages.POM6_Edit_Quote_02();
		edit.clickAddProductsButton();
	}

	@Test(priority = 13, description = "Adding more products to cart")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating adding more products to cart Test")
	@Story("Story Name: To check adding more products to cart")
	public void selectmoreProductTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 productPage = new pomPages.POM6_Edit_Quote_02();
		productPage.searchProductBox();
		productPage.selectProduct1();
		productPage.selectProduct2();
	}

	@Test(priority = 14, description = "Moving again towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCartAgainTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 cart = new pomPages.POM6_Edit_Quote_02();
		cart.clickCartIcon();
	}

	@Test(priority = 15, description = "Click on update quote button")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating click on update quote button")
	@Story("Story Name: To check click on update quote button")
	public void clickUpdateQuoteButtonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 update = new pomPages.POM6_Edit_Quote_02();
		update.clickUpdateQuoteButton();
	}

	@Test(priority = 16, description = "Click on re-submit quote button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on re-submit quote button Test")
	@Story("Story Name: To check click on re-submit quote button")
	public void clickReSubmitQuoteButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 apply = new pomPages.POM5_Edit_Quote_01();
		apply.clickReSubmitQuoteButton();
	}

	@Test(priority = 17, description = "Click on convert to order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on convert to order Test")
	@Story("Story Name: To check click on convert to order")
	public void clickConvertToOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order convert = new pomPages.POM4_Convert_Quote_To_Order();
		convert.clickConvertToOrder();
	}

	@Test(priority = 18, description = "Handling check box 1")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 1 Test")
	@Story("Story Name: To check handling check box 1")
	public void handlingCheckbox1Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox1();
	}

	@Test(priority = 19, description = "Click on submit order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit order Test")
	@Story("Story Name: To check click on submit order")
	public void clickSubmitOrderButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickSubmitOrderButton();
	}

	@Test(priority = 20, description = "Handling check box 2")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 2 Test")
	@Story("Story Name: To check handling check box 2")
	public void handlingCheckbox2Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox2();
	}

}
