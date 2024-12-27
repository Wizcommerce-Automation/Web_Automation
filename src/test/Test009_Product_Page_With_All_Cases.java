package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

//@Listeners(Listener.class)
//@Listeners({AllureListener.class})
public class Test009_Product_Page_With_All_Cases extends BaseTest {

	@Epic("Product Page Flow")
	@Feature("Product page")

	@Test(priority = 1, description = "Click on product button")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating product button Test")
	@Story("Story Name: To check product button")
	public void productButtonTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		button.clickProduct();
	}

	@Test(priority = 2, description = "check cart to discard entire cart if products existed prior")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating check cart to discard entire cart if products existed prior Test")
	@Story("Story Name: To check cart to discard entire cart if products existed prior")
	public void productsVisibleOnCartIconTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases pro = new pomPages.POM10_Product_Page_With_All_Cases();
		pro.productsVisibleOnCartIcon();
	}

	@Test(priority = 3, description = "check Bell icon display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Bell icon display")
	@Story("Story Name: To check Bell icon display")
	public void verifyBellIconTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases icon = new pomPages.POM10_Product_Page_With_All_Cases();
		icon.verifyBellIcon();
	}

	@Test(priority = 4, description = "check representative name", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating representative name")
	@Story("Story Name: To check representative name")
	public void verifyRepresentativeTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases rep = new pomPages.POM10_Product_Page_With_All_Cases();
		rep.verifyRepresentative();
	}

	@Test(priority = 5, description = "check cart icon display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating cart icon display")
	@Story("Story Name: To check cart icon display")
	public void verifyCartIconTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases icon = new pomPages.POM10_Product_Page_With_All_Cases();
		icon.verifyCartIcon();
	}

	@Test(priority = 6, description = "check view similar Button and similar product box at right side", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating view similar Button and similar product box at right side")
	@Story("Story Name: To check view similar Button and similar product box at right side")
	@Step("Click on view similar button and similar product box at right side")
	public void verifyViewSimilarBtnTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases icon = new pomPages.POM10_Product_Page_With_All_Cases();
		icon.verifyViewSimilarBtn();
	}

	@Test(priority = 7, description = "check Category view all, back and forward arrow button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Category view all, back and forward arrow button")
	@Story("Story Name: To check Category view all, back and forward arrow button")
	public void verifyCategoryViewAllButtonTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases view = new pomPages.POM10_Product_Page_With_All_Cases();
		view.verifyCategoryViewAllButton();
	}

	@Test(priority = 8, description = "check category rail products display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating category rail products display")
	@Story("Story Name: To check category rail products display")
	public void verifyCategoryRailProductsTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases rail = new pomPages.POM10_Product_Page_With_All_Cases();
		rail.verifyCategoryRailProducts();
	}
	
	@Test(priority = 9, description = "check recomended view all, back and forward arrow button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating recomended view all, back and forward arrow button")
	@Story("Story Name: To check recomended view all, back and forward arrow button")
	public void verifyRecommendedViewAllButtonTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases view = new pomPages.POM10_Product_Page_With_All_Cases();
		view.verifyRecommendedViewAllButton();
	}

	@Test(priority = 10, description = "check recomended rail products display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating recomended rail products display")
	@Story("Story Name: To check recomended rail products display")
	public void verifyRecomendedRailProductsTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases rail = new pomPages.POM10_Product_Page_With_All_Cases();
		rail.verifyRecomendedRailProducts();
	}

	@Test(priority = 11, description = "check Collections view all, back and forward arrow button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Collections view all, back and forward arrow button")
	@Story("Story Name: To check Collections view all, back and forward arrow button")
	public void verifyCollectionsViewAllButtonTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases view = new pomPages.POM10_Product_Page_With_All_Cases();
		view.verifyCollectionsViewAllButton();
	}

	@Test(priority = 12, description = "check Collections rail products display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Collections rail products display")
	@Story("Story Name: To check Collections rail products display")
	public void verifyCollectionsRailProductsTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases rail = new pomPages.POM10_Product_Page_With_All_Cases();
		rail.verifyCollectionsRailProducts();
	}

	@Test(priority = 13, description = "check explore all, all dropdown display and check the filters", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating explore all, all dropdown display and check the filters")
	@Story("Story Name: To check explore all, all dropdown display and check the filters")
	public void verifyExploreAll_AllDropdownsTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases explore = new pomPages.POM10_Product_Page_With_All_Cases();
		explore.verifyExploreAll_AllDropdowns();
	}

	@Test(priority = 14, description = "check filter icon display and check the filters", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating filter icon display and check the filters")
	@Story("Story Name: To check filter icon display and check the filters")
	public void verifyFilterIconTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases icon = new pomPages.POM10_Product_Page_With_All_Cases();
		icon.verifyFilterIcon();
	}

	@Test(priority = 15, description = "check sort by dropdown display and check the filters", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating sort by dropdown display and check the filters")
	@Story("Story Name: To check sort by dropdown display and check the filters")
	public void verifySortByDropdownTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases sort = new pomPages.POM10_Product_Page_With_All_Cases();
		sort.verifySortByDropdown();
	}
	
	@Test(priority = 16, description = "Searching product and select attribute", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating searching product and select attribute")
	@Story("Story Name: To check searching product and select attribute ")
	public void searchProductBoxTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases srch = new pomPages.POM10_Product_Page_With_All_Cases();
		srch.searchProductBox();
	}

	@Test(priority = 17, description = "Verify back arrow button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating back arrow button ")
	@Story("Story Name: To check back arrow button ")
	public void clickBackArrowNextToCartTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases back = new pomPages.POM10_Product_Page_With_All_Cases();
		back.clickBackArrowNextToCart();
	}

	@Test(priority = 18, description = "Verify the suggestion showing in products search textbox", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating the suggestion showing in products search textbox")
	@Story("Story Name: To check the suggestion showing in products search textbox	")
	public void searchProductBoxAgainToCheckSuggestionTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases srch = new pomPages.POM10_Product_Page_With_All_Cases();
		srch.searchProductBoxAgainToCheckSuggestion();
	}

	@Test(priority = 19, description = "Searching products with SKUID, Search all, Name and check products showing accordingly", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating searching products with SKUID, Search all, Name and check products showing accordingly")
	@Story("Story Name: To check searching products with SKUID, Search all, Name and check products showing accordingly ")
	public void serachProductWithDifferentOperationsTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases srch = new pomPages.POM10_Product_Page_With_All_Cases();
		srch.serachProductWithDifferentOperations();
	}

	@Test(priority = 20, description = "Click on product button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating product button Test")
	@Story("Story Name: To check product button")
	public void productButtonAgainTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		button.clickProduct();
	}

	@Test(priority = 21, description = "check product count display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating product count display")
	@Story("Story Name: To check product count display")
	public void verifyProductsCountTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases count = new pomPages.POM10_Product_Page_With_All_Cases();
		count.verifyProductsCount();
	}

	@Test(priority = 22, description = "Catalogue switch", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Catalogue switch ")
	@Story("Story Name: To check Catalogue switch")
	public void catlogueSwitchTestTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases catalogue = new pomPages.POM10_Product_Page_With_All_Cases();
		catalogue.catlogueSwitchTest();
	}
	
	@Test(priority = 23, description = "Catalogue switch", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Catalogue switch ")
	@Story("Story Name: To check Catalogue switch")
	public void catlogueSwitchTestTest1() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases catalogue = new pomPages.POM10_Product_Page_With_All_Cases();
		catalogue.catlogueSwitchTest1();
	}
	
	@Test(priority = 24, description = "Buyer switch for previously ordered rail", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Buyer switch for previously ordered rail")
	@Story("Story Name: To check Buyer switch for previously ordered rail")
	public void buyerSwitchForPreviouslyOrderedRailTYest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases buyer = new pomPages.POM10_Product_Page_With_All_Cases();
		buyer.buyerSwitchForPreviouslyOrderedRail();
	}

	@Test(priority = 25, description = "check actual number of products display", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating actual number of products display")
	@Story("Story Name: To check actual number of products display")
	public void verifyNumberOfProductsDisplayTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases number = new pomPages.POM10_Product_Page_With_All_Cases();
		number.verifyNumberOfProductsDisplay();
	}
	
	@Test(priority = 26, description = "check that for any product after buyer switching if catalog changed then product price change", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating that for any product after buyer switching if catalog changed then product price change")
	@Story("Story Name: To check that for any product after buyer switching if catalog changed then product price change")
	public void checkPriceChangeAfterCustomerSwitchFollowingCatalogueSWitchTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases change = new pomPages.POM10_Product_Page_With_All_Cases();
		change.checkPriceChangeAfterCustomerSwitchFollowingCatalogueSwitch();
	}
	
	@Test(priority = 27, description = "check varient", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating varient")
	@Story("Story Name: To check varient")
	public void checkVarientAvailableTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases var = new pomPages.POM10_Product_Page_With_All_Cases();
		var.checkVarientAvailable();
	}
	
	@Test(priority = 28, description = "Check filters and add product to cart from varient box", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating filters and add product to cart from varient box ")
	@Story("Story Name: To check filters and add product to cart from varient box ")
	public void checkFilterOnVarientBoxTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases var = new pomPages.POM10_Product_Page_With_All_Cases();
		var.checkFilterOnVarientBox();
	}
	
}
