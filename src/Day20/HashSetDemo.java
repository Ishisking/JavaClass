package Day20;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetDemo {
public static void main(String[] args) {
	//Declaration
	HashSet myset=new HashSet();
	//Set myset=new HashSet();
	//homogeneous data
	//HashSet <String>myset=new HashSet<String>();
//Adding elements into the HashSet
	myset.add(100);
	myset.add(11.11);
	myset.add(null);
	myset.add(null);
	myset.add(100);
	myset.add(400);
	myset.add(true);
	myset.add('A');
	myset.add("welcome");
	//Printing HashSet 
	System.out.println(myset);
	//Size of HashSet
	System.out.println(myset.size());
	//Removing specific value from Hashset
	myset.remove(11.11);
	System.out.println(myset+" After Removing data from Hashset");
	//Inserting an element -- Not Possible in HashSet
	//Retrieving a specific value/ Accessing a specific element --Not Possible
//As indexing is not followed so we cannot know where the specific value is stored sowe cannot retrieve the specific element 
	//Convert HashSet to ArrayList
	ArrayList al=new ArrayList(myset);
	System.out.println(al);
	System.out.println(al.get(3));
	System.out.println("\n");
//Normal for loop we cannot use when we read data from set collection as in HashSet Indexing is not supported
	//Read all the elements using for..each loop collection
	for(Object x:myset)
	{
		System.out.println(x);
	}
	//Using iterator
	Iterator <Object> it=myset.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
//clearing all the elements in hashset
	myset.clear();
	System.out.println(myset);
	System.out.println(myset.isEmpty());

}

}
