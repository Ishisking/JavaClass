package Day6;
/*
1) Declare an array
2) Add values into array
3) Find size of an array
4) Read single value from an array
5) Read multiple values from an array
 */
public class TwoDimensionalArray 
{

	public static void main(String[] args) 
{
	//Declaring Array
		//Approach 1
/*		 int a[][]=new int[3][2];		//3 rows 2 columns
		//int [][]a=new int[3][2];
		//	int []a[]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		//Approach 2]
	//	int a[][]= { {100,200}, {300,400}, {500,600} };
		 int a[][]= { {100,200},
					  {550,400}, 
					  {500,900} };
		// Find size of an array
		System.out.println("length of rows"+a.length);
		System.out.println("length of columns:"+a[0].length);
		
		//Read single value from an array
	//	System.out.println(a[2][1]);   //600

	/*	// Normal for Loop
		for(int r=0;r<=2;r++)  //rows 0 1 2				for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=1;c++)   //columns 0 1		for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.println(a[r][c]);	//100 200
			}
			
		}	*/
		//Enhanced ForLoop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x+"   ");
			}
			System.out.println();
		}
}

}
