package Day31;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver42=new ChromeDriver();
	driver42.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver42.get("https://testautomationpractice.blogspot.com/?");
	driver42.manage().window().maximize();	
	WebElement dropCountryEle=driver42.findElement(By.xpath("//select[@id='country']"));
	Select drpCountry=new Select(dropCountryEle);
	//Select options from the dropdown
	//drpCountry.selectByVisibleText("France");
	//drpcountry.selectvisibletextby value
	//drpCountry.selectByValue("japan");
	//drpCountry.selectByIndex(9);
	
	//capture the options from the dropdown
	List<WebElement>options=drpCountry.getOptions();
	System.out.println("Number of options in a dropdown :"+options.size());
	//Printing all the options in the dropdown
/*	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
*/	//Enhanced for Loop
	for(WebElement op:options)
		{
		System.out.println(op.getText());
		}
		
	Thread.sleep(5000);
	driver42.close();
}
}
