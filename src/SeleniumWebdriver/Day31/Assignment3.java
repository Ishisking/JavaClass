package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver46=new ChromeDriver();
	driver46.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver46.get("https://www.bjs.com/");
	driver46.manage().window().maximize();
	driver46.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("water");  //SearchBox
	Thread.sleep(5000);
	
	List<WebElement> choices=driver46.findElements(By.xpath("//div[@data-cnstrc-item-section=\"Search Suggestions\"]"));
	System.out.println(choices.size());
	for(int i=0;i<=choices.size();i++)
	{
		System.out.println(choices.get(i).getText());
		if(choices.get(i).getText().equals("water"))
		{
			choices.get(i).click();
			break;
		}
	}
	Thread.sleep(5000);
	driver46.close();

}
}
