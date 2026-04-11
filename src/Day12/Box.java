package Day12;

public class Box 
{	double width,height,depth;
	Box()		//1
	{
	/*	width=0;
		height=0;
		depth=0;
		
	*/	width=height=depth=25;
	}
	Box(double w, double h, double d)	//2
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(double len) 	//3
	{
		width=height=depth=len;
	}
	Box(double l,double b, int d)	//4
	{
		width=l;
		height=b;
		depth=d;
	}
	Box(double area, double h)			//5
	{
		width=depth=area;
		height=h;
	}
	double volume()
	{
		return(width*height*depth);
	}
	double basearea()
	{
		return(width*depth);
	}
	double totalsurfacearea()
	{
		return(2*(width+depth)*height);
	}
}
