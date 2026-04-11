package Day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class FirstTestCaseRunning {
public static void main(String[] args) {
	        // 1) Set up Chrome WebDriver
	   //   System.setProperty("webdriver.chrome.driver", "C:\\Selenium browser Drivers\\chromedriver-win64\\chromedriver.exe"); // Change path

	        // 2) Launch Browser
	        WebDriver wd = new ChromeDriver();

	        // 3) Maximize window and set implicit wait
	        wd.manage().window().maximize();
	        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	        // 4) Open URL
	      //  wd.get("https://demo.opencart.com/");
	        wd.get("https://demo.opencart.com/");
	        // 5) Validate title
	        String act_title = wd.getTitle();
	        if (act_title.equals("Your Store")) {
	            System.out.println("Test Passed ✅");
	        } else {
	            System.out.println("Test Failed ❌ - Actual Title: " + act_title);
	        }

	        // 6) Close browser properly
	        wd.quit();

}
}
