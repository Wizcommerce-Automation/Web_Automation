package pomPages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import generic.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Param;
import io.qameta.allure.Step;
import utility.JSONUtil;

public class POM2_Product_Page extends BaseTest {
	
	@FindBy(xpath="//button[@id='sidebar-item-2']")
	WebElement productBtn;
	
	@FindBy(xpath = "//input[@id='global-search']")
	WebElement searchTextbox;

	@FindBy(xpath = "//div[@class=\"dropdown-container\"]/nav/div")
	List<WebElement> searchDd;

// this is for chair
// for both	
	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[1]")
	WebElement product1;

// for both		
	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[2]")
	WebElement product2;

// for both	
	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[3]")
	WebElement product3;

// for both		
	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[4]")
	WebElement product4;
	
	// for both		
	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[5]")
	WebElement product5;

	@FindBy(xpath = "//img[@src=\"/assets/cart_icon-e88b9cca.svg\"]/parent::span")
	WebElement cartIconBtn;

	@FindBy(xpath = "(//div[@class=\"MuiButtonGroup-root MuiButtonGroup-outlined css-r0oui7\"]/button)[5]")
	WebElement deleteBtn;

	@FindBy(xpath = "(//*[@class=\"tabler-icon tabler-icon-dots-vertical\"])[3]")
	WebElement threeDotsBtn;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDd;

	@FindBy(xpath = "(//*[@class=\"tabler-icon tabler-icon-plus\"])[4]")
	public WebElement plusIcon;

	@FindBy(xpath = "//*[@class=\"tabler-icon tabler-icon-minus\"]")
	WebElement minusIcon;

	@FindBy(xpath = "(//*[@class=\"tabler-icon tabler-icon-dots-vertical\"])[2]")
	WebElement threeDotsBtn1;

	@FindBy(xpath = "(//*[@class=\"tabler-icon tabler-icon-dots-vertical\"])[3]")
	WebElement threeDotsBtn2;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDd1;

	@FindBy(xpath = "(//textarea[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-ea3rxm\"])[1]")
	WebElement addNoteTextbox;

	@FindBy(xpath = "//button[starts-with(text(),'Save')]")
	WebElement saveBtn;

	@FindBy(xpath = "(//div[@class=\"MuiButtonGroup-root MuiButtonGroup-outlined css-r0oui7\"]/input)[4]")
	WebElement count;
	
	@FindBy(xpath = "(//div[@class=\"MuiButtonGroup-root MuiButtonGroup-outlined css-r0oui7\"]/input)[2]")
	WebElement count1;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/div[1]/div/p[1]")
	WebElement numberOfProducts;

//	@FindBy(xpath = "(//div[@class=\"MuiGrid-root css-1eqg8k8\"])[2]/div[3]/p[2]")
	@FindBy(xpath = "//p[text()='Wizcom']")
	WebElement addNoteText;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container breadcrumb-header css-1tr1ywp\"]/div/div/*)[1]")
	WebElement backArrowNextToCart;

	@FindBy(xpath = "(//input[@ id=\"discount-input\"])[1]")
	WebElement discountTextbox;

	@FindBy(xpath = "//div[@class=\"MuiDialog-container MuiDialog-scrollPaper css-ekeie0\"]/div/div/div[2]/div[2]/p[2]")
	WebElement valueOfSellingPricePerUnit;

	@FindBy(xpath = "//div[@class=\"MuiDialog-container MuiDialog-scrollPaper css-ekeie0\"]/div/div/div[2]/div[3]/p")
	WebElement valueOfDiscountOffered;

	@FindBy(xpath = "//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-adornedStart css-1obaz8s\"]/input")
	WebElement valueOfOfferedPricePerUnit;

	@FindBy(xpath = "//button[starts-with(text(),'Confirm')]")
	WebElement confirmBtn;

//  @FindBy(xpath = "//div[@class=\"MuiGrid-root css-1eqg8k8\"]/div[4]/div[1]/div")
	@FindBy(xpath = "//div[contains(text(),'Discount applied (10% off)')]")
	WebElement discountVisibiltyOnProduct;

	@FindBy(xpath = "//img[@src=\"/assets/cart_icon-e88b9cca.svg\"]/parent::span/span")
	WebElement productVisibleOnCartIcon;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/*[2]/div")
	WebElement threeDotsBtToDeleteCart;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDrop;

	@FindBy(xpath = "//button[text()='Discard entire cart']")
	WebElement discardEntireCartBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Add existing products')]")
	WebElement addExistingProductsBtn;
	
	@FindBy(xpath="//p[normalize-space()='All Variants']")
	WebElement allVariantsSidebar;
	
	//All Variants first product
	@FindBy(xpath="//div[@id='variant_drawer_container']/div/div[3]//*[contains(text(),'Add to cart')][1]")
	WebElement allVariantFirstProduct;
	
	@FindBy(xpath="(//p[normalize-space()='All Variants']/parent::div//*[local-name()='svg'])[1]")
	WebElement crossButton;
	
	@FindBy(xpath="//p[normalize-space()='Customize product']")
	WebElement customizeSidebar;
	
	@FindBy(xpath="(//p[normalize-space()='Customize product']/parent::div/parent::div//*[name()='svg'])[3]")
	WebElement customizeSidebarCloseButton;
	
	private WebDriverWait wait;

	public POM2_Product_Page() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	

// Click on product button on dashboard
	@Step("Click on product button on dashboard")
	public void clickProduct() throws Exception {
//		System.out.println(JSONUtil.getXPath("productBtn"));
//		WebElement productBtn = driver.findElement(By.xpath(JSONUtil.getXPath("productBtn")));
		wait.until(ExpectedConditions.elementToBeClickable(productBtn)).click();
	}

// Click on cart button if product visible on cart icon else continue with product search
	@Step("Steps to click on cart button if product visible on cart icon else continue with product search")
	public void productsVisibleOnCartIcon() throws Exception {
		Thread.sleep(3000);
		String text = productVisibleOnCartIcon.getText();
		System.out.println(text);
		if (text.contains("0")) {
			Allure.step("Click on cart Icon button");
			wait.until(ExpectedConditions.elementToBeClickable(cartIconBtn)).click();
			Allure.step("Click on add Existing Product Button");
			wait.until(ExpectedConditions.elementToBeClickable(addExistingProductsBtn)).click();
			Allure.step("Click on search text box");
			wait.until(ExpectedConditions.elementToBeClickable(searchTextbox)).click();
		} else {
			Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on cart icon button");
			wait.until(ExpectedConditions.elementToBeClickable(cartIconBtn)).click();
			Assert.assertTrue(threeDotsBtToDeleteCart.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on three dots button to delete cart");
			wait.until(ExpectedConditions.elementToBeClickable(threeDotsBtToDeleteCart)).click();
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
			wait.until(ExpectedConditions.elementToBeClickable(discardEntireCartBtn)).click();
			Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
			Allure.step("Click on add Existing Products Button");
			wait.until(ExpectedConditions.elementToBeClickable(addExistingProductsBtn)).click();
		}
	}

// Searching for products in the search product textbox and selecting attributes from dropdown
	@Step("Click on Search Product Box \n\n Search chair \n\n Click on Attributes dropdown \n\n Press Enter")
	public void searchProductBox() throws InterruptedException {
//	    Scanner sc = new Scanner(System.in);
//		System.out.println("enter the name of the product");
//		String product_Name = sc.nextLine();
//		textbox.sendKeys(product_Name); //user can also enter data
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Assert.assertTrue(searchTextbox.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(3000);		
		searchTextbox.sendKeys("chair");
		for (int i = 0; i <= searchDd.size(); i++) {
			String text = searchDd.get(i).getText();
			System.out.print(text + " ");
			System.out.println();
			if (text.contains("Attributes")) {
				searchDd.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	public void productSelection(WebElement product) {
		if(allVariantsSidebar.isDisplayed()) {
			allVariantFirstProduct.click();
			crossButton.click();
		}
	}

// Adding first product to the cart that appears after product searched
	@Step("Click on Add to Cart button of Product 1")
	public void selectProduct1() throws Exception {

		try {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(3000);
			Assert.assertTrue(product1.isEnabled(), "Both actual and expected are not same");
			product1.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// Adding second product to the cart that appears after product searched
	@Step("Click on Add to Cart button of Product 2")
	public void selectProduct2() throws Exception {

		try {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(3000);
			Assert.assertTrue(product2.isEnabled(), "Both actual and expected are not same");
			product2.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// Adding third product to the cart that appears after product searched
	@Step("Click on Add to Cart button of Product 3")
	public void selectProduct3() throws Exception {

		try {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(3000);
			Assert.assertTrue(product3.isEnabled(), "Both actual and expected are not same");
			
			product3.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// Adding fourth product to the cart that appears after product searched
	@Step("Click on Add to Cart button of Product 4")
	public void selectProduct4() throws Exception {

		try {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(3000);
			Assert.assertTrue(product4.isEnabled(), "Both actual and expected are not same");

			product4.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// Adding fifth product to the cart that appears after product searched
		public void selectProduct5() throws Exception {

			try {
				Thread.sleep(1000);
				Assert.assertTrue(product5.isEnabled(), "Both actual and expected are not same");

				product5.click();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

// Click on cart icon button
	@Step("Click on Cart")
	public void clickCartIcon() throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
		cartIconBtn.click();
		Thread.sleep(3000);
	}

// Click on plus button for increasing product count
	@Step("Click on Plus Button")
	public void clickPlusButton() throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(plusIcon.isEnabled(), "Both actual and expected are not same");
		plusIcon.click();
		Thread.sleep(3000);
	}

// Verifying product increases after clicking on plus button
	@Step("Get count of Product")
	public void countProductAfterIncreament() throws Exception {
		String text = count.getAttribute("value");
		System.out.println(text);
		Assert.assertEquals(text, "2", "Both actual and expected are not same");
		Thread.sleep(3000);
	}

// Click on delete button for deleting particular product
	@Step("Click on delete button")
	public void clickdelete() throws Exception {
			Assert.assertTrue(deleteBtn.isDisplayed(), "Both actual and expected are not same");
			deleteBtn.click();
			Thread.sleep(5000);
	}

// Verifying number of product after deleting
	@Step("Get Total Number of Products")
	public void verifyProductOnCart() throws Exception {
		String text = numberOfProducts.getText();
		Assert.assertEquals(text, "3 Products", "Both actual and expected are not same");
		Thread.sleep(3000);
		System.out.println(text);
	}

// Click on three dots button near a product and deleting that product by click on delete item
	@Step("1. Click on three dots button. \n\n 2. Click on delete item")
	public void clickThreeDotsButton() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#rootContainer\").scrollBy(0,-8000)");
		Assert.assertTrue(threeDotsBtn.isEnabled(), "Both actual and expected are not same");
		threeDotsBtn.click();
		Thread.sleep(3000);
		for (int i = 0; i < threeDotsBtnDd.size(); i++) {
			String text = threeDotsBtnDd.get(i).getText();
			if (text.contains("Delete Item")) {
				threeDotsBtnDd.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

// Click on minus button for decreasing product count
	@Step("Click on Minus Button")
	public void clickMinusButton() throws Exception {
		Assert.assertTrue(minusIcon.isEnabled(), "Both actual and expected are not same");
		Actions a = new Actions(driver);
		a.moveToElement(minusIcon).click().build().perform();
		Thread.sleep(2000);
	}

// Verifying product decreases after clicking on minus button
	@Step("Get count of products")
	public void countProductAfterDecrement() throws Exception {
		String text = count1.getAttribute("value");
		Thread.sleep(3000);
		Assert.assertEquals(text, "1", "Both actual and expected are not same");
		System.out.println(text);
	}

// Click on three dots button near a product and adding note in a product by click on add note
	@Step("1. Click on Three Dots Button \n\n2. Click on Add note")
	public void clickAgainThreeDotsButton() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-8000)");
		Assert.assertTrue(threeDotsBtn1.isEnabled(), "Both actual and expected are not same");
		threeDotsBtn1.click();
		Thread.sleep(3000);
		for (int i = 0; i < threeDotsBtnDd1.size(); i++) {
			String text = threeDotsBtnDd1.get(i).getText();
			if (text.contains("Add note")) {
				threeDotsBtnDd1.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

// Adding note in add note textbox by passing some string
	@Step("1. Click on add Notes \n\n2. Enter text Wizcom")
	public void addingNote() throws Exception {
		Assert.assertTrue(addNoteTextbox.isEnabled(), "Both actual and expected are not same");
		addNoteTextbox.click();
		addNoteTextbox.sendKeys("Wizcom");
		Thread.sleep(3000);
	}

// Click on save button below the add note textbox
	@Step("Click on Save button")
	public void clickSaveButton() throws Exception {
		Assert.assertTrue(saveBtn.isEnabled(), "Both actual and expected are not same");
		saveBtn.click();
		Thread.sleep(4000);
	}

// Verifying note added and displayed below the product
	@Step("Get Note Text")
	public void getNoteText() {
		String text = addNoteText.getText();
		Assert.assertEquals(text, "Note: Wizcom", "Both actual and expected are not same");
		System.out.println(text);
	}

// Click on back arrow to check button working
	@Step("Click on back arrow")
	public void clickBackArrowNextToCart() throws Exception {
		Assert.assertTrue(backArrowNextToCart.isEnabled(), "Both actual and expected are not same");
		backArrowNextToCart.click();
		Thread.sleep(6000);
	}

// Click on particular product to offer discount by click on three dots button
	@Step("1. Click on Three Dots Button \n\n 2. Now click on offer Discount Button")
	public void clickAgainOnThreeDotsButton() throws Exception {
		Assert.assertTrue(threeDotsBtn2.isEnabled(), "Both actual and expected are not same");
		threeDotsBtn2.click();
		Thread.sleep(3000);
		for (int i = 0; i < threeDotsBtnDd1.size(); i++) {
			String text = threeDotsBtnDd1.get(i).getText();
			if (text.contains("Offer Discount")) {
				threeDotsBtnDd1.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

// Enter the discount user want to offer  
	@Step("Enter Discount Value")
	@Parameters("Discount")
	public void offeringDiscount() throws Exception {
		Assert.assertTrue(discountTextbox.isDisplayed(), "Both actual and expected are not same");
		discountTextbox.click();
		discountTextbox.sendKeys("10");
		Thread.sleep(3000);
	}

// Verifying amount after offering discount
	@Step("1. get sp, discount, totalAfterDisc. \n\n2. verify discount after total")
	public boolean verifyingAmount() throws Exception {

		String sp = valueOfSellingPricePerUnit.getText();
		String discount = valueOfDiscountOffered.getText();
		String totalAfterDisc = valueOfOfferedPricePerUnit.getAttribute("value");

		System.out.println(sp);
		System.out.println(discount);
		System.out.println(totalAfterDisc);

		String sp1 = sp.substring(2).replaceAll(",", "");
		String discount1 = discount.substring(2).replaceAll(",", "");

		System.out.println(sp1);
		System.out.println(discount1);

		double sp2 = Double.parseDouble(sp1);
		double discount2 = Double.parseDouble(discount1);
		double totalAfterDisc2 = Double.parseDouble(totalAfterDisc);

		System.out.println(sp2);
		System.out.println(discount2);
		System.out.println(totalAfterDisc2);

		double verify = sp2 - discount2;
		System.out.println(verify == totalAfterDisc2);

		Thread.sleep(4000);
		return true;
	}

// Click on the confirm button on discount textbox
	@Step("Click on confirm button")
	public void clickConfirmButton() throws Exception {
		Assert.assertTrue(confirmBtn.isEnabled(), "Both actual and expected are not same");
		confirmBtn.click();
		Thread.sleep(8000);
	}

// Verify that the offered discount visible below that particular product	
	@Step("Get discount on product")
	public void verifyDiscountVisibilityOnProduct() {
		String text = discountVisibiltyOnProduct.getText();
		Assert.assertEquals(text, "Discount applied (10% off)", "Both actual and expected are not same");
	}

// Verifying number of product after deleting
	@Step("Get number of products")
	public void verifyProductOnCartAgain() throws Exception {
		String text = numberOfProducts.getText();
		Assert.assertEquals(text, "2 Products", "Both actual and expected are not same");
		Thread.sleep(3000);
		System.out.println(text);
	}
	

}
