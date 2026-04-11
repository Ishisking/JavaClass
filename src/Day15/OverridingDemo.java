package Day15; // in overriding only implementation part should be changed and not the declaration part
class Bank
{
	double roi()		//Declaration part
	{
		return 0;		//Implementation part
	}
}
class ICICI extends Bank
{	
	double roi()
	{
		return 10.5;
	}
}
class SBI extends Bank
{
	double roi()
	{
		return 15.5;
	}
}
public class OverridingDemo 
{
	
public static void main(String[] args) 
{
	ICICI ic=new ICICI();
	System.out.println(ic.roi());
	SBI sb=new SBI();
	System.out.println(sb.roi());
	
}

}
