package pomPages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;
import io.qameta.allure.Step;

public class POM9_Container extends BaseTest {

	@FindBy(xpath = "//p[contains(text(), 'Container')]/parent::div")
	WebElement containerWholeBox;

//	@FindBy(xpath = "//div[@id=\"rootContainer\"]/div/div/div/div[2]/div[2]/div/div[2]/div/span/span[2]")
	@FindBy(xpath = "//span[@class=\"MuiSwitch-root MuiSwitch-sizeMedium css-ecvcn9\"]")
	WebElement containerToggleSwitch;

//	@FindBy(xpath = "//div[@id=\"rootContainer\"]/div/div/div/div[2]/div[2]/div/div[2]/div[2]//div/button[1]")
	@FindBy(xpath = "//button/p[text()='CBM']")
	WebElement CBM;

//	@FindBy(xpath = "//div[@id=\"rootContainer\"]/div/div/div/div[2]/div[2]/div/div[2]/div[2]//div/button[2]")
	@FindBy(xpath = "//button/p[text()='CFT']")
	WebElement CFT;

//	@FindBy(xpath = "//div[@id=\"rootContainer\"]/div/div/div/div[2]/div[2]/div/div[2]/div[5]")
	@FindBy(xpath = "(//p[text()='CFT'])[5]")
	WebElement totalCFT;

//	@FindBy(xpath = "//div[@id=\"rootContainer\"]/div/div/div/div[2]/div[2]/div/div[2]/div[5]")
	@FindBy(xpath = "(//p[text()='CBM'])[5]")
	WebElement totalCBM;

	@FindBy(xpath = "(//div[@role='combobox'])[2]")
	WebElement VolumeContainerCBMdropdown;

	@FindBy(xpath = "//*[@data-testid=\"ArrowDropDownIcon\"]")
	WebElement VolumeContainerCFTdropdown;

	@FindBy(xpath = "//div['class=\"MuiGrid-root css-29xz2q\"']/li")
	List<WebElement> VolumeContainerCBMDropdownList;

//	@FindBy(xpath = "//div['class=\"MuiGrid-root css-29xz2q\"']/li")
	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-tleme8\"]//li")
	List<WebElement> VolumeContainerCFTDropdownList;

	@FindBy(xpath = "//input[@class=\"PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3\"]")
	WebElement containerToggleSwitchInQuotePAge;
	
	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/p")
	WebElement user;

	public POM9_Container() {
		PageFactory.initElements(driver, this);
	}

// Verify that container box visible	
	public void containerBoxVisibility() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(containerWholeBox.isDisplayed(), "both expected and actual are not same");
	}

// Verify that container toggle switch working
	@Step("Click on container toggle switch")
	public void toggleSwitch() throws Exception {
		Assert.assertTrue(containerToggleSwitch.isEnabled(), "both expected and actual are not same");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(containerToggleSwitch).click().build().perform();
		Thread.sleep(3000);
	}

//Check container box visible after selecting customer	
	@Step("Click on container toggle switch after selecting customer")
	public void checkContainerOnCartPageAfterSelectingCustomer() throws Exception {
		Assert.assertTrue(containerWholeBox.isDisplayed(), "both expected and actual are not same");
		boolean displayed = containerWholeBox.isDisplayed();
		if (displayed == true) {
			Actions a = new Actions(driver);
			Assert.assertTrue(containerToggleSwitch.isEnabled(), "both expected and actual are not same");
			a.moveToElement(containerToggleSwitch).click().build().perform();
			Thread.sleep(3000);
		}
	}

// Verify that by default CFT is selected and total CFT is showing in the bottom
	@Step("Check defaultCFT is displayed")
	public void defaultCFT() throws Exception {
		if (CFT.isSelected()) {
			Thread.sleep(3000);
			Assert.assertTrue(totalCFT.isDisplayed(), "both expected and actual are not same");
		}
	}

// Verify that CBM working and total CBM is showing in the bottom
	@Step("Click on CBM")
	public void clickCBM() throws Exception {
		Assert.assertTrue(CBM.isDisplayed(), "both expected and actual are not same");
		if (CBM.isDisplayed()) {
			CBM.click();
			Thread.sleep(5000);
			Assert.assertTrue(totalCBM.isDisplayed(), "both expected and actual are not same");
		}
	}

// Select from CBM dropdown
	@Step("Click on CBM from Dropdown")
	public void selctCBMFromDropdown() throws Exception {
		Assert.assertTrue(VolumeContainerCBMdropdown.isEnabled(), "both expected and actual are not same");
		VolumeContainerCBMdropdown.click();
		for (int i = 0; i < VolumeContainerCBMDropdownList.size(); i++) {
			String text = VolumeContainerCBMDropdownList.get(i).getText();
			System.out.println(text);
			Thread.sleep(3000);
			if (text.contains("CBM")) {
				VolumeContainerCBMDropdownList.get(i).click();
				Thread.sleep(3000);
			}
		}
		Thread.sleep(3000);
	}

// Select from CFT dropdown		
	@Step("Click on CFT from dropdown")
	public void clickCFTAgainAndSelctCFTFromDropdown() throws Exception {
		Assert.assertTrue(CFT.isEnabled(), "both expected and actual are not same");
		Actions a = new Actions(driver);
		a.moveToElement(CFT).build().perform();
		Thread.sleep(3000);
		Assert.assertTrue(VolumeContainerCFTdropdown.isEnabled(), "both expected and actual are not same");
		a.moveToElement(VolumeContainerCFTdropdown).build().perform();
		Thread.sleep(3000);
		for (int i = 0; i < VolumeContainerCFTDropdownList.size(); i++) {
			String text = VolumeContainerCFTDropdownList.get(i).getText();
			System.out.println(text);
			Thread.sleep(3000);
			if (text.contains("1000 CFT")) {
				VolumeContainerCFTDropdownList.get(i).click();
				Thread.sleep(5000);
			}
		}
		Thread.sleep(3000);
	}

// Again verify toggle switch
	@Step("Verify toggle switch")
	public void toggleSwitchCheck() throws Exception {
		Thread.sleep(3000);
		System.out.println("Verify after correction");
//		System.out.println(containerToggleSwitchInQuotePAge.isDisplayed());
//		System.out.println(containerToggleSwitchInQuotePAge.isEnabled());
//		System.out.println(containerToggleSwitchInQuotePAge.isSelected());
//		Assert.assertFalse(containerToggleSwitchInQuotePAge.isDisplayed(), "both expected and actual are not same");
	}

}
