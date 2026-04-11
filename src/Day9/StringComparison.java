package Day9;

public class StringComparison 
{
public static void main(String[] args) 
{
	//Scenario 1	//variable
	String s1="welcome";
	String s2="welcome";
	System.out.println(s1==s2);			//true
	System.out.println(s1.equals(s2));		//true
																						System.out.println(" Scenario 2 ");
		//Scenario 2		//objects
	String s3=new String("welcome");
	String s4=new String("welcome");
	System.out.println(s3);			//welcome
	System.out.println(s4);			//welcome
	System.out.println(s3==s4);		//false	//== used to compare the objects
	System.out.println(s3.equals(s4));	//true  //.equals() is used to compare values of objects	
	//when you create the strings as an objects we can see the difference
	//when you create the strings as an variable you will not see the difference
																						System.out.println(" Scenario 3 ");
		//Scenario 3
	String s5="abc";
	String s6=new String("abc");
	System.out.println(s5==s6);		//variable is different from object so FALSE
	System.out.println(s5.equals(s6));	//OBJECTS in string are same so TRUE
																						System.out.println(" scenario 4 ");
	//Scenario 4
	String s7="abc";
	String s8=new String("abc");
	String s9=s8;
	System.out.println(s7==s8);	//FALSE
	System.out.println(s7.equals(s8));  //TRUE
																						System.out.println("     ");
	System.out.println(s8==s9);   //true	bcoz objects are same/equal
	System.out.println(s8.equals(s9));  //true 
																							System.out.println("  ");
	System.out.println(s7==s9);  //FALSE
	System.out.println(s7.equals(s9));   //true
}

}

