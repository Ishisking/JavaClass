package Day23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practiceprogram {
public static void main(String[] args) {
	WebDriver driver15=new ChromeDriver();
	driver15.get("https://www.mnru.ac.in/");
	//driver15.get("https://creativecrows.com/");
	//driver15.get("https://demo.nopcommerce.com/");
	driver15.manage().window().maximize();
	// without tagname id  NNNnNNN
//	driver1.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
	
   // tag and class         syntax:- tag.classname 
//	driver15.findElement(By.cssSelector("span.elementor-button-content-wrapper")).click();

/*	List<WebElement> links=driver15.findElements(By.linkText("CSE"));
	System.out.println("Total number of links : "+links.size());
	System.out.println("Links : "+links);		*/

/*
	List<WebElement> links=driver15.findElements(By.linkText("FREE SEO AUDIT"));
	System.out.println("Total number of links : "+links.size());
	System.out.println("Links : "+links);
*/	List<WebElement> links=driver15.findElements(By.linkText("Overview"));
	System.out.println("Total number of links : "+links.size());
	System.out.println("Links : "+links);

	//tag attribute   tag[attribute='value']
//driver1.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
//driver1.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
//driver1.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
 //WebElement searchBox = driver15.findElement(By.cssSelector("input[placeholder='Search for a company']"));
//searchBox.click();  // Click before typing
//searchBox.sendKeys("PCBL Chemical Ltd");


	//tag class attribute	tag[attribute='value']
//driver1.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
 //driver1.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Books");
//	driver15.close();


}
}
