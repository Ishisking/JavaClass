package Day20;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args) {
	//Declaration
	ArrayList mylist=new ArrayList();
	List mylist1=new ArrayList();//Child class object(mylist) can hold parent class variable
	ArrayList <Integer>mylist2=new ArrayList<Integer>(); //ArrayList can hold only Integer type of data
	ArrayList <String>mylist3=new ArrayList<String>();  //ArrayList can hold only String type of data
//	ArrayList <Employee>mylist4=new ArrayList<Employee>(); //ArrayList can store only Employee type of objects.
//Suppose we have Employee class in which emp1, emp2, emp3...objects are there and we want to store all these objects 
//into single entity then we can specify them
//**ArrayList can hold objects type of data** it can be predefined or user defined objects
//if we want to store numbers then we have to mention corresponding WRAPPER class (Integer)
	          //-------Adding Data into ArrayList----------------
	mylist.add(100);
	mylist.add(15.5);
	mylist.add("Welcome");
	mylist.add('A');
	mylist.add(true);
	mylist.add(null);
	mylist.add(100);
	mylist.add(null);
	mylist.add(null);
	mylist.add(500);
	mylist.add(-10.5);
	mylist.add(314);
	//Size of ArrayList
	System.out.println("Size of an ArrayList :"+mylist.size());
	//Printing ArrayList
	System.out.println("Printing data from ArrayList :"+mylist);
	//Remove a element from arraylist
	mylist.remove(6);  //01234567891011
	System.out.println("Size of an ArrayList :"+mylist.size());
	System.out.println("Printing Data from ArrayList After Removing :"+mylist);
	//Insert element in the arraylist
//Add method will add value at the end of the list but if we want to add data in the middle of the list then follow steps 
	mylist.add(6,1111);
	System.out.println("Size of an ArrayList :"+mylist.size());
	System.out.println("Printing data from ArrayList After Inserting :"+mylist);
	//Modify the element in the ArrayList
	mylist.add(4,"Java");
	mylist.add(5,null);
	System.out.println("Size of an ArrayList :"+mylist.size());
	System.out.println("After insertion :"+mylist);
	//(Modify/Replace/Change)
	mylist.set(5,"Selenium");
	System.out.println("Size of an ArrayList :"+mylist.size());
	System.out.println("After Modifying/Replacing :"+mylist);
	
	//Access specific element from ArrayList
	System.out.println(mylist.get(5));
	
	//Reading all the elements from ArrayList
	//Using normal for loop
	System.out.println("\n");
/*	for(int i=0; i<mylist.size();i++)
	{
		System.out.println(mylist.get(i));
	}
*/	//using Enhance For Loop
/*	for(Object j:mylist)
	{
		System.out.println(j);
	}
*/   // Using iterator
Iterator it=mylist.iterator(); //we are storing the object(iterator()) in a variable and that object type is iterator(it)
//so before getting the data check if data exists or not
	//hasNext() method will go to the next element of the array in the iteration and check the existing element
// So by combining the hasNext() and next() methods we will retrieve the elements from the ArrayList
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
//Checking ArrayList is empty or not
	System.out.println("\n Is ArrayList empty? "+mylist.isEmpty());
//Remove all the elements from the arrayList
	ArrayList mylist6=new ArrayList();
	mylist6.add(100);
	mylist6.add("Welcome");
	
	mylist.removeAll(mylist6);
//The above method is used to remove selected random elements(mylist6) from the ArrayList(mylist)
//remove(index)--used to remove a particular element from the ArrayList
//clear()-- used to remove all the elements from the ArrayList
	mylist.clear();
	System.out.println("Is ArrayList Empty? :"+mylist.isEmpty());
	
}

}
