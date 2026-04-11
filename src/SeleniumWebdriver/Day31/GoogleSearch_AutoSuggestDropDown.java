package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver46=new ChromeDriver();
	driver46.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver46.get("http://www.google.com");
	driver46.manage().window().maximize();
	driver46.findElement(By.name("q")).sendKeys("selenium");  //SearchBox
	Thread.sleep(5000);
	
	List <WebElement> list=driver46.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	System.out.println(list.size());
	for(int i=0;i<=list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("selenium"))
		{
			list.get(i).click();
			break;
		}
	}
	Thread.sleep(5000);
	driver46.close();

}
}
