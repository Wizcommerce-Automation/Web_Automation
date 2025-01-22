package pomPages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;
import io.qameta.allure.Step;

public class POM8_Buyer_Switching extends BaseTest {

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-6 css-1ebhcds\"]/div/div[1]")
	WebElement guestCustomerBtn;

	@FindBy(xpath = "//input[@id='buyer_search']")
	WebElement customerSearchTextbox;

	@FindBy(xpath = "(//div[@id=\"db2fa53d-1512-4afe-8919-a847b4b005ef\"]/div)[2]")
	WebElement cartIconOnCustomer;
// for demo
	@FindBy(id = "db2fa53d-1512-4afe-8919-a847b4b005ef")
	WebElement customer1_demo;

	@FindBy(id = "14a9b68d-4d17-49a5-9dea-15c3c0c6013c")
	WebElement customer2_demo;

	@FindBy(id = "914a9b68d-4d17-49a5-9dea-15c3c0c6013c")
	WebElement customer3_demo;

// for qa 
	@FindBy(id = "33223ce2-8f38-440d-9cb8-ef7cfd3e310c")
	WebElement customer1_qa;

	@FindBy(id = "81622dbe-5d0e-4902-97ff-a44437baaabe")
	WebElement customer2_qa;

	@FindBy(id = "3627e310-eb74-4302-86aa-b7e234df88f9")
	WebElement customer3_qa;

// keepExisting and ReplaceCheckbox;
	@FindBy(xpath = "//button[starts-with(text(),'Replace')]")
	WebElement replaceBtn;

	@FindBy(xpath = "//button[starts-with(text(),\"Keep existing\")]")
	WebElement keepExistingBtn;

// New Cart and Assign Cart Checkbox;
	@FindBy(xpath = "//button[starts-with(text(),'New Cart')]")
	WebElement newCartBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Assign Cart')]")
	WebElement assignCartBtn;

	@FindBy(xpath = "//span/img[@src=\"/assets/cart_icon-e88b9cca.svg\"]")
	WebElement cartIconBtn;

	@FindBy(xpath = "//p[text()=\"Your cart is empty, start adding products to cart\"]")
	WebElement cartPageText;

	@FindBy(xpath = "//button[starts-with(text(),'Add existing products')]")
	WebElement addExistingProductsBtn;

	@FindBy(xpath = "//span[@class=\"MuiTypography-root MuiTypography-contained css-e9h7g0\"]")
	WebElement verifyCustomerOnCartPage;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/div/div/p[1]")
	WebElement numberOfProducts;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div/div/div)[1]")
	WebElement threeDotsBtn;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDd;

	@FindBy(xpath = "//button[text()='Discard entire cart']")
	WebElement discardEntireCartBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container breadcrumb-header css-1tr1ywp\"]/div[2]/div/div[1]")
	WebElement customerDropdownOnCartapge;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-elevation16 MuiDrawer-paper MuiDrawer-paperAnchorRight css-1byhons\"]/div/div[2]/div[1]/div[2]/div[2]")
	WebElement guestCus;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-v0mrmj\"]/div/div[1]")
	WebElement guestCusOnCart;

	@FindBy(xpath = "//input[@id='buyer_search']")
	WebElement customerSearchTextbox1;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/div/p")
	WebElement user;

	public POM8_Buyer_Switching() {
		PageFactory.initElements(driver.get(), this);
	}

// Click on the guest customer button on top
	@Step("Click on Guest Customer Button")
	public void clickGuestCustomerButton1stTime() throws Exception {
		Assert.assertTrue(guestCustomerBtn.isEnabled(), "Both actual and expected are not same");
		guestCustomerBtn.click();
		Thread.sleep(5000);
	}

// Search customer by passing a particular customer name
	@Step("Enter wizcom")
	public void clickCustomerSearchTextbox1stTime() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			customerSearchTextbox.sendKeys("wizcom");
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			customerSearchTextbox.sendKeys("Qa team");
			Thread.sleep(5000);
		}
	}

// Click on customer followed by new cart button
	@Step("Click on Customer")
	public void clickCustomer1() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customer1_demo.isDisplayed(), "Both actual and expected are not same");
			customer1_demo.click();
			Assert.assertTrue(newCartBtn.isEnabled(), "Both actual and expected are not same");
			if (newCartBtn.isEnabled())
				Thread.sleep(5000);
			newCartBtn.click();
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customer1_qa.isDisplayed(), "Both actual and expected are not same");
			customer1_qa.click();
			Assert.assertTrue(newCartBtn.isEnabled(), "Both actual and expected are not same");
			if (newCartBtn.isEnabled())
				Thread.sleep(5000);
			newCartBtn.click();
			Thread.sleep(5000);
		}
	}

// Click on cart icon button
	@Step("Click on Cart Button")
	public void clickCartButton1stTime() throws Exception {
		Assert.assertTrue(cartIconBtn.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(5000);
		cartIconBtn.click();
		Thread.sleep(5000);
	}

//Verify that the cart is empty
	@Step("click on add Existing Product button")
	public void verifyEmptyCart1stTime() throws Exception {
		Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
		Assert.assertTrue(cartPageText.isDisplayed(), "Both actual and expected are not same");
		String text = cartPageText.getText();
		Assert.assertEquals(text, "Your cart is empty, start adding products to cart",
				"Both actual and expected are not same");
		addExistingProductsBtn.click();
		Thread.sleep(3000);

	}

//Verify customer name after selecting particular customer	
	@Step("Verify customer name after selecting particular customer")
	public void verifyCustomerNameOnCartPage1stTime() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(verifyCustomerOnCartPage.isDisplayed(), "Both actual and expected are not same");
			String text = verifyCustomerOnCartPage.getText();
			Assert.assertEquals(text, "Wizcom_Automate", "Both actual and expected are not same");
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(verifyCustomerOnCartPage.isDisplayed(), "Both actual and expected are not same");
			String text = verifyCustomerOnCartPage.getText();
			Assert.assertEquals(text, "Qa team", "Both actual and expected are not same");
			Thread.sleep(5000);
		}
	}

// Search customer again by passing a particular customer name
	@Step("Click on customer search text box")
	public void clickCustomerSearchTextbox2ndTime() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			Thread.sleep(5000);
			customerSearchTextbox.sendKeys("Shad");
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customerSearchTextbox.isDisplayed(), "Both actual and expected are not same");
			Thread.sleep(5000);
			customerSearchTextbox.sendKeys("Shad");
			Thread.sleep(5000);
		}
	}

// Click on customer followed by assign cart button	
	@Step("Click on customer")
	public void clickCustomer2() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customer2_demo.isDisplayed(), "Both actual and expected are not same");
			customer2_demo.click();
			Thread.sleep(5000);
			Assert.assertTrue(assignCartBtn.isEnabled(), "Both actual and expected are not same");
			assignCartBtn.click();
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customer2_qa.isDisplayed(), "Both actual and expected are not same");
			customer2_qa.click();
			Thread.sleep(5000);
			Assert.assertTrue(assignCartBtn.isEnabled(), "Both actual and expected are not same");
			assignCartBtn.click();
			Thread.sleep(5000);
		}
	}

//Verify customer name after selecting particular customer
	@Step("Verify customer name after selecting particular customer")
	public void verifyCustomerNameOnCartPage2ndTime() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(verifyCustomerOnCartPage.isDisplayed(), "Both actual and expected are not same");
			String text = verifyCustomerOnCartPage.getText();
			System.out.println(text);
			Assert.assertEquals(text, "Shad wizcom", "Both actual and expected are not same");
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(verifyCustomerOnCartPage.isDisplayed(), "Both actual and expected are not same");
			String text = verifyCustomerOnCartPage.getText();
			System.out.println(text);
			Assert.assertEquals(text, "Shad 5/12", "Both actual and expected are not same");
			Thread.sleep(5000);
		}
	}

// Verifying number of product same as added
	@Step("Verifying number of product same as added")
	public void verifyProductOnCart1stTime() throws Exception {
		Assert.assertTrue(numberOfProducts.isDisplayed(), "Both actual and expected are not same");
		String text = numberOfProducts.getText();
		System.out.println(text);
		Thread.sleep(3000);
		Assert.assertEquals(text, "2 Products", "Both actual and expected are not same");
		Thread.sleep(3000);
	}

// Click on the guest customer button on top
	@Step("Click on Customer Drop Down on cart page")
	public void clickOnCustomerButton3rdTime() throws Exception {
		Assert.assertTrue(customerDropdownOnCartapge.isEnabled(), "Both actual and expected are not same");
		customerDropdownOnCartapge.click();
		Thread.sleep(5000);
	}

// Select guest customer
	@Step("Click on guest customer")
	public void clickGuestCus3rdTime() throws Exception {
		Assert.assertTrue(guestCus.isEnabled(), "Both actual and expected are not same");
		guestCus.click();
		Thread.sleep(6000);

	}

// Click on the guest customer button on top	
	@Step("Click on the guest customer button on top")
	public void clickGuestCustomerButton3rdTime() throws Exception {
		Assert.assertTrue(guestCusOnCart.isEnabled(), "Both actual and expected are not same");
		guestCusOnCart.click();
		Thread.sleep(5000);
	}

// Search customer by passing a particular customer name
	@Step("Click on customer search text box")
	public void clickCustomerSearchTextbox3rdTime() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerSearchTextbox1.isDisplayed(), "Both actual and expected are not same");
			customerSearchTextbox1.sendKeys("Shad wizcom");
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customerSearchTextbox1.isDisplayed(), "Both actual and expected are not same");
			customerSearchTextbox1.sendKeys("Shad");
			Thread.sleep(5000);
		}
	}

// Click on customer followed by keep existing button
	@Step("Click on keep existing button")
	public void clickCustomer2AgainForkeepExisting() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customer2_demo.isEnabled(), "Both actual and expected are not same");
			customer2_demo.click();
			Thread.sleep(5000);
			Assert.assertTrue(keepExistingBtn.isEnabled(), "Both actual and expected are not same");
			keepExistingBtn.click();
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customer2_qa.isEnabled(), "Both actual and expected are not same");
			customer2_qa.click();
			Thread.sleep(5000);
			Assert.assertTrue(keepExistingBtn.isEnabled(), "Both actual and expected are not same");
			keepExistingBtn.click();
			Thread.sleep(5000);
		}
	}

// Search customer by passing a particular customer name
	@Step("Click on customer search text box")
	public void clickCustomerSearchTextbox4theTime() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerSearchTextbox1.isEnabled(), "Both actual and expected are not same");
			customerSearchTextbox1.sendKeys("Qa Testing");
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customerSearchTextbox1.isEnabled(), "Both actual and expected are not same");
			customerSearchTextbox1.sendKeys("HB");
			Thread.sleep(5000);
		}
	}

// Click on customer followed by replace button	
	@Step("Click on replace button")
	public void clickCustomer4ForReplace() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customer3_demo.isDisplayed(), "Both actual and expected are not same");
			customer3_demo.click();
			Thread.sleep(5000);
			Assert.assertTrue(replaceBtn.isEnabled(), "Both actual and expected are not same");
			replaceBtn.click();
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(customer3_qa.isDisplayed(), "Both actual and expected are not same");
			customer3_qa.click();
			Thread.sleep(5000);
			Assert.assertTrue(replaceBtn.isEnabled(), "Both actual and expected are not same");
			replaceBtn.click();
			Thread.sleep(5000);
		}
	}

}
