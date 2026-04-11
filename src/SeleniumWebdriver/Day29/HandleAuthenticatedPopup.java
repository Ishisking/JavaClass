package Day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver38=new ChromeDriver();
	driver38.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver38.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	driver38.manage().window().maximize();	
	Thread.sleep(2000);
	driver38.close();
}
}
