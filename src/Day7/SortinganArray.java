package Day7;

import java.util.Arrays;

public class SortinganArray
{

	public static void main(String[] args) 
{
		int a[]= {100,600,200,400,500};
		
		System.out.println("Before Sorting....");
		System.out.println(Arrays.toString(a));			//[100,600,200,400,500]
	/*	for(int value:a)
		{
			System.out.println(value);
		}	*/
		
		Arrays.sort(a);		//sort elements in array
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));     // [100,600,200,400,500]

}
}
