package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//name locator
		//driver.findElement(By.name("search")).sendKeys("Mac");
		//id
		boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplaystatus);
		//linktext & partial link text
		driver.findElement(By.linkText("Products")).click();
		
	}

}
