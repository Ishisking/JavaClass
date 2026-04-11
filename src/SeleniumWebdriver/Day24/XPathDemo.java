package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
public static void main(String[] args) {
	WebDriver driver1=new ChromeDriver();
	//driver1.get("https://demo.nopcommerce.com/");
	driver1.get("https://www.demo.opencart.com/");
	//driver1.get("https://www.screener.in/");
	driver1.manage().window().maximize();
	
	//Relative XPath with single attribute
//	driver1.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("apparel");
	//Relative XPath with Multiple attribute	
//driver1.findElement(By.xpath("//input[@placeholder='Search store'][@aria-label='Search store']")).sendKeys("apparel");

//XPath with and operator
//driver1.findElement(By.xpath("//input[@placeholder='Search store' and @aria-label='Search store'] ")).sendKeys("apparel");
//driver1.findElement(By.xpath("//input[@placeholder='Search store' or @aria-label='Search store'] ")).sendKeys("apparel");	

//xpath with text()
//	driver1.findElement(By.xpath("//*[text()='MacBook']")).click();
	//driver1.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).click();
//driver1.findElement(By.xpath("//input[@placeholder='Search for a company'][@aria-label='Search for a company']")).sendKeys("REC Ltd");
//driver1.findElement(By.xpath("//input[@placeholder='Search for a company']")).sendKeys("bajaj finance");
//driver1.findElement(By.xpath("//a[text()='Screens']")).click();
/*boolean displaystatus=driver1.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();)
System.out.println(displaystatus);
String value=driver1.findElement(By.xpath("//h3[text()='Featured']")).getText();
System.out.println(value);
*/
	//xpath with contains()   --Search
//	driver1.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
	//xpath with start with()
//	driver1.findElement(By.xpath("//input[start-with@placeholder,'Sea')]")).sendKeys("Tshirts");
	//chained xpath
	//boolean imagestatus=driver1.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
//	System.out.println(imagestatus);
	
}
}
