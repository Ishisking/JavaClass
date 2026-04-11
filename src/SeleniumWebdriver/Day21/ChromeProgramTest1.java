package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Test Case
 * 1)Launch Browser (Chrome)
 * 2) Open URL https://demo.opencart.com
 * 3) Validate title should be "Your Store" 
 * 4) Close Browser		 */
public class ChromeProgramTest1 {
public static void main(String[] args) {
		//1)Launch Browser (Chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver wd2=new ChromeDriver();
	
		//2) Open URL https://demo.opencart.com
		wd2.get("https://demo.opencart.com/");
		//3) Validate title should be "Your Store" 
		String act_title=wd2.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		} else
		{
			System.out.println("Test Failed");
		}
		// 4) Close Browser
		//wd.close();
		wd2.quit();
	

}

}
