package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver36=new ChromeDriver();
	driver36.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver36.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver36.manage().window().maximize();
/*	//1)Normal Alert with OK button
	driver36.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	Thread.sleep(2000);
	//driver36.switchTo().alert().accept();
	Alert myalert=driver36.switchTo().alert();
	System.out.println(myalert.getText());
	myalert.accept();
	//2) conformation Alert OK & Cancel
*/	driver36.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	Thread.sleep(3500);
	driver36.switchTo().alert().dismiss(); // Close alert using Cancel button
//	driver36.switchTo().alert().accept();  //Close alert using OK button
/*	Alert myalert1=driver36.switchTo().alert();
	System.out.println(myalert1.getText());
	myalert1.dismiss();	
*/	//3) Prompt Alert having Input Box
	driver36.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	Thread.sleep(3000);
	Alert myalert2=driver36.switchTo().alert();
	myalert2.sendKeys("Welcome");
	driver36.switchTo().alert().accept();
	Thread.sleep(10000);
	driver36.close();









}
}
