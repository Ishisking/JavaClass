package Day31;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
public static void main(String[] args) {
	
	WebDriver driver42=new ChromeDriver();
	driver42.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver42.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver42.manage().window().maximize();	
	driver42.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click(); //opens dropdown options
	//1) Select Single Option
//	driver42.findElement(By.xpath("//input[@value='Java']")).click();
	//2) Capture all the options and find out size
	List<WebElement> options= driver42.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println("Number of options:"+options.size()); //14
	
	//3) Printing options from the dropdown
	for(WebElement op:options)
	{
		System.out.println(op.getText());
	}
	//4) Selecting multiple options
	for(WebElement op:options)
		{	
			String option=op.getText();
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
			{
				op.click();
			}
		}
}
}
