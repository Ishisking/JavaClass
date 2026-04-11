package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver43=new ChromeDriver();
	driver43.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver43.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	driver43.manage().window().maximize();	
	
	//Login Steps
	driver43.findElement(By.name("username")).sendKeys("Admin");
	driver43.findElement(By.name("password")).sendKeys("admin123");
	driver43.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	//Clicking on PIM
	driver43.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click(); //PIM

	//Clicked on dropdown
	driver43.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
	Thread.sleep(5000);
	//Count Number of Options
		List<WebElement> options=driver43.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
		System.out.println("Number of Options :"+options.size());
		//Printing Options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	// Select single option
	driver43.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
	
	Thread.sleep(5000);
	driver43.close();
}
}
