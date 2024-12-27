package test;

import java.util.NoSuchElementException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import pomPages.CreateCustomerPage;
import pomPages.ProductDetailsPage;

public class ProductDetailsPageTest extends BaseTest {
	@Test(priority=1, description = "Verify that title should be the same as wizcommerce")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify login")
	@Step("1. Launch URL. 2. Click on Login button 3. Enter username and password. 4. CLick on submit button and verify user gets logged in successfully.")
	public void loginPageTitleTest() {
		String title = ProductDetailsPage.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "WizCommerce");
	}
	
	@Test(priority=2, description = "user should  be able to click on product_tab")
	@Severity(SeverityLevel.BLOCKER)
	@Description("redirecting to product page")
	@Step("redirecting to product page")
	public void click_product_title() throws Exception {
		pomPages.ProductDetailsPage click_product_page = new pomPages.ProductDetailsPage();
		
		click_product_page.click_product_tab();
	}
	
	
	@Test(priority=3, description = "user should be able to select product")
	@Severity(SeverityLevel.BLOCKER)
	@Description("redirect to PDP page")
	@Step("redirect to PDP page")
	public void select_product() throws Exception {
		pomPages.ProductDetailsPage click_product = new pomPages.ProductDetailsPage();
		click_product.searchProductBox();
		click_product.click_product();
	}
	
	@Test(priority=4, description = "SKU_ID should  be displaying")
	@Severity(SeverityLevel.BLOCKER)
	public void SKU_ID_display() throws Exception{
		pomPages.ProductDetailsPage sku_id_product = new pomPages.ProductDetailsPage();
		sku_id_product.checkDisplayed(sku_id_product.SKU_ID, "SKU_ID");
	}
	
	@Test(priority=5, description = "Check that SKU-ID of product is on top of product image and Verify that SKU-ID is same on product heading and top of it")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verifying SKU_ID are same on PDP")
	public void SKU_ID_equals() throws Exception{
		pomPages.ProductDetailsPage sku_id_equals = new pomPages.ProductDetailsPage();
		
		sku_id_equals.verify_sku_id();
	}
	
	@Test(priority=6, description = "check that user is able to zoom out image on hovering mouse pointer and zoom in when mouse is not pointing to  image")
	@Severity(SeverityLevel.BLOCKER)
	public void zoom_image() {
		pomPages.ProductDetailsPage zoom_image = new pomPages.ProductDetailsPage();
		zoom_image.check_zoom_image();
	}
	
	@Test(priority=7, description = "Buyer switcher should  be displaying")
	@Severity(SeverityLevel.BLOCKER)
	public void buyer_switcher() {
		pomPages.ProductDetailsPage buyer_switcher = new pomPages.ProductDetailsPage();
		
		buyer_switcher.checkDisplayed(buyer_switcher.customer, "Buyer Switcher");
	}
	
	@Test(priority=8, description = "catalog switcher should  be displaying")
	@Severity(SeverityLevel.BLOCKER)
	public void catalog_switcher() {
		pomPages.ProductDetailsPage catalog_switcher = new pomPages.ProductDetailsPage();
		
		catalog_switcher.checkDisplayed(catalog_switcher.catalog,"Catalog Swicher");
	}
	
	@Test(priority=9, description = "catalog switcher should  be displaying")
	@Severity(SeverityLevel.BLOCKER)
	public void cart_icon() {
		pomPages.ProductDetailsPage cart_icon = new pomPages.ProductDetailsPage();
		
		cart_icon.checkDisplayed(cart_icon.cart, "Cart");
	}
	
	@Test(priority=10, description = "Product name should be displayed")
	@Severity(SeverityLevel.BLOCKER)
	public void product_name() {
		pomPages.ProductDetailsPage product_name = new pomPages.ProductDetailsPage();
		
		product_name.checkDisplayed(product_name.productName, "Product_Name");
	}
	
	
	@Test(priority=11, description = "Price and MOQ should be displayed")
	@Severity(SeverityLevel.BLOCKER)
	public void price_and_MOQ() {
		pomPages.ProductDetailsPage price_and_MOQ = new pomPages.ProductDetailsPage();
		
		price_and_MOQ.checkDisplayed(price_and_MOQ.productPrice, "Price");
		price_and_MOQ.checkDisplayed(price_and_MOQ.MOQ.get(0), "MOQ");
	}
	
	
	@Test(priority=12, description = "Tear sheet should be clickable")
	@Severity(SeverityLevel.BLOCKER)
	public void tear_sheet() {
		pomPages.ProductDetailsPage tear_sheet = new pomPages.ProductDetailsPage();
		
		tear_sheet.checkElementClickable();
	}
	
//	@Test(priority=13, description = "Description should be displayed")
//	@Severity(SeverityLevel.BLOCKER)
//	public void description() {
//		try {
//			pomPages.ProductDetailsPage desc = new pomPages.ProductDetailsPage();
//			if(desc.description .isDisplayed()) {
//				desc.checkDisplayed(desc.description, "Description");
//			}
//			else {
//				System.out.println("Discription is not present");
//			}
//		}
//		catch (NoSuchElementException e) {
//			System.out.println("Element is not present");
//		}
//	}
	
	@Test(priority=13, description ="Variant added should be clickable")
	@Severity(SeverityLevel.BLOCKER)
	public void variant_added() {
	pomPages.ProductDetailsPage variant_added = new pomPages.ProductDetailsPage();
		
		variant_added.checkVariantAddedClickable();
	}
	
	
	@Test(priority=14, description ="Available should be displaying")
	@Severity(SeverityLevel.BLOCKER)
	public void available_display(){
	pomPages.ProductDetailsPage available_display = new pomPages.ProductDetailsPage();
		try {
		available_display.checkDisplayed(available_display.available, "Available");
		}
		catch(Exception e) {
			System.out.println("Element Not Present in this page");
		}
	}
	
	@Test(priority=15, description = "Inventory icon should be clickable")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify Inventory icon should be clickable")
	public void inventory_tracker() {
		pomPages.ProductDetailsPage inventory_icon = new pomPages.ProductDetailsPage();
		
		inventory_icon.check_inventory_clickable();
	}
	
	@Test(priority=16, description="user should be able to click on inventory icon and all options are displaying")
	@Severity(SeverityLevel.BLOCKER)
	public void check_options_inventory() throws InterruptedException {
		pomPages.ProductDetailsPage inventory_icon = new pomPages.ProductDetailsPage();
		
		inventory_icon.click_inventory_icon();
		
		inventory_icon.checkDisplayed(inventory_icon.inventoryList.get(0), "inventoryList");
	}
	
//	@Test(priority=17, description="If Available value is 0  then Add to cart button should be disabled")
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Check cart button is disabled or not")
//	public void checkAvailable() throws InterruptedException {
//		pomPages.ProductDetailsPage checkAvailable = new pomPages.ProductDetailsPage();
//		
//		checkAvailable.out_of_stock();
//	}
	
//	@Test(priority=19, description="Verify that add to cart should be greater than or equal to MOQ and less than Available")
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Verify added value in add to cart button")
//	public void  verify_MOQ_and_Available() throws InterruptedException {
//		pomPages.ProductDetailsPage verify_added_value = new pomPages.ProductDetailsPage();
//		
//		verify_added_value.verify_add_to_cart_value();
//	}
//	
//	@Test(priority=20, description="Check that Additional details should be displayed and on click it should be extendable")
//	@Severity(SeverityLevel.BLOCKER)
//	public void extendable() throws InterruptedException {
//		pomPages.ProductDetailsPage click_and_displaying_details = new pomPages.ProductDetailsPage();
//		
//		click_and_displaying_details.click_and_displaying_additional_details();
//		
//	}
//	
//	@Test(priority=21, description="Check that on add to cart Variant should be increase by 1 and display variant sidebar with product")
//	@Severity(SeverityLevel.BLOCKER)
//	public void check_variant_sidebar_product() throws InterruptedException {
//		pomPages.ProductDetailsPage check_variant_sidebar_product = new pomPages.ProductDetailsPage();
//		
//		check_variant_sidebar_product.cart_variant_sidebar_products();
//	}
//	
//	@Test(priority=22, description="Verify that variant sidebar product value should be less than or equals to total number of variants")
//	@Severity(SeverityLevel.CRITICAL)
//	@Description("Verify that variant product value should be less than or equals to total number of variants")
//	@Step("Steps to verify variant product value")
//	public void verify_variant_product() throws InterruptedException {
//		pomPages.ProductDetailsPage verify_variant_product = new pomPages.ProductDetailsPage();
//		verify_variant_product.check_variant_product_value();
//	}
//	
//	@Test(priority=23, description="verify that similar product rail is displayed and able to select")
//	@Step("Steps to verify that similar product rail is displayed and able to select")
//	public void verify_similar_product() throws InterruptedException {
//		pomPages.ProductDetailsPage verify_similar_product = new pomPages.ProductDetailsPage();
//		verify_similar_product.similar_product_display();
//		
//	}
//	
//	@Test(priority=24, description="Check that similar product section is scrollable to left and right")
//	public void similar_product_scrollable() throws InterruptedException {
//		pomPages.ProductDetailsPage similar_product_scrollable = new pomPages.ProductDetailsPage();
//		similar_product_scrollable.similar_product_scrollable();
//	}
//	
//	@Test(priority=25, description = "verify that frequently bought together rail should be displayed and scrollable")
//	@Step("Steps to verify that verify_frequently_bought_together is displayed and scrollable")
//	public void verify_frequently_bought_together() throws InterruptedException {
//		pomPages.ProductDetailsPage verify_frequently_bought_together = new pomPages.ProductDetailsPage();
//		
//		verify_frequently_bought_together.frequently_bought_together_displayed_and_scrollable();
//	}
//	
//	@Test(priority=26, description = "Verify that all the fields are displayed on product details, Unit Dimensions  and case dimensions")
//	public void verify_all_fields() throws InterruptedException {
//		pomPages.ProductDetailsPage verify_all_additional_details_field = new pomPages.ProductDetailsPage();
//		verify_all_additional_details_field.verify_additional_details_field();
//	}
	
	
}
