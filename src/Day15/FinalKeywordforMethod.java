package Day15;
final 	class Test1
{
 final void m()
	{
		System.out.println("This is m Method from Test1...");
	}
}
class Test2 extends Test1 //incorrect as we cannot extend final class
{
	void m()	//incorrect because m() is final method
	{
		System.out.println("This is m Method from Test2...");
	}
}
public class FinalKeywordforMethod 
{
public static void main(String[] args) 
{
	Test2 t2=new Test2();
	t2.m();
	
}

}
