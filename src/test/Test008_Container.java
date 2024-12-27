package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Listeners(Listener.class)
public class Test008_Container extends BaseTest {

	@Epic("Container flow")
	@Feature("Container flow to submit order")

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
		productPage.selectProduct3();
		productPage.selectProduct4();
	}

	@Test(priority = 3, description = "Moving towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCart() throws Exception {
		pomPages.POM2_Product_Page cart = new pomPages.POM2_Product_Page();
		cart.clickCartIcon();
	}

	@Test(priority = 4, description = "Checking container box visible on cart page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating container box visible on cart page Test")
	@Story("Story Name: To check container box visible on cart page")
	public void containerBoxVisibilityTest() throws Exception {
		pomPages.POM9_Container visible = new pomPages.POM9_Container();
		visible.containerBoxVisibility();

	}

	@Test(priority = 5, description = "handling toggle switch")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling toggle switch Test")
	@Story("Story Name: To check handling toggle switch")
	public void toggleSwitchTest() throws Exception {
		pomPages.POM9_Container toggle = new pomPages.POM9_Container();
		toggle.toggleSwitch();

	}

	@Test(priority = 6, description = "clicking on Create quote button on cart page", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Create quote button on cart page Test")
	@Story("Story Name: To check Create quote button on cart page")
	public void clickCreateOrderTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order cartPage = new pomPages.POM4_Convert_Quote_To_Order();
		cartPage.clickCreateQuoteBtn1();
	}

	@Test(priority = 7, description = "clicking on Choose customer button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Choose customer button Test")
	@Story("Story Name: To check Choose customer button")
	public void clickChooseCustomerTest() throws Exception {
		pomPages.POM3_Cart_Page choose = new pomPages.POM3_Cart_Page();
		choose.clickchooseCustomerBtn();
	}

	@Test(priority = 8, description = "Searching customer", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search Test")
	@Story("Story Name: To check customer search textbox")
	public void customerSearchTest() throws Exception {
		pomPages.POM3_Cart_Page cus = new pomPages.POM3_Cart_Page();
		cus.clickCustomerSearchTextbox();
	}

	@Test(priority = 10, description = "Checking toggle switch off after selecting customer", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating toggle switch off after selecting customer Test")
	@Story("Story Name: To check toggle switch off after selecting customer")
	public void checkContainerOnCartPageAfterSelectingCustomerTest() throws Exception {
		pomPages.POM9_Container toggle = new pomPages.POM9_Container();
		toggle.checkContainerOnCartPageAfterSelectingCustomer();
	}

	@Test(priority = 11, description = "Checking that by default CFT is displaying and in bottom totalCFT value is showing", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating that by default CFT is displaying and in bottom totalCFT value is showing Test")
	@Story("Story Name: To check that by default CFT is displaying and in bottom totalCFT value is showing")
	public void defaultCFTTest() throws Exception {
		pomPages.POM9_Container show = new pomPages.POM9_Container();
		show.defaultCFT();
	}

	@Test(priority = 12, description = "Checking that by click on CBM, in bottom totalCBM value is showing", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating that by click on CBM, in bottom totalCBM value is showing Test")
	@Story("Story Name: To check that by click on CBM, in bottom totalCBM value is showing")
	public void clickCBMTest() throws Exception {
		pomPages.POM9_Container show = new pomPages.POM9_Container();
		show.clickCBM();
	}

	@Test(priority = 13, description = "Selecting from CBM dropdown", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating selecting from CBM dropdown Test")
	@Story("Story Name: To check selecting from CBM dropdown")
	public void selctCBMFromDropdownTest() throws Exception {
		pomPages.POM9_Container dD = new pomPages.POM9_Container();
		dD.selctCBMFromDropdown();
	}

	@Test(priority = 14, description = "Click on CFT again and selecting from CFT dropdown", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on CFT again and selecting from CFT dropdown Test")
	@Story("Story Name: To check click on CFT again and selecting from CFT dropdown")
	public void clickCFTAgainAndSelctCFTFromDropdownTest() throws Exception {
		pomPages.POM9_Container dD = new pomPages.POM9_Container();
		dD.clickCFTAgainAndSelctCFTFromDropdown();
	}

	@Test(priority = 15, description = "handling toggle switch again")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating handling toggle switch again Test")
	@Story("Story Name: To check handling toggle switch again")
	public void toggleSwitchAgainTest() throws Exception {
		pomPages.POM9_Container toggle = new pomPages.POM9_Container();
		toggle.toggleSwitch();
	}

	@Test(priority = 16, description = "Click on create quote")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on create quote Test")
	@Story("Story Name: To check click on create quote")
	public void clickCreateOrder2ButtonTest() throws Exception {
		pomPages.POM4_Convert_Quote_To_Order quote = new pomPages.POM4_Convert_Quote_To_Order();
		quote.clickCreateQuoteBtn2Button();
	}

	@Test(priority = 17, description = "Click on proceed button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on proceed button Test")
	@Story("Story Name: To check click on proceed button")
	public void clickProceedButtonTest() throws Exception {
		pomPages.POM3_Cart_Page proceed = new pomPages.POM3_Cart_Page();
		proceed.clickProceedButton();
	}

	@Test(priority = 18, description = "Checking container box not visible on cart page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating container box not visible on cart page Test")
	@Story("Story Name: To check container box not visible on cart page")
	public void toggleSwitchCheckTest() throws Exception {
		pomPages.POM9_Container visible = new pomPages.POM9_Container();
		visible.toggleSwitchCheck();

	}

	@Test(priority = 19, description = "Click on edit button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on edit Test")
	@Story("Story Name: To check click on edit")
	public void clickEditButtonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 edit = new pomPages.POM6_Edit_Quote_02();
		edit.clickEditButton();
	}

	@Test(priority = 20, description = "Click on Add product button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on Add product Test")
	@Story("Story Name: To check click on Add product")
	public void clickAddProductsButtonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 edit = new pomPages.POM6_Edit_Quote_02();
		edit.clickAddProductsButton();
	}

	@Test(priority = 21, description = "Adding more products to cart")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating adding more products to cart Test")
	@Story("Story Name: To check adding more products to cart")
	public void selectmoreProductTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 productPage = new pomPages.POM6_Edit_Quote_02();
		productPage.searchProductBox();
		productPage.selectProduct1();
		productPage.selectProduct2();
	}

	@Test(priority = 22, description = "Moving again towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCartAgainTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 cart = new pomPages.POM6_Edit_Quote_02();
		cart.clickCartIcon();
	}

	@Test(priority = 23, description = "Checking again container box not visible on cart page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating again container box not visible on cart page Test")
	@Story("Story Name: To check again container box not visible on cart page")
	public void toggleSwitchCheckTest2() throws Exception {
		pomPages.POM9_Container visible = new pomPages.POM9_Container();
		visible.toggleSwitchCheck();

	}

	@Test(priority = 24, description = "Click on update quote button")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating click on update quote button")
	@Story("Story Name: To check click on update quote button")
	public void clickUpdateQuoteButtonTest() throws Exception {
		pomPages.POM6_Edit_Quote_02 update = new pomPages.POM6_Edit_Quote_02();
		update.clickUpdateQuoteButton();
	}

	@Test(priority = 25, description = "Checking after updating quote, container box not visible on cart page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating after updating quote, container box not visible on cart page Test")
	@Story("Story Name: To check after updating quote, container box not visible on cart page")
	public void toggleSwitchCheckTest3() throws Exception {
		pomPages.POM9_Container visible = new pomPages.POM9_Container();
		visible.toggleSwitchCheck();

	}

}
