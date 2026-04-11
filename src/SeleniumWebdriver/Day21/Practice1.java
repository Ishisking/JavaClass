package Day21;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Practice1 {
public static void main(String[] args) {
	WebDriver wd5=new ChromeDriver();
	wd5.get("https://www.screener.in/");
	wd5.manage().window().maximize();
	String act_title=wd5.getTitle();
	System.out.println("Site Title :"+act_title);
	if(act_title.equals("Stock Screener and fundamental analysis tool for Indian stocks - Screener"))
	{
		System.out.println("Test Passed");
	} else
	{
		System.out.println("Test Failed");
	}
  	
	wd5.close();
	
}

}
