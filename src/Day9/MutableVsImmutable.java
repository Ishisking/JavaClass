package Day9;

import java.util.Arrays;

public class MutableVsImmutable 
{
public static void main(String[] args) 
{		//mutable - we can change
	int a[]= {20,10,40,50,30};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);		//mutable	- we can change
	System.out.println(Arrays.toString(a));
	
	//immutable 
	String s=new String("welcome");			//object
	System.out.println(s);			//welcome
	String concatstrings=s.concat("to Java");
	System.out.println(s);  		//welcome  -->immutable - we cannot change
    System.out.println(concatstrings);		//welcome to java
    
}

}
