package Day19;
//Upcasting -- Converting value from smaller to larger
// 										int---->long
//									   Float--->Double
//Downcasting -- Converting the value from larger to smaller
//											long------>int
//											Double----->Float
public class TypeCastingConcept {
public static void main(String[] args) {
	//upcasting is automatic ----- smaller to larger
	int intvalue=100;
	long longvalue=intvalue;
	System.out.println(longvalue);

	float floatvalue=10.5F;
	double doublevalue=floatvalue;
	//Downcasting is not automatic ----- Larger to Smaller
	long longvariable=11111;
	int intvariable=(int)longvariable;
	System.out.println(intvariable);
	double doublevariable=125.55;
	float floatvariable=(float)doublevariable;
	System.out.println(floatvariable);
	//Example 1
	int i=111;
	double d=i; 	//upcasting
	System.out.println(d); 	//111.0
	
	//	Example 2
	double b=10.5;
	int a=(int)b;	//downcasting
	System.out.println(a);
	
	
	
	}

}
