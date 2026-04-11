package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver45=new ChromeDriver();
	driver45.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver45.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	driver45.manage().window().maximize();
	driver45.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver45.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver45.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	driver45.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
	driver45.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
	Thread.sleep(5000);
	driver45.findElement(By.xpath("//span[normalize-space()='Full-Time Permanent']")).click();
	
	Thread.sleep(5000);
    driver45.close();
}
}
