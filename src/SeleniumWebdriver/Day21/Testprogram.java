package Day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.bidi.BiDi;
public class Testprogram {

	public static void main(String[] args) {
	

		//public class FirefoxBiDiExample {
		//    public static void main(String[] args) {
		        // Set up the GeckoDriver path
		        System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser Drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");

		        // Enable WebDriver BiDi
		        FirefoxOptions options = new FirefoxOptions();
		        options.setCapability("webSocketUrl", true);  // Enable BiDi communication

		        // Start the WebDriver session
		        WebDriver driver = new FirefoxDriver(options);
		        
		        // Open a webpage
		        driver.get("https://www.google.com");

		        // Print the title of the page
		        System.out.println("Page Title: " + driver.getTitle());

		        // Close the browser
		        driver.quit();
	

}

}
