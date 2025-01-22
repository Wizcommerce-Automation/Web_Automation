package pomPages;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

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

import generic.BaseTest;
import io.qameta.allure.Step;

public class POM7_Draft extends BaseTest {

	@FindBy(xpath = "//p[starts-with(text(),'Drafts')]")
	WebElement draftsBtn;

	@FindBy(xpath = "(//div[@col-id=\"buyer_details.name\"]//div[@class=\"_agGridCustomCell_mqg92_8\"]/span)[1]")
	WebElement customerNameVerify;

	@FindBy(xpath = "(//div[@col-id=\"document_status\"])[2]")
	WebElement quote;

	@FindBy(xpath = "(//div[@col-id=\"document_status\"])[2]")
	WebElement draft;

	@FindBy(xpath = "(//input[@aria-label=\"Reference ID Filter Input\"])[3]")
	WebElement referenceIDTextbox1;

	@FindBy(xpath = "//div[@class=\"MuiGrid-root MuiGrid-container css-wz0ool\"]/div/p")
	WebElement user;
	
	@FindBy(xpath="((//div[@aria-rowindex=\"3\"])/div/a)[3]")
	WebElement mainID;

	public POM7_Draft() {
		PageFactory.initElements(driver.get(), this);
	}

// Verifying customer name
	@Step("Get customer name")
	public void customerNameVerification() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerNameVerify.isDisplayed(), "Both actual and expected are not same");
			String text_demo = customerNameVerify.getText();
			Thread.sleep(3000);
			Assert.assertEquals(text_demo, "Wizcom_Automate", "Both actual and expected are not same");
		} else {
			Assert.assertTrue(customerNameVerify.isDisplayed(), "Both actual and expected are not same");
			String text_qa = customerNameVerify.getText();
			Thread.sleep(3000);
			Assert.assertEquals(text_qa, "Qa team", "Both actual and expected are not same");
		}
	}

// Click on the draft button
	@Step("Click on the draft button")
	public void clickDarft() throws Exception {
		Assert.assertTrue(draftsBtn.isEnabled(), "Both actual and expected are not same");
		draftsBtn.click();
		Thread.sleep(3000);
	}

// Paste Order Id on the reference Id text box and press enter key
	@Step("Paste Order Id on the reference Id text box and press enter key")
	public void pasteOrderIdOnDrafts() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(referenceIDTextbox1.isDisplayed(), "Both actual and expected are not same");
		Thread.sleep(3000);
		referenceIDTextbox1.click();
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
	}

// Verifying type after click on draft
	@Step("Get Draft Type Status")
	public void getDarftTypeStatus() throws Exception {
		Assert.assertTrue(quote.isDisplayed(), "Both actual and expected are not same");
		String text = quote.getText();
		System.out.println(text);
		Thread.sleep(3000);

	}

// Verify status on draft
	@Step("Get Status on draft")
	public void getStatusOnDraft() throws Exception {
		Assert.assertTrue(draft.isDisplayed(), "Both actual and expected are not same");
		String text = draft.getText();
		Assert.assertEquals(text, "Draft", "Both actual and expected are not same");
		Thread.sleep(3000);
		System.out.println(text);
	}
	
	@Step("Click on main id")
	public void clickmainId() throws Exception {
		Assert.assertTrue(mainID.isEnabled(), "Both actual and expected are not same");
		Thread.sleep(3000);
		mainID.click();
	}

// Verify customer name on draft
	@Step("Get Customer name and verify customer name")
	public void customerNameVerificationOnDraft() throws Exception {
		if (user.getText().equals("DC")) {
			Assert.assertTrue(customerNameVerify.isDisplayed(), "Both actual and expected are not same");
			String text_demo = customerNameVerify.getText();
			Assert.assertEquals(text_demo, "Wizcom_Automate", "Both actual and expected are not same");
			Thread.sleep(3000);
			System.out.println(text_demo);
		} else {
			Assert.assertTrue(customerNameVerify.isDisplayed(), "Both actual and expected are not same");
			String text_qa = customerNameVerify.getText();
			Assert.assertEquals(text_qa, "Qa team", "Both actual and expected are not same");
			Thread.sleep(3000);
			System.out.println(text_qa);
		}
	}

}
