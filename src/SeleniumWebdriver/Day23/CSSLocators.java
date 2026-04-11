package Day23;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
public static void main(String[] args) {
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://demo.nopcommerce.com/");
	driver1.manage().window().maximize(); //maximize the browser window
	//tag and id combination   syntax:- tag#id
	//driver1.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	// without tagname id
//	driver1.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
	
   // tag and class         syntax:- tag.classname
//	driver1.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
	//driver1.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
	
	List<WebElement> links=driver1.findElements(By.cssSelector(".sublist-toggle"));
	System.out.println("Total number of links : "+links.size());
	
	//tag attribute   tag[attribute='value']
//driver1.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
//driver1.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
//driver1.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
	
	//tag class attribute	tag[attribute='value']
driver1.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
 //driver1.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Books");
	driver1.close();

}
}
