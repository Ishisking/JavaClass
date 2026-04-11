package Day21;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsample1 {
public static void main(String[] args) {
        // Launch Chrome browser
	        WebDriver wd3 = new ChromeDriver();
	        
	        // Maximize window
	        wd3.manage().window().maximize();
	        
	        // Navigate to Google
	        wd3.get("https://www.google.com");
	        
	        // Locate search box and enter search query
	        WebElement searchBox = wd3.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium WebDriver");
	        searchBox.sendKeys(Keys.RETURN); // Press Enter key
	        
	        // Wait for results to load and click on the first result
	        WebElement firstResult = wd3.findElement(By.xpath("(//h3)[1]"));
	        firstResult.click();
	        
	        // Print the title of the new page
	        System.out.println("Page Title: " + wd3.getTitle());
	        
	        // Close the browser
	        wd3.quit();


	}

}
