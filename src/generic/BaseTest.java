package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.qameta.allure.Step;

public class BaseTest extends Libraries {

	public static WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	@Step("Open Browser")
	public void openBrowser(String browserName) throws Exception {

		System.out.println("Your OS version -> " + System.getProperty("os.name"));
		String osname = System.getProperty("os.name");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.toString().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if(browserName.toString().equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		System.out.println("Browser launched");
		driver.get(Libraries.fetchPropertyValue("TestURL").toString());
		System.out.println("URL launched");
		driver.manage().window().maximize();
		System.out.println("browser maximized sucessfully");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		File f = new File("C:\\Users\\heman\\eclipse-workspace\\Wizcom_WebAutomation\\ExcelData\\wizcom.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet loginSheet = book.getSheet("Sheet1");
		Object testData[][] = new Object[1][2];
		XSSFRow row1 = loginSheet.getRow(1);
		XSSFCell username = row1.getCell(0);
		XSSFCell password = row1.getCell(1);
		String uname = username.getStringCellValue();
		String pass = password.getStringCellValue();

		WebElement emailId = driver.findElement(By.xpath("//input[@id='login_email']"));

		emailId.sendKeys(uname);
		WebElement passcode = driver.findElement(By.xpath("//input[@id='login_password']"));
		passcode.sendKeys(pass);
	   

		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login_submit']"));
		loginBtn.click();

	}

	@AfterClass
	@Step("Close Browser")
	public void closeBrowser() throws Exception {
		try {
			Thread.sleep(5000);
			driver.quit();
			// driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("browser closed");
	}

}
