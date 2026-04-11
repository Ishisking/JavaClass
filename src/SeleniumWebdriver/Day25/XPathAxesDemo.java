package Day25;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class XPathAxesDemo {
public static void main(String[] args) {
	WebDriver driver125=new ChromeDriver();
	driver125.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver125.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver125, Duration.ofSeconds(10));
WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Atul Ltd.')]")));	
	//Self-selects the current node
	String text=driver125.findElement(By.xpath("//a[contains(text(),'Atul Ltd.')]")).getText();
	System.out.println("Self :"+ text);  //Atul Ltd.
	
	//parent-Select the parent of the current node(always One)
text=driver125.findElement(By.xpath("//a[contains(text(),'Atul Ltd.')]/parent::td")).getText(); 
	//there is no text for parent, so it is
	System.out.println("parent :"+text);    //Atul Ltd.
	
	//child-Selects all children of the current node(One or many)
List<WebElement> childs=driver125.findElements(By.xpath("//a[contains(text(),'Atul Ltd.')]/ancestor::tr/child::td"));
System.out.println("Number of child elements:"+childs.size()); //5	

//Ancestor-Selects all ancestors (parent, grandmother, etc)
text=driver125.findElement(By.xpath("//a[contains(text(),'Atul Ltd.')]/ancestor::tr")).getText();
System.out.println("Ancestors :"+text);

//Descendant- Selects all descendants (children,grandchildren etc) of the current node
List<WebElement> descendants=driver125.findElements(By.xpath("//a[contains(text(),'Atul Ltd.')]/ancestor::tr/descendant::*"));
System.out.println("Number of descendants nodes :"+descendants.size());  //7

//Following- Selects everything in the document after the closing tag of the current node
List<WebElement>followingnodes = driver125.findElements(By.xpath("//a[contains(text().'Atul Ltd.')]/ancestor::tr/following::tr"));
System.out.println("Number of following noodes :"+followingnodes.size());  //267

//Preceding - Selects all nodes that appear before the current node in the document
List<WebElement> precedings=driver125.findElements(By.xpath("//a[contains(text(),'Atul Ltd.')]/ancestor::tr/preceding::tr"));
System.out.println("Number of preceding nodes:"+precedings.size());  //31

//Following-sibling:Selects all siblings after the current node
List<WebElement> followingsiblings=driver125.findElements(By.xpath("//a[contains(text(),'Atul Ltd.')]/ancestor::tr/following-sibling::tr"));
System.out.println("Number of following Siblings :"+followingsiblings.size());  //265"
	
//Preceding-sibling	-Selects all siblings before the current node
List<WebElement> precedingsiblings=driver125.findElements(By.xpath("//a[contains(text(),'Atul Ltd.')]/ancestor::tr/preceding-sibling::tr"));
System.out.println("Number of preceding sibling nodes :"+precedingsiblings.size());//30"
	
		driver125.quit();
}

}
