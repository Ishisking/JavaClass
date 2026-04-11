package Day23;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) {
	WebDriver driver15=new ChromeDriver();
	driver15.get("https://www.screener.in/");
	//driver15.get("https://www.blazemeter.com/");
	driver15.manage().window().maximize();
	//boolean logoDisplayStatus = driver15.findElement(By.cssSelector("img[alt='Screener logo']")).isDisplayed();
	//System.out.println(logoDisplayStatus);
	//boolean logoDisplaystatus=driver15.findElement(By.id("block-blazemeter-branding")).isDisplayed();
	//		System.out.println(logoDisplaystatus);		
		
	//tag and id combination   syntax:- tag#id
//	driver15.findElement(By.cssSelector("div#edit-actions input")).sendKeys("Selenium");

//driver15.findElement(By.cssSelector("div#edit-actions")).sendKeys("Selenium");
		// without tagname id
//		driver1.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
	   // tag and class         syntax:- tag.classname i.addon 
	//driver15.findElement(By.cssSelector("i.addon "));
		//driver15.findElement(By.cssSelector("a.nav-link"));
		
	//	List<WebElement> links=driver1.findElements(By.cssSelector(".sublist-toggle"));
	//	System.out.println("Total number of links : "+links.size());
		
		//tag attribute   tag[attribute='value']
	//driver1.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
	//driver1.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
	//driver1.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
	WebElement searchBox = driver15.findElement(By.cssSelector("input[placeholder='Search for a company']"));
	searchBox.click();  // Click before typing
	searchBox.sendKeys("PCBL Chemical Ltd");

	
		//tag class attribute	tag[attribute='value']
	//driver1.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
	 //driver1.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Books");
	//	driver15.close();
//.alt("Screener logo")).isDisplayed();
}
}
