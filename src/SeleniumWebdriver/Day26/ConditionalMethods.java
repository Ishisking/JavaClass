package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
public static void main(String[] args) throws Throwable {
	WebDriver driver26=new ChromeDriver();
	driver26.get("https://demo.nopcommerce.com/register");
	driver26.manage().window().maximize();
	Thread.sleep(5000);
	
	//isDisplayed   verify logo is displayed or not
//	WebElement logo=driver26.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//  System.out.println("Display Status of Logo : "+logo.isDisplayed());
    boolean status=driver26.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println("Display Status of Logo : "+status);

	//isEnabled	will check if the element is operational or not
	boolean status1=driver26.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	System.out.println("Input Box is Enabled : "+status1);
	
	//isSelected used to check the element is selected or not
	WebElement male_rb=driver26.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_rb=driver26.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("Before Selection .................");
	System.out.println(male_rb.isSelected());    //false
	System.out.println(female_rb.isSelected());  //false
	System.out.println("After Selecting Male");
	male_rb.click();
	System.out.println(male_rb.isSelected());    //true
	System.out.println(female_rb.isSelected());  //false
	boolean newsletter=driver26.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	System.out.println("NewsLetter Checkbox Status :"+newsletter);
}
}
