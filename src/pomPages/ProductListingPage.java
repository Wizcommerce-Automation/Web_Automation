package pomPages;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class ProductListingPage extends BaseTest {
	
	@FindBy(xpath="(//div[@id='scroll_div-0'])/parent::div//div[text()='Add to cart']")
	List<WebElement> addtoCart;
	
	@FindBy(xpath="//p[normalize-space()='All Variants']")
	WebElement allVariantsSidebar;
	
	@FindBy(xpath="(//p[normalize-space()='All Variants']/parent::div//*[local-name()='svg'])[1]")
	WebElement crossButton;
	
	@FindBy(xpath="//p[normalize-space()='Customize product']")
	WebElement customizeSidebar;
	
	@FindBy(xpath="(//p[normalize-space()='Customize product']/parent::div/parent::div//*[name()='svg'])[3]")
	WebElement customizeSidebarCloseButton;
	
	@FindBy(xpath="//span[normalize-space()='Category']")
	WebElement categoryFilter;
	
	@FindBy(xpath="//input[@value='67a7d906-01bf-4bb7-be6e-6d1e61682349']")
	WebElement furniture;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement applyButton;
	
	public ProductListingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() throws InterruptedException {
		int n = 100;
		int count = 1;
		Thread.sleep(2000);
		categoryFilter.click();
		furniture.click();
		applyButton.click();
		int size = addtoCart.size();
		int extraLength = 0;
		for(int i=0; i<n; i++) {
			addtoCart.get(i).click();
			Thread.sleep(1000);
			System.out.println(addtoCart.size()-extraLength+" "+ (size-i-1));
			if(addtoCart.size()-extraLength == size-i-1 || i==size-1) {
				if(i==size-1) {
					i=0;
					driver.findElement(By.xpath("//div[@id='root']//button[contains(text(), \""+(++count)+"\")]"));
				}
			}
			else {
				try {
					if(allVariantsSidebar.isDisplayed()) {
						extraLength+=2;
						crossButton.click();
					}
				}catch(Exception e) {
					System.out.println("There is no variants");
				}
				try {
					if(customizeSidebar.isDisplayed()) {
						extraLength+=2;
						customizeSidebarCloseButton.click();
//						driver.findElement(By.xpath("//button[normalize-space()='Discard']")).click();
					}
				}catch(Exception error) {
					System.out.println("There is no CustomizeSidebar");
				}
			}
		}
	}
	
}
