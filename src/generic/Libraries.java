package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Libraries {
	
	public static WebDriver driver;

	public static String fetchPropertyValue(String key) throws Exception {

		Properties p = new Properties();

		File f = new File("Config/Data");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
		return (String) p.get(key);
	}

}
