package Day24;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice3 {
public static void main(String[] args) {
	WebDriver driver18=new ChromeDriver();
	driver18.get("https://demo.nopcommerce.com/");
	driver18.manage().window().maximize();	
	
//Relative XPath with OPerator
//	driver18.findElement(By.xpath("//input[@placeholder='Search store' and @aria-label='Search store']")).sendKeys("T-Shirts");
//	driver18.findElement(By.xpath("//input[@placeholder='Search step' or @aria-label='Search store']")).sendKeys("T-Shirts");
//Relative XPath with Single Attribute
//	driver18.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("T-Shirts");
//Relative XPath with Multiple attribute	
//	driver18.findElement(By.xpath("//input[@placeholder='Search store'][@aria-label='Search store']")).sendKeys("T-Shirt");
//XPath with text()
	driver18.findElement(By.xpath("//a[text()='Build your own computer']")).click();
//	driver18.findElement(By.xpath("//strong[normalize-space(text())='News']")).click();

//	driver18.findElement(By.xpath("//a[text()='Register']")).click();
//	driver18.findElement(By.xpath("//a[text()='Log in']")).click();
	//xpath with text()l
//	driver1.findElement(By.xpath("//*[text()='MacBook']")).click();
	//driver1.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).click();
//driver1.findElement(By.xpath("//input[@placeholder='Search for a company'][@aria-label='Search for a company']")).sendKeys("REC Ltd");
//driver1.findElement(By.xpath("//input[@placeholder='Search for a company']")).sendKeys("bajaj finance");
//driver1.findElement(By.xpath("//a[text()='Screens']")).click();
/*boolean displaystatus=driver1.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();)
System.out.println(displaystatus);
String value=driver1.findElement(By.xpath("//h3[text()='Featured']")).getText();
System.out.println(value);*/


}
}
