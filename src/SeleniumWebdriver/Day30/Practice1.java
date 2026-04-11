package Day30;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Practice1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver42=new ChromeDriver();
	driver42.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver42.get("https://ui.vision/demo/webtest/frames/");
	driver42.manage().window().maximize();	
//Access radio buttons through Javascript if xpath method does not work
	WebElement frame3=driver42.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver42.switchTo().frame(frame3);
	driver42.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is called automation");
	
	driver42.switchTo().frame(0);
	WebElement rdbutton=driver42.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
	JavascriptExecutor js=(JavascriptExecutor)driver42;
	js.executeScript("arguments[0].click();", rdbutton);
	WebElement rdbutton1=driver42.findElement(By.xpath("//div[@id='i27']//div[@class='uHMk6b fsHoPb']"));
	JavascriptExecutor js1=(JavascriptExecutor)driver42;
	js.executeScript("arguments[0].click();", rdbutton1);
	Thread.sleep(5000);
	
	
	driver42.close();
	
	
	
}
}
