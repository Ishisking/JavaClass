package Day6;
/*
1) Declare an array
2) Add value into an array
3) Find length of an array
4) Read single value from an array
5) Read multiple values from an array
 */
public class SingleDimensionalArray 
{

	public static void main(String[] args) 
{
//declaring an array
		//Approach  1   (when we know the number of variables are fixed)
		
/*		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;	*/
		
		//Approach 2 (more dynamic and can be changed in future)
		
	int a[]= {100,200,300,400,500};
		
	//Find length of an array
	System.out.println("Length of the above declared arrray: "+a.length);
		
	// Read single value from an array
	System.out.println("\n"+a[4]+"\n");   ////here 4 is index
	
	//	Reading all the values from an array
	//Normal for Loop
/*	for(int i=0;i<a.length;i++) 			//i<=4/i<5/i<=a.length-1/i<a.length
	{
		System.out.println(a[i]);    //100,200,300,400,500
	}
*/		//Enhanced for Loop/for..each loop
	for(int x:a)
	{
		System.out.println(x);
	}
	
}

}
