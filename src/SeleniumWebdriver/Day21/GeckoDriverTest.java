package Day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GeckoDriverTest {
public static void main(String[] args) {
	//Set the path to geckodriver - C:\Selenium browser Drivers\geckodriver-v0.35.0-win64
System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser Drivers\\geckodriver.exe");
//create a new instance of the geckoDriver
	WebDriver wd1=new FirefoxDriver();
	//Navigate to any site
	wd1.get("http://www.google.com");

}

}
