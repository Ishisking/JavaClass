package Day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice {
public static void main(String[] args) {
		WebDriver driver16=new ChromeDriver();
		driver16.get("https://www.screener.in/");
		driver16.manage().window().maximize(); //maximize the browser window
		//Relative XPath with OPerator
driver16.findElement(By.xpath("//input[@aria-label='Search for a company' and @placeholder='Search for a company']")).sendKeys("PCBL Chemical Ltd");
//		driver16.findElement(By.xpath("//input[@placeholder='Search step' or @aria-label='Search store']")).sendKeys("T-Shirts");
		
	


}
}
