package Day11;

public class GreetingsMain 
{
public static void main(String[] args) 
{
	Greetings gr=new Greetings();		//gr is object
	gr.m1();		//1
	
/*	String s=gr.m2();		//2
	System.out.println(s);  */
	
	System.out.println(gr.m2());   //2
	
	gr.m3("john");	   //3
	
/*	String r=gr.m4("sachin");		//4
	System.out.println(r);			*/
	System.out.println(gr.m4("Abhiti"));
}
}
