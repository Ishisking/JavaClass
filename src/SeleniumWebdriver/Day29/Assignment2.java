package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver40=new ChromeDriver();
	
	driver40.get("https://mypage.rediff.com/login");
	driver40.manage().window().maximize();
	driver40.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	driver40.switchTo().alert().accept();
	
	
	





	Thread.sleep(3000);
	driver40.close();


}
}
