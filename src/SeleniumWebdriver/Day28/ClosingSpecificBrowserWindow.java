package Day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {
public static void main(String[] args) {
	WebDriver driver34=new ChromeDriver();
	driver34.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver34.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver34.manage().window().maximize();
	driver34.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowIDs=driver34.getWindowHandles();
	for(String winId:windowIDs)
	{
		String title=driver34.switchTo().window(winId).getTitle();
		System.out.println(title);
		if(title.equals("Human Resources Management Software | OrangeHRM HR Software") || title.equals("some other title"))
		{
			driver34.close();
		}	
		
	}



}
}
