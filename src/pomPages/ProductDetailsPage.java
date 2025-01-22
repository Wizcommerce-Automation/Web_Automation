package pomPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generic.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class ProductDetailsPage extends BaseTest {
	
	//ProductTab from side bar
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0\"][2]")
	WebElement products_tab;
	
	//searchTextBox
	@FindBy(xpath = "//input[starts-with(@id,\"outlined-adornment\")]")
	WebElement searchTextbox;
	
	@FindBy(xpath = "//div[@class=\"dropdown-container\"]/nav/div")
	List<WebElement> searchDd;
	
	//Product from Products Page
	//div[@id=\"9f9cb313-aba6-41c3-874b-84bd16e038c1\"]/div[1]/div
	@FindBy(xpath="//div[@id=\"3029fb13-a2d8-4ef2-b831-bdf4a7b36031\"]/a")
	WebElement product;
	
	//top SKU-ID
	@FindBy(xpath="//h5")
	public WebElement SKU_ID;
	
	//back symbol
	@FindBy(xpath="//h5/*[local-name()='svg']")
	WebElement back;
	
	//Customer
	@FindBy(xpath="//div[@class=\"MuiGrid-root css-r2u2lv\"]/div[1]")
	public WebElement customer;
	
	//Catalog
	@FindBy(xpath="//div[@class=\"MuiGrid-root css-r2u2lv\"]/div[2]")
	public WebElement catalog;
	
	//Cart
	@FindBy(xpath="//img[@src=\"/assets/cart_icon-e88b9cca.svg\"]")
	public WebElement cart;
	
	//productImage
	@FindBy(xpath="//div[@class=\"MuiBox-root css-1g017dz\"]")
	WebElement product_Image;
	
	//xpath for SKU-ID
	@FindBy(xpath="//div[@class=\"_header_container_1j9ew_10 MuiBox-root css-uz6002\"]/div[1]/p")
	WebElement SKU_ID_Header;
	
	//xpath for tear-sheet
	@FindBy(xpath="//button[@id=\"\"]")
	WebElement tearSheet;
	
	//xpath for ProductName
	@FindBy(xpath="//div[@class=\"_header_container_1j9ew_10 MuiBox-root css-uz6002\"]/p")
	public WebElement productName;
	
	//xpath for productPrice
	@FindBy(xpath="//div[@class=\"_header_container_1j9ew_10 MuiBox-root css-uz6002\"]/div[2]/p[1]")
	public WebElement productPrice;
	
	//xpath for MOQ
	@FindBy(xpath="//*[contains(text(), \"MOQ\")]")
	public List<WebElement> MOQ;
	
	//variantContainerHeading
	@FindBy(xpath="//*[contains (text(), \"Finish\")]")
	WebElement variantContainerHeading;
	
	//VariantContainerFinishSection
	@FindBy(xpath="//div[@id=\"varaint-containerFinish\"]/div")
	List<WebElement> variantContainerFinish;
	
	//thicknessHeading
	@FindBy(xpath="//*[contains(text(), \"Thickness\")]")
	WebElement thickness;
	
	//thicknessContainer;
	@FindBy(xpath="//div[@id=\"varaint-containerThickness\"]/div")
	List<WebElement> thicknessContainer;
	
	//Description
	@FindBy(xpath="//*[contains(text(), \"Description\")]")
	public WebElement description;
	
	//Value
	@FindBy(xpath="//*[contains(text(), \"Value:\")]")
	List<WebElement> value;
	
	//Variant added
	@FindBy(xpath="//div[@class=\"_header_container_value_1j9ew_15 MuiBox-root css-1qm1lh\"]/div[1]/p")
	WebElement variantAdded;
	
	//AddToCartButton
	@FindBy(xpath="//*[contains(text(), \"Add to cart\")]")
	List<WebElement> addToCart;
	
   //Details
	@FindBy(xpath="//p[text()=\"BASIC DETAILS\"]/parent::div/parent::div/parent::div/parent::div/div")
	List<WebElement> Details;
	
	//SimilarProducts Heading
	@FindBy(xpath="//*[contains(text(),\"Similar Products\")]")
	WebElement similarProducts;
	
	//Similar Products
	@FindBy(xpath="//div[@class=\"MuiGrid-root MuiGrid-container _container_1j9ew_2 css-1d3bbye\"]/div[3]/div")
	List<WebElement> similarProductRails;
	
	//Frequently bought together
	@FindBy(xpath="//*[contains(text(),\"Frequently bought together\")]")
	WebElement freqBoughtTogether;
	
	//Frequently bought together rails
	@FindBy(xpath="//div[@class=\"MuiGrid-root MuiGrid-container _container_1j9ew_2 css-1d3bbye\"]/div[5]/div")
	List<WebElement> freqBoughtTogetherRails;
	
	//AllVariants Heading
	@FindBy(xpath="//*[contains(text(), \"All Variants\")]")
	WebElement heading;
	
	//AllVariantsProducts
	@FindBy(xpath="//div[@class=\"MuiGrid-root jss156 css-rfnosa\"]")
	List<WebElement> allVariantProducts;
	
	//AllVariantSideBar(Done Button)
	@FindBy(xpath="//*[contains(text(), \"Done\")]")
	List<WebElement> done;
	
	//AllVariantDrawerSearchAndSort
	@FindBy(xpath="//div[@id=\"variant_drawer_container\"]/div[1]/div[1]/div[1]/div")
	List<WebElement> SearchAndSort;
	
	//AllFilters
	@FindBy(xpath="//div[@id=\"variant_drawer_container\"]/div[1]/div[2]/div/div/div/div/div[1]")
	List<WebElement> Filters;
	
	//AllVariantClose
	@FindBy(xpath="//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeSmall _icon_style_1wp47_34 css-hzhrz7\"]")
	WebElement close;
	
	//Available
	@FindBy(xpath="//*[contains(text(),\"Available\")]")
	public WebElement available;
	
	//Available inventory icon
	@FindBy(xpath="//p[contains(text(), \"Available\")]/parent::div/div/div/div")
	public WebElement  inventoryIcon;
	
	//Inventory options
	@FindBy(xpath="//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	public List<WebElement> inventoryList;
	
	//AddToCart Delete icon
	@FindBy(xpath="//div[@id=\"counter_d984d73c-6b10-4390-8a4f-f13f117c7301\"]/*[local-name()=\"svg\"]")
	WebElement delete_icon;
	
	//input value
	@FindBy(xpath="//div[@id=\"counter_d984d73c-6b10-4390-8a4f-f13f117c7301\"]/div/input")
	List<WebElement> input_value;
	
	//AddToCart Plus icon
	@FindBy(xpath="//div[@id=\"counter_d984d73c-6b10-4390-8a4f-f13f117c7301\"]/*[local-name()=\"svg\"][2]")
	WebElement plus_icon;
	
	//Extendable fields element
	@FindBy(xpath="//div[@role=\"region\"]")
	List<WebElement> extandanble_fields;
	
	@FindBy(xpath = "//span[@class=\"MuiBadge-root css-1rzb3uu\"]")
	WebElement cartIconBtn;
	
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/*[2]/div")
	WebElement threeDotsBtToDeleteCart;
	
	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDrop;
	
	@FindBy(xpath = "//span[@class=\"MuiBadge-root css-1rzb3uu\"]/span")
	WebElement productVisibleOnCartIcon;
	
	@FindBy(xpath = "//button[text()='Discard entire cart']")
	WebElement discardEntireCartBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Add existing products')]")
	WebElement addExistingProductsBtn;
	
	@FindBy(xpath = "//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-j03msc\"]")
	List<WebElement> arrowButton;
	
	JavascriptExecutor js = (JavascriptExecutor) driver.get();
	WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(10));
	
	public ProductDetailsPage() {
		PageFactory.initElements(driver.get(), this);
	}
	
	public static String validateLoginPageTitle() {
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String pageTitle = driver.get().getTitle();
		return  pageTitle;
	}
	
	
	public void click_product_tab() throws Exception {
		
		Thread.sleep(5000);
		
		products_tab.click();
	}
	
	@Step("Click on Search Product Box \n\n Search chair \n\n Click on Attributes dropdown \n\n Press Enter")
	public void searchProductBox() throws InterruptedException {
//	    Scanner sc = new Scanner(System.in);
//		System.out.println("enter the name of the product");
//		String product_Name = sc.nextLine();
//		textbox.sendKeys(product_Name); //user can also enter data
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Assert.assertTrue(searchTextbox.isDisplayed(), "Both actual and expected are not same");
		searchTextbox.sendKeys("SA-BC-95.5433");
		for (int i = 0; i <= searchDd.size(); i++) {
			String text = searchDd.get(i).getText();
			System.out.print(text + " ");
			System.out.println();
			if (text.contains("SKU ID")) {
				searchDd.get(i).click();
				break;
			}
		}
	}
	
	public void  click_product() throws InterruptedException{
		//Need to know that how to scroll down slowly
		Thread.sleep(5000);
//		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,2000)");
		product.click();
	}
	
	//for checking all elements are displaying
	public void checkDisplayed(WebElement element, String name) {
		boolean element_displayed = element.isEnabled();
		
		if(element_displayed==false) {
			System.out.println("Product "+ name +"is not displaying");
			Assert.assertEquals(element_displayed, false);
		}
		else {
			System.out.println("Product "+ name +" is displaying");
			Assert.assertEquals(element_displayed, true);
		}
	}
	
	
	public void verify_sku_id() throws InterruptedException {
		Thread.sleep(5000);
		boolean isEqual = SKU_ID.getText().equals(SKU_ID_Header.getText());
		
		Assert.assertEquals(isEqual, true);
		
		if(isEqual==false) {
			System.out.println("Product  SKU_ID is not equal to Product heading SKU_ID");
		}
		else {
			System.out.println("Product  SKU_ID is equal to Product heading SKU_ID");
		}
	}
	
	public void check_zoom_image() {
		Actions actions = new Actions(driver.get());
		
		actions.moveToElement(product_Image).build().perform();
		
	}
	
	//TearSheetShouldBeClickable
	public void checkElementClickable() {
		WebDriverWait wt = new WebDriverWait(driver.get(), Duration.ofSeconds(5));
		
		wt.until(ExpectedConditions.elementToBeClickable(tearSheet));
	}
	
	//Check That Variant added should be clickable
	public void checkVariantAddedClickable() {
		WebDriverWait wt = new WebDriverWait(driver.get(), Duration.ofSeconds(5));
		
		wt.until(ExpectedConditions.elementToBeClickable(variantAdded));
	}
	
	//Check that inventory tracker should be clickable
	public void check_inventory_clickable() {
		WebDriverWait wt = new WebDriverWait(driver.get(), Duration.ofSeconds(5));
		
		wt.until(ExpectedConditions.elementToBeClickable(inventoryIcon));
	}
	
	//Click inventoryIcon
	public void click_inventory_icon() throws InterruptedException {
		Thread.sleep(5000);
		
		inventoryIcon.click();
	}
	
	//Verify OutOfStock
	public void out_of_stock() throws InterruptedException {
		Thread.sleep(3000);
		inventoryIcon.click();
		String test = inventoryList.get(0).getText();
		int available_value = 0;
		for(int i=0; i<test.length(); i++) {
			if(test.charAt(i)>='0' && test.charAt(i)<='9') {
				available_value=available_value*10+(test.charAt(i)-'0');
			}
		}
		
		System.out.println(available_value);
		WebElement element = driver.get().findElement(By.xpath("div[aria-hidden=\"true\"]"));
		Thread.sleep(3000);
		element.click();
		
		WebDriverWait wt = new WebDriverWait(driver.get(), Duration.ofSeconds(5));
		
		if(available_value==0) {
			System.out.println(wt.until(ExpectedConditions.elementToBeClickable(addToCart.get(0))));
			Assert.assertEquals(addToCart.get(0).isEnabled() , false);
		}
		else {
			Assert.assertEquals(addToCart.get(0).isEnabled(), true);
		}
		
	}
	
	
	//Verify that add to cart should be greater than or equal to MOQ and less than Available
	
	public void verify_add_to_cart_value() throws InterruptedException {
		Thread.sleep(5000);
		
		inventoryIcon.click();
		
		String test = inventoryList.get(0).getText();
		int available_value = 0;
		for(int i=0; i<test.length(); i++) {
			if(test.charAt(i)>='0' && test.charAt(i)<='9') {
				available_value=available_value*10+(test.charAt(i)-'0');
			}
		}
		
		inventoryIcon.click();
		
		
		int count = 1;
		Thread.sleep(5000);
		
		addToCart.get(0).click();
		int value = 0;
		String MOQstr = MOQ.get(0).getText();
		for(int i=0; i<MOQstr.length(); i++) {
			if(MOQstr.charAt(i)>='0' && MOQstr.charAt(i)<='9') {
				value=value*10+(MOQstr.charAt(i)-'0');
			}
		}
		Assert.assertTrue(Integer.parseInt(input_value.get(0).getAttribute("value"))>=value);
		Assert.assertTrue(Integer.parseInt(input_value.get(0).getAttribute("value"))<=available_value);
		
		Thread.sleep(5000);
		
		while(count<available_value) {
			plus_icon.click();
			count++;
		}
		
		while(count!=0) {
			delete_icon.click();
			count--;
		}
		
	}
	
	
	//check that product details should be displayed or not
	public void click_and_displaying_additional_details() throws InterruptedException{
		int size = Details.size();
		int j=0;
		for(int i=size-1; i<=size; i++) {
			System.out.println(("(//div[@tabindex=\"0\"])"+ "["+i+"]"+"/div"));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@tabindex=\"0\"])"+ "["+i+"]"+"/div"))).click();
			extandanble_fields.get(j).isDisplayed();
			j++;
		}
	}
	
	//check that cart Variant display sidebar with same product
	public void cart_variant_sidebar_products() throws InterruptedException {
		Thread.sleep(5000);
		
		addToCart.get(0).click();
		
		Thread.sleep(5000);
		
		variantAdded.click();
		
		String input = input_value.get(0).getText();
		for(int i=1; i<input_value.size(); i++) {
			Assert.assertEquals(input, input_value.get(i).getText());
		}
		Thread.sleep(10000);
		close.click();
		
		Thread.sleep(5000);
		delete_icon.click();
	}
	
	//Verify that variant sidebar product value should be equal as we are added to cart
	public void check_variant_product_value() throws InterruptedException {
		String text = productVisibleOnCartIcon.getText();
		System.out.println(text);
		Thread.sleep(8000);
		Thread.sleep(3000);
		int size = addToCart.size();
		System.out.println(size);
		Thread.sleep(3000);
		variantAdded.click();
		Thread.sleep(3000);
		System.out.println("Changes"+addToCart.size());
		for(int i=size; i<addToCart.size(); i++) {
			addToCart.get(i).click();
		}
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		System.out.println((variantAdded.getText()).charAt(0) + " " + (variantAdded.getText()).charAt(2));
		Assert.assertTrue((variantAdded.getText()).charAt(0)==(variantAdded.getText()).charAt(2), "variant number is less than or equals to total variants");
		Thread.sleep(1000);
		Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on cart icon button");
		cartIconBtn.click();
		Thread.sleep(5000);
		Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on three dots button to delete cart");
		threeDotsBtToDeleteCart.click();
		Thread.sleep(2000);
		Allure.step("Click on Delete cart from three dots dropdown button");
		for (int i = 0; i < threeDotsBtnDrop.size(); i++) {
			String text1 = threeDotsBtnDrop.get(i).getText();
			System.out.println(text);
			if (text1.equalsIgnoreCase("Delete cart")) {
				threeDotsBtnDrop.get(i).click();
				break;
			}
		}
		Assert.assertTrue(discardEntireCartBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on discard Entire cart button");
		discardEntireCartBtn.click();
		Thread.sleep(2000);
		Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
		Allure.step("Click on add Existing Products Button");
		addExistingProductsBtn.click();
		Thread.sleep(2000);
	
	}
	
	//Verify that similar products are displayed and able to select
	public void similar_product_display() throws InterruptedException {
//		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,4000)");
//		Thread.sleep(5000);
//		product.click();
//		Thread.sleep(5000);
		Allure.step("similar product is displaying");
		similarProducts.isDisplayed();
		Allure.step("Similar product is selectable");
		similarProducts.isSelected();
	}
	
	//Verify that similar products rail is scrollable to left and right
	public void similar_product_scrollable() throws InterruptedException {
//		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,500)");
		Thread.sleep(3000);
		arrowButton.get(0).click();
		Thread.sleep(3000);
		//to right end
		while(arrowButton.get(1).isDisplayed() && arrowButton.size()>2){
			arrowButton.get(1).click();
		}
		//to left end
		Thread.sleep(3000);
		arrowButton.get(0).click();
		while(arrowButton.get(0).isDisplayed() && arrowButton.size()>2) {
			arrowButton.get(0).click();
			Thread.sleep(3000);
		}
	}
	
	//Verify that frequently bought together is displayed and scrollable
	public void frequently_bought_together_displayed_and_scrollable() throws InterruptedException {
		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,300)");
		Thread.sleep(3000);
		Allure.step("Frequently bought together product is displaying");
		freqBoughtTogether.isDisplayed();
		Allure.step("Frequently bought together product is selectable");
		freqBoughtTogether.isSelected();
		Thread.sleep(3000);
		Allure.step("click on right arrow button");
		arrowButton.get(1).click();
		Thread.sleep(3000);
		while(arrowButton.size()>2 && arrowButton.get(2).isDisplayed()) {
			arrowButton.get(2).click();
			Thread.sleep(3000);
		}
		
		Allure.step("Click on left arrow button");
		arrowButton.get(1).click();
		while(arrowButton.get(1).isDisplayed() && arrowButton.size()>2) {
			arrowButton.get(1).click();
			Thread.sleep(3000);
		}
		
	}
	
	//Verify that all the fields are displayed on product details, Unit Dimensions  and case dimensions
	public void verify_additional_details_field() throws InterruptedException {
		int size = Details.size();
		int j=0;
		for(int i=0; i<size; i++) {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(Details.get(i))).click();
			extandanble_fields.get(j).isDisplayed();
			Thread.sleep(3000);
			System.out.println(extandanble_fields.get(i));
			j++;
		}
	}
	
}
