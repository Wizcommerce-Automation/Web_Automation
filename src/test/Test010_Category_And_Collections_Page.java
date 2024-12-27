package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Listeners(Listener.class)
//@Listeners({AllureListener.class})
public class Test010_Category_And_Collections_Page extends BaseTest  {
	
	@Epic("Category and Collections Page Flow")
	@Feature("Category and Collections page")

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
	
	@Test(priority = 3, description = "check Category view all, back and forward arrow button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Category view all, back and forward arrow button")
	@Story("Story Name: To check Category view all, back and forward arrow button")
	public void verifyCategoryViewAllButtonTest() throws Exception {
		pomPages.POM10_Product_Page_With_All_Cases view = new pomPages.POM10_Product_Page_With_All_Cases();
		view.verifyCategoryViewAllButton();
	}
	
	@Test(priority = 4, description = "verify category page", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Category products")
	@Story("Story Name: To check Category products")
	public void verifyCategoryPageTest() throws Exception {
		pomPages.POM11_Category_And_Collections_Page cat = new pomPages.POM11_Category_And_Collections_Page();
		cat.verifyCategoryPage();
	}
	
	@Test(priority = 5, description = "verify particular category", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating Category")
	@Story("Story Name: To check Category")
	public void clickOnParticularCategoryTest() throws Exception {
		pomPages.POM11_Category_And_Collections_Page cat = new pomPages.POM11_Category_And_Collections_Page();
		cat.clickOnParticularCategory();
	}
	
	@Test(priority = 6, description = "verify by applying filters", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating by applying filters")
	@Story("Story Name: To check by applying filters")
	public void verifyExploreAll_AllDropdownsTest() throws Exception {
		pomPages.POM11_Category_And_Collections_Page explore = new pomPages.POM11_Category_And_Collections_Page();
		explore.verifyExploreAll_AllDropdowns();
	}
	
	@Test(priority = 7, description = "verify filters", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating by applying filters")
	@Story("Story Name: To check by applying filters")
	public void verifyFilterIconTest() throws Exception {
		pomPages.POM11_Category_And_Collections_Page filter = new pomPages.POM11_Category_And_Collections_Page();
		filter.verifyFilterIcon();
	}
	
	@Test(priority = 8, description = "check sort by dropdown display and check the filters", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating sort by dropdown display and check the filters")
	@Story("Story Name: To check sort by dropdown display and check the filters")
	public void verifySortByDropdownTest() throws Exception {
		pomPages.POM11_Category_And_Collections_Page sort = new pomPages.POM11_Category_And_Collections_Page();
		sort.verifySortByDropdown();
	}
	
	@Test(priority = 9, description = "check view similar Button and similar product box at right side", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating view similar Button and similar product box at right side")
	@Story("Story Name: To check view similar Button and similar product box at right side")
	public void verifyViewSimilarBtnTest() throws Exception {
		pomPages.POM2_Product_Page button = new pomPages.POM2_Product_Page();
		pomPages.POM10_Product_Page_With_All_Cases icon = new pomPages.POM10_Product_Page_With_All_Cases();
		button.clickProduct();
		icon.verifyViewSimilarBtn();
	}
	
	@Test(priority = 10, description = "Check recommended rail whole funtionality by click on view all button", enabled = true)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Validating recommended rail whole funtionality by click on view all button")
	@Story("Story Name: To check recommended rail whole funtionality by click on view all button")
	public void clickViewAllRecommendedRailBtnTest() throws Exception {
		pomPages.POM11_Category_And_Collections_Page icon = new pomPages.POM11_Category_And_Collections_Page();
		icon.clickViewAllRecommendedRailBtn();
	}
}
