package pomPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;
import io.qameta.allure.Step;

public class POM6_Edit_Quote_02 extends BaseTest {

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1c40uzo\"]/button[1]")
	WebElement editQuoteBtn;

	@FindBy(xpath = "//h6[@class=\"MuiTypography-root MuiTypography-h6 css-11gyw79\"][starts-with(text(),'Edit')]")
	WebElement editBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Add Products')]")
	WebElement addproductsBtn;

	@FindBy(xpath = "//input[@id='global-search']")
	WebElement searchTextbox;

	@FindBy(xpath = "//div[@class=\"dropdown-container\"]/nav/div")
	List<WebElement> searchDd;

// product for sofa for demo id

//	@FindBy(xpath = "//button[@id=\"add_to_cart_ab37fa3d-1cf6-4511-a0c6-0673869ae7b2\"]")
//	WebElement product1;

//	@FindBy(xpath = "//button[@id=\"add_to_cart_6bdddc3e-a8b8-4fdb-b8c0-3862e8851c0c\"]")
//	WebElement product2;

// product for sofa for qaAutomation id

//	@FindBy(xpath = "//button[@id=\"add_to_cart_b42dcf84-4fa1-4fef-aa05-3e81778c3460\"]")
//	WebElement product1;

//	@FindBy(xpath = "//button[@id=\"add_to_cart_e4a0baff-5d3e-42e7-b1ed-4b5e5599650b\"]")
//	WebElement product2;

// product for sofa for both

	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[4]")
	WebElement product1;

	@FindBy(xpath = "(//div[contains(text(),'Add to cart')])[3]")
	WebElement product2;

	@FindBy(xpath = "//span/img[@src=\"/assets/cart_icon-e88b9cca.svg\"]")
	WebElement cartIconBtn;

	@FindBy(xpath = "//button[contains(text(),'Update quote')]")
	WebElement updateQuoteBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Re-submit Quote')]")
	WebElement reSubmitQuoteBtn;

	@FindBy(xpath = "//button[contains(text(),'Submit quote')]")
	WebElement submitQuoteBtn;
	
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement submitButtonPopup;
	
	public POM6_Edit_Quote_02() {
		PageFactory.initElements(driver.get(), this);
	}

// Click on submit quote button
	@Step("Click on submit quote button")
	public void clickSubmitQuote() throws Exception {
		Assert.assertTrue(submitQuoteBtn.isEnabled(), "Both actual and expected are not same");
		submitQuoteBtn.click();
		Thread.sleep(5000);
		submitButtonPopup.click();
	}

// Click on edit quote button
	@Step("Click on edit quote button")
	public void clickEditQuotebutton() throws Exception {
		Thread.sleep(5000);
		Assert.assertTrue(editQuoteBtn.isEnabled(), "Both actual and expected are not same");
		editQuoteBtn.click();
		Thread.sleep(5000);
	}

// Click on edit button
	@Step("Click on edit button")
	public void clickEditButton() throws Exception {
		Assert.assertTrue(editBtn.isEnabled(), "Both actual and expected are not same");
		editBtn.click();
		Thread.sleep(5000);
	}

// Click on add products button appaers after clicking on edit button
	@Step("Click on add products button appears after clicking on edit button")
	public void clickAddProductsButton() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(addproductsBtn.isEnabled(), "Both actual and expected are not same");
		addproductsBtn.click();
		Thread.sleep(5000);
	}

// Searching for products in the search product textbox and selecting attributes from dropdown
	@Step("Searching for products in the search product textbox and selecting attributes from dropdown")
	public void searchProductBox() throws InterruptedException {
//	    Scanner sc = new Scanner(System.in);
//		System.out.println("enter the name of the product");
//		String product_Name = sc.nextLine();
//		textbox.sendKeys(product_Name); //user can also enter data
		Assert.assertTrue(searchTextbox.isDisplayed(), "Both actual and expected are not same");
		searchTextbox.sendKeys("sofa");
		Thread.sleep(8000);
		for (int i = 0; i <= searchDd.size(); i++) {
			String text = searchDd.get(i).getText();
			System.out.print(text + " ");
			System.out.println();
			if (text.contains("Attributes")) {
				searchDd.get(i).click();
				break;
			}
		}
		Thread.sleep(6000);
	}

// Adding first product to the cart that appears after product searched
	@Step("Adding first product to the cart that appears after product searched")
	public void selectProduct1() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(product1.isEnabled(), "Both actual and expected are not same");
		product1.click();
		Thread.sleep(3000);
	}

// Adding second product to the cart that appears after product searched
	@Step("Adding second product to the cart that appears after product searched")
	public void selectProduct2() throws Exception {

		Thread.sleep(3000);
		Assert.assertTrue(product2.isEnabled(), "Both actual and expected are not same");
		product2.click();
		Thread.sleep(3000);
	}

// Click on cart icon button
	@Step("Click on cart icon button")
	public void clickCartIcon() throws Exception {
		Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
		cartIconBtn.click();
		Thread.sleep(3000);
	}

	// Click on update quote button
	@Step("Click on update quote button")
	public void clickUpdateQuoteButton() throws Exception {
		Assert.assertTrue(updateQuoteBtn.isEnabled(), "Both actual and expected are not same");
		updateQuoteBtn.click();
		Thread.sleep(8000);
	}

	// Click on resubmit button
	public void clickReSubmitQuoteButton() throws Exception {
		Assert.assertTrue(reSubmitQuoteBtn.isEnabled(), "Both actual and expected are not same");
		reSubmitQuoteBtn.click();
		Thread.sleep(7000);
	}

}
