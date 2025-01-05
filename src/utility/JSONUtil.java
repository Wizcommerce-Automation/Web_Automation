package utility;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JSONUtil {

    // Method to fetch XPath by key from JSON file
    public static String getXPath(String key) {
        JSONParser parser = new JSONParser();
        try {
            // Parse the JSON file
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("Config/locators.json"));

            // Return the XPath for the key passed
            return (String) jsonObject.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

