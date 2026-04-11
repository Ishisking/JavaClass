package Day18;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptions {
public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	System.out.println("Program started......");
	System.out.println("Program in Progress....");
	Thread.sleep(5000);
	
	FileInputStream fis=new FileInputStream("C:\\TEXT.TXT");
	
/*	try 
	{
	Thread.sleep(5000);	
	}
	catch(InterruptedException e)
	{
		System.out.println(e.getMessage());
	}
*/	System.out.println("Program finished....");
	System.out.println("Program Exited....");
	
}
}