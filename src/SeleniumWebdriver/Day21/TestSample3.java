package Day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestSample3 {
public static void main(String[] args) {
			// Launch Chrome browser
	        WebDriver wd5 = new ChromeDriver();
	        
	        // Navigate to the website
	        wd5.get("https://creativecrows.com/");
	        
	        // Get and print the title of the webpage
	        String pageTitle = wd5.getTitle();
	        System.out.println("Website Title: " + pageTitle);
	        
	        // Close the browser
	        wd5.quit();
}
}
