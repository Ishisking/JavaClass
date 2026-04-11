package Day13;
/*
public class ThisKeyword 
{	int x,y;	//Class variables/Instance variables
	ThisKeyword(int a,int b)
	{	x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
public static void main(String[] args) 
{
	ThisKeyword th=new ThisKeyword(100,200);
	th.display();
}}	*/
/*	public class ThisKeyword
{
		int x,y;	//Class Variables/Instance Variables
		ThisKeyword(int x,int y)
		{
			this.x=x;	//this.x here x belongs to the class variable
			this.y=y;	//this.y here y belongs to the class variable
		}
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
		public static void main(String args[])
{		ThisKeyword th=new ThisKeyword(100,200);
		th.display();
	}	}   */
public class ThisKeyword
{
	int x,y;	//Class Variables/Instance Variables

	void setData(int a,int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[])
{		ThisKeyword thk=new ThisKeyword();
	thk.setData(10,20);
	thk.display();
}	} 	
