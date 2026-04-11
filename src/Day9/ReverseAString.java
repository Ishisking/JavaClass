package Day9;

public class ReverseAString 
{
public static void main(String[] args) 
{
	// Approach 1	-- length()  , charAt()
	String a="automation";    //String a=new String("automation");
	String rev="";
	for(int i=a.length()-1; i>=0;i--)
	{
	rev=rev+a.charAt(i);
		
	}
	System.out.println(rev);
	
	//Approach 2 - without using string methods
	String b="welcome";
	String reve="";
	char c[]=b.toCharArray();		// VIMP String to Array Conversion
	for(int i=c.length-1;i>=0;i--)
	{
		reve=reve+c[i];
	}
System.out.println("\n 1 Reverse String is : "+reve);
	//Approach 3 -Using StringBuffer Class
	StringBuffer d=new StringBuffer("Selenium");
	System.out.println(d);
	System.out.println("Reverse String is : "+d.reverse());	
	//Approach 4 - Using StringBuilder Class
	StringBuilder s=new StringBuilder("welcome");
	System.out.println("\n 2 Reverse String is : "+s.reverse());
}

}
