package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
public static void main(String[] args) {
	WebDriver driver33=new ChromeDriver();
	driver33.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver33.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //OrangeHRM
//	driver33.get("https://www.orangehrm.com/"); //Human Resources Management Software | OrangeHRM HR Software
	driver33.manage().window().maximize();
//	driver33.findElement(By.linkText("OrangeHRM, Inc")).click();
	driver33.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowIDs=driver33.getWindowHandles();
	//now how to differentiate the parent pageid and child page id
	//Approach 1:- Convert this set collection to List collection
	List<String> windowList=new ArrayList<String>(windowIDs);
	@SuppressWarnings("unused")
	String parentID=windowList.get(0);
	@SuppressWarnings("unused")
	String childID=windowList.get(1);
	//Here why we have converted set into List collection?
//If we have set collection we cannot extract individual items that is the reason we have converted set collection into list collection
	//System.out.println(driver33.getTitle());
	//Switch to child Window
/*	driver33.switchTo().window(childID);
	System.out.println(driver33.getTitle());
	System.out.println(childID);
	driver33.switchTo().window(parentID);
	System.out.println(driver33.getTitle());
	System.out.println(parentID);
*/	//Approach 2
	for(String winId:windowIDs)
	{
		String title=driver33.switchTo().window(winId).getTitle();
		if(title.equals("OrangeHRM"))
		{
			System.out.println(driver33.getCurrentUrl());
		}	//some validation on the parent window
		
	}
	
	
	
	

}
}
