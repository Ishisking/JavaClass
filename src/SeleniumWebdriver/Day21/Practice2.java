package Day21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Practice2 {
public static void main(String[] args) {
	        // Set the path for Edge WebDriver if necessary
	        // System.setProperty("webdriver.edge.driver", "path_to_edgedriver");
	        
	        // Initialize Edge WebDriver
	        WebDriver wd5 = new EdgeDriver();
	        
	        // Open the website
	        wd5.get("https://www.screener.in/");
	        
	        // Maximize the browser window
	        wd5.manage().window().maximize();
	        
	        // Get and print the page title
	        String act_title = wd5.getTitle();
	        System.out.println("Site Title :" + act_title);
	        
	        // Validate the title
	        if (act_title.equals("Stock Screener and fundamental analysis tool for Indian stocks - Screener")) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        // Close the browser
	        wd5.close();
	    


}

}
