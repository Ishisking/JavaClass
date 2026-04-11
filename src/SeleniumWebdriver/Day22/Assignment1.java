package Day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1 {
public static void main(String[] args) {
	WebDriver driver11=new ChromeDriver();
	driver11.get("https://demoblaze.com/");
	driver11.manage().window().maximize();
	boolean logoDisplaystatus=driver11.findElement(By.id("nava")).isDisplayed();
	System.out.println(logoDisplaystatus);
	List<WebElement> headerLinks=driver11.findElements(By.className("nav-item"));
	System.out.println("Total number of Header links : "+headerLinks.size());
	System.out.println("Total number of Header links : "+headerLinks);
	List<WebElement> images=driver11.findElements(By.tagName("img"));
	System.out.println("Total number of images : "+images.size());
	driver11.findElement(By.linkText("page-link")).click();
	driver11.close();
}
}
