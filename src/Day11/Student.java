package Day11;

public class Student
{
	int sid;			//Class Variables
	String sname;	//Can be accessed everywhere
	char grad;
	
	void printStudentData()
	{
		System.out.println(sid+"   "+sname+"    "+grad);
	}
	
	void setStudentData(int id, String name, char gr)
	{				  //Local Variables only locally used
		sid=id;			// in this method
		sname=name;
		grad=gr;
	}
	Student(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
}
