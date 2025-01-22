package pomPages;

import static org.testng.Assert.assertEquals;

import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;

public class CartSummaryPage extends BaseTest {

	// Path xpath
	@FindBy(xpath = "//ol[@class=\"MuiBreadcrumbs-ol css-nhb8h9\"]/li")
	List<WebElement> path;

	@FindBy(xpath = "//span[text()='Guest Customer']//parent::div")
	WebElement guestCustomerBtn;
	
	//Heading of select a customer drawer
	@FindBy(xpath= "//p[text()='Select a customer']")
	WebElement selectACustomer;
	
	// close button of select a customer drawer
	@FindBy(xpath= "//p[text()='Select a customer']//parent::div//*[@type=\"fallback\"]")
	WebElement customerSideDrawerCloseButton;
	
	@FindBy(xpath = "//span[text()='Wholesale']//parent::div")
	WebElement catalog;
	
	@FindBy(xpath = "//span[text()='Guest Customer']/parent::div/parent::div/div")
	WebElement tearSheetIcon;
	
	@FindBy(xpath="//img[@src=\"/assets/unseen_notification-c61d0077.svg\"]")
	WebElement bellIcon;
	
	@FindBy(xpath="//img[@src=\"/assets/unseen_notification-c61d0077.svg\"]/parent::div/parent::div/text/div/div/div/p")
	WebElement userProfile;
	
	@FindBy(xpath="//button[text()=\"Add Products\"]")
	WebElement addProduct;
	
	@FindBy(xpath="//ul/li[2]")
	WebElement logoutButton;
	
	@FindBy(xpath="//button[text()=\"Add Products\"]/parent::div/div[0]")
	WebElement threeDots;
	
	@FindBy(xpath="//ul/li[1]")
	WebElement deleteCart;
	
	@FindBy(xpath="//ul/li[2]")
	WebElement addCustomitem;
	
	@FindBy(xpath="(//p[text()='in cart']/parent::div/parent::div/parent::div/parent::div/div[2]/div/div/div/div/img)")
	List<WebElement> productImage;
	
	@FindBy(xpath="(//p[text()='in cart']/parent::div/parent::div/parent::div/parent::div/div[2]/div/div/div/div[2]/p[1])")
	List<WebElement> productName;
	
	@FindBy(xpath="//p[text()=\"View similar\"]")
	List<WebElement> viewSimilar;
	
	//Inventory Icon
	@FindBy(xpath="//p[contains(text(), 'Available')]/parent::div/div")
	WebElement inventoryIcon;
	
	//minus and delete icon
	@FindBy(xpath="//div[@aria-label=\"small outlined button group\"]/button[1]")
	List<WebElement> deleteAndMinusButton;
	
	//input value
	@FindBy(xpath="//div[@aria-label=\"small outlined button group\"]/input")
	List<WebElement> input;
	
	//plus Icon
	@FindBy(xpath="//div[@aria-label=\"small outlined button group\"]/button[2]")
	List<WebElement> plusIcon;
	
	//product three dots
	@FindBy(xpath="//div[@aria-label=\"small outlined button group\"]/parent::div/parent::div/following-sibling::div/div/div")
	List<WebElement> productThreeDots;
	
	//product Three Dots Dropdown options
	@FindBy(xpath="//ul/li")
	List<WebElement> threeDotsDropDown;
	
	//Buyer name
	@FindBy(xpath="//button[text()=\"Create quote\"]/parent::div/parent::div/div/div[2]/p")
	WebElement buyerName;
	
	//Create Quote button
	@FindBy(xpath="//button[text()=\"Create quote\"]")
	WebElement createQuote;
	
	//Create Order button
	@FindBy(xpath="//button[text()=\"Create order\"]")
	WebElement createOrder;
	
	//Container
	@FindBy(xpath="//p[contains(text(), \"Container\")]")
	WebElement container;
	
	//Container Switcher
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	WebElement containerSwitcher;
	
	//Measure Volume in container CBM button
	@FindBy(xpath="//button/p[text()=\"CBM\"]")
	WebElement VolumeCBMButton;
	
	//Measure Volume in container CFT button
	@FindBy(xpath="//button/p[text()=\"CFT\"]")
	WebElement VolumeCFTButton;
	
	//Capacity dropdown
	@FindBy(xpath="//p[contains(text(), 'Capacity:')]//parent::div")
	WebElement capacityDropdown;
	
	//Heading od dropdown with count
	@FindBy(xpath="//ul/p")
	WebElement dropdownHeading;
	
	//Dropdown options
	@FindBy(xpath="//ul/div/li")
	List<WebElement> measureVolumeDropDownOptions; 
	
	//edit capacity
	@FindBy(xpath="//p[text()=\"Edit capacity\"]")
	WebElement editCapacity;
	
	//edit popup text field //need to be change
	@FindBy(xpath="//input[@id=\":r45:\"]")
	WebElement CapacityInput;
	
	//popup done button
	@FindBy(xpath="//button[text()=\"Done\"]")
	WebElement doneButton;
	
	//popup done button
    @FindBy(xpath="//button[text()=\"Cancel\"]")
	WebElement cancelButton;
	
	//custom line item Button
	@FindBy(xpath="//p[text()=\" Custom line item\"]")
	WebElement customLineItemButton;
	
    //SKU-ID
	@FindBy(xpath="//input[@name=\"sku_id\"]")
	WebElement SKUID;
	
	//Product Name
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement CustomProductName;
	
	//Price
	@FindBy(xpath="//input[@name=\"price\"]")
	WebElement Price;
	
	//input[@type="number"]//parent::div//parent::div//*[name()='svg'])[1]
	//minus Add custom line item
	@FindBy(xpath="//input[@type=\"number\"]//parent::div//parent::div//*[name()='svg'][1]")
	WebElement minusButtonQuantity;
	
	@FindBy(xpath="//input[@type=\\\"number\\\"]//parent::div//parent::div//*[name()='svg'][2]")
	WebElement plusButtonQuatity;
	
	//Unit Volume
	@FindBy(xpath="//input[@name=\"container\"]")
	WebElement unitVolume;
	
	//Add Note input
	@FindBy(xpath="//input[@name=\"note\"]")
	WebElement addNote;
	
	//Button Add more
	@FindBy(xpath="//Button[text()=\"Add more\"]")
	WebElement addMore;
	
	//Button add
	@FindBy(xpath="//Button[text()=\"Add\"]")
	WebElement add;
	
//	@FindBy(xpath="(//div[text()=\"Add to cart\"])")
//	List<WebElement> addToCart;
	
	public CartSummaryPage() {
		PageFactory.initElements(driver.get(), this);
	}
	
	//Check Path is displayed or not
	public void checkPath(){
		String str = "";				
		for(int i=0; i<path.size(); i++) {
			path.get(i).isDisplayed();
			String tagName = path.get(i).getTagName();
			str+=path.get(i).getText();
			Assert.assertEquals(true, tagName.equals("li"));
		}
		Assert.assertEquals("Dashboard/Cart", str);
	}
	
	
	//Customer/Buyer
	public void verifyCustomerBuyer() throws InterruptedException {
		guestCustomerBtn.isDisplayed();
		Thread.sleep(3000);
		guestCustomerBtn.click();
		selectACustomer.isDisplayed();
		assertEquals("Select a customer", selectACustomer.getText());
		customerSideDrawerCloseButton.isDisplayed();
		Thread.sleep(3000);
		customerSideDrawerCloseButton.click();
	}
	
	//Verify Catalog switcher
	public void verifyCatalogSwitcher() {
		catalog.isDisplayed();
	}

}
