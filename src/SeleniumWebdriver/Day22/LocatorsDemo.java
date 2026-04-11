package Day22;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsDemo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://creativecrows.com/");
	//driver.get("https://ntpc.co.in/");
	//driver.get("https://www.screener.in/");
	driver.manage().window().maximize();
	//name locator
	//driver.findElement(By.name("search")).sendKeys("Mac");
	//id
	boolean logoDisplaystatus=driver.findElement(By.id("pi-all")).isDisplayed();
	//boolean logoDisplaystatus=driver.findElement(By.id("large-footer")).isDisplayed();
	System.out.println(logoDisplaystatus);
	
	//linktext & partial link text
	//driver.findElement(By.linkText("products.php")).click();
	
	//driver.findElement(By.linkText("View More")).click();
	//driver.findElement(By.linkText("Screens")).click();
	//driver.findElement(By.partialLinkText("")).click();
	//driver.findElement(By.linkText("Products")).click();
	//driver.findElement(By.linkText("Our Client")).click();
	
	//class name
	List<WebElement> headerLinks=driver.findElements(By.className("pi-row-block"));
	System.out.println("Total number of Header links : "+headerLinks.size());
	
	//Tagname
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links : "+links.size());
	
/*	WebElement dropdown = driver.findElement(By.id("pi-all")); // Replace with actual ID
	Select select = new Select('About Us');
	select.selectByVisibleText("Our Team");
	*/List<WebElement> images=driver.findElements(By.tagName("img"));
	System.out.println("Total number of images : "+images.size());
	//int linkCount = driver.findElements(By.tagName("a")).size();
	//System.out.println("Total number of links on the webpage: " + linkCount);

	//driver.findElement(By.linkText("Our Client")).click();
	//driver.findElement(By.linkText("FREE SEO AUDIT")).click();

	driver.close();
}

}
