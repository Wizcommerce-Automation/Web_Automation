package test;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import generic.AllureListener;
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
//@Listeners({AllureListener.class})
public class Test002_Create_Order extends BaseTest {
	
	WebDriver driver;
	
	public void implicitWait(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	};
 
	
	@Epic("Create Order Flow")
	@Feature("Product page and cart page")

	@Test(priority = 1, description = "Click on product button")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating product button Test")
	@Story("Story Name: To check product button")
	@Step("Click on side bar product button")
	public void productButtonTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		button.clickProduct();
	}

	@Test(priority = 2, description = "check cart to discard entire cart if products existed prior")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating check cart to discard entire cart if products existed prior Test")
	@Story("Story Name: To check cart to discard entire cart if products existed prior")
	@Step("Click on Cart Button")
	public void productsVisibleOnCartIconTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		button.productsVisibleOnCartIcon();
	}

	@Test(priority = 3, description = "Adding products to cart")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating adding products to cart Test")
	@Story("Story Name: To check adding products to cart")
	public void selectProduct() throws Exception {
		pomPages.POM2_Product_Page productPage = new pomPages.POM2_Product_Page();
		productPage.searchProductBox();
		productPage.selectProduct1();
		productPage.selectProduct2();
		productPage.selectProduct3();
		productPage.selectProduct4();
	}

	@Test(priority = 4, description = "Moving towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCart() throws Exception {
		pomPages.POM2_Product_Page cart = new pomPages.POM2_Product_Page();
		cart.clickCartIcon();
	}

	@Test(priority = 5, description = "Increasing product count by click on plus button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product increament by click on plus button Test")
	@Story("Story Name: To check product increment with plus icon click")
	public void plusButtonTest() throws Exception {
		pomPages.POM2_Product_Page plus = new pomPages.POM2_Product_Page();
		plus.clickPlusButton();
	}

	@Test(priority = 6, description = "Increasing product count", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product increament Test")
	@Story("Story Name: To check product increment")
	public void increasingProductCountTest() throws Exception {
		pomPages.POM2_Product_Page number = new pomPages.POM2_Product_Page();
		number.countProductAfterIncreament();
	}

	@Test(priority = 7, description = "Delete product by clicking on delete button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product delete Test")
	@Story("Story Name: To check product delete")
	public void verifyDeleteTest() throws Exception {
		pomPages.POM2_Product_Page dlt = new pomPages.POM2_Product_Page();
		dlt.clickdelete();
	}

	@Test(priority = 8, description = "Count total products on cart after deleting", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating count of total products on cart after deleting Test")
	@Story("Story Name: To check count of products on cart")
	public void validatingTotalProductOnCartTest() throws Exception {
		pomPages.POM2_Product_Page count = new pomPages.POM2_Product_Page();
		count.verifyProductOnCart();
	}

	@Test(priority = 9, description = "Delete product by click on three dots and selecting delete item", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product delete with three dots and selecting delete item")
	@Story("Story Name: To check product delete")
	public void deleteProductByThreedotButtonTest() throws Exception {
		pomPages.POM2_Product_Page dot = new pomPages.POM2_Product_Page();
		dot.clickThreeDotsButton();
	}

	@Test(priority = 10, description = "Decreasing product count by click on minus button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product decrement by click on minus button Test")
	@Story("Story Name: To check product decrement with minus icon click")
	@Step("Decreasing Product count")
	public void minusButtonTest() throws Exception {
		pomPages.POM2_Product_Page minus = new pomPages.POM2_Product_Page();
		minus.clickMinusButton();
	}

	@Test(priority = 11, description = "Decreasing product count", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating product decrement Test")
	@Story("Story Name: To check product decrement")
	public void decreasingProductCountTest() throws Exception {
		pomPages.POM2_Product_Page number = new pomPages.POM2_Product_Page();
		number.countProductAfterDecrement();
	}

	@Test(priority = 12, description = "Add Note by click on three dots", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating adding note with three dots and selecting Add note")
	@Story("Story Name: To check Add note")
	@Step("add notes")
	public void addNoteByThreedotButtonTest() throws Exception {
		pomPages.POM2_Product_Page dot = new pomPages.POM2_Product_Page();
		dot.clickAgainThreeDotsButton();
	}

	@Test(priority = 13, description = "Adding note in textbox", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating adding note in the textbox")
	@Story("Story Name: To check note added")
	public void writeNoteTest() throws Exception {
		pomPages.POM2_Product_Page note = new pomPages.POM2_Product_Page();
		note.addingNote();
	}

	@Test(priority = 14, description = "click on save button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating save button Test")
	@Story("Story Name: To check save button click")
	public void saveButtonTest() throws Exception {
		pomPages.POM2_Product_Page save = new pomPages.POM2_Product_Page();
		save.clickSaveButton();
	}

	@Test(priority = 15, description = "verifying note on cart page", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating note Test")
	@Story("Story Name: To check note")
	public void addNoteText() {
		pomPages.POM2_Product_Page note = new pomPages.POM2_Product_Page();
		note.getNoteText();
	}

	@Test(priority = 16, description = "Offer Discount by click on three dots", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating offer discount with three dots button test")
	@Story("Story Name: To check Offer discount")
	public void clickAgainOnThreeDotsButtonTest() throws Exception {
		pomPages.POM2_Product_Page disc = new pomPages.POM2_Product_Page();
		disc.clickAgainOnThreeDotsButton();
	}

	@Test(priority = 17, description = "Adding discount in the textbox", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating adding discount Test")
	@Story("Story Name: To check adding discount")
	@Step("Offering Discount")
	public void offeringDiscountTest() throws Exception {
		pomPages.POM2_Product_Page disc = new pomPages.POM2_Product_Page();
		disc.offeringDiscount();
	}

	@Test(priority = 18, description = "Amount verification", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating all the amounts after discount")
	@Story("Story Name: To check exact all the amounts after discount")
	public void verifyingAmountTest() throws Exception {
		pomPages.POM2_Product_Page disc = new pomPages.POM2_Product_Page();
		Assert.assertTrue(disc.verifyingAmount());
	}

	@Test(priority = 19, description = "Click on confirm button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on confirm button Test")
	@Story("Story Name: To check click on confirm button")
	public void clickConfirmButtonTest() throws Exception {
		pomPages.POM2_Product_Page cfm = new pomPages.POM2_Product_Page();
		cfm.clickConfirmButton();
	}

	@Test(priority = 20, description = "Verify that discount visible on selected product ", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating that discount visible on selected product Test")
	@Story("Story Name: To check that discount visible on selected product")
	public void verifyDiscountVisibilityOnProductTest() throws Exception {
		pomPages.POM2_Product_Page visible = new pomPages.POM2_Product_Page();
		visible.verifyDiscountVisibilityOnProduct();
	}

	@Test(priority = 21, description = "verifying click on back arrow next to cart", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating back arrow next to cart Test")
	@Story("Story Name: To check back arrow next to cart")
	public void clickBackArrowNextToCartTest() throws Exception {
		pomPages.POM2_Product_Page back = new pomPages.POM2_Product_Page();
		back.clickBackArrowNextToCart();
	}

	@Test(priority = 22, description = "Moving towards Cart page again", enabled = true)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page again Test")
	@Story("Story Name: To check Cart page again")
	public void selectCartAgain() throws Exception {
		pomPages.POM2_Product_Page cart = new pomPages.POM2_Product_Page();
		cart.clickCartIcon();
	}

	@Test(priority = 23, description = "Count total products on cart after coming on cart page again", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating count of total products on cart after coming on cart page again Test")
	@Story("Story Name: To check count of products on cart after coming on cart page again")
	public void verifyProductOnCartAgainTest() throws Exception {
		pomPages.POM2_Product_Page count = new pomPages.POM2_Product_Page();
		count.verifyProductOnCartAgain();
	}

	@Test(priority = 24, description = "clicking on Create Order button on cart page", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Create Order button on cart page Test")
	@Story("Story Name: To check Create Order button on cart page")
	public void clickCreateOrderTest() throws Exception {
		pomPages.POM3_Cart_Page cartPage = new pomPages.POM3_Cart_Page();
		cartPage.clickCreateOrderBtn1();
	}

	@Test(priority = 25, description = "clicking on Choose customer button", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating Choose customer button Test")
	@Story("Story Name: To check Choose customer button")
	public void clickChooseCustomerTest() throws Exception {
		pomPages.POM3_Cart_Page choose = new pomPages.POM3_Cart_Page();
		choose.clickchooseCustomerBtn();
	}

	@Test(priority = 26, description = "Searching customer", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating customer search Test")
	@Story("Story Name: To check customer search textbox")
	public void clickCustomerSearchTextboxTest() throws Exception {
		pomPages.POM3_Cart_Page cus = new pomPages.POM3_Cart_Page();
		cus.clickCustomerSearchTextbox();
	}

	@Test(priority = 27, description = "Click on create order")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on create order Test")
	@Story("Story Name: To check click on create order")
	public void clickCreateOrder2ButtonTest() throws Exception {
		pomPages.POM3_Cart_Page order = new pomPages.POM3_Cart_Page();
		order.clickCreateOrder2Button();
	}

	@Test(priority = 28, description = "Click on proceed button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on proceed button Test")
	@Story("Story Name: To check click on proceed button")
	@Step("Click on proceed button")
	public void clickProceedButtonTest() throws Exception {
		pomPages.POM3_Cart_Page proceed = new pomPages.POM3_Cart_Page();
		proceed.clickProceedButton();
	}

	@Test(priority = 29, description = "Click on submit order button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit order button Test")
	@Story("Story Name: To check click on submit order button")
	public void clickSubmitOrderButtonTest() throws Exception {
		pomPages.POM3_Cart_Page submit = new pomPages.POM3_Cart_Page();
		submit.clickSubmitOrderButton();
	}

	@Test(priority = 30, description = "Click on submit button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validating click on submit button Test")
	@Story("Story Name: To check click on submit button")
	public void clickSubmitButtonTest() throws Exception {
		pomPages.POM3_Cart_Page submit = new pomPages.POM3_Cart_Page();
		submit.clickSubmitButton();
	}

}
