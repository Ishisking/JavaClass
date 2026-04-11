package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
@SuppressWarnings("null")
public static void main(String[] args) throws Throwable {
	WebDriver driver27=new ChromeDriver();
	driver27.get("https://testautomationpractice.blogspot.com/");
	driver27.manage().window().maximize();
	Thread.sleep(5000);
	//get methods
	System.out.println(driver27.getCurrentUrl());
	System.out.println(driver27.getTitle());
	//System.out.println(driver27.getPageSource());
	//System.out.println(driver27.getWindowHandle());
	String id=driver27.getWindowHandle();
	System.out.println("window id : "+id);
	//driver27.findElement(By.linkText("Apple")).click();
	//Thread.sleep(5000);
	//Set<String> id1=driver27.getWindowHandles();
//	System.out.println("Window ids : "+id1);
	//Thread.sleep(5000);
	//driver27.close();
	//conditional methods
	boolean gui=driver27.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed();
	System.out.println("GUI is displayed : "+gui);
	boolean st=driver27.findElement(By.xpath("//input[@id='name']")).isEnabled();
	System.out.println("Input box is Enabled :"+st);
	WebElement male=driver27.findElement(By.xpath("//input[@id='male']"));
	WebElement female=driver27.findElement(By.xpath("//input[@id='female']"));
	System.out.println("Before Selection .................");
	System.out.println(male.isSelected());    
	System.out.println(female.isSelected());  
	System.out.println("After Selecting Male");
	male.click();
	System.out.println(male.isSelected());    //true
	System.out.println(female.isSelected());  //false

	WebElement monday=driver27.findElement(By.xpath("//input[@id='monday']"));
	monday.click();
	System.out.println("Weekday Monday is Selected :"+monday);
	
	


}
}
