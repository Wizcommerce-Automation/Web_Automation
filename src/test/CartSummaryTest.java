package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class CartSummaryTest extends BaseTest {
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

	
	@Test(priority = 4, description = "Add Product in cart")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add products in cart")
	@Story("Story Name: to add products")
	@Step("Click 'add to cart' button")
	public void addProductsToCart() throws Exception {
		pomPages.POM2_Product_Page productPage = new pomPages.POM2_Product_Page();
		productPage.selectProduct1();
		productPage.selectProduct2();
		productPage.selectProduct3();
		productPage.selectProduct4();
	}
	
	@Test(priority = 5, description = "Moving towards Cart page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Validating Cart page Test")
	@Story("Story Name: To check Cart page")
	public void selectCart() throws Exception {
		pomPages.POM2_Product_Page cart = new pomPages.POM2_Product_Page();
		cart.clickCartIcon();
	}
	
	@Test(priority = 6, description = "Check path name")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Check Path of cart page")
	@Story("Story Name: check path")
	@Step("Check path of cart page")
	public void checkPath(){
		pomPages.CartSummaryPage path = new pomPages.CartSummaryPage();
		path.checkPath();
	}
	
	@Test(priority = 7, description = "Check path name")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Check Path of cart page")
	@Story("Story Name: check path")
	@Step("Check path of cart page")
	public void VerifyGuestCustomerTest() throws InterruptedException{
		pomPages.CartSummaryPage path = new pomPages.CartSummaryPage();
		path.verifyCustomerBuyer();
	}
	
	@Test(priority = 8, description = "Check path name")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Check Path of cart page")
	@Story("Story Name: check path")
	@Step("Check path of cart page")
	public void VerifyCatalogSwitcherTest() throws InterruptedException{
		pomPages.CartSummaryPage path = new pomPages.CartSummaryPage();
		path.verifyCustomerBuyer();
	}
	
}
