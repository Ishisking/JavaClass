package Day7;

import java.util.Arrays;

public class AssignementFindMissingNumber 
{
public static void main(String[] args) 
{
int a[]= {1,4,5,3};
System.out.println("Array before Sorting :"+Arrays.toString(a));
Arrays.sort(a);		//sort elements in array
System.out.println("Array After Sorting :"+Arrays.toString(a));
	for(int i=a[0];i<=a[a.length-1];i++)
{
	boolean found=false;
	for(int num:a)
	{	
		if(num==i)
		{
			found=true;
			break;
		}
	} 
		if(!found)
		{
		System.out.println(i +" is the Missing Number");
		}
}
}

}
