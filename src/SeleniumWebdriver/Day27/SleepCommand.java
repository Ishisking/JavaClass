package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver28=new ChromeDriver();
	driver28.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver28.manage().window().maximize();
	Thread.sleep(5000);
	driver28.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver28.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver28.findElement(By.xpath("//button[normalize-space()='Login']")).click();








}
}
