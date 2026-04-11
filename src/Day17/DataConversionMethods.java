package Day17;

public class DataConversionMethods 
{	public static void main(String[] args) 
{	// String--->int
	//String s="Welcome";		//cannot convert to int
	//int sint=Integer.parseInt(s);
	String s="123456789";
	int sint=Integer.parseInt(s);
	System.out.println(sint);
	
	String s1="10";
	String s2="20";
	System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	//String--->double
	String t1="10.50";
	String t2="20.50";
	System.out.println(Double.parseDouble(t1)+Double.parseDouble(t2));
	String b="true";
	System.out.println(Boolean.parseBoolean(b));
	String d="welcome";		//Otherthan true if we pass any string it will return false
	System.out.println(Boolean.parseBoolean(d));

	//int,double,boolean,char---->String
	int a=14;
	double e=15.5;
	char c='A';
	boolean bool=true;
	
	String w=String.valueOf(a);		//Integer
	System.out.println(w);
	w=String.valueOf(e);			//double
	System.out.println(w);
	w=String.valueOf(c);			//char
	System.out.println(w);
	w=String.valueOf(bool);			//boolean
	System.out.println(w);
}

}
