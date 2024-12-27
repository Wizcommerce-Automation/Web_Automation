package pomPages;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class POM5_Edit_Quote_01 extends BaseTest {

	@FindBy(xpath = "//button[text()='Edit quote']")
	WebElement editQuoteBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-134xd8p\"]/p[starts-with(text(),\"Add Discount\")]")
	WebElement addDiscountBtn;

	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-13ny0hi\"]")
	WebElement discountTextbox;

	@FindBy(xpath = "//button[starts-with(text(),'Apply')]")
	WebElement applyBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Re-submit Quote')]")
	WebElement reSubmitQuoteBtn;

	@FindBy(xpath = "//button[contains(text(),'Submit quote')]")
	WebElement submitQuoteBtn;
	
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement submitButtonPopup;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-7.85 MuiGrid-grid-xl-7.85 css-1ov68gl\"]/div/div[1]/*[2]/div")
	WebElement threeDotsBtn;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]/li")
	List<WebElement> threeDotsBtnDd;

	@FindBy(xpath = "//button[text()='Discard entire cart']")
	WebElement discardEntireCartBtn;

	@FindBy(xpath = "//button[text()='Back to cart']")
	WebElement BackToCartBtn;

	@FindBy(xpath = "//button[starts-with(text(),'Add existing products')]")
	WebElement addExistingProductsBtn;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-134xd8p\"]/p[1]")
	WebElement addShippingChargeBtn;

	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-13ny0hi\"]")
	WebElement shippingChargeTextbox;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-134xd8p\"]/p[1]")
	WebElement addTaxBtn;

	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-13ny0hi\"]")
	WebElement taxTextbox;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root css-134xd8p\"]/p")
	WebElement addAdditionalChargeBtn;

	@FindBy(xpath = "(//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1t4xfhy\"]/input)[2]")
	WebElement additionalChargeTextbox;

	@FindBy(xpath = "(//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1t4xfhy\"]/input)[1]")
	WebElement additionalChargeNameTextbox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[2]/p[2]")
	WebElement cartTotalValueInShippingBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[3]/p[2]")
	WebElement discountValueInShippingBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[4]/p[2]")
	WebElement shippingValueInShippingBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[6]/p[2]")
	WebElement totalValueInShippingBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[2]/p[2]")
	WebElement cartTotalValueInDiscountBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[3]/p[2]")
	WebElement discountValueInDiscountBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[5]/p[2]")
	WebElement totalValueInDiscountBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[2]/p[2]")
	WebElement cartTotalValueInTaxBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[3]/p[2]")
	WebElement discountValueInTaxBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[4]/p[2]")
	WebElement shippingValueInTaxBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[5]/p[2]")
	WebElement taxValueInTaxBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[7]/p[2]")
	WebElement totalValueInTaxBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[3]/p[2]")
	WebElement cartTotalValueInAddChargeBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[4]/p[2]")
	WebElement discountValueInAddChargeBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[5]/p[2]")
	WebElement shippingValueInAddChargeBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[6]/p[2]")
	WebElement taxValueInAddChargeBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[7]/p[2]")
	WebElement addChargeValueInAddChargeBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div[9]/p[2]")
	WebElement totalValueInAddChargeBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div/div[2]/div[1]")
	WebElement percentInBox;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm css-7jjbdt\"]/div/div[2]/div/div[2]/div[2]")
	WebElement dollarInBox;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"]/p)[2]")
	WebElement pageCartTotalValue;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"]/p)[3]")
	WebElement pageDiscountValue;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"]/p)[4]")
	WebElement pageShippingValue;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"]/p)[5]")
	WebElement pageTaxValue;

	@FindBy(xpath = "(//div[@class=\"MuiGrid-root MuiGrid-container css-8rnkcc\"]/p)[6]")
	WebElement pageAdditionalChargeValue;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-1m2qg1i\"]/p[2]")
	WebElement pageTotalValue;
	
	@FindBy(xpath="//button[text()=\"Re-submit\"]")
	WebElement ReSubmitPopup;

	public POM5_Edit_Quote_01() {
		PageFactory.initElements(driver, this);
	}

// Click on three dots button to delete entire cart 
	@Step("Click on three dots button to delete entire cart")
	public void clickThreeDotsButton() throws Exception {
		Assert.assertTrue(threeDotsBtn.isEnabled(), "Both actual and expected are not same");
		threeDotsBtn.click();
		Thread.sleep(3000);
	}

// Select Delete Cart from dropdown	
	@Step("Select Delete Cart from dropdown")
	public void selectDeleteCart() throws Exception {
		for (int i = 0; i < threeDotsBtnDd.size(); i++) {
			String text = threeDotsBtnDd.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Delete cart")) {
				threeDotsBtnDd.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

//Handling checkbox after click on delete cart and click on discard entire cart button
	@Step("Handling checkbox after click on delete cart and click on discard entire cart button")
	public void handlingDiscardAllItemsInCartCheckbox() throws Exception {
		Assert.assertTrue(BackToCartBtn.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(discardEntireCartBtn.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(2000);
		discardEntireCartBtn.click();
		Thread.sleep(4000);
	}

//	Click on existing products button
	@Step("Click on existing products button")
	public void clickAddExistingProducts() throws Exception {
		Thread.sleep(2000);
		Assert.assertTrue(addExistingProductsBtn.isEnabled(), "Both actual and expected are not same");
		addExistingProductsBtn.click();
		Thread.sleep(6000);
	}

// Click on submit quote button
	@Step("Click on submit quote button")
	public void clickSubmitQuote() throws Exception {
		Assert.assertTrue(submitQuoteBtn.isEnabled(), "Both actual and expected are not same");
		submitQuoteBtn.click();
		Thread.sleep(5000);
		Allure.step("click on submit button");
		submitButtonPopup.click();
		Thread.sleep(5000);
	}

// Click on edit quote button
	@Step("Click on edit quote button")
	public void clickEditQuotebutton() throws Exception {
		Assert.assertTrue(editQuoteBtn.isEnabled(), "Both actual and expected are not same");
		editQuoteBtn.click();
		Thread.sleep(5000);
	}

// Click on add discount button
	@Step("Click on add discount button")
	public void clickAddDiscountButton() throws Exception {
		Assert.assertTrue(addDiscountBtn.isEnabled(), "Both actual and expected are not same");
		addDiscountBtn.click();
		Thread.sleep(3000);
	}

// Enter the discount in the discount textbox
	@Step("Enter the discount in the discount textbox")
	public void enterDiscount() throws Exception {
		Assert.assertTrue(percentInBox.isEnabled(), "Both actual and expected are not same");
		percentInBox.click();
		Assert.assertTrue(dollarInBox.isDisplayed(), "Both actual and expected are not same");
		Assert.assertTrue(discountTextbox.isDisplayed(), "Both actual and expected are not same");
		discountTextbox.sendKeys("10");
		Thread.sleep(3000);
	}

// Verifying amount after applying discount
	@Step("Verifying amount after applying discount")
	public void verifyAmountAfterDiscount() throws Exception {
		String carttotal = cartTotalValueInDiscountBox.getText();
		String discount = discountValueInDiscountBox.getText();
		String total = totalValueInDiscountBox.getText();

		System.out.println(carttotal);
		System.out.println(discount);
		System.out.println(total);

		String carttotal1 = carttotal.substring(1).replace(" ", "").replace(",","");
		String discount1 = discount.substring(3).replace(" ", "").replace(",","");
		String total1 = total.substring(1).replace(" ", "").replace(",","");

		System.out.println("cart total1= "+carttotal1);
		System.out.println("discount1= "+discount1);
		System.out.println("total1= "+total1);

		double carttotal2 = Double.parseDouble(carttotal1);
		double discount2 = Double.parseDouble(discount1);
		double total2 = Double.parseDouble(total1);

		double verify = carttotal2 - discount2;
		System.out.println("verification amount is :" + verify);
		assertTrue(verify == total2, "both expected and actual are not same");
		System.out.println(verify == total2);
		Thread.sleep(5000);

		System.out.println("------------------*********---------------");

	}

//	Click on apply button after adding discount
	@Step("Click on apply button after adding discount")
	public void clickApplyButton() throws Exception {
		Assert.assertTrue(applyBtn.isEnabled(), "Both actual and expected are not same");
		applyBtn.click();
		Thread.sleep(6000);
	}

// Click on add shipping charge button
	@Step("Click on add shipping charge button")
	public void clickAddShippingChargeButton() throws Exception {
		assertTrue(addShippingChargeBtn.isEnabled(), "both expected and actual are not same");
		addShippingChargeBtn.click();
		Thread.sleep(3000);
	}

// Enter the shipping charge in the shipping textbox
	@Step("Enter the shipping charge in the shipping textbox")
	public void enterShippingCharge() throws Exception {
		assertTrue(dollarInBox.isEnabled(), "both expected and actual are not same");
		dollarInBox.click();
		assertTrue(percentInBox.isEnabled(), "both expected and actual are not same");
		assertTrue(shippingChargeTextbox.isDisplayed(), "both expected and actual are not same");
		shippingChargeTextbox.sendKeys("50");
		Thread.sleep(3000);
	}

// Verifying amount after applying Shipping charge	
	@Step("Verifying amount after applying Shipping charge")
	public void verifyAmountAfterShipping() throws Exception {
		String carttotal = cartTotalValueInShippingBox.getText();
		String discount = discountValueInShippingBox.getText();
		String shipping = shippingValueInShippingBox.getText();
		String total = totalValueInShippingBox.getText();

		System.out.println(carttotal);
		System.out.println(discount);
		System.out.println(shipping);
		System.out.println(total);

		String carttotal1 = carttotal.substring(1).replace(" ", "").replace(",","");
		String discount1 = discount.substring(3).replace(" ", "").replace(",","");
		String shipping1 = shipping.substring(1).replace(" ", "").replace(",","");
		String total1 = total.substring(1).replace(" ", "").replace(",","");

		System.out.println(carttotal1);
		System.out.println(discount1);
		System.out.println(shipping1);
		System.out.println(total1);

		double carttotal2 = Double.parseDouble(carttotal1);
		double discount2 = Double.parseDouble(discount1);
		double shipping2 = Double.parseDouble(shipping1);
		double total2 = Double.parseDouble(total1);

		double verify = carttotal2 - discount2 + shipping2;
		System.out.println("verification amount is :" + verify);
		System.out.format("Double Number: %.2f", verify);
		System.out.println();
		System.out.println(verify == total2);
		assertTrue(verify == total2, "both expected and actual are not same");
		System.out.println("---------****----------*****------------");

	}

// Click on apply button after adding shipping
	@Step("Click on apply button after adding shipping")
	public void clickShippingApplyButton() throws Exception {
		assertTrue(applyBtn.isEnabled(), "both expected and actual are not same");
		applyBtn.click();
		Thread.sleep(6000);
	}

// Click on add tax button
	@Step("Click on add tax button")
	public void clickAddTaxButton() throws Exception {
		assertTrue(addTaxBtn.isEnabled(), "both expected and actual are not same");
		addTaxBtn.click();
		Thread.sleep(3000);
	}

// Enter the tax in the tax textbox	
	@Step("Enter the tax in the tax textbox")
	public void enterTax() throws Exception {
		assertTrue(percentInBox.isEnabled(), "both expected and actual are not same");
		percentInBox.click();
		assertTrue(dollarInBox.isEnabled(), "both expected and actual are not same");
		assertTrue(taxTextbox.isDisplayed(), "both expected and actual are not same");
		taxTextbox.sendKeys("5");
		Thread.sleep(3000);
	}

// Verifying amount after applying tax	
	@Step("Verifying amount after applying tax")
	public void verifyAmountAfterTax() throws Exception {
		String carttotal = cartTotalValueInTaxBox.getText();
		String discount = discountValueInTaxBox.getText();
		String shipping = shippingValueInTaxBox.getText();
		String tax = taxValueInTaxBox.getText();
		String total = totalValueInTaxBox.getText();

		System.out.println(carttotal);
		System.out.println(discount);
		System.out.println(shipping);
		System.out.println(tax);
		System.out.println(total);

		String carttotal1 = carttotal.substring(1).replace(" ", "").replace(",","");
		String discount1 = discount.substring(3).replace(" ", "").replace(",","");
		String shipping1 = shipping.substring(1).replace(" ", "").replace(",","");
		String tax1 = tax.substring(1).replace(" ", "").replace(",","");
		String total1 = total.substring(1).replace(" ", "").replace(",","");

		System.out.println(carttotal1);
		System.out.println(discount1);
		System.out.println(shipping1);
		System.out.println(tax1);
		System.out.println(total1);

		double carttotal2 = Double.parseDouble(carttotal1);
		double discount2 = Double.parseDouble(discount1);
		double shipping2 = Double.parseDouble(shipping1);
		double tax2 = Double.parseDouble(tax1);
		double total2 = Double.parseDouble(total1);

		double verify = carttotal2 - discount2 + shipping2 + tax2;
		System.out.println("verification amount is :" + verify);
		double verify1 = Math.round(verify * 100.0) / 100.0;
		System.out.println(verify1);
		System.out.println(verify1 == total2);
		assertTrue(verify1 == total2, "both expected and actual are not same");
		System.out.println("---------****----------*****--------********----");

	}

// Click on apply button after adding tax
	@Step("Click on apply button after adding tax")
	public void clickTaxApplyButton() throws Exception {
		assertTrue(applyBtn.isEnabled(), "both expected and actual are not same");
		applyBtn.click();
		Thread.sleep(6000);
	}

// Click on add additional charge button
	@Step("Click on add additional charge button")
	public void clickAddAdditionalChargeButton() throws Exception {
		assertTrue(addAdditionalChargeBtn.isEnabled(), "both expected and actual are not same");
		addAdditionalChargeBtn.click();
		Thread.sleep(3000);
	}

	public void enterAdditionalchargeName() throws Exception {
		assertTrue(additionalChargeNameTextbox.isEnabled(), "both expected and actual are not same");
		additionalChargeNameTextbox.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);
		Thread.sleep(3000);
		Actions a = new Actions(driver);
//		additionalChargeNameTextbox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
		a.moveToElement(additionalChargeTextbox).click().sendKeys("Testing").build().perform();

		// additionalChargeNameTextbox.sendKeys("Testing");

		Thread.sleep(3000);
	}

// Enter the additional charge in the additional charge textbox	
	@Step("Enter the additional charge in the additional charge textbox")
	public void enterAdditionalcharge() throws Exception {
		assertTrue(additionalChargeTextbox.isDisplayed(), "both expected and actual are not same");
		additionalChargeTextbox.sendKeys("10");
		Thread.sleep(3000);
	}

// Verifying amount after applying additional charge
	@Step("Get value of cartTotal, discount, shipping, tax, addCharge, total")
	public void verifyAmountAfterAddCharge() throws Exception {
		String carttotal = cartTotalValueInAddChargeBox.getText();
		String discount = discountValueInAddChargeBox.getText();
		String shipping = shippingValueInAddChargeBox.getText();
		String tax = taxValueInAddChargeBox.getText();
		String addCharge = addChargeValueInAddChargeBox.getText();
		String total = totalValueInAddChargeBox.getText();

		System.out.println(carttotal);
		System.out.println(discount);
		System.out.println(shipping);
		System.out.println(tax);
		System.out.println(addCharge);
		System.out.println(total);

		String carttotal1 = carttotal.substring(1).replace(" ", "").replace(",","");
		String discount1 = discount.substring(3).replace(" ", "").replace(",","");
		String shipping1 = shipping.substring(1).replace(" ", "").replace(",","");
		String tax1 = tax.substring(1).replace(" ", "").replace(",","");
		String addCharge1 = addCharge.substring(1).replace(" ", "").replace(",","");
		String total1 = total.substring(1).replace(" ", "").replace(",","");

		System.out.println(carttotal1);
		System.out.println(discount1);
		System.out.println(shipping1);
		System.out.println(tax1);
		System.out.println(addCharge1);
		System.out.println(total1);

		double carttotal2 = Double.parseDouble(carttotal1);
		double discount2 = Double.parseDouble(discount1);
		double shipping2 = Double.parseDouble(shipping1);
		double tax2 = Double.parseDouble(tax1);
		double addCharge2 = Double.parseDouble(addCharge1);
		double total2 = Double.parseDouble(total1);

		double verify = carttotal2 - discount2 + shipping2 + tax2 + addCharge2;
		System.out.println("verification amount is :" + verify);
		double verify1 = Math.round(verify * 100.0) / 100.0;
		System.out.println(verify1);
		System.out.println(verify1 == total2);
		assertTrue(verify1 == total2, "both expected and actual are not same");
		System.out.println("---------****----------*****--------********----*****----------------");

	}

// Click on apply button after adding additional charge
	@Step("Click on apply button after adding additional charge")
	public void clickApplyAdditionalChargeButton() throws Exception {
		assertTrue(applyBtn.isEnabled(), "both expected and actual are not same");
		applyBtn.click();
		Thread.sleep(10000);
	}

// Verify the page amount after applying all charges
	@Step("Get value of cartTotal, discount, shipping, tax, addCharge, Total")
	public void verifyPageAmount() throws Exception {
		String carttotal = pageCartTotalValue.getText();
		Thread.sleep(1000);
		String discount = pageDiscountValue.getText();
		Thread.sleep(1000);
		String shipping = pageShippingValue.getText();
		Thread.sleep(1000);
		String tax = pageTaxValue.getText();
		Thread.sleep(1000);
		String addCharge = pageAdditionalChargeValue.getText();
		Thread.sleep(1000);
		String total = pageTotalValue.getText();
		Thread.sleep(1000);

		System.out.println(carttotal);
		System.out.println(discount);
		System.out.println(shipping);
		System.out.println(tax);
		System.out.println(addCharge);
		System.out.println(total);

		String carttotal1 = carttotal.substring(1).replace(" ", "").replace(",", "");
		String discount1 = discount.substring(3).replace(" ", "").replace(",","");
		String shipping1 = shipping.substring(1).replace(" ", "").replace(",","");
		String tax1 = tax.substring(1).replace(" ", "").replace(",","");
		String addCharge1 = addCharge.substring(1).replace(" ", "").replace(",","");
		String total1 = total.substring(1).replace(" ", "").replace(",", "");

		System.out.println(carttotal1);
		System.out.println(discount1);
		System.out.println(shipping1);
		System.out.println(tax1);
		System.out.println(addCharge1);
		System.out.println(total1);

		double carttotal2 = Double.parseDouble(carttotal1);
		double discount2 = Double.parseDouble(discount1);
		double shipping2 = Double.parseDouble(shipping1);
		double tax2 = Double.parseDouble(tax1);
		double addCharge2 = Double.parseDouble(addCharge1);
		double total2 = Double.parseDouble(total1);
		double verify = carttotal2 - discount2 + shipping2 + tax2 + addCharge2;
		System.out.println("verification amount is :" + verify);
		double verify1 = Math.round(verify * 100.0) / 100.0;
		System.out.println(verify1);
		System.out.println(verify1 == total2);
		assertTrue(verify1 == total2, "both expected and actual are not same");
		System.out
				.println("---------****----------*****--------********------------*****---------*********-----------");

	}

// Click on re-submit button
	@Step("Click on re-submit button")
	public void clickReSubmitQuoteButton() throws Exception {
		assertTrue(reSubmitQuoteBtn.isEnabled(), "both expected and actual are not same");
		reSubmitQuoteBtn.click();
		Thread.sleep(3000);
		ReSubmitPopup.click();
		Thread.sleep(3000);
	}

}
