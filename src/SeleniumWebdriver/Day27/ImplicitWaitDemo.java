package Day27;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWaitDemo {
public static void main(String[] args) {
		WebDriver driver29=new ChromeDriver();
		
		driver29.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver29.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver29.manage().window().maximize();
		driver29.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver29.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver29.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//driver29.close();













}
}
