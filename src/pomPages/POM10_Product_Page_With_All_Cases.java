package pomPages;

import static org.testng.Assert.assertEquals;
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

public class POM10_Product_Page_With_All_Cases extends BaseTest {

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0\"])[2]//button")
	WebElement productBtn;

	@FindBy(xpath = "//span/img[@src=\"/assets/cart_icon-e88b9cca.svg\"]/parent::span/span")
	WebElement productVisibleOnCartIcon;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/*[2]/div/div")
	WebElement threeDotsBtToDeleteCart;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDrop;

	@FindBy(xpath = "//button[text()='Discard entire cart']")
	WebElement discardEntireCartBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Add existing products')]")
	WebElement addExistingProductsBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1ihak3c\"]/div/*")
	WebElement bellIcon;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-67txvj\"]")
	WebElement notification;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-67txvj\"]/div[1]/*[2]")
	WebElement crossBtnOnNotification;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/div/p")
	WebElement user;

	@FindBy(xpath = "//span/img[@src=\"/assets/cart_icon-e88b9cca.svg\"]")
	WebElement cartIconBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1b1jvye\"]//button")
	WebElement categoryViewAllBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-9bfjpg\"]/*")
//	@FindBy(xpath = "(//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault jss157 css-13vossk\"]/*)[2]")
	WebElement categoryNextArrow;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-1n87upn\"]/*")
//	@FindBy(xpath = "(//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault jss157 css-13vossk\"]/*)[1]")
	WebElement categoryBackArrow;

	@FindBy(xpath = "//div[@class=\"css-1k3mbjo\"]")
	WebElement categoryRailProducts;

	@FindBy(xpath = "//div[@class=\"css-1k3mbjo\"]/div")
	List<WebElement> categoryRailProductsList;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-116iflt\"]/div")
	List<WebElement> productListNameInCategory;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-h67vp5\"]//button")
	WebElement collectionsViewAllBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-h97huj\"]/*")
	WebElement collectionsNextArrow;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-h97huj\"])[2]/*")
	WebElement collectionsNextArrow_WhenRecOn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-109ndem\"]/*")
	WebElement collectionsBackArrow;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-109ndem\"])[2]/*")
	WebElement collectionsBackArrow_WhenRecOn;

	@FindBy(xpath = "//div[@class=\"css-1pd29rw\"]")
	WebElement collectionsRailProducts;

	@FindBy(xpath = "//div[@class=\"css-1nfx9tm\"]")
	WebElement exploreAllDropdowns;

	@FindBy(xpath = "//div[@class=\"css-1nfx9tm\"]/div[1]")
	WebElement exploreAllCategory;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/ul/div")
	List<WebElement> listOfCategory;

	@FindBy(xpath = "//div[@class=\"css-1nfx9tm\"]/div[2]")
	WebElement exploreAllCollections;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/div/li")
	List<WebElement> listOfCollections;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applyBtn_ForAll;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root _text_overflow_jl43n_218 css-f28z2n\"])[1]")
//	WebElement product1Verification;
	
	@FindBy(xpath = "//div[normalize-space()='SA-BC-60351']")
	WebElement product1Verification;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root _text_overflow_jl43n_218 css-f28z2n\"])[3]")
//	WebElement product2Verification;
	
	@FindBy(xpath = "//div[normalize-space()='WH-BC-95.5441']")
	WebElement product2Verification;
	
	
	@FindBy(xpath="//div[normalize-space()='XB551908-099']")
	WebElement product3Verification;
	
	@FindBy(xpath="//div[normalize-space()='XB551911-099']")
	WebElement product4Verification;

//	@FindBy(xpath = "//div[@class=\"MuiGrid-root _text_overflow_jl43n_218 css-f28z2n\"]")
//	List<WebElement> productIds;
	
	@FindBy(xpath = "(//div[@class='MuiGrid-root css-1dpvjwd'])")
	List<WebElement> productIds;

	@FindBy(xpath = "//*[@id=\"explore_all_container\"]/div[3]/div/div/div[2]/*[1]/div/*[2]")
	WebElement crossOnFurniture;

	@FindBy(xpath = "//span[text()='Clear All']")
	WebElement clearAll;

	@FindBy(xpath = "//div[@class=\"_icon-container_a31gt_1 MuiBox-root css-0\"]")
	WebElement filterBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-nl1052\"]/div")
	List<WebElement> filterOptions;

	@FindBy(xpath = "(//div[@class=\"MuiBox-root css-1ytub8b\"])[1]/div")
	List<WebElement> categoryOptions;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root css-nl1052\"]/div)[5]/div/div[2]/div/div/div/div/div/div")
	@FindBy(xpath = "(//div[@class='MuiGrid-root _sidebar-filter-container_99je1_18 css-xox83q'])[1]/div")
	List<WebElement> inventoryStatusOptions;

	@FindBy(xpath = "(//button[text()='Apply'])[1]")
	WebElement applyBtn_ForFilter;

	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	WebElement clearBtn_ForFilter;

	@FindBy(xpath = "(//button[text()='Update'])[1]")
	WebElement updateBtn_ForFilter;

	@FindBy(xpath = "(//button[text()='Clear All'])[1]")
	WebElement clearAllBtn_ForFilter;

	@FindBy(xpath = "//button[contains(text(),'Show')]")
	WebElement show_ForFilter;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-10s5n5l\"]")
	WebElement sortByDropdown;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> sortByDropdownOptions;

	@FindBy(xpath = "//div[@id='explore_all_container']/div[3]//span")
	WebElement productsCounts_qa;

	@FindBy(xpath = "//div[@id='explore_all_container']/div/span")
	WebElement productsCounts_demo;

	@FindBy(xpath = "//div[@id='products_container']/div")
	List<WebElement> totalProductsOnDisplay;

	@FindBy(xpath = "//input[@id='global-search']")
	WebElement searchTextbox;

	@FindBy(xpath = "//div[@class=\"dropdown-container\"]/nav/div")
	List<WebElement> searchDd;

	@FindBy(xpath = "//p[contains(text(),'No recent searches')]")
	WebElement noRecentSearches;

	@FindBy(xpath = "//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-krpi0\"]")
	WebElement backBtnBehindSearchTextbox;

	@FindBy(xpath = "//nav[@class=\"MuiList-root MuiList-padding css-1hbeie5\"]")
	WebElement suggested;

	@FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div/div")
	List<WebElement> productList;

//	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-6 css-1ebhcds\"]//div[2]/span")
	@FindBy(xpath = "//span[text()=\"Guest Customer\"]/parent::div/parent::div/div[2]")
	WebElement catalogSwitch;

	@FindBy(xpath = "//div[@class=\"MuiFormGroup-root MuiRadioGroup-root css-1h7anqn\"]/label")
	List<WebElement> Catalogs;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applyBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//div[contains(text(),'Changing Pricelist may change product availability and prices')]")
	WebElement alertMsg;

	@FindBy(xpath = "(//div[@id='scroll_div-0'])[1]")
	WebElement product_Name_All_SKU;

	@FindBy(xpath = "//p[contains(text(),'Chair')][1]")
	WebElement product_verification;

	@FindBy(xpath = "(//div[@class='_name_container_h9ooi_34 MuiBox-root css-0'])[1]/p")
	WebElement product_SKU_ver_demo_qa;

	@FindBy(xpath = "(//div[@class=\"MuiAccordionSummary-expandIconWrapper css-1fx8m19\"])[1]")
	WebElement product_Details_Dropdown;

	@FindBy(xpath = "//span[normalize-space()='Side Chair']")
	WebElement product_Atribute;

	@FindBy(xpath = "//div[@class=\"MuiBox-root css-0\"]/h5/*")
	WebElement backArrowBtn;

	@FindBy(xpath = "(//p[text()='View similar'])[10]/parent::div")
	WebElement viewSimilarBtnProduct1;

	@FindBy(xpath = "(//p[text()='View similar'])[2]/parent::div")
	WebElement viewSimilarBtnProduct2;

	@FindBy(xpath = "//p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div")
	WebElement viewSimilarProductsBox;

	@FindBy(xpath = "(//div/p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div//preceding-sibling::div)[3]/div")
	List<WebElement> similarProducts;

	@FindBy(xpath = "//div/p[contains(text(), 'View Similar')]/parent::div/parent::div//*[@type=\"fallback\"]")
	WebElement viewSimilarProductsBoxCrossBtn;

	@FindBy(xpath = "//p[text()='No similar products were found']")
	WebElement noSimilarProducts;

	@FindBy(xpath = "//p[text()='Try exploring more products']")
	WebElement tryExploringProducts;

	@FindBy(xpath = "//button[text()=\"Explore all\"]")
	WebElement exploreAllBtn;

	@FindBy(xpath = "((//div/p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div//preceding-sibling::div)[3]/div//div[contains(text(), \"Add to cart\")]/parent::button/parent::div/preceding-sibling::div/div)[1]")
	WebElement productName;

	@FindBy(xpath = "((//div/p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div//preceding-sibling::div)[3]/div//div[contains(text(), \"Add to cart\")]/parent::button/parent::div/preceding-sibling::div/div)[2]")
	WebElement productId;

	@FindBy(xpath = "((//div/p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div//preceding-sibling::div)[3]/div//div[contains(text(), \"Add to cart\")]/parent::button/parent::div/preceding-sibling::div/div)[3]")
	WebElement productPrice;

	@FindBy(xpath = "(//div/p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div//preceding-sibling::div)[3]/div//div[contains(text(),\"Add to cart\")]/parent::button")
	WebElement addToCart;

	@FindBy(xpath = "(//div/p[contains(text(), 'View Similar')]/parent::div/parent::div/parent::div//preceding-sibling::div)[3]/div//div//input/parent::div/parent::div//*[@type=\"fallback\"][1]")
	WebElement deleteBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-6 css-1ebhcds\"]/div/div[1]")
	WebElement guestCustomerBtn;

	@FindBy(xpath = "//input[@id='buyer_search']")
	WebElement customerSearchTextbox;

	@FindBy(id = "33223ce2-8f38-440d-9cb8-ef7cfd3e310c")
	WebElement customer1_demo;

	@FindBy(id = "22c2c8fe-041e-4968-88b1-af51e7625c39")
	WebElement customer1_qa;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-1aeq99b\"])[1]")
	WebElement previoiuslyOrderedRail;

	@FindBy(xpath = "(//button[text()='View All'])[1]")
	WebElement previoiuslyOrderedViewAllBtn;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-9bfjpg\"]/*)[1]")
	WebElement previouslyOrderNextArrow;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item css-e3gum\"]/*")
	WebElement previouslyOrderBackArrow;

	@FindBy(xpath = "//h5")
	WebElement product1SKUID;

	@FindBy(xpath = "(//p[contains(text(), \"$\")])[1]")
	WebElement product1Price;

	@FindBy(xpath = "//div[@id=\"scroll_div-0\"]/parent::div/div")
	WebElement Product;

	@FindBy(xpath = "//span[text()='Guest Customer']")
	WebElement guestCusBtn;

	@FindBy(xpath = "//input[@id='buyer_search']")
	WebElement cusBox;

	@FindBy(id = "f46a668d-e460-49c8-8512-4c52e075f245")
	WebElement buyer1_demo;

	@FindBy(id = "cb2f40a7-4e5b-4c0a-aeaf-3f1cbc29c7f0")
	WebElement buyer1_qa;

	@FindBy(xpath = "//div[@id=\"scroll-infinite\"]/div[1]/div[2]")
	WebElement guestCus;

	@FindBy(xpath = "//div[@id=\"scroll_div-0\"]/parent::div/div[1]/div/div/div/div/div[1]/div/div/div")
	WebElement varient;

	@FindBy(xpath = "//div[@id=\"scroll_div-0\"]/parent::div//button")
	WebElement product_Demo;

	@FindBy(xpath = "//button[@id=\"add_to_cart_41e044d2-2512-4b25-b395-fbf20d4dd85f\"]")
	WebElement product_Qa;

	@FindBy(xpath = "//div[@id=\"scroll_div-0\"]/parent::div/div[1]/div/div/div/div[3]/div/div")
	WebElement product_Demo_PriceRange;

	@FindBy(xpath = "//div[@id=\"scroll_div-0\"]/parent::div/div[1]/div/div/div/div[3]/div/div")
	WebElement product_Qa_PriceRange;

	@FindBy(xpath = "//p[text()=\"All Variants\"]/parent::div/parent::div")
	WebElement allVarientBox;

	@FindBy(xpath = "(//p[contains(text(),\"Showing \")])[2]")
	WebElement productsNumberInVarientBox;

	@FindBy(xpath = "//p[text()=\"All Variants\"]/parent::div/parent::div/div[2]/div/div[4]/div/div")
	List<WebElement> productListInVarientBox;

	@FindBy(xpath = "//p[text()=\"All Variants\"]/parent::div/parent::div//div[contains(text(), \"$\")]")
	List<WebElement> priceListInVarientBox;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container _range-filter-box_su5vy_1 css-t7hulg\"])[2]")
	WebElement priceDropdownVarientBox;

	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-lywihl\"])[1]")
	WebElement priceMin;

	@FindBy(xpath = "(//p[contains(text(),\"Showing \")])[2]")
	WebElement productCountInVarientBox;

	@FindBy(xpath = "//p[text()=\"Clear filters\"]")
	WebElement clearFilter;

	@FindBy(xpath = "//input[@id='outlined-adornment']")
	WebElement searchVarientTextbox;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4 css-1udb513\"]")
	WebElement sortByDropdownVarientBox;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement apply;

	@FindBy(xpath = "//div[@id=\"variant_drawer_container\"]//button")
	WebElement addToCartInVarientBox;

	@FindBy(xpath = "//button[text()='Done']")
	WebElement doneBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-wjome\"]/p[1]")
	WebElement numberOfProductOnCartPage;

	@FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div//p[2]")
	WebElement productIDOnCartPage_Qa;

	@FindBy(xpath = "//*[contains(text(), \"FA-BC-82449\")]")
	WebElement productIDOnCartPage_Demo;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1juycit\"]//button")
	WebElement recommendedViewAllBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1se3ah5\"]")
	WebElement recommendedRailProducts;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-h97huj\"])[1]/*")
	WebElement recommendedNextArrow_WhenRecOn;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item css-109ndem\"])[1]/*")
	WebElement recommendedBackArrow_WhenRecOn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column css-3en47i\"]")
	List<WebElement> displayedRail;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-xfdkmj\"]/button)[1]")
	WebElement addToCartViewSimilar_WhenRecOn;

	public POM10_Product_Page_With_All_Cases() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);

// Click on cart button if product visible on cart icon else continue with product search
	public void productsVisibleOnCartIcon() throws Exception {
		Thread.sleep(5000);
		String text = productVisibleOnCartIcon.getText();
		Thread.sleep(5000);
		System.out.println(text);
		Allure.step("if product is zero in cart");
		if (text.contains("0")) {
			Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on cart Icon Button");
			cartIconBtn.click();
			Thread.sleep(5000);
			Allure.step("Click on add Existing Product Button");
			addExistingProductsBtn.click();
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on cart Icon Button");
			cartIconBtn.click();
			Thread.sleep(5000);
			Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on three dots");
			threeDotsBtToDeleteCart.click();
			Thread.sleep(2000);
			Allure.step("Click on Delete cart from three dots button dropdown");
			for (int i = 0; i < threeDotsBtnDrop.size(); i++) {
				String text1 = threeDotsBtnDrop.get(i).getText();
				if (text1.equalsIgnoreCase("Delete cart")) {
					threeDotsBtnDrop.get(i).click();
					break;
				}
			}
			Assert.assertTrue(discardEntireCartBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click discard entire cart button");
			discardEntireCartBtn.click();
			Thread.sleep(2000);
			Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on add Existing Product Button");
			addExistingProductsBtn.click();
			Thread.sleep(2000);
		}
	}

//Verify the bell icon
	@Step("Click on bell icon")
	public void verifyBellIcon() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(bellIcon.isEnabled(), "Both actual and expected are not same");
		bellIcon.click();
		assertTrue(notification.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(4000);
		Assert.assertTrue(crossBtnOnNotification.isEnabled(), "Both actual and expected are not same");
		a.moveToElement(crossBtnOnNotification).click().build().perform();
		Thread.sleep(4000);
	}

// Verify the representative name
	@Step("verify the representative name")
	public void verifyRepresentative() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(user.isDisplayed(), "Both actual and expected are not same");
		System.out.println(user.getText());
	}

// Verify the cart icon button
	@Step("Verify the cart icon")
	public void verifyCartIcon() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
	}

//Verify the Category view all, back and forward arrow button	
	@Step("Steps to verify the category view all, back and forward arrow button")
	public void verifyCategoryViewAllButton() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(categoryViewAllBtn.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(4000);
		Assert.assertTrue(categoryNextArrow.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(4000);
		Allure.step("Click on category next arrow", () -> {
			for (int i = 0; i < 2; i++) {
				a.moveToElement(categoryNextArrow).click().build().perform();
				Thread.sleep(1000);
			}
		});
		Assert.assertTrue(categoryBackArrow.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(4000);
		Allure.step("Click on category back arrow", () -> {
			a.moveToElement(categoryBackArrow).click().build().perform();
		});
		Thread.sleep(4000);
	}

// Verify the category rail 	
	public void verifyCategoryRailProducts() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(categoryRailProducts.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(categoryRailProducts.isDisplayed(), "Both actual and expected are not same");
	}

// Verify the Collections view all, back and forward arrow button
	public void verifyCollectionsViewAllButton() throws Exception {
		if (user.getText().equals("Div Cooper"))
			if (displayedRail.size() == 5) {

				Thread.sleep(4000);
				Assert.assertTrue(collectionsViewAllBtn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Assert.assertTrue(collectionsNextArrow_WhenRecOn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Allure.step("Click on collections next arrow button", () -> {
					for (int i = 0; i < 13; i++) {
						a.moveToElement(collectionsNextArrow_WhenRecOn).click().build().perform();
						Thread.sleep(1000);
					}
				});
				Assert.assertTrue(collectionsBackArrow_WhenRecOn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Allure.step("Click on collection back arrow", () -> {
					a.moveToElement(collectionsBackArrow_WhenRecOn).click().build().perform();
				});
				Thread.sleep(4000);
			} else {
				Thread.sleep(4000);
				Assert.assertTrue(collectionsViewAllBtn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Assert.assertTrue(collectionsNextArrow.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				
				Allure.step("Click on collections next arrow", () -> {
					for (int i = 0; i < 14; i++) {
						a.moveToElement(collectionsNextArrow).click().build().perform();
						Thread.sleep(1000);
					}
				});
				Assert.assertTrue(collectionsBackArrow.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Allure.step("Click on colllects back arrow", () -> {
					a.moveToElement(collectionsBackArrow).click().build().perform();
				});
				Thread.sleep(4000);
			}
		else {
			Thread.sleep(4000);
			Assert.assertTrue(collectionsViewAllBtn.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Assert.assertTrue(collectionsNextArrow.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Allure.step("Click on collections next arrow button", () -> {
				for (int i = 0; i < 14; i++) {
					a.moveToElement(collectionsNextArrow).click().build().perform();
					Thread.sleep(1000);
				}
			});
			Assert.assertTrue(collectionsBackArrow.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Allure.step("Click on collections back arrow", () -> {
				a.moveToElement(collectionsBackArrow).click().build().perform();
			});
			Thread.sleep(4000);
		}
	}

// Verify the collections rail
	public void verifyCollectionsRailProducts() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(collectionsRailProducts.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(collectionsRailProducts.isDisplayed(), "Both actual and expected are not same");
	}

// Verify explore all filters	
	public void verifyExploreAll_AllDropdowns() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(exploreAllDropdowns.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(exploreAllDropdowns.isDisplayed(), "Both actual and expected are not same");

		Assert.assertTrue(exploreAllCategory.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on explore all category", () -> {
			exploreAllCategory.click();
		});
		Thread.sleep(6000);
		
		Allure.step("Click on Furniture  from list of category", () -> {
			for (int i = 0; i < listOfCategory.size(); i++) {
				String text = listOfCategory.get(i).getText();
				if (text.contains("Furniture")) {
					listOfCategory.get(i).click();
					Thread.sleep(4000);
					break;
				}
			}
		});
		Assert.assertTrue(applyBtn_ForAll.isEnabled(), "Both actual and expected are not same");
		
		Allure.step("Click on apply button for all", () -> {
			applyBtn_ForAll.click();
		});
		Thread.sleep(14000);

		Assert.assertTrue(exploreAllCollections.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on explore all collections", () -> {
			exploreAllCollections.click();
		});
		Thread.sleep(6000);
		Allure.step("Click on select all from list of collections",  () -> {
			for (int i = 0; i < listOfCollections.size(); i++) {
				String text = listOfCollections.get(i).getText();
				if (text.contains("Select All")) {
					listOfCollections.get(i).click();
					Thread.sleep(4000);
					break;
				}
			}
		});
		Assert.assertTrue(applyBtn_ForAll.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply button for all", () -> {
			applyBtn_ForAll.click();
		});
		Thread.sleep(8000);

		String ID1 = product1Verification.getText();
		String ID2 = product2Verification.getText();
		Allure.step("Click on Furniture from category rail products list", () -> {
			for (int i = 0; i < categoryRailProductsList.size(); i++) {
				String text = categoryRailProductsList.get(i).getText();
				if (text.contains("Furniture")) {
					categoryRailProductsList.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(4000);
		for (int i = 0; i < productIds.size(); i++) {
			String text = productIds.get(i).getText();
			if (text.contains(ID1)) {
				Assert.assertTrue(text.contains(ID1), "Both actual and expected are not same");
			}
			if (text.contains(ID2)) {
				Assert.assertTrue(text.contains(ID2), "Both actual and expected are not same");
			}
		}
		Thread.sleep(4000);
		Allure.step("Click on product button", () -> {
			productBtn.click();
		});

		Thread.sleep(6000);
		if (user.getText().equals("QT")) {
			Thread.sleep(3000);
			Assert.assertTrue(productsCounts_demo.isDisplayed(), "Both actual and expected are not same");
			String count = productsCounts_demo.getText().substring(12, 14);
			System.out.println(count);
			int numbers = Integer.parseInt(count);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,10000)");
			Thread.sleep(2000);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,20000)");
			Thread.sleep(2000);
			int size = totalProductsOnDisplay.size();

			Assert.assertEquals(size-1, numbers, "Both actual and expected are not same");
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
		} else {
			Assert.assertTrue(productsCounts_qa.isDisplayed(), "Both actual and expected are not same");
			Thread.sleep(8000);
			String count = productsCounts_qa.getText().substring(8, 10);
			int numbers = Integer.parseInt(count);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,10000)");
			Thread.sleep(2000);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,20000)");
			Thread.sleep(2000);
			int size = totalProductsOnDisplay.size();
			Assert.assertEquals(size, numbers, "Both actual and expected are not same");
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
		}
//		Assert.assertTrue(crossOnFurniture.isEnabled(), "Both actual and expected are not same");
//		crossOnFurniture.click();
		Thread.sleep(12000);
		Assert.assertTrue(clearAll.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on clear all button", () -> {
			clearAll.click();
		});
		Thread.sleep(15000);
	}

// Verify all the Filters
	@Step("Steps for verify filter icon")
	public void verifyFilterIcon() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(filterBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on filter button", () -> {
			filterBtn.click();
		});
		Thread.sleep(4000);
		
		Allure.step("Click on Category from filter options", () -> {
			for (int i = 0; i < filterOptions.size(); i++) {
				String text = filterOptions.get(i).getText();
				if (text.contains("Category")) {
					filterOptions.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(4000);
		
		Allure.step("Click on mixed  bushes from category options", () -> {
			for (int i = 0; i < categoryOptions.size(); i++) {
				String text = categoryOptions.get(i).getText();
				if (text.contains("Mixed Bushes")) {
					categoryOptions.get(i).click();
					break;
				}
			}
		});
		Assert.assertTrue(applyBtn_ForFilter.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply button for all", () -> {
			applyBtn_ForFilter.click();
		});
		Thread.sleep(8000);
		Assert.assertTrue(clearBtn_ForFilter.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(updateBtn_ForFilter.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(clearAllBtn_ForFilter.isEnabled(), "Both actual and expected are not same");
		
		Allure.step("Click on Inventory status from filter options", () -> {
			for (int i = 0; i < filterOptions.size(); i++) {
				String text = filterOptions.get(i).getText();
				if (text.contains("Inventory Status")) {
					filterOptions.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(4000);
		
		Allure.step("Click on Select All from inventory status options", () -> {
			for (int i = 0; i < inventoryStatusOptions.size(); i++) {
				String text = inventoryStatusOptions.get(i).getText();
				if (text.contains("Select All")) {
					inventoryStatusOptions.get(i).click();
					break;
				}
			}
		});
		Assert.assertTrue(show_ForFilter.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on show for filter",() -> {
			show_ForFilter.click();
		});
		Thread.sleep(8000);

		String ID1 = product3Verification.getText();
		String ID2 = product4Verification.getText();
		Allure.step("click on Mixed Bushes from category rail product list", () -> {
			for (int i = 0; i < categoryRailProductsList.size(); i++) {
				String text = categoryRailProductsList.get(i).getText();
				if (text.contains("Mixed Bushes")) {
					categoryRailProductsList.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(4000);
		
		for (int i = 0; i < productIds.size(); i++) {
			String text = productIds.get(i).getText();
			if (text.contains(ID1)) {
				Assert.assertTrue(text.contains(ID1), "Both actual and expected are not same");
			}
			if (text.contains(ID2)) {
				Assert.assertTrue(text.contains(ID2), "Both actual and expected are not same");
			}
		}
		Thread.sleep(4000);
		Allure.step("Click on product button", () -> {
			productBtn.click();
		});
		Thread.sleep(8000);
		if (user.getText().equals("QT")) {
			Thread.sleep(3000);
			Assert.assertTrue(productsCounts_demo.isDisplayed(), "Both actual and expected are not same");
			String count = productsCounts_demo.getText().substring(12, 14);
			int numbers = Integer.parseInt(count);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,10000)");
			Thread.sleep(2000);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,20000)");
			Thread.sleep(2000);
			int size = totalProductsOnDisplay.size();

			Assert.assertEquals(size, numbers, "Both actual and expected are not same");
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
		} else {
			Assert.assertTrue(productsCounts_qa.isDisplayed(), "Both actual and expected are not same");
			Thread.sleep(8000);
			String count = productsCounts_qa.getText().substring(12, 14);
			int numbers = Integer.parseInt(count);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,10000)");
			Thread.sleep(2000);
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,20000)");
			Thread.sleep(2000);
			int size = totalProductsOnDisplay.size();
			Assert.assertEquals(size, numbers, "Both actual and expected are not same");
			js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
		}
		Assert.assertTrue(clearAll.isEnabled(), "Both actual and expected are not same");
		
		Allure.step("Click on clear all button", () -> {
			clearAll.click();
		});
		Thread.sleep(15000);
	}

// Verify with sort by filter
	@Step("Steps to verify sort by dropsdown")
	public void verifySortByDropdown() throws Exception {
		Thread.sleep(4000);
		Assert.assertTrue(sortByDropdown.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(sortByDropdown.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on sort by drop down button", () -> {
			sortByDropdown.click();
		});
		Thread.sleep(5000);
		
		Allure.step("Click on Price -Low to High from sort by drop down options", () -> {
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("Price - Low to High")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(8000);
		
		Allure.step("Click on sort by drop down button", () -> {
			sortByDropdown.click();
		});
		
		Allure.step("Click on Name Ascending from sort by drop down button", () -> {
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("Name Ascending")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
		});
		
		Thread.sleep(10000);
	}

// Verify product count
	@Step("Verify Products Count")
	public void verifyProductsCount() throws Exception {
		Thread.sleep(4000);
		if (user.getText().equals("QT")) {
			Thread.sleep(3000);
			Assert.assertTrue(productsCounts_demo.isDisplayed(), "Both actual and expected are not same");
		} else {
			Assert.assertTrue(productsCounts_qa.isDisplayed(), "Both actual and expected are not same");
		}

	}

// Verify count equals to the number of products showing
	@Step("Steps to verify count equals to the number of products showing")
	public void verifyNumberOfProductsDisplay() throws InterruptedException {
		Thread.sleep(8000);
		if (user.getText().equals("QT")) {
			Allure.step("Scroll down to end");
			for (int j = 0; j < 30; j++) {
				js.executeScript(
						"document.querySelector('#rootContainer').scrollBy(0, document.querySelector('#rootContainer').scrollHeight)");
				Thread.sleep(1000);
			}
			int size = totalProductsOnDisplay.size();
			String count = productsCounts_demo.getText().substring(12, 14);
			int numbers = Integer.parseInt(count);
			Allure.step("Check size and numbers are equals");
			Assert.assertEquals(size-1, numbers, "Both actual and expected are not same");
		} else {
			Thread.sleep(8000);
			Allure.step("Scroll down to end");
			for (int j = 0; j < 25; j++) {
				js.executeScript(
						"document.querySelector('#rootContainer').scrollBy(0, document.querySelector('#rootContainer').scrollHeight)");
				Thread.sleep(1000);
			}
			int size = totalProductsOnDisplay.size();
			String count = productsCounts_qa.getText().substring(12, 14);
			int numbers = Integer.parseInt(count);
			Allure.step("Check size and numbers are equals");
			Assert.assertEquals(size, numbers, "Both actual and expected are not same");
		}
	}

// Searching for products in the search product textbox and selecting attributes from dropdown
	@Step("Steps for search product textbox and selecting attributes from dropdown")
	public void searchProductBox() throws Exception {
//		    Scanner sc = new Scanner(System.in);
//			System.out.println("enter the name of the product");
//			String product_Name = sc.nextLine();
//			textbox.sendKeys(product_Name); //user can also enter data
		Thread.sleep(1000);
		Assert.assertTrue(searchTextbox.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(searchTextbox.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on search text box", () -> {
			searchTextbox.click();
		});
		Assert.assertEquals(noRecentSearches.getText(), "No recent searches", "Both actual and expected are not same");
		Allure.step("Enter chair", () -> {
			searchTextbox.sendKeys("chair");
		});
		Thread.sleep(6000);
		Allure.step("Select Attributes from search dropdown", () -> {
			for (int i = 0; i <= searchDd.size(); i++) {
				String text = searchDd.get(i).getText();
				System.out.print(text + " ");
				System.out.println();
				if (text.contains("Attributes")) {
					searchDd.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(6000);
		Assert.assertTrue(product_Name_All_SKU.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on product name all sku", () -> {
			product_Name_All_SKU.click();
		});
		Thread.sleep(8000);
		Assert.assertTrue(product_Details_Dropdown.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on product details dropdown", () -> {
			product_Details_Dropdown.click();
		});
		Thread.sleep(8000);
		boolean ver = product_Atribute.getText().contains("Chair");
		Assert.assertTrue(ver, "Both actual and expected are not same");
		Assert.assertTrue(backArrowBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on back arrow button", () -> {
			backArrowBtn.click();
		});
		Thread.sleep(8000);
	}

// Click on back arrow Button	
	@Step("Click on back arrow button")
	public void clickBackArrowNextToCart() throws Exception {
		Thread.sleep(8000);
		Assert.assertTrue(backBtnBehindSearchTextbox.isEnabled(), "Both actual and expected are not same");
		backBtnBehindSearchTextbox.click();
		Thread.sleep(8000);
	}

// Verify the suggestion showing in products search textbox	
	@Step("Click on search text box")
	public void searchProductBoxAgainToCheckSuggestion() throws Exception {
		Assert.assertTrue(searchTextbox.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(searchTextbox.isEnabled(), "Both actual and expected are not same");
		searchTextbox.click();
		Thread.sleep(8000);
		String text = suggested.getText().replaceAll("\\s", "");
		String s = "chair In Attributes";
		String text1 = s.replaceAll("\\s", "");

		Assert.assertEquals(text, text1, "Both actual and expected are not same");
	}

// Verify searching products with different opertaions	
	public void serachProductWithDifferentOperations() throws Exception {
		Thread.sleep(1000);
		Allure.step("Click on search text box", () -> {
			searchTextbox.click();
		});
		Allure.step("Enter chair", ()->{
			searchTextbox.sendKeys("chair");
		});
		Thread.sleep(2000);
		
		Allure.step("Select Name from search dropdown", () -> {
			for (int i = 0; i < searchDd.size(); i++) {
				String text = searchDd.get(i).getText();
				System.out.print(text + " ");
				System.out.println();
				if (text.contains("Name")) {
					searchDd.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(8000);
		Allure.step("Click product name all sku button", () -> {
			product_Name_All_SKU.click();
		});
		Thread.sleep(8000);
		boolean ver = product_verification.getText().contains("Chair");
		Thread.sleep(8000);
		assertTrue(ver, "Both actual and expected are not same");
		Thread.sleep(8000);
		
		Allure.step("Click on product Button", () -> {
			productBtn.click();
		});
		Thread.sleep(8000);
		Allure.step("Click on search text box", () -> {
			searchTextbox.click();
		});
		Allure.step("Enter chair", ()->{
			searchTextbox.sendKeys("chair");
		});
		Thread.sleep(8000);
		
		Allure.step("Click on Search in all from dropdown", () -> {
			for (int i = 0; i < searchDd.size(); i++) {
				String text = searchDd.get(i).getText();
				System.out.print(text + " ");
				System.out.println();
				if (text.contains("Search in all")) {
					searchDd.get(i).click();
					break;
				}
			}
		});
		Thread.sleep(8000);
		
		Allure.step("Click on product name all sku", () -> {
			product_Name_All_SKU.click();
		});
		Thread.sleep(8000);
		assertTrue(ver, "Both actual and expected are not same");
		Thread.sleep(8000);
		
		Allure.step("Click on product button", ()->{
			productBtn.click();
		});
		Thread.sleep(8000);
		if (user.getText().equals("QT")) {
			Allure.step("Click on search text box", () -> {
				searchTextbox.click();
			});
			Allure.step("Enter 11001", () -> {
				searchTextbox.sendKeys("SA-BC-60351");
			});
			Thread.sleep(8000);
			Allure.step("Click on SKU ID from search dropdown button");
			for (int i = 0; i < searchDd.size(); i++) {
				String text = searchDd.get(i).getText();
				System.out.print(text + " ");
				System.out.println();
				if (text.contains("SKU ID")) {
					searchDd.get(i).click();
					break;
				}
			}
			Thread.sleep(8000);
			Allure.step("Click on product name all sku");
			product_Name_All_SKU.click();
			Thread.sleep(8000);
			Allure.step("Get product sku id");
			String text = product_SKU_ver_demo_qa.getText();
			assertEquals(text, "SA-BC-60351", "Both actual and expected are not same");
			Thread.sleep(8000);
		} else {
			Allure.step("Click on SKU ID from search dropdown button");
			searchTextbox.click();
			Allure.step("Enter 104803796");
			searchTextbox.sendKeys("104803796");
			Thread.sleep(8000);
			Allure.step("Click on SKU ID from search dropdown button");
			for (int i = 0; i < searchDd.size(); i++) {
				String text = searchDd.get(i).getText();
				System.out.print(text + " ");
				System.out.println();
				if (text.contains("SKU ID")) {
					searchDd.get(i).click();
					break;
				}
			}
			Thread.sleep(8000);
			Allure.step("Click on Product name sku id");
			product_Name_All_SKU.click();
			Thread.sleep(8000);
			Allure.step("Get product sku-id");
			String text = product_SKU_ver_demo_qa.getText();
			assertEquals(text, "104803796", "Both actual and expected are not same");
			Thread.sleep(8000);
		}
	}

// Catalogue switch	
	public void catlogueSwitchTest() throws Exception {
		Thread.sleep(3000);
		Allure.step("clear search text box");
		searchTextbox.clear();
		Allure.step("Enter SA-BC-60351");
		searchTextbox.sendKeys("SA-BC-60351");
		Allure.step("Press Enter");
		searchTextbox.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		Allure.step("Select product");
		Product.click();
	}
	
// Catalogue switch	
	@Step("Steps for catalog switching")
	public void catlogueSwitchTest1() throws InterruptedException {
		Thread.sleep(6000);
		assertTrue(catalogSwitch.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on catalog switch");
		catalogSwitch.click();
		Allure.step("Click on Dealer from catalog dropdown");
		for (int i = 0; i < Catalogs.size(); i++) {
			String text = Catalogs.get(i).getText();
			if (text.contains("Dealer")) {
				Catalogs.get(i).click();
			}
		}
		Thread.sleep(3000);
		assertEquals(alertMsg.getText(), "Changing Pricelist may change product availability and prices",
				"Both actual and expected are not same");
		Assert.assertTrue(applyBtn.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(cancelBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply button");
		applyBtn.click();
		Thread.sleep(8000);
		String sKUID = product1SKUID.getText();
		String price = product1Price.getText();
		System.out.println(sKUID);
		System.out.println(price);
		assertEquals(catalogSwitch.getText(), "Dealer", "Both actual and expected are not same");
		Allure.step("Click on catalog switch.");
		catalogSwitch.click();
		Allure.step("Click on designer from catalogs dropdown");
		for (int i = 0; i < Catalogs.size(); i++) {
			String text = Catalogs.get(i).getText();
			if (text.contains("Designer")) {
				Catalogs.get(i).click();
			}
		}
		Thread.sleep(3000);
		assertEquals(alertMsg.getText(), "Changing Pricelist may change product availability and prices",
				"Both actual and expected are not same");
		Assert.assertTrue(applyBtn.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(cancelBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply button");
		applyBtn.click();
		Thread.sleep(8000);
		String sKUID1 = product1SKUID.getText();
		String price1 = product1Price.getText();
		System.out.println(sKUID1);
		System.out.println(price1);
		Assert.assertEquals(sKUID, sKUID1, "Both actual and expected are not same");
		boolean notTrue = price.equalsIgnoreCase(price1);
		Assert.assertFalse(notTrue, "Both actual and expected are not same");
		Thread.sleep(3000);
		assertEquals(catalogSwitch.getText(), "Designer", "Both actual and expected are not same");
		Allure.step("Click on catalog switch");
		catalogSwitch.click();
		Allure.step("Click on Wholesale from Catalogs dropdown");
		for (int i = 0; i < Catalogs.size(); i++) {
			String text = Catalogs.get(i).getText();
			if (text.contains("Wholesale")) {
				Catalogs.get(i).click();
			}
		}
		Thread.sleep(3000);
		assertEquals(alertMsg.getText(), "Changing Pricelist may change product availability and prices",
				"Both actual and expected are not same");
		Assert.assertTrue(applyBtn.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(cancelBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on apply button");
		applyBtn.click();
		Thread.sleep(8000);
		String sKUID2 = product1SKUID.getText();
		String price2 = product1Price.getText();
		System.out.println(sKUID2);
		System.out.println(price2);
		Assert.assertEquals(sKUID1, sKUID2, "Both actual and expected are not same");
		boolean notTrue1 = price1.equalsIgnoreCase(price2);
		Assert.assertFalse(notTrue1, "Both actual and expected are not same");
		Thread.sleep(3000);
		assertEquals(catalogSwitch.getText(), "Wholesale", "Both actual and expected are not same");
		Allure.step("Click on product button");
		productBtn.click();
		Thread.sleep(8000);
	}

// Verify view similar button on products
	public void verifyViewSimilarBtn() throws Exception {
		Thread.sleep(8000);
		if (user.getText().equals("QT")) {
			if (displayedRail.size() == 5) {
				Assert.assertTrue(viewSimilarBtnProduct2.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on view Similar Button Product", ()-> {
					viewSimilarBtnProduct2.click();
				});
				Thread.sleep(1500);
				Assert.assertTrue(viewSimilarProductsBox.isDisplayed(), "Both actual and expected are not same");
				Thread.sleep(1500);
				Assert.assertTrue(noSimilarProducts.isDisplayed(), "Both actual and expected are not same");
				Thread.sleep(1500);
				String text = noSimilarProducts.getText();
				Assert.assertEquals(text, "No similar products were found", "Both actual and expected are not same");
				Assert.assertTrue(tryExploringProducts.isDisplayed(), "Both actual and expected are not same");
				String text1 = tryExploringProducts.getText();
				Assert.assertEquals(text1, "Try exploring more products", "Both actual and expected are not same");
				Assert.assertTrue(exploreAllBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on Explore All Button", ()-> {
					exploreAllBtn.click();
				});
				
				Thread.sleep(1500);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
				Assert.assertTrue(viewSimilarBtnProduct1.isEnabled(), "Both actual and expected are not same");
				viewSimilarBtnProduct1.click();
				Thread.sleep(6000);
				Assert.assertTrue(viewSimilarProductsBox.isDisplayed(), "Both actual and expected are not same");
				if (similarProducts.size() > 4) {
					js.executeScript(
							"document.querySelector(\"body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ryhpzo > div > div > div.MuiGrid-root.drawer-body-no-footer.css-16gy2kw\").scrollBy(0,1200)");
					Assert.assertTrue(viewSimilarProductsBoxCrossBtn.isEnabled(),
							"Both actual and expected are not same");
					Thread.sleep(4000);
				}
				a.moveToElement(productName).build().perform();
				Thread.sleep(2000);
				a.moveToElement(productId).build().perform();
				Thread.sleep(2000);
				a.moveToElement(productPrice).build().perform();
				Thread.sleep(2000);
				Assert.assertTrue(addToCart.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on Add to Cart Button", ()-> {
					addToCart.click();
				});
				Thread.sleep(5000);
				Assert.assertTrue(deleteBtn.isEnabled(), "Both actual and expected are not same");
				Assert.assertTrue(viewSimilarProductsBoxCrossBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on view similar products box cross button", ()-> {
					viewSimilarProductsBoxCrossBtn.click();
				});
				String text2 = productVisibleOnCartIcon.getText();
				Assert.assertEquals(text2, "1", "Both actual and expected are not same");
				Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on cart icon button", ()-> {
					cartIconBtn.click();
				});
				Thread.sleep(5000);
				Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on three dots button to delete cart", ()-> {
					threeDotsBtToDeleteCart.click();
				});
				Thread.sleep(2000);
				Allure.step("Click on three dots button drop", () -> {
					for (int i = 0; i < threeDotsBtnDrop.size(); i++) {
						String text11 = threeDotsBtnDrop.get(i).getText();
						if (text11.equalsIgnoreCase("Delete cart")) {
							threeDotsBtnDrop.get(i).click();
							break;
						}
					}
				});
				Assert.assertTrue(discardEntireCartBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on discard Entire Cart Button", () -> {
					discardEntireCartBtn.click();
				});	
				Thread.sleep(2000);
				Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on add Existing Products button", () -> {
					addExistingProductsBtn.click();
				});
				Thread.sleep(6000);
			} else {
				Assert.assertTrue(viewSimilarBtnProduct1.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on view similar button", () -> {
					viewSimilarBtnProduct1.click();
				});
				Thread.sleep(6000);
				Assert.assertTrue(viewSimilarProductsBox.isDisplayed(), "Both actual and expected are not same");
				if (similarProducts.size() > 4) {
					js.executeScript(
							"document.querySelector(\"body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ryhpzo > div > div > div.MuiGrid-root.drawer-body-no-footer.css-15xeppi\").scrollBy(0,1600)");

				}
				Thread.sleep(5000);
//				js.executeScript(
//						"document.querySelector(\"body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ryhpzo > div > div > div.MuiGrid-root.drawer-body-no-footer.css-15xeppi\").scrollBy(0,-1600)");
//				Thread.sleep(2000);
				Assert.assertTrue(addToCartViewSimilar_WhenRecOn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on add to cart view similar button", () -> {
					addToCartViewSimilar_WhenRecOn.click();
				});
				Thread.sleep(5000);
				Assert.assertTrue(viewSimilarProductsBoxCrossBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on view similar products box cross button", () -> {
					viewSimilarProductsBoxCrossBtn.click();
				});
				String text2 = productVisibleOnCartIcon.getText();
				Assert.assertEquals(text2, "1", "Both actual and expected are not same");
				Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on cart Icon Button", () -> {
					cartIconBtn.click();
				});
				Thread.sleep(5000);
				Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on three dots button to delete cart", () -> {
					threeDotsBtToDeleteCart.click();
				});
				Thread.sleep(2000);
				Allure.step("Clickk on Delete Cart from three dots button drop down", () -> {
					for (int i = 0; i < threeDotsBtnDrop.size(); i++) {
						String text11 = threeDotsBtnDrop.get(i).getText();
						if (text11.equalsIgnoreCase("Delete cart")) {
							threeDotsBtnDrop.get(i).click();
							break;
						}
					}
				});
				Assert.assertTrue(discardEntireCartBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on discard Entire Cart Button", () -> {
					discardEntireCartBtn.click();
				});
				Thread.sleep(2000);
				Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
				Allure.step("Click on add Existing Products Button", () -> {
					addExistingProductsBtn.click();
				});
				Thread.sleep(6000);
			}
		} else {
			Assert.assertTrue(viewSimilarBtnProduct2.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on view similar button product", () -> {
				viewSimilarBtnProduct2.click();
			});
			Thread.sleep(1500);
			Assert.assertTrue(viewSimilarProductsBox.isDisplayed(), "Both actual and expected are not same");
			Assert.assertTrue(noSimilarProducts.isDisplayed(), "Both actual and expected are not same");
			String text = noSimilarProducts.getText();
			Thread.sleep(1500);
			Assert.assertEquals(text, "No similar products were found", "Both actual and expected are not same");
			Assert.assertTrue(tryExploringProducts.isDisplayed(), "Both actual and expected are not same");
			String text1 = tryExploringProducts.getText();
			Assert.assertEquals(text1, "Try exploring more products", "Both actual and expected are not same");
			Assert.assertTrue(exploreAllBtn.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(1500);
			Allure.step("Click on explore all button", () -> {
				exploreAllBtn.click();
			});
			Thread.sleep(1500);
		}
	}

// Verify previously ordered rail after buyer switching	
	@Step("Steps to Verify previously ordered rail after buyer switching")
	public void buyerSwitchForPreviouslyOrderedRail() throws Exception {
		Assert.assertTrue(guestCustomerBtn.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on guest customer button");
		guestCustomerBtn.click();
		if (user.getText().equals("QT")) {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Click on guest customer button");
			customerSearchTextbox.click();
			Thread.sleep(1500);
			Allure.step("Enter wizcom");
			customerSearchTextbox.sendKeys("Qa team");
			Thread.sleep(1500);
			Allure.step("Press Enter");
			customerSearchTextbox.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			Allure.step("Click on customer");
			customer1_demo.click();
			Thread.sleep(10000);
			Assert.assertTrue(previoiuslyOrderedRail.isEnabled(), "Both actual and expected are not same");
			Assert.assertTrue(previoiuslyOrderedRail.isDisplayed(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Assert.assertTrue(previoiuslyOrderedViewAllBtn.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Assert.assertTrue(previouslyOrderNextArrow.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			
			Allure.step("Click on previously order next arrow");
			for (int i = 0; i < 9; i++) {
				a.moveToElement(previouslyOrderNextArrow).click().build().perform();
				Thread.sleep(1000);
			}
			Assert.assertTrue(previouslyOrderBackArrow.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Allure.step("Click on previously order back arrow");
			a.moveToElement(previouslyOrderBackArrow).click().build().perform();
			Thread.sleep(4000);
		} else {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Click on customer search text box");
			customerSearchTextbox.click();
			Allure.step("Enter Zenith Technologies");
			customerSearchTextbox.sendKeys("Zenith Technologies");
			Allure.step("Press Enter");
			customerSearchTextbox.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			Allure.step("Click customer");
			customer1_qa.click();
			Thread.sleep(10000);
			Assert.assertTrue(previoiuslyOrderedRail.isEnabled(), "Both actual and expected are not same");
			Assert.assertTrue(previoiuslyOrderedRail.isDisplayed(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Assert.assertTrue(previoiuslyOrderedViewAllBtn.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Assert.assertTrue(previouslyOrderNextArrow.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);

			while(previouslyOrderNextArrow.isDisplayed()==true) {
				Allure.step("Click on previously Order Next Arrow");
				a.moveToElement(previouslyOrderNextArrow).click().build().perform();
				Thread.sleep(1000);
			}
			Assert.assertTrue(previouslyOrderBackArrow.isEnabled(), "Both actual and expected are not same");
			Thread.sleep(4000);
			Allure.step("click on previouslyOrderBackArrow");
			a.moveToElement(previouslyOrderBackArrow).click().build().perform();
			Thread.sleep(4000);
		}

		Assert.assertTrue(guestCustomerBtn.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on guest customer button");
		guestCustomerBtn.click();
		Allure.step("Click on guest customer");
		guestCus.click();
		Thread.sleep(8000);
	}

// Verify change in price after customer switch followed by change in catalogue	
	@Step("Steps to verify change in price after customer switch followed by change in catalogue")
	public void checkPriceChangeAfterCustomerSwitchFollowingCatalogueSwitch() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(searchTextbox.isDisplayed(), "Both actual and expected are not same");
		Allure.step("clear search text box");
		searchTextbox.clear();
		Allure.step("Enter IV-BC-80377");
		searchTextbox.sendKeys("IV-BC-80377");
		Allure.step("Press Enter");
		searchTextbox.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		Allure.step("Click product button");
		Product.click();
		Thread.sleep(6000);
		String sKUID = product1SKUID.getText();
		String price = product1Price.getText();
		System.out.println(sKUID);
		System.out.println(price);

		Assert.assertTrue(guestCusBtn.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on guest customer button");
		guestCusBtn.click();
		if (user.getText().equals("QT")) {
			Assert.assertTrue(cusBox.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Click on customer box");
			cusBox.click();
			Thread.sleep(1500);
			Allure.step("Enter Designer");
			cusBox.sendKeys("Designer");
			Thread.sleep(1500);
			Allure.step("Press Enter");
			cusBox.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			Allure.step("Click on buyer");
			buyer1_demo.click();
			Thread.sleep(10000);
			String sKUID1 = product1SKUID.getText();
			String price1 = product1Price.getText();
			System.out.println(sKUID1);
			System.out.println(price1);
			Assert.assertEquals(sKUID, sKUID1, "Both actual and expected are not same");
			boolean notTrue = price.equalsIgnoreCase(price1);
			Assert.assertFalse(notTrue, "Both actual and expected are not same");
		} else {
			Assert.assertTrue(cusBox.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Click on customer box");
			cusBox.click();
			Thread.sleep(1500);
			Allure.step("Enter wizcom_Automate");
			cusBox.sendKeys("wizom_Automate");
			Thread.sleep(1500);
			Allure.step("Press Enter");
			cusBox.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			Allure.step("Click on buyer");
			buyer1_qa.click();
			Thread.sleep(10000);
			String sKUID1 = product1SKUID.getText();
			String price1 = product1Price.getText();
			System.out.println(sKUID1);
			System.out.println(price1);
			Assert.assertEquals(sKUID, sKUID1, "Both actual and expected are not same");
			boolean notTrue = price.equalsIgnoreCase(price1);
			Assert.assertFalse(notTrue, "Both actual and expected are not same");
		}
		Allure.step("Click on product Button");
		productBtn.click();
		Thread.sleep(8000);
		Assert.assertTrue(guestCustomerBtn.isDisplayed(), "Both actual and expected are not same");
		Allure.step("Click on guest Customer Button");
		guestCustomerBtn.click();
		Allure.step("Click on guest Customer");
		guestCus.click();
		Thread.sleep(8000);
	}

//Verify varients available and compare the maximum and minimum price	
	@Step("Steps to verify varients available and compare the maximum and minimum price")
	public void checkVarientAvailable() throws Exception {
		if (user.getText().equals("QT")) {
			Assert.assertTrue(sortByDropdown.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on sortByDropdownVarientBox");
			sortByDropdown.click();
			Allure.step("Click on Price - High to Low from sort by dropdown options");
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("Price - High to Low")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
			Thread.sleep(8000);
			Allure.step("varient is displaying");
			Assert.assertTrue(varient.isDisplayed(), "Both actual and expected are not same");
			String text = varient.getText().substring(2, 4);
			System.out.println(text);
			
			Thread.sleep(1500);
			String minimumPrice = product_Demo_PriceRange.getText().substring(0, 5);
			System.out.println(minimumPrice);

			String maximunPrice = product_Demo_PriceRange.getText().substring(8, 13);
			System.out.println(maximunPrice);
			
			Allure.step("Click on product demo");
			product_Demo.click();
			Thread.sleep(1500);
			Allure.step("All varient box is displaying");
			Assert.assertTrue(allVarientBox.isDisplayed(), "Both actual and expected are not same");
			String text3 = productsNumberInVarientBox.getText();

			Assert.assertEquals(text, text3.substring(10, 12), "Both actual and expected are not same");

			int size = productListInVarientBox.size();
			System.out.println(size);

			for (int i = 0; i < priceListInVarientBox.size(); i++) {
				String text4 = priceListInVarientBox.get(i).getText();
				System.out.println(text4);
				if (text4.contains(minimumPrice)) {
					Assert.assertEquals(text4.substring(0, 5), minimumPrice, "Both actual and expected are not same");
				}
				if (text4.contains(maximunPrice)) {
					Assert.assertEquals(text4.substring(0, 5), maximunPrice, "Both actual and expected are not same");
				}
			}

		} else {
			Allure.step("varient is displaying");
			Assert.assertTrue(varient.isDisplayed(), "Both actual and expected are not same");
			String text = varient.getText().substring(2, 3);
			System.out.println(text);

			String minimumPrice = product_Qa_PriceRange.getText().substring(0, 5);
			System.out.println(minimumPrice);

			String maximunPrice = product_Qa_PriceRange.getText().substring(7, 12);
			System.out.println(maximunPrice);
			
			Allure.step("Click on product_QA");
			product_Qa.click();
			Thread.sleep(1500);
			Allure.step("all Varient Box is displaying");
			Assert.assertTrue(allVarientBox.isDisplayed(), "Both actual and expected are not same");
			String text3 = productsNumberInVarientBox.getText();

			Assert.assertEquals(text, text3.substring(8, 9), "Both actual and expected are not same");

			int size = productListInVarientBox.size();
			System.out.println(size);

			for (int i = 0; i < priceListInVarientBox.size(); i++) {
				String text4 = priceListInVarientBox.get(i).getText();
				System.out.println(text4);
				if (text4.contains(minimumPrice)) {
					Assert.assertEquals(text4.substring(0, 5), minimumPrice, "Both actual and expected are not same");
				}
				if (text4.contains(maximunPrice)) {
					Assert.assertEquals(text4.substring(0, 5), maximunPrice, "Both actual and expected are not same");
				}
			}
		}
	}

// Verify all the filters in varient box
	@Step("Steps to verify all the filters in varient box")
	public void checkFilterOnVarientBox() throws Exception {
		if (user.getText().equals("DC")) {
			Thread.sleep(1500);
			String count = productsNumberInVarientBox.getText().substring(8, 10);
			System.out.println(count);
			Assert.assertTrue(priceDropdownVarientBox.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on price drop down varient box");
			a.moveToElement(priceDropdownVarientBox).click().build().perform();
			Thread.sleep(1500);
			Allure.step("Price min is displaying");
			Assert.assertTrue(priceMin.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Press Ctrl+a");
			priceMin.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Allure.step("Press Backspace");
			priceMin.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(4000);
			Allure.step("Click priceMin button then Enter 5188");
			a.moveToElement(priceMin).click().sendKeys("5188").build().perform();
			Thread.sleep(4000);
			Assert.assertTrue(apply.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on apply button");
			apply.click();
			Thread.sleep(4000);
			String count1 = productCountInVarientBox.getText().substring(16, 18);
			boolean notTrue = count.equalsIgnoreCase(count1);
			Assert.assertTrue(notTrue, "Both actual and expected are not same");
			Assert.assertTrue(clearFilter.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on clear filter button");
			clearFilter.click();
			Thread.sleep(4000);
			Assert.assertTrue(sortByDropdownVarientBox.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on sortByDropdownVarientBox");
			sortByDropdownVarientBox.click();
			Allure.step("Click on Price - Low to High from sort by dropdown options");
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("Price - Low to High")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
			Thread.sleep(8000);
			Allure.step("Click on sortByDropdownVarientBox");
			sortByDropdownVarientBox.click();
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("SKU ID Descending")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
			
			Allure.step("searchVarientTextbox is displaying");
			Assert.assertTrue(searchVarientTextbox.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Enter FA-BC-82449");
			searchVarientTextbox.sendKeys("FA-BC-82449");
			Thread.sleep(4000);
			Assert.assertTrue(addToCartInVarientBox.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click add to cart in varient box");
			addToCartInVarientBox.click();
			Thread.sleep(4000);
			Assert.assertTrue(doneBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on done button");
			doneBtn.click();
			Thread.sleep(4000);
			Allure.step("Click on cart icon button");
			cartIconBtn.click();
			Thread.sleep(4000);
			Allure.step("number of Product on cart page is displaying");
			Assert.assertTrue(numberOfProductOnCartPage.isDisplayed(), "Both actual and expected are not same");
			String number = numberOfProductOnCartPage.getText().substring(0, 1);
			Assert.assertEquals(number, "1", "Both actual and expected are not same");
			Assert.assertEquals(productIDOnCartPage_Demo.getText().substring(11), "2449",
					"Both actual and expected are not same");
		} else {
			Thread.sleep(1500);
			String count = productCountInVarientBox.getText().substring(8, 10);
			System.out.println(count);
			Assert.assertTrue(priceDropdownVarientBox.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on price drop down varient box");
			a.moveToElement(priceDropdownVarientBox).click().build().perform();
			Thread.sleep(1500);
			Allure.step("priceMin is displaying");
			Assert.assertTrue(priceMin.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Enter ctrl+a");
			priceMin.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Allure.step("Enter back_space");
			priceMin.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(4000);
			Allure.step("Click priceMin then enter 5188");
			a.moveToElement(priceMin).click().sendKeys("5188").build().perform();
			Thread.sleep(4000);
			Assert.assertTrue(apply.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click apply button");
			apply.click();
			Thread.sleep(4000);
			String count1 = productCountInVarientBox.getText().substring(10, 11);
			boolean notTrue = count.equalsIgnoreCase(count1);
			Assert.assertFalse(notTrue, "Both actual and expected are not same");
			Assert.assertTrue(clearFilter.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on clear filter button");
			clearFilter.click();
			Thread.sleep(4000);
			Assert.assertTrue(sortByDropdownVarientBox.isEnabled(), "Both actual and expected are not same");
			Allure.step("click on sortByDropdownVarientBox");
			sortByDropdownVarientBox.click();
			Allure.step("Click on Price - Low to High button from sortByDropdownOptions");
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("Price - Low to High")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
			Thread.sleep(8000);
			Allure.step("Click on sortByDropdownVarientBox");
			sortByDropdownVarientBox.click();
			for (int i = 0; i < sortByDropdownOptions.size(); i++) {
				String text = sortByDropdownOptions.get(i).getText();
				if (text.contains("SKU ID Descending")) {
					sortByDropdownOptions.get(i).click();
					break;
				}
			}
			Allure.step("searchVarientTextbox is displaying");
			Assert.assertTrue(searchVarientTextbox.isDisplayed(), "Both actual and expected are not same");
			Allure.step("Enter FA-BC-82449");
			searchVarientTextbox.sendKeys("FA-BC-82449");
			Thread.sleep(4000);
			Assert.assertTrue(addToCartInVarientBox.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on add to cart in varient box");
			addToCartInVarientBox.click();
			Thread.sleep(4000);
			Assert.assertTrue(doneBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on done button");
			doneBtn.click();
			Thread.sleep(4000);
			Allure.step("click on cart Icon button");
			cartIconBtn.click();
			Thread.sleep(4000);
			Allure.step("numberOfProductOnCartPage is displaying");
			Assert.assertTrue(numberOfProductOnCartPage.isDisplayed(), "Both actual and expected are not same");
			String number = numberOfProductOnCartPage.getText().substring(0, 1);
			Assert.assertEquals(number, "1", "Both actual and expected are not same");
			Assert.assertEquals(productIDOnCartPage_Qa.getText().substring(4), "FA-BC-82449",
					"Both actual and expected are not same");

		}
		Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
		Allure.step("Click on three dots button to delete cart");
		threeDotsBtToDeleteCart.click();
		Thread.sleep(2000);
		Allure.step("Click on delete cart from threeDotsBtnDrop");
		for (int i = 0; i < threeDotsBtnDrop.size(); i++) {
			String text1 = threeDotsBtnDrop.get(i).getText();
			if (text1.equalsIgnoreCase("Delete cart")) {
				threeDotsBtnDrop.get(i).click();
				break;
			}
		}
		Assert.assertTrue(discardEntireCartBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on discard Entire Cart Button");
		discardEntireCartBtn.click();
		Thread.sleep(2000);
		Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on add Existing products Button");
		addExistingProductsBtn.click();
		Thread.sleep(2000);
	}

//Verify the Recommended view all, back and forward arrow button
	@Step("Steps to verify the recommended view all, back and forward arrow button")
	public void verifyRecommendedViewAllButton() throws Exception {
		if (user.getText().equals("Div Cooper")) {
			if (displayedRail.size() == 5) {
				Thread.sleep(4000);
				Assert.assertTrue(recommendedViewAllBtn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Assert.assertTrue(recommendedNextArrow_WhenRecOn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Allure.step("Click on recommended view all button",  () -> {
					for (int i = 0; i < 8; i++) {
						a.moveToElement(recommendedNextArrow_WhenRecOn).click().build().perform();
						Thread.sleep(1000);
					}
				});
				Assert.assertTrue(recommendedBackArrow_WhenRecOn.isEnabled(), "Both actual and expected are not same");
				Thread.sleep(4000);
				Allure.step("Click on recommended back arrow button", () -> {
					a.moveToElement(recommendedBackArrow_WhenRecOn).click().build().perform();
				});
				Thread.sleep(4000);
			} else {
				Allure.step("Click on product button", () -> {
					productBtn.click();
				});
				Thread.sleep(4000);
			}

		} else {
			Allure.step("Click on product button", () -> {
				productBtn.click();
			});
			Thread.sleep(4000);
		}
	}

// Verify the category rail 	
	public void verifyRecomendedRailProducts() throws Exception {
		if (user.getText().equals("Div Cooper")) {
			if (displayedRail.size() == 5) {
				Thread.sleep(4000);
				Assert.assertTrue(recommendedRailProducts.isEnabled(), "Both actual and expected are not same");
				Assert.assertTrue(recommendedRailProducts.isDisplayed(), "Both actual and expected are not same");
			} else {
				Allure.step("Click on product button", () -> {
					productBtn.click();
				});
				Thread.sleep(4000);
			}
		} else {
			Allure.step("Click on product button", () -> {
				productBtn.click();
			});
			Thread.sleep(4000);
		}
	}
}
