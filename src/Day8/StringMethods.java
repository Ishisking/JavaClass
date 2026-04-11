package Day8;

import java.util.Arrays;

public class StringMethods 
{
public static void main(String[] args) 
{
														//String s="Welcome";
														//String s=new String("Welcome");
														//System.out.println(s);
// length()--returns length of a string(number of characters)
	//String s="welcome";
	String s=new String("Welcome");
	int l=s.length();
	System.out.println(s);						//Welcome
	System.out.println(s.length());				//7
	System.out.println(l); 						//7
	System.out.println("Welcome".length());		//7
	
	// Concat--Joining two or more Strings
	String s1="Welcome";
	String s2="to Java";
	String s3=" Automation";
	System.out.println(s1+s2);						      //Welcome to java
	System.out.println(s1.concat(s2));				     //Welcome to java
	System.out.println(s1+s2+s3);      				    //Welcome to java automation
	System.out.println(s1.concat(s2).concat(s3));	   //Welcome to java automation
	System.out.println(s1.concat(s2+s3));		 	  //Welcome to java automation
	System.out.println("Welcome "+"to java");  	     //Welcome to java
	System.out.println("Welcome".concat(" to java")); //Welcome to java
	System.out.println("******Trim Method****");
	//trim()-remove spaces right and left side
	s="   Welcome   ";
	System.out.println("Before Trimming length of s:"+s.length());		//13
	System.out.println(s);	//Print along with spaces
	System.out.println(s.trim());
	System.out.println("After Trimming length of s is:"+s.trim().length());		//7
		//charAt()-- returns a character from a string based on index
		//Index starts from 0
	s="Welcome";
	System.out.println(s.charAt(3)); 		 //c
	System.out.println(s.charAt(0));		 //W
	
//contains()--returns true or false i.e booloean value
	//Checks string is part of main string or not
	//string values are case sensitive
	//In contains methods sequence of characters being searched should be same and not scrambled
	System.out.println(s.contains("Wel"));	//true
	System.out.println(s.contains("come"));  //true
	System.out.println(s.contains("wel"));  //false as W is in lower case and string values are case sensitive
	System.out.println(s.contains("COME"));  //	false
	
	//equals(), equalsIgnoreCase() -- compare strings
	s1="welcome";
	s2="welcome";
	
	System.out.println(s1==s2);								//true
	System.out.println(s1.equals(s2));  				    //true
	System.out.println(s1.equals("Welcome"));				//false
	System.out.println(s1.equalsIgnoreCase("Welcome"));     //true
	
	//replace() --this method will replace single or multiple (sequence) of characters in a string
	s="welcome to selenium java selenium python selenium c# selenium javascript";
	System.out.println(s);
	System.out.println(s.replace('s','j'));
	//System.out.println(s.replace('e','j'));
	System.out.println(s.replace("selenium","Automation with"));
	
	//substring()--extract substring from the main string
	//starting index starts with -- 0
	//ending index starts with -- 1
	s="Selenium";
	System.out.println(s.substring(1,5));	//elen
	System.out.println(s.substring(0,3));   //sel
	System.out.println(s.substring(0,1));	//s
	System.out.println(s.charAt(0));        //s
	System.out.println(s.substring(3,8));    //enium
	//toUpperCase()   toLowerCase()
	s="Welcome";
	System.out.println(s.toUpperCase());		//WELCOME
	System.out.println(s.toLowerCase());		//welcome
	//split()-split the string into multiple parts based on delimeter
	s="abc@gmail.com";
	String a[]=s.split("@");
	System.out.println(Arrays.toString(a));    //[abc,gmail.com]
	System.out.println(a[0]);	//abc
	System.out.println(a[1]);	//gmail.com
	System.out.println("\n@"+a[1]);	//@gmail.com
	//Example 1:-
	String amount="$15,20,55";	//Expected Output:- 152055
	
	System.out.println(amount.replace("$"," "));	//15,20,55
	System.out.println(amount.replace("$"," ").replace(",",""));	//152055
	// Example 2:-
	s1="abc,123@xyz";		// output=abc   123    xyz
	System.out.println(s1.replace(",","").replace("@",""));	//abc123xyz
	String arr1[]=s1.split(",");  
	System.out.println(Arrays.toString(arr1));	//[abc,123@xyz]
	String arr2[]=arr1[1].split("@");  //123  xyz
	System.out.println(Arrays.toString(arr2));	//[123, xyz]
	System.out.println(arr1[0] +arr2[0] +arr2[1]);  // abc123xyz
	System.out.println(arr1[0]);	//abc
	System.out.println(arr2[0]);	//123
	System.out.println(arr2[1]);	//xyz
	//Example 3:-
	String c="abc 123";
	String cs[]=c.split(" ");
	System.out.println(Arrays.toString(cs));
	//  * % ^ & ( ) -    These symbols cannot be used as delimeters
	
	//Example 4:-
	String name="Ishan Nashine";
	System.out.println(name.contains("nashine"));	//false	
	System.out.println(name.replace("I","i").contains("ishan"));  //true
	System.out.println(name.toLowerCase().contains("ishan"));		//true
	
	String s9="abcaabbccabcaabbcccabc";
	System.out.println(s9);
	System.out.println(s9.replace('a', 'x').replace('b','y').replace('c','z'));
	System.out.println(s9.replace('c','y'));
}

}
