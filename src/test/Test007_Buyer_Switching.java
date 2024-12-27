package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Test007_Buyer_Switching extends BaseTest {

	@Epic("Buyer Switching")
	@Feature("Buyer Switching and catlogue Change")

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

	@Test(priority = 3, description = "Click on Guest Customer button")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Guest Customer button Test")
	@Story("Story Name: To check Guest Customer button")
	public void clickGuestCustomerButton1sttimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching button = new pomPages.POM8_Buyer_Switching();
		button.clickGuestCustomerButton1stTime();

	}

	@Test(priority = 4, description = "Searching customer")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search Test")
	@Story("Story Name: To check customer search textbox")
	@Step("Click on Customer Search Text box")
	public void clickCustomerSearchTextbox1stTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching cus = new pomPages.POM8_Buyer_Switching();
		cus.clickCustomerSearchTextbox1stTime();
	}

	@Test(priority = 5, description = "Click on selected customer and selecting new cart from popup")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on selected customer and selecting new cart from popup Test")
	@Story("Story Name: To check click on selected customer and selecting new cart from popup")
	public void clickCustomer1Test() throws Exception {
		pomPages.POM8_Buyer_Switching check = new pomPages.POM8_Buyer_Switching();
		check.clickCustomer1();
	}

	@Test(priority = 6, description = "Moving towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void clickCartButton1stTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching cart = new pomPages.POM8_Buyer_Switching();
		cart.clickCartButton1stTime();

	}

	@Test(priority = 7, description = "verify cart is empty after choosing new cart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating cart is empty after choosing new cart Test")
	@Story("Story Name: To check cart is empty after choosing new cart")
	@Step("Check cart")
	public void verifyEmptyCart1stTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching verify = new pomPages.POM8_Buyer_Switching();
		verify.verifyEmptyCart1stTime();

	}

	@Test(priority = 8, description = "verify customer name on cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating customer name on cart page Test")
	@Story("Story Name: To check customer name on cart page")
	public void verifyCustomerNameOnCartPage1stTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching verify = new pomPages.POM8_Buyer_Switching();
		verify.verifyCustomerNameOnCartPage1stTime();

	}

	@Test(priority = 9, description = "Adding products to cart again")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating adding products to cart again Test")
	@Story("Story Name: To check adding products to cart again")
	public void selectProduct2ndTimeTest() throws Exception {
		pomPages.POM2_Product_Page productPage = new pomPages.POM2_Product_Page();
		productPage.searchProductBox();
		productPage.selectProduct3();
		productPage.selectProduct4();
	}

	@Test(priority = 10, description = "Click on Guest Customer button again for assign cart")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Guest Customer button again for assign cart Test")
	@Story("Story Name: To check Guest Customer button again for assign cart")
	public void clickGuestCustomerButton2ndTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching button = new pomPages.POM8_Buyer_Switching();
		button.clickGuestCustomerButton1stTime();

	}

	@Test(priority = 11, description = "Searching customer again for assign cart")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search again for assign cart Test")
	@Story("Story Name: To check customer search again in textbox for assign cart")
	public void clickCustomerSearchTextbox2ndTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching cus = new pomPages.POM8_Buyer_Switching();
		cus.clickCustomerSearchTextbox2ndTime();
	}

	@Test(priority = 12, description = "Select customer and selecting assign cart ")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating selecting assign cart Test")
	@Story("Story Name: To check selecting assign cart")
	public void clickCustomer2Test() throws Exception {
		pomPages.POM8_Buyer_Switching check = new pomPages.POM8_Buyer_Switching();
		check.clickCustomer2();
	}

	@Test(priority = 13, description = "Moving towards Cart page again")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page again Test")
	@Story("Story Name: To check Cart page again")
	public void clickCartButton2ndTime() throws Exception {
		pomPages.POM8_Buyer_Switching cart = new pomPages.POM8_Buyer_Switching();
		cart.clickCartButton1stTime();

	}

	@Test(priority = 14, description = "verify customer name on cart page again")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating customer name on cart page again Test")
	@Story("Story Name: To check customer name on cart page again")
	public void verifyCustomerNameOnCartPage2ndTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching verify = new pomPages.POM8_Buyer_Switching();
		verify.verifyCustomerNameOnCartPage2ndTime();

	}

	@Test(priority = 15, description = "Count total products on cart after buyer switching")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating count of total products on cart after buyer switching Test")
	@Story("Story Name: To check count of products on cart after buyer switching")
	public void verifyProductOnCart1stTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching count = new pomPages.POM8_Buyer_Switching();
		count.verifyProductOnCart1stTime();
	}

	@Test(priority = 16, description = "Click on Customer button again to check no popup came")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Customer button again to check no popup came Test")
	@Story("Story Name: To check Customer button again to check no popup came")
	public void clickOnCustomerButton3rdTime() throws Exception {
		pomPages.POM8_Buyer_Switching button = new pomPages.POM8_Buyer_Switching();
		button.clickOnCustomerButton3rdTime();
		button.clickGuestCus3rdTime();
	}

	@Test(priority = 17, description = "Count total products on cart after selecting guest customer")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating count of total products on cart after after selecting guest customer Test")
	@Story("Story Name: To check count of products on cart after after selecting guest customer")
	public void verifyProductOnCart2ndTime() throws Exception {
		pomPages.POM8_Buyer_Switching count = new pomPages.POM8_Buyer_Switching();
		count.verifyProductOnCart1stTime();
	}

	@Test(priority = 18, description = "Click on Guest Customer button again to check product added prior")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Guest Customer button again to check product added prior Test")
	@Story("Story Name: To check Guest Customer button again to check product added prior")
	public void clickGuestCustomerButton3rdTimeforReplaceTest() throws Exception {
		pomPages.POM8_Buyer_Switching button = new pomPages.POM8_Buyer_Switching();
		button.clickGuestCustomerButton3rdTime();

	}

	@Test(priority = 19, description = "Searching customer again in which products were added previously")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search again in which products were added previously Test")
	@Story("Story Name: To check customer search again textbox in which products were added previously")
	public void clickCustomerSearchTextbox3rdTime() throws Exception {
		pomPages.POM8_Buyer_Switching cus = new pomPages.POM8_Buyer_Switching();
		cus.clickCustomerSearchTextbox3rdTime();
	}

	@Test(priority = 20, description = "Select customer and selecting keep existing from popup as product existed in the customer cart")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Select customer and selecting keep existing from popup as product existed in the customer cart Test")
	@Story("Story Name: To check Select customer and selecting keep existing from popup as product existed in the customer cart")
	@Step("Click on customer button")
	public void clickCustomer2AgainForkeepExistingTest() throws Exception {
		pomPages.POM8_Buyer_Switching check = new pomPages.POM8_Buyer_Switching();
		check.clickCustomer2AgainForkeepExisting();
	}

	@Test(priority = 21, description = "Count total products on cart after buyer switching after selecting keep existing from popup")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating count of total products on cart after buyer switching after selecting keep existing from popup Test")
	@Story("Story Name: To check count of products on cart after buyer switching after selecting keep existing from popup")
	public void verifyProductOnCart3rdTimeTest() throws Exception {
		pomPages.POM8_Buyer_Switching count = new pomPages.POM8_Buyer_Switching();
		count.verifyProductOnCart1stTime();
	}

	@Test(priority = 22, description = "Click on Guest Customer button again to check product added prior")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Guest Customer button again to check product added prior Test")
	@Story("Story Name: To check Guest Customer button again to check product added prior")
	public void clickGuestCustomerButton4thTime() throws Exception {
		pomPages.POM8_Buyer_Switching button = new pomPages.POM8_Buyer_Switching();
		button.clickGuestCustomerButton3rdTime();

	}

	@Test(priority = 23, description = "Searching customer again in which products were added previously")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search again in which products were added previously Test")
	@Story("Story Name: To check customer search again textbox in which products were added previously")
	public void clickCustomerSearchTextbox4thTime() throws Exception {
		pomPages.POM8_Buyer_Switching cus = new pomPages.POM8_Buyer_Switching();
		cus.clickCustomerSearchTextbox4theTime();
	}

	@Test(priority = 24, description = "Select customer and selecting replace from popup as product existed in the customer cart")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Select customer and selecting replace from popup as product existed in the customer cart Test")
	@Story("Story Name: To check Select customer and selecting replace from popup as product existed in the customer cart")
	@Step("Click on customer search text box")
	public void clickCustomerSearchTextbox4theTime() throws Exception {
		pomPages.POM8_Buyer_Switching check = new pomPages.POM8_Buyer_Switching();
		check.clickCustomer4ForReplace();
	}

	@Test(priority = 25, description = "Count total products on cart after buyer switching after selecting replace from popup")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating count of total products on cart after buyer switching after selecting keep existing from popup Test")
	@Story("Story Name: To check count of products on cart after buyer switching after selecting keep existing from popup")
	public void clickCustomer4ForReplaceTest() throws Exception {
		pomPages.POM8_Buyer_Switching count = new pomPages.POM8_Buyer_Switching();
		count.verifyProductOnCart1stTime();
	}

}
