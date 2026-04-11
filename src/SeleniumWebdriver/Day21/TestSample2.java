package Day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/* Test Case
 * 1)Launch Browser (Chrome)
 * 2) Open URL https://demo.nopcommerce.com
 * 3) Validate title should be "nopCommerce demo store" 
 * 4) Close page		 */
public class TestSample2 {
public static void main(String[] args) {
		//1)Launch Browser (Chrome)
		WebDriver wd4=new FirefoxDriver();
		//2) Open URL https://demo.nopcommerce.com
		wd4.get("https://demo.nopcommerce.com/");
		//3) Validate title should be "nopCommerce demo store"
		String act_title=wd4.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test Passed");
		} else
		{
			System.out.println("Test Failed");
		}
		//Close page
		wd4.close();


}
}
