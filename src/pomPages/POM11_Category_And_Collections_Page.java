package pomPages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class POM11_Category_And_Collections_Page extends BaseTest {

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1b1jvye\"]//button")
	WebElement categoryViewAllBtn;

	@FindBy(xpath = "(//p[contains(text(), \"Showing\")])[2]")
	WebElement numberOfResultInCategory;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-116iflt\"]/div")
	List<WebElement> categoryCount;

	@FindBy(xpath = "//p[text()='Wall Art']")
	WebElement wallArtCategory;

	@FindBy(xpath = "//p[text()='Acrylic Print']")
	WebElement acrylicPrint;

	@FindBy(xpath = "//div[@id=\"explore_all_container\"]/div[5]/div/div")
	List<WebElement> numberOfProducts;
	
	@FindBy(xpath = "//div[@id=\"explore_all_container\"]/div[6]/div/div")
	List<WebElement> numberOfProductsWithFilter;

	@FindBy(xpath = "//div[@id=\"explore_all_container\"]/div/p")
	WebElement numberOfProductsShowing;
	
	@FindBy(xpath = "//div[@id=\"explore_all_container\"]/div/span")
	WebElement numberOfProductsShowingInPLP;

	@FindBy(xpath = "//p[text()='Canvas Prints']")
	WebElement canvasPrints;

	@FindBy(xpath = "//p[text()='All Products']")
	WebElement allProducts;

	@FindBy(xpath = "//div[@class=\"css-1nfx9tm\"]")
	WebElement exploreAllDropdowns;

	@FindBy(xpath = "//div[@class=\"css-1nfx9tm\"]/div[1]")
	WebElement exploreAllCategory;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/div/li")
	List<WebElement> listOfCategory;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applyBtn_ForAll;

	@FindBy(xpath = "//div[@class=\"css-1nfx9tm\"]/div[2]")
	WebElement price;

	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-lywihl\"])[1]")
	WebElement priceMin;

	@FindBy(xpath = "//span[text()='Clear All']")
	WebElement clearAll;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-1wxaqej\"]/button")
	WebElement priceApply;

	@FindBy(xpath = "//div[@class=\"_icon-container_a31gt_1 MuiBox-root css-0\"]")
	WebElement filterBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-nl1052\"]/div")
	List<WebElement> filterOptions;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root css-nl1052\"]/div)[1]/div/div[2]/div/div/div/div/div/div")
	List<WebElement> filterCollectionsList;

	@FindBy(xpath = "//button[text()='Clear All']")
	WebElement clearAllBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root _buttonAlignmentContainer_q7cya_6 css-16gy2kw\"]/button[2]")
	WebElement showBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-10s5n5l\"]")
	WebElement sortByDropdown;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> sortByDropdownOptions;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/div/p")
	WebElement user;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column css-3en47i\"]")
	List<WebElement> displayedRail;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1juycit\"]//button")
	WebElement recommendedViewAllBtn;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0\"])[2]//button")
	WebElement productBtn;

	@FindBy(xpath = "(//p[contains(text(), \"Showing\")])[2]")
	WebElement recommendedShowingValue;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1.5 css-1vln3gf\"]/div")
	List<WebElement> recommendedProductCount;
	
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1.5 css-1vln3gf\"]/div[3]")
	WebElement product1OnRecommendedRail;
	
	@FindBy(xpath = "//span[@class=\"MuiTypography-root MuiTypography-contained css-1xdge49\"]")
	List<WebElement> outOfStock;
	
	@FindBy(xpath = "//span[@class=\"MuiTypography-root MuiTypography-contained css-1i6dvzq\"]")
	List<WebElement> backOrder;
	
	@FindBy(xpath = "(//button/div[text()='Add to cart'])[4]")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "(//span[@class=\"MuiBadge-root css-1rzb3uu\"]/span)[2]")
	WebElement productVisibleOnCartIcon;
	
	@FindBy(xpath="(//span[@class=\"MuiBadge-root css-1rzb3uu\"])[2]")
	WebElement cartIconBtn;
	
	@FindBy(xpath="//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/*[2]/div")
	WebElement threeDotsBtToDeleteCart;
	
	@FindBy(xpath="//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDrop;
	
	@FindBy(xpath="//button[text()='Discard entire cart']")
	WebElement discardEntireCartBtn;
	
	@FindBy(xpath="//button[starts-with(text(),'Add existing products')]")
	WebElement addExistingProductsBtn;
	
	public POM11_Category_And_Collections_Page() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);

//Verify category view all button and verify  product count 
	@Step("Steps to verify category view all button and verify  product count")
	public void verifyCategoryPage() throws Exception {
		Assert.assertTrue(categoryViewAllBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on category View All button");
		categoryViewAllBtn.click();
		Thread.sleep(8000);
		Allure.step("number of result in category is displaying");
		Assert.assertTrue(numberOfResultInCategory.isDisplayed(), "Both actual and expected are not same");
		String text = numberOfResultInCategory.getText().substring(8, 10);
		int size = categoryCount.size();
		int numbers = Integer.parseInt(text);
		Assert.assertEquals(size, numbers, "Both actual and expected are not same");
		Thread.sleep(5000);
	}

//verify by selecting particular categpry
	@Step("Steps to verify by selecting particular category")
	public void clickOnParticularCategory() throws Exception {
		Allure.step("Click on Wall Art from category count");
		for (int i = 0; i < categoryCount.size(); i++) {
			String text = categoryCount.get(i).getText();
			if (text.contains("Wall Art")) {
				categoryCount.get(i).click();
				break;
			}
		}
		Thread.sleep(9000);
		assertTrue(wallArtCategory.isDisplayed(), "Both actual and expected are not same");

		assertTrue(acrylicPrint.isEnabled(), "Both actual and expected are not same");
		acrylicPrint.click();
		Thread.sleep(5000);
		String text = numberOfProductsShowing.getText().substring(17, 18);
		int numbers = Integer.parseInt(text);
		int size = numberOfProducts.size();
		Assert.assertEquals(size, numbers, "Both actual and expected are not same");
		Thread.sleep(5000);

		assertTrue(canvasPrints.isEnabled(), "Both actual and expected are not same");
		canvasPrints.click();
		Thread.sleep(5000);
		String text1 = numberOfProductsShowing.getText().substring(18, 20);
		int numbers1 = Integer.parseInt(text1);
		int size1 = numberOfProducts.size();
		Assert.assertEquals(size1, numbers1, "Both actual and expected are not same");
		Thread.sleep(5000);

		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,1200)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-1200)");
		Thread.sleep(3000);

		assertTrue(allProducts.isEnabled(), "Both actual and expected are not same");
		allProducts.click();
		Thread.sleep(6000);
		String text2 = numberOfProductsShowing.getText().substring(18, 20);
		int numbers2 = Integer.parseInt(text2);
		for (int j = 0; j < 10; j++) {
			js.executeScript(
					"document.querySelector('#rootContainer').scrollBy(0, document.querySelector('#rootContainer').scrollHeight)");
			Thread.sleep(1000);
		}
		int size2 = numberOfProducts.size();
		Assert.assertEquals(size2, numbers2, "Both actual and expected are not same");
		Thread.sleep(3000);
	}

// Verify all the filters in explore all
	@Step("Steps to verify all filters in explore all")
	public void verifyExploreAll_AllDropdowns() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(exploreAllDropdowns.isEnabled(), "Both actual and expected are not same");
		Allure.step("explore all dropdowns is displaying");
		Assert.assertTrue(exploreAllDropdowns.isDisplayed(), "Both actual and expected are not same");
		Allure.step("explore all category is displaying");
		Assert.assertTrue(exploreAllCategory.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on explore all category");
		exploreAllCategory.click();
		Thread.sleep(6000);
		Allure.step("Click on select all from listOfCategory");
		for (int i = 0; i < listOfCategory.size(); i++) {
			String text = listOfCategory.get(i).getText();
			if (text.contains("Select All")) {
				listOfCategory.get(i).click();
				Thread.sleep(4000);
				break;
			}
		}
		Assert.assertTrue(applyBtn_ForAll.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply for all button");
		applyBtn_ForAll.click();
		Thread.sleep(10000);

		Allure.step("price is dislaying");
		Assert.assertTrue(price.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on price button");
		price.click();
		Thread.sleep(3000);
		Allure.step("priceMin is displaying");
		Assert.assertTrue(priceMin.isDisplayed(), "Both actual and expected are not same");
		Allure.step("press ctrl+a");
		priceMin.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Allure.step("press backspace");
		priceMin.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(4000);
		Allure.step("Click on priceMin");
		Allure.step("Enter 100");
		a.moveToElement(priceMin).click().sendKeys("100").build().perform();
		Thread.sleep(4000);
		Assert.assertTrue(priceApply.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on price apply button");
		priceApply.click();
		Thread.sleep(10000);

		String text = numberOfProductsShowing.getText().substring(12, 14);
		int numbers = Integer.parseInt(text);
		for (int j = 0; j < 8; j++) {
			js.executeScript(
					"document.querySelector('#rootContainer').scrollBy(0, document.querySelector('#rootContainer').scrollHeight)");
			Thread.sleep(1000);
		}
		int size = numberOfProductsWithFilter.size();
		Assert.assertEquals(size-1, numbers, "Both actual and expected are not same");
		Thread.sleep(3000);

		Assert.assertTrue(clearAll.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on clearAll button");
		clearAll.click();
		Thread.sleep(15000);
	}

//verify filter icon
	@Step("Steps to verify filter icon")
	public void verifyFilterIcon() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(filterBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on filter button");
		filterBtn.click();
		Thread.sleep(4000);
		Allure.step("Click on Collections from filter options");
		for (int i = 0; i < filterOptions.size(); i++) {
			String text = filterOptions.get(i).getText();
			if (text.contains("Collections")) {
				filterOptions.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		Allure.step("Click on select all from filter collections list");
		for (int i = 0; i < filterCollectionsList.size(); i++) {
			String text = filterCollectionsList.get(i).getText();
			if (text.contains("Select All")) {
				filterCollectionsList.get(i).click();
				break;
			}
		}
		Allure.step("Click on price from filter collections list");
		for (int i = 0; i < filterOptions.size(); i++) {
			String text = filterOptions.get(i).getText();
			if (text.contains("Price")) {
				filterOptions.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		Allure.step("priceMin is displaying");
		Assert.assertTrue(priceMin.isDisplayed(), "Both actual and expected are not same");
		Allure.step("press ctrl+a");
		priceMin.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Allure.step("press backspace");
		priceMin.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(4000);
		Allure.step("Click on priceMin");
		Allure.step("Enter 100");
		a.moveToElement(priceMin).click().sendKeys("100").build().perform();
		Thread.sleep(4000);
		Assert.assertTrue(priceApply.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply button");
		priceApply.click();
		Thread.sleep(9000);
		Assert.assertTrue(clearAllBtn.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(showBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on show button");
		showBtn.click();
		Thread.sleep(9000);

		String text = numberOfProductsShowing.getText().substring(12, 14);
		int numbers = Integer.parseInt(text);
		for (int j = 0; j < 6; j++) {
			js.executeScript(
					"document.querySelector('#rootContainer').scrollBy(0, document.querySelector('#rootContainer').scrollHeight)");
			Thread.sleep(1000);
		}

		int size = numberOfProductsWithFilter.size();
		Assert.assertEquals(size-1, numbers, "Both actual and expected are not same");
		Thread.sleep(3000);

		Assert.assertTrue(clearAll.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on clear all button");
		clearAll.click();
		Thread.sleep(15000);
	}

//verify sort by dropdown
	@Step("Steps to verify sort by dropdown button")
	public void verifySortByDropdown() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(sortByDropdown.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(sortByDropdown.isDisplayed(), "Both actual and expected are not same");
		sortByDropdown.click();
		for (int i = 0; i < sortByDropdownOptions.size(); i++) {
			String text = sortByDropdownOptions.get(i).getText();
			if (text.contains("Price - Low to High")) {
				sortByDropdownOptions.get(i).click();
				break;
			}
		}
		Thread.sleep(8000);
		sortByDropdown.click();
		for (int i = 0; i < sortByDropdownOptions.size(); i++) {
			String text = sortByDropdownOptions.get(i).getText();
			if (text.contains("Name Ascending")) {
				sortByDropdownOptions.get(i).click();
				break;
			}
		}
		Thread.sleep(10000);
		sortByDropdown.click();
		for (int i = 0; i < sortByDropdownOptions.size(); i++) {
			String text = sortByDropdownOptions.get(i).getText();
			if (text.contains("Price - High to Low")) {
				sortByDropdownOptions.get(i).click();
				break;
			}
		}
		Thread.sleep(8000);
	}

//verify recommended rail and by click on view all button verify all the functionality	
	@Step("Steps to verify recommended rail")
	public void clickViewAllRecommendedRailBtn() throws Exception {
		if (user.getText().equals("DC")) {
			if (displayedRail.size() == 5) {
				js.executeScript("document.querySelector('#rootContainer').scrollBy(0,-5000)");
				Thread.sleep(4000);
				Assert.assertTrue(recommendedViewAllBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on recommended View All button");
				recommendedViewAllBtn.click();
				Thread.sleep(6000);
				Allure.step("recommendedShowingValue is displaying");
				Assert.assertTrue(recommendedShowingValue.isDisplayed(), "Both actual and expected are not same");
				String text = recommendedShowingValue.getText().substring(8, 10);
				int size = recommendedProductCount.size();
				int numbers = Integer.parseInt(text);
				Assert.assertEquals(size, numbers, "Both actual and expected are not same");
				Thread.sleep(5000);
				js.executeScript(
						"document.querySelector('#rootContainer').scrollBy(0, document.querySelector('#rootContainer').scrollHeight)");
				Thread.sleep(4000);
				js.executeScript("document.querySelector('#rootContainer').scrollBy(0,-5000)");
				Thread.sleep(4000);
				Assert.assertTrue(product1OnRecommendedRail.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on product on recommended rail");
				product1OnRecommendedRail.click();
				
				pomPages.POM10_Product_Page_With_All_Cases x= new pomPages.POM10_Product_Page_With_All_Cases();
				x.catlogueSwitchTest1();
				Allure.step("Click on recommended View All button");
				js.executeScript("document.querySelector('#rootContainer').scrollBy(0,-5000)");
				Thread.sleep(4000);
				recommendedViewAllBtn.click();
				Thread.sleep(1000);
				Assert.assertTrue(addToCartBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on add to cart button");
				Thread.sleep(1000);
				addToCartBtn.click();
				Thread.sleep(3000);
				String text1 = productVisibleOnCartIcon.getText();
				Assert.assertEquals(text1, "1", "Both actual and expected are not same");
				Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on cart Icon button");
				cartIconBtn.click();
				Thread.sleep(5000);
				Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on three dots button");
				threeDotsBtToDeleteCart.click();
				Thread.sleep(2000);
				Allure.step("Click on Delete cart from three dots button dropdown");
				for (int i = 0; i < threeDotsBtnDrop.size(); i++) {
					String text11 = threeDotsBtnDrop.get(i).getText();
					if (text11.equalsIgnoreCase("Delete cart")) {
						threeDotsBtnDrop.get(i).click();
						break;
					}
				}
				Assert.assertTrue(discardEntireCartBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on discard Entire Cart Button");
				discardEntireCartBtn.click();
				Thread.sleep(2000);
				Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on add Existing Products Button");
				addExistingProductsBtn.click();
				Thread.sleep(6000);

			} else {
				Allure.step("Click on product button");
				productBtn.click();
				Thread.sleep(4000);
			}
		} else {
			Allure.step("Click on product button");
			productBtn.click();
			Thread.sleep(4000);
		}
	}
	

}
