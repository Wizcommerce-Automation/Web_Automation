package generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

import test.Test001_Login_Logout;

public class Listener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stud
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stud
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED TEST");
		try {
			captureScreenshotForFailedTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stud
	}

	// for capturing screenshot with date and time stamp if any test case got failed
	public void captureScreenshotForFailedTest() throws Exception {
		Date d = new Date();
		String timeDateStamp = d.toString().replace(":", "_").replace(" ", "_");
		System.out.println(timeDateStamp);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("Screenshot\\Screenshot_" + timeDateStamp + ".png");
		Files.copy(src, des);
	}

}
