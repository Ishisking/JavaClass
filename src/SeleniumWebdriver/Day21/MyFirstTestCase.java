package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.bidi.BiDi;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.SocketException;
/* Test Case
 * 1)Launch Browser (Chrome)
 * 2) Open URL https://demo.opencart.com
 * 3) Validate title should be "Your Store" 
 * 4) Close Browser		 */
public class MyFirstTestCase {
public static void main(String[] args) {
	//1)Launch Browser (Chrome)
	//ChromeDriver wd=new ChromeDriver();
	WebDriver wd=new ChromeDriver();
	//WebDriver wd=new FirefoxDriver();
	//2) Open URL https://demo.opencart.com
	wd.get("https://demo.opencart.com/");
	//3) Validate title should be "Your Store" 
	String act_title=wd.getTitle();
	if(act_title.equals("Your Store"))
	{
		System.out.println("Test Passed");
	} else
	{
		System.out.println("Test Failed");
	}
	// 4) Close Browser
	//wd.close();
	wd.quit();
}

}
