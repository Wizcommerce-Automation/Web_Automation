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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.qameta.allure.Step;

public class BaseTest extends Libraries {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	private static ThreadLocal<String> excelFilePath = new ThreadLocal<>();

	@Parameters({"browserName", "ExcellFile"})
	@BeforeClass
	@Step("Open Browser")
	public void openBrowser(@Optional("chrome")String browserName, @Optional("/ExcelData/wizcom.xlsx")String ExcellFile) throws Exception {
		excelFilePath.set(ExcellFile);
		System.out.println("excelFilePathinBaseClass"+ excelFilePath.get());
		System.out.println("Your OS version -> " + System.getProperty("os.name"));
		String osname = System.getProperty("os.name");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriver localDriver = new ChromeDriver();
			driver.set(localDriver);
		} else if (browserName.toString().equalsIgnoreCase("firefox")) {
			WebDriver localDriver = new FirefoxDriver();
			driver.set(localDriver);
		} else if(browserName.toString().equalsIgnoreCase("edge")){
			WebDriver localDriver = new EdgeDriver();
			driver.set(localDriver);
		}else {
			WebDriver localDriver = new ChromeDriver();
			driver.set(localDriver);
		}
		System.out.println("Browser launched");
		driver.get().get(Libraries.fetchPropertyValue("TestURL").toString());
		System.out.println("URL launched");
		driver.get().manage().window().maximize();
		System.out.println("browser maximized sucessfully");
		Thread.sleep(1000);
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File f = new File(System.getProperty("user.dir")+excelFilePath.get());
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet loginSheet = book.getSheet("Sheet1");
		XSSFRow row1 = loginSheet.getRow(1);
		XSSFCell username = row1.getCell(0);
		XSSFCell password = row1.getCell(1);
		String uname = username.getStringCellValue();
		String pass = password.getStringCellValue();

		WebElement emailId = driver.get().findElement(By.xpath("//input[@id='login_email']"));

		emailId.sendKeys(uname);
		WebElement passcode = driver.get().findElement(By.xpath("//input[@id='login_password']"));
		passcode.sendKeys(pass);
	   

		WebElement loginBtn = driver.get().findElement(By.xpath("//button[@id='login_submit']"));
		loginBtn.click();

	}
	
	
	public String getDataFromExcell(int i, int j) throws IOException {
		System.out.println("ExcellFilePath: " + excelFilePath.get());
	    File f = new File(System.getProperty("user.dir") + excelFilePath.get());
		FileInputStream fis = new FileInputStream(f);
		try (XSSFWorkbook book = new XSSFWorkbook(fis)) {
			XSSFSheet loginSheet = book.getSheet("Login_Data");
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell col = row.getCell(j);
			String value = col.getStringCellValue();
			return value;
		} catch(Exception error) {
			System.out.println("Excell Data Fetching Error"+error.getMessage());
			return "Excell Data is Null: "+ error.getMessage();
		}
		
	}


	@AfterClass
	@Step("Close Browser")
	public void closeBrowser() throws Exception {
		try {
			WebDriver localDriver = driver.get(); 
            Thread.sleep(5000); 
            localDriver.quit();
			// driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("browser closed");
	}

}
