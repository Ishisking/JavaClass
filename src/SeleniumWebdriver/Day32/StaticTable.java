package Day32;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver47=new ChromeDriver();
	driver47.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver47.get("https://testautomationpractice.blogspot.com/");
	driver47.manage().window().maximize();
	
	//1) Find total number of rows in a table
	
	int rows=driver47.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //Preferred if multiple tables are in webpage
//	int rows=driver47.findElements(By.tagName("tr")).size(); //Preferred if there is Single Table in the Web page
	System.out.println("Number of Rows :"+rows);

	//2)Find No. of Columns in a table
	
	int columns=driver47.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println("No. of Columns : "+columns);
	
	//3) Read data from specific row and column (eg: 5th row and 1st Column)
	String bookName=driver47.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	System.out.println(bookName);
	
	//4) Read All the data from all the rows and columns
/*	for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=columns; c++)
		{
			String value=driver47.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+"\t");
		}// Passing Dynamic Values in xpath
		System.out.println();
	}
	//Print Header First and then Read Data from all the rows and columns
	System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"\t"+"Price"+");   //Header
	for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=columns;c++)
		{
			String value=driver47.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+"\t");
		}// Passing Dynamic Values in xpath
		System.out.println();
	}
*/	//5) Print Book Names whose author is Mukesh
	for(int r=2;r<=rows;r++)
	{
		String authorName=driver47.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		//System.out.println(authorName);
		if(authorName.equals("Mukesh"))
		{
		String BookName=driver47.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();	
		System.out.println(BookName+"\t"+"\t"+authorName);
		}
		}
	//6) Find total price of all the books
	int sum=0;
	for(int r=2;r<=rows;r++)
	{
		String price=driver47.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		int rate = Integer.parseInt(price); // Convert string to integer
		sum=sum+rate;
	}
	System.out.println("Total Price of Books :"+sum);
	Thread.sleep(1000);
	driver47.close();
	

}
}
