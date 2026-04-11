package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicPaginationTable {
public static void main(String[] args) throws InterruptedException {
	  // Step 1: Create ChromeOptions object
    ChromeOptions options = new ChromeOptions();

    // Step 2: Add incognito mode
    options.addArguments("--incognito");
    // (Optional) Disable Chrome password manager popup
    options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
        put("credentials_enable_service", false);
        put("profile.password_manager_enabled", false);
    }});
	WebDriver driver49=new ChromeDriver();	
	driver49.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver49.get("https://www.ecomdeveloper.com/demo/admin/index.php");
	driver49.manage().window().maximize();
	driver49.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demoadmin");
	driver49.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demopass");
	driver49.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	driver49.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
	driver49.findElement(By.xpath("//ul[@id='collapse8']//a[contains(text(),'Customers')]")).click();
	
	
	Thread.sleep(5000);
	driver49.close();
	
}
}
