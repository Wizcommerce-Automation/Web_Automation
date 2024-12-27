//package generic;
//
//import java.io.File;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.google.common.io.Files;
//
//import io.qameta.allure.Allure;
//import io.qameta.allure.Attachment;
//
//public class AllureListener extends BaseTest implements ITestListener {
//
////	@Override
////	public void onTestFailure(ITestResult result) {
////
////		System.out.println("Failed Test");
////		try {
////			allureCaptureScreenshotForFailedTest();
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////	}
////
////	public void allureCaptureScreenshotForFailedTest() throws Exception {
////		Date d = new Date();
////		String timeDateStamp = d.toString().replace(":", "_").replace(" ", "_");
////		System.out.println(timeDateStamp);
////		TakesScreenshot ts = (TakesScreenshot) driver;
////		File src = ts.getScreenshotAs(OutputType.FILE);
////		File des = new File("C:\\Users\\DELL\\eclipse-workspace\\WizCommerce\\Screenshot\\Screenshot_" + timeDateStamp + ".png");
////		Files.copy(src, des);
////		Allure.addAttachment("abcd", FileUtils.openInputStream(des));
////	}
//
//	private static String getTestMethodName(ITestResult iTestResult) {
//		return iTestResult.getMethod().getConstructorOrMethod().getName();
//	}
//
//	@Attachment(value = "Page Screenshot", type = "image/png")
//	public byte[] saveScreenshotPNG(WebDriver driver) {
//		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	}
//	
//	@Override
//	public void onTestFailure(ITestResult iTestResult) {
//		System.out.println("Failed Test");
//		Object testClass= iTestResult.getInstance();
//
//				if(driver instanceof WebDriver) {
//					System.out.println("ss");
//					saveScreenshotPNG(driver);
//				}
//	}
//}