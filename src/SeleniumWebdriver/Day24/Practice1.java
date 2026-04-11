package Day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice1 {
public static void main(String[] args) {
	WebDriver driver17=new ChromeDriver();
	driver17.get("https://creativecrows.com/");
	driver17.manage().window().maximize();
	//Relative XPath with Single Attribute
	//XPath with text()
		//driver17.findElement(By.xpath("//span[text()='What We']")).click();
		
		//driver17.findElement(By.xpath("//*[normalize-space(text())=' Designing']")).click();
	//driver17.findElement(By.xpath("//h3[normalize-space(text())='Designing']")).click();
		driver17.findElement(By.xpath("//h3[normalize-space(text())='Testing']")).click();
		
}

}
