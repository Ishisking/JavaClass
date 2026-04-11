package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
public static void main(String[] args) throws Throwable{
	WebDriver driver27=new ChromeDriver();	
	driver27.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
	driver27.manage().window().maximize();
	driver27.findElement(By.linkText("OrangeHRM, Inc")).click();
	Thread.sleep(10000);
	//driver27.close();
	driver27.quit();

}
}
