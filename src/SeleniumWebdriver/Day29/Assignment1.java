package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver39=new ChromeDriver();
		driver39.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver39.get("https://testautomationpractice.blogspot.com/?");
		driver39.manage().window().maximize();
		driver39.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver39.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver39.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver39.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver39.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
	/*	for (int i=8;i<=12;i++)
		{
		   driver39.findElement(By.xpath("(//input[@type='checkbox'])[" +i "]")).click();
		}	*/
		Thread.sleep(2000);
		driver39.close();
}
}
