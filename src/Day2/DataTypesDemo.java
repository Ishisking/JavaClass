package Day2;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		//Numeric data types
		int a=100, b=200;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		System.out.println("The sum of a and b is:"+a+b);
		System.out.println("The sum of a and b is:" +(a+b));

		byte by=125;
		System.out.println(by);
		
		short sh=32250;
		System.out.println(sh);
		
		long ln=222229925;
		System.out.println(ln);
		
		long l=21213123123L;	//l- Literal is needed-->L/l
		System.out.println(l);
		
		//Decimal numbers -- float,double
		float item_price=15.55F;	//Literal is needed-->F/f
		System.out.println(item_price);
		double dbl=1234.43434321;
		System.out.println(dbl);
		
		char grade='A';
		System.out.println(grade);
		
		String name="Ishan";
		System.out.println(name);
		
	   // char ch='ABC';                                    Invalid
	 //   String ch='ABC';                                  Invalid
	   // String ch='A';										Invalid
		   String ch="A"; 								//Valid
		   
		   boolean bl=true;		//boolean allows only true or false
		   System.out.println(bl);
		   boolean bln=false;
		   System.out.println(bln);
	
		  // boolean bn="true";		//Invalid as true is in double quotes which implies it is a string which cannot be stored in boolean variable
		   // String bw=true;       //Invalid as it is a boolean variable
		   String bw="true";		//valid
		   System.out.println(bw);
	}
}


