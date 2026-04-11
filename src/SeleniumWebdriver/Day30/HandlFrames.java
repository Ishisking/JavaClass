package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver41=new ChromeDriver();
	driver41.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver41.get("https://ui.vision/demo/webtest/frames/");
	driver41.manage().window().maximize();
	//Frame 1
	WebElement frame1=driver41.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver41.switchTo().frame(frame1);
	driver41.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
	//Frame2
	driver41.switchTo().defaultContent(); //Go Back to Page
	WebElement frame2=driver41.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver41.switchTo().frame(frame2);
	driver41.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("This is Ishaan");
	//Frame3
	driver41.switchTo().defaultContent();
	WebElement frame3=driver41.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver41.switchTo().frame(frame3);
	driver41.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is called automation");
	//Frame4
	driver41.switchTo().defaultContent();
	WebElement frame4=driver41.findElement(By.xpath("//frame[@src='frame_4.html']"));
	driver41.switchTo().frame(frame4);
	driver41.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("This is called switching frames");
	//frame5
	driver41.switchTo().defaultContent();
	WebElement frame5=driver41.findElement(By.xpath("//frame[@src='frame_5.html']"));
	driver41.switchTo().frame(frame5);
	driver41.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Welcome To Automation World");
	driver41.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
	
	driver41.switchTo().defaultContent();    //Go back to default page
	
	driver41.switchTo().frame(frame3);
	driver41.findElement(By.xpath("//input[@name='mytext3']")).clear();
	driver41.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("IshisKing");
	//Inner iframe - Part of frame 3
	driver41.switchTo().frame(0);
	driver41.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
	driver41.findElement(By.xpath("//div[@id='i27']//div[@class='uHMk6b fsHoPb']")).click();
	WebElement buttonEle=driver41.findElement(By.xpath("//span[normalize-space()='Choose']"));
	Select button=new Select(buttonEle);
	//Select options from the dropdown
	button.selectByVisibleText("Yes");
	Thread.sleep(3000);
	driver41.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	driver41.findElement(By.xpath("//input[@type='text']")).sendKeys("It is an Awesome Journey Learning Automation");
	driver41.findElement(By.xpath("//textarea[@aria-label='Your answer']")).sendKeys("We have to pass username and password along with the URL itself  this process is Injection process");
	Thread.sleep(4000);
	driver41.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
	
	Thread.sleep(8000);
	driver41.close();
	
}
}
