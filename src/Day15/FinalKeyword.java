package Day15;
class Test
{
	final int x=100;
	int y=200;
}
public class FinalKeyword 
{
public static void main(String[] args) 
{
	Test t=new Test();
	//t.x=250;	//incorrect because x is final variable
	System.out.println(t.x);
	System.out.println(t.y);
	t.y=1000;    //correct as y is not final variable
	System.out.println(t.y);
	
}

}
