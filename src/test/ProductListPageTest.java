package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class ProductListPageTest extends BaseTest  {
	@Epic("Product Page Flow")
	@Feature("Product page")

	@Test(priority = 1, description = "Click on product button")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating product button Test")
	@Story("Story Name: To check product button")
	public void productButtonTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		button.clickProduct();
		pomPages.ProductListingPage butt = new pomPages.ProductListingPage();
		butt.addToCart();
	}
	
}
