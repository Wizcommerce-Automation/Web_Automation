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
public class Test004_Edit_Quote_01 extends BaseTest {

	@Epic("Edit Quote Case 1")
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

	@Test(priority = 4, description = "Click three dots button next to Add Products", enabled = true)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating three dots button Test")
	@Story("Story Name: To check three dots button")
	public void clickThreeDotsButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 dots = new pomPages.POM5_Edit_Quote_01();
		dots.clickThreeDotsButton();
	}

	@Test(priority = 5, description = "Selecting delete cart", enabled = true)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating delete cart Test")
	@Story("Story Name: To check delete cart")
	public void selectDeleteCartTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 delete = new pomPages.POM5_Edit_Quote_01();
		delete.selectDeleteCart();
	}

	@Test(priority = 6, description = "Handling checkbox ", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating discard all items in the cart checkbox Test")
	@Story("Story Name: To check discard all items in the cart checkbox")
	public void handlingDiscardAllItemsInCartCheckboxTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 discard = new pomPages.POM5_Edit_Quote_01();
		discard.handlingDiscardAllItemsInCartCheckbox();
	}

	@Test(priority = 7, description = "Click on add existing products", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating add existing products button Test")
	@Story("Story Name: To check add existing products button")
	public void clickAddExistingProductsTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 discard = new pomPages.POM5_Edit_Quote_01();
		discard.clickAddExistingProducts();
	}

	@Test(priority = 8, description = "Adding products again to the cart after deleting entire cart", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating adding products again to the cart after deleting entire cart Test")
	@Story("Story Name: To check adding products again to the cart after deleting entire cart")
	public void selectmoreProductTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 productPage = new pomPages.POM6_Edit_Quote_02();
		productPage.searchProductBox();
		productPage.selectProduct1();
		productPage.selectProduct2();
	}

	@Test(priority = 9, description = "Moving again towards Cart page", enabled = true)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCartAgainTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 cart = new pomPages.POM6_Edit_Quote_02();
		cart.clickCartIcon();
	}

	@Test(priority = 10, description = "clicking on Create quote button on cart page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Create quote button on cart page Test")
	@Story("Story Name: To check Create quote button on cart page")
	public void clickCreateOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order cartPage = new pomPages.POM4_Convert_Quote_To_Order();
		cartPage.clickCreateQuoteBtn1();
	}

	@Test(priority = 11, description = "clicking on Choose customer button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Choose customer button Test")
	@Story("Story Name: To check Choose customer button")
	public void clickChooseCustomerTest() throws Exception {
		pomPages.POM3_Cart_Page choose = new pomPages.POM3_Cart_Page();
		choose.clickchooseCustomerBtn();
	}

	@Test(priority = 12, description = "Searching customer")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search Test")
	@Story("Story Name: To check customer search textbox")
	public void customerSearchTest() throws Exception {
		pomPages.POM3_Cart_Page cus = new pomPages.POM3_Cart_Page();
		cus.clickCustomerSearchTextbox();
	}

	@Test(priority = 13, description = "Click on create quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on create quote Test")
	@Story("Story Name: To check click on create quote")
	public void clickCreateOrder2ButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order quote = new pomPages.POM4_Convert_Quote_To_Order();
		quote.clickCreateQuoteBtn2Button();
	}

	@Test(priority = 14, description = "Click on proceed button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on proceed button Test")
	@Story("Story Name: To check click on proceed button")
	public void clickProceedButtonTest() throws Exception {
		pomPages.POM3_Cart_Page proceed = new pomPages.POM3_Cart_Page();
		proceed.clickProceedButton();
	}

	@Test(priority = 15, description = "Click on submit quote button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit quote Test")
	@Story("Story Name: To check click on submit quote")
	public void clickSubmitQuoteTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 submit = new pomPages.POM5_Edit_Quote_01();
		submit.clickSubmitQuote();
	}

	@Test(priority = 16, description = "Click on edit quote button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on edit quote Test")
	@Story("Story Name: To check click on edit quote")
	public void clickEditQuotebuttonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 edit = new pomPages.POM5_Edit_Quote_01();
		edit.clickEditQuotebutton();
	}

	@Test(priority = 17, description = "Click on Add discount button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Add discount Test")
	@Story("Story Name: To check click on Add discount")
	public void clickAddDiscountButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 disc = new pomPages.POM5_Edit_Quote_01();
		disc.clickAddDiscountButton();
	}

	@Test(priority = 18, description = "Enter the discount value", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating enter the discount value Test")
	@Story("Story Name: To check discount entered")
	public void enterDiscountTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 discount = new pomPages.POM5_Edit_Quote_01();
		discount.enterDiscount();
	}

	@Test(priority = 19, description = "Amount verification", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating the amounts after shipping charge apply Test")
	@Story("Story Name: To check the amounts after applying shipping charge")
	public void verifyAmountAfterDiscountTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 amt = new pomPages.POM5_Edit_Quote_01();
		amt.verifyAmountAfterDiscount();
	}

	@Test(priority = 20, description = "Click on apply button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on apply button Test")
	@Story("Story Name: To check click on apply button")
	public void clickApplyButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 apply = new pomPages.POM5_Edit_Quote_01();
		apply.clickApplyButton();
	}

	@Test(priority = 21, description = "Click on Add Shipping charge button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Add shipping charge Test")
	@Story("Story Name: To check click on Add shipping charge")
	public void clickAddShippingChargeButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 ship = new pomPages.POM5_Edit_Quote_01();
		ship.clickAddShippingChargeButton();
	}

	@Test(priority = 22, description = "Enter the shipping value", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating enter the shipping charge Test")
	@Story("Story Name: To check shiiping charge entered")
	public void enterShippingChargeTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 ship = new pomPages.POM5_Edit_Quote_01();
		ship.enterShippingCharge();
	}

	@Test(priority = 23, description = "Amount verification", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating the amounts after shipping charge apply Test")
	@Story("Story Name: To check the amounts after applying shipping charge")
	public void verifyAmountAfterShipping() throws Exception {
		pomPages.POM5_Edit_Quote_01 amt = new pomPages.POM5_Edit_Quote_01();
		amt.verifyAmountAfterShipping();
	}

	@Test(priority = 24, description = "Click on apply button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on apply button Test")
	@Story("Story Name: To check click on apply button")
	public void clickShippingApplyButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 apply = new pomPages.POM5_Edit_Quote_01();
		apply.clickShippingApplyButton();
	}

	@Test(priority = 25, description = "Click on Add Tax button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Add Tax Test")
	@Story("Story Name: To check click on Add tax")
	public void clickAddTaxButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 tax = new pomPages.POM5_Edit_Quote_01();
		tax.clickAddTaxButton();
	}

	@Test(priority = 26, description = "Enter the tax value", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating enter the tax Test")
	@Story("Story Name: To check tax entered")
	public void enterTaxTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 tax = new pomPages.POM5_Edit_Quote_01();
		tax.enterTax();
	}

	@Test(priority = 27, description = "Amount verification", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating the amounts after tax charge apply Test")
	@Story("Story Name: To check the amounts after applying tax charge")
	public void verifyAmountAfterTaxTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 amt = new pomPages.POM5_Edit_Quote_01();
		amt.verifyAmountAfterTax();
	}

	@Test(priority = 28, description = "Click on apply button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on apply button Test")
	@Story("Story Name: To check click on apply button")
	public void clickTaxApplyButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 apply = new pomPages.POM5_Edit_Quote_01();
		apply.clickTaxApplyButton();
	}

	@Test(priority = 29, description = "Click on Add additional charge button")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating click on Add additional charge Test")
	@Story("Story Name: To check click on Add additional charge")
	public void clickAddAdditionalChargeButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 add = new pomPages.POM5_Edit_Quote_01();
		add.clickAddAdditionalChargeButton();
	}

	@Test(priority = 30, description = "Enter the name of additional charge", enabled = false)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating enter the name of additional charge Test")
	@Story("Story Name: To check name of additional charge entered")
	public void enterAdditionalchargeNameTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 name = new pomPages.POM5_Edit_Quote_01();
		name.enterAdditionalchargeName();
	}

	@Test(priority = 31, description = "Enter the add charge value")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating enter the add charge Test")
	@Story("Story Name: To check add charge entered")
	public void enterAdditionalchargeTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 charge = new pomPages.POM5_Edit_Quote_01();
		charge.enterAdditionalcharge();
	}

	@Test(priority = 32, description = "Amount verification")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating the amounts after add charge apply Test")
	@Story("Story Name: To check the amounts after applying add charge")
	public void verifyAmountAfterAddChargeTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 amt = new pomPages.POM5_Edit_Quote_01();
		amt.verifyAmountAfterAddCharge();
	}

	@Test(priority = 33, description = "Click on apply button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on apply button Test")
	@Story("Story Name: To check click on apply button")
	public void clickApplyAdditionalChargeButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 apply = new pomPages.POM5_Edit_Quote_01();
		apply.clickApplyAdditionalChargeButton();
	}

	@Test(priority = 34, description = "Page amount verification", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating page all amount Test ")
	@Story("Story Name: To check amount verification ")
	public void verifyPageAmountTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 verify = new pomPages.POM5_Edit_Quote_01();
		verify.verifyPageAmount();
	}

	@Test(priority = 35, description = "Click on re-submit quote button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on re-submit quote button Test")
	@Story("Story Name: To check click on re-submit quote button")
	public void clickReSubmitQuoteButtonTest() throws Exception {
		pomPages.POM5_Edit_Quote_01 apply = new pomPages.POM5_Edit_Quote_01();
		apply.clickReSubmitQuoteButton();
	}

	@Test(priority = 36, description = "Click on convert to order", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on convert to order Test")
	@Story("Story Name: To check click on convert to order")
	public void clickConvertToOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order convert = new pomPages.POM4_Convert_Quote_To_Order();
		convert.clickConvertToOrder();
	}

	@Test(priority = 37, description = "Handling check box 1", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 1 Test")
	@Story("Story Name: To check handling check box 1")
	public void handlingCheckbox1Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox1();
	}

	@Test(priority = 38, description = "Click on submit order", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit order Test")
	@Story("Story Name: To check click on submit order")
	public void clickSubmitOrderButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order submit = new pomPages.POM4_Convert_Quote_To_Order();
		submit.clickSubmitOrderButton();
	}

	@Test(priority = 39, description = "Handling check box 2", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling check box 2 Test")
	@Story("Story Name: To check handling check box 2")
	public void handlingCheckbox2Test() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order box = new pomPages.POM4_Convert_Quote_To_Order();
		box.handlingCheckbox2();
	}
	
	@Test(priority = 40, description = "cancel order verification")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating cancel order verification Test")
	@Story("Story Name: To check cancel order verification")
	public void orderCancelledTest() throws Exception {
		Test002_Create_Order cancelOrder = new Test002_Create_Order();
		cancelOrder.cancelOrderTest();
	}
}
