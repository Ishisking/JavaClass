package Day5;

public class BreakStatement
{

	public static void main(String[] args)
{
		for(int i=1; i<=10;i++)
		{
		if(i==5)
		{
			break;
		}
		System.out.println(i);
		} 
	System.out.println("\n New loop");
		for(int j=1; j<=10;j++) 
		{
		if(j==5)
		{
			continue;
		} System.out.println(j);
		}	
		System.out.println("\n New loop");
		for(int k=1; k<=10;k++) 
		{
		if(k==3 || k==5 || k==9)
		{
			continue;
		} System.out.println(k);
		}	
}

}
