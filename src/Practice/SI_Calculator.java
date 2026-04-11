package Practice;
import java.util.Scanner;
public class SI_Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Enter values
		System.out.println("Enter Principal amount");
		int P=sc.nextInt();
		System.out.println("Enter time period");
		int T=sc.nextInt();
		System.out.println("Enter rate of interest");
		int R=sc.nextInt();
		int SI=P*T*R/100;
		//System.out.println("The simple interest is:",+SI);
		 System.out.println("The simple interest is: " + SI);
		sc.close();

	}

}
