package Day10;
//import packagename.classname;  if class belongs
// to some other package
public class EmployeeMain 
{	
	public static void main(String[] args) 
{
		Employee emp1=new Employee();  //object
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Mary";
		emp2.job="Engineer";
		emp2.sal=30000;
		emp2.display();
	

}

}
