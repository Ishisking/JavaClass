package Day32;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver48 = new ChromeDriver();
		driver48.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver48.get("https://blazedemo.com/");
		driver48.manage().window().maximize();

	}
}
