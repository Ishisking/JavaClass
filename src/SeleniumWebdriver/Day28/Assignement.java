package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement {
private static final Object Title = null;
private static Object tit;

public static void main(String[] args) {
	WebDriver driver35=new ChromeDriver();
	driver35.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver35.get("https://testautomationpractice.blogspot.com/");
	driver35.manage().window().maximize();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
	driver35.findElement(By.xpath("//input[@type='submit']")).click();
	List<WebElement> links = driver35.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
	System.out.println("Total number of links Available : "+links.size());
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).clear();
	
	// Array of search terms
	String[] searchTerms = {
	    "Selenium",
	    "Selenium in biology",
	    "Selenium (software)",
	    "Selenium disulfide",
	    "Selenium dioxide"
	};

	for (String term : searchTerms) {
	    // Locate search input and enter the term
	    WebElement searchBox = driver35.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	    searchBox.clear();
	    searchBox.sendKeys(term);

	    // Click the search button
	    driver35.findElement(By.xpath("//input[@type='submit']")).click();

	    // Click the result link with exact matching text
	    driver35.findElement(By.xpath("//a[normalize-space()='" + term + "']")).click();
	}
	
	Set<String> windowIDs=driver35.getWindowHandles();
	for(String winId:windowIDs)
	{
		String title=driver35.switchTo().window(winId).getTitle();
		System.out.println(title);
		System.out.println("Window ID : "+winId);
	}
	List<String> windowList=new ArrayList<String>(windowIDs);
	@SuppressWarnings("unused")
	String parentID=windowList.get(0);
	System.out.println("Parent ID : "+parentID);
	@SuppressWarnings("unused")
	String child1ID=windowList.get(1);
	System.out.println("Child1 ID : "+child1ID);
	@SuppressWarnings("unused")
	String child2ID=windowList.get(2);
	System.out.println("Child2 ID : "+child2ID);
	@SuppressWarnings("unused")
	String child3ID=windowList.get(3);
	System.out.println("Child3 ID : "+child3ID);
	@SuppressWarnings("unused")
	String child4ID=windowList.get(4);
	System.out.println("Child4 ID : "+child4ID);
	@SuppressWarnings("unused")
	String child5ID=windowList.get(5);
	System.out.println("Child4 ID : "+child4ID);
	driver35.switchTo().window(child1ID);
	driver35.close();
	driver35.switchTo().window(child2ID);
	driver35.close();
	driver35.switchTo().window(child3ID);
	driver35.close();	
	
/*	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
	driver35.findElement(By.xpath("//input[@type='submit']")).click();
	driver35.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).clear();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium in biology");
    driver35.findElement(By.xpath("//input[@type='submit']")).click();
	driver35.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).clear();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium (software)");
	driver35.findElement(By.xpath("//input[@type='submit']")).click();
	driver35.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).clear();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium disulfide");
	driver35.findElement(By.xpath("//input[@type='submit']")).click();
	driver35.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).clear();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium dioxide");
	driver35.findElement(By.xpath("//input[@type='submit']")).click();
	driver35.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
	driver35.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).clear();
*/

}
}
