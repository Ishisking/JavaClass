package Day7;

public class FindingHowmanyDuplicatesarethereinArray 
{
public static void main(String[] args) 
{
		int a[]= {100,200,100,300,100,400,100,400,200,400,400};
		int num=300;
		int count=0;
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println("No. of Duplicates present are :"+count);
}

}
