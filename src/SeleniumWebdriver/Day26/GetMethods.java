package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
public static void main(String[] args) throws Throwable {
	WebDriver driver25=new ChromeDriver();	
	//get(url) - opens the url on the browser
	driver25.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver25.manage().window().maximize();
//getTitle() - returns title of the page
	System.out.println(driver25.getTitle());
//getCurrentUrl() - returns URL of the page
	System.out.println(driver25.getCurrentUrl());
//getPageSource() - returns source code of the page
	//System.out.println(driver25.getPageSource());
//getWindowHandle() - returns ID of the single Browser window
	//System.out.println(driver25.getWindowHandle());
//	String windowid=driver25.getWindowHandle();
	//System.out.println("Window ID : "+windowid);
//getWindowHandles() - returns ID's of the multiple browser windows
	driver25.findElement(By.linkText("OrangeHRM, Inc")).click();  //this will open new browser window
	Set<String> windowids=driver25.getWindowHandles();
	System.out.println(windowids);
	
}
}
