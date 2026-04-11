package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class Assignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver44=new ChromeDriver();	
	driver44.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver44.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver44.manage().window().maximize();
	//Clicked on dropdown
driver44.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(5000);
	//Count Number of Options
			List<WebElement> options=driver44.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
			System.out.println("Number of Options :"+options.size());
	//Printing Options
			for(WebElement op:options)
			{
				System.out.println(op.getText());
			}
		// Select single option
		driver44.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();


}
}
