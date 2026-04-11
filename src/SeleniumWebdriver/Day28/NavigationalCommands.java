package Day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver32=new ChromeDriver();
	driver32.get("https://demo.nopcommerce.com/"); //accepts URL only in the string format
	driver32.manage().window().maximize();
	driver32.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	URL myurl=new URL("https://testautomationpractice.blogspot.com/");
	driver32.navigate().to(myurl);
	driver32.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver32.navigate().back();
	System.out.println(driver32.getCurrentUrl());
	driver32.navigate().forward();
	System.out.println(driver32.getCurrentUrl());
	driver32.navigate().refresh();
	//driver32.close();
	
	
	
	
	
	
}
}
