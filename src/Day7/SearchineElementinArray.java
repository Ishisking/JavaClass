package Day7;

public class SearchineElementinArray 
{

	public static void main(String[] args) 
{
		int a[]= {10,20,30,40,50};
		int search_element=30;
		boolean status=false;	//false-not found   true-found
	/*for(int i=0; i<a.length;i++)		//NORMAL FOR LOOP
		{
			if(a[i]==search_element)
			{
			System.out.println("Element Found:"+a[i]);
			status=true;
			break;
			} 
		}	if(status==false)
			{
				System.out.println("Element Not Found");
			}	*/
		for(int x:a)		//ENHANCED FOR LOOP
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element Not Found");
		}
			
		
}

}
