package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver36=new ChromeDriver();
	driver36.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver36.get("https://testautomationpractice.blogspot.com/");
	driver36.manage().window().maximize();
	
	//1) Select specific checkbox
//	driver36.findElement(By.xpath("//input[@id='sunday']")).click();
	//2) Select all the checkboxes
	List<WebElement> checkboxes=driver36.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
/*	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	for(WebElement checkbox:checkboxes)
	{
	checkbox.click();
	}
*/	//3) How to select only selected checkboxes
	//Total no of checkboxes= how many checkboxes want to be selected=starting index
/*	for(int i=2;i<checkboxes.size()-3;i++)
	{
		checkboxes.get(i).click();
	}
	//4) unselect checkboxes if they are selected
*/	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}
	Thread.sleep(3000);
/*	for(int i=0;i<checkboxes.size()-4;i++)
	{
		checkboxes.get(i).click();
	}	*/
	for(int i=0;i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
		}
	}


}
}
