package Day9;

public class StringVsStringBufferVsStringBuilder 
{
public static void main(String[] args) 
{
	//String - immutable
	String s="welcome";
	s.concat("to java");
	System.out.println(s);  //immutable, cannot change original value of s
	
	//stringBuffer - mutable
	StringBuffer t=new StringBuffer("welcome");
	t.append("to java world");
	System.out.println(t);	//welcome to java world //mutable- we can change original value
	
	//StringBuilder - mutable
	StringBuilder o= new StringBuilder("Welcome to");
	o.append("java programming");
	System.out.println(o);  //welcome to java proogramming //mutable - we can change

}

}
