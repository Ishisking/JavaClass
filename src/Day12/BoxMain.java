package Day12;

public class BoxMain 
{
public static void main(String[] args) 
{
//Box b=new Box(); //1
//Box b=new Box(10.5,15.5,5.0); //2
	Box b=new Box(10.5);//3
	System.out.println(b.volume());
	Box b1=new Box(11.5,5.5);
	System.out.println(b1.volume());
	System.out.println(b1.basearea());
	System.out.println(b1.totalsurfacearea());
	Box b2=new Box();
	System.out.println(b2.volume());
	System.out.println(b2.basearea());
	System.out.println(b2.totalsurfacearea());
}

}
