package Day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample6 {
public static void main(String[] args) {
	        // Initialize the WebDriver
	        WebDriver driver1 = new ChromeDriver();

	        // Open the website
	        driver1.get("https://www.screener.in/");

	        // Get the title of the website
	        String title = driver1.getTitle();
	        System.out.println("Website Title: " + title);

	        // Close the browser
	        driver1.quit();
}

}
