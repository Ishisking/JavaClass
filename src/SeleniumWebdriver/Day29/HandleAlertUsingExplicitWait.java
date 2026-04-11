package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle Alert without using switchTo().alert()
//By Using explicit wait
public class HandleAlertUsingExplicitWait {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver37=new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver37,Duration.ofSeconds(10)); //Explicit wait
	//driver37.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver37.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver37.manage().window().maximize();
	driver37.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	Thread.sleep(3000);
	Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
	System.out.println(myalert.getText());
	myalert.accept();
	









Thread.sleep(3500);
driver37.close();

}
}
