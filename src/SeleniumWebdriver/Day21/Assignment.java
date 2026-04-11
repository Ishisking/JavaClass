package Day21;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/* Test Case
 * 1)Launch Browser (Chrome)
 * 2) Open URL https://demo.nopcommerce.com
 * 3) Validate title should be "nopCommerce demo store" 
 * 4) Close page		 */
public class Assignment {
public static void main(String[] args) {
	//1)Launch Browser (Chrome)
	WebDriver driver=new ChromeDriver();
	//2) Open URL https://demo.nopcommerce.com
	driver.get("https://demo.nopcommerce.com/");
	//3) Validate title should be "nopCommerce demo store"
	String act_title=driver.getTitle();
	if(act_title.equals("nopCommerce"))
	{
		System.out.println("Test Passed");
	} else
	{
		System.out.println("Test Failed");
	}
	//Close page
	driver.close();
}
}
