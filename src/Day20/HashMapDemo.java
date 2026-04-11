package Day20;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashMapDemo {
public static void main(String[] args) {
	//Declaration
	//HashMap hm=new HashMap();
	//Map hm=new HashMap();
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	//Adding pairs
	hm.put(101,"John");
	hm.put(102,"Mary");
	hm.put(103,"Scott");
	hm.put(104,"Belle");
	hm.put(105,"Boss");
	hm.put(101,"Campus");
	hm.put(106,"White");
	System.out.println(hm);
 System.out.println("Size of HashMap : "+hm.size());
 //Remove one pair
 hm.remove(104);
 System.out.println("Printing HashMap After Removing : "+hm);
 //Access value of the key
 System.out.println(hm.get(101)); //104 is also a key
 //get all the keys from the HashMap
 System.out.println(hm.keySet());//Access all the keys     [101, 102, 103, 105, 106]
 System.out.println(hm.values());//Access all the values    [Campus, Mary, Scott, Boss, White]
 System.out.println(hm.entrySet());//Access all the keys and values [101=Campus, 102=Mary, 103=Scott, 105=Boss, 106=White]
 
 //Reading data from HashMap
 
 //using for..each
/* for(int k:hm.keySet())  //for getting the key
 {
	 System.out.println(k+"   "+hm.get(k));     //for getting the value
 }  */
 System.out.println("\n");
 //Using Iterator Method
 
 Iterator<Entry <Integer, String>> it=hm.entrySet().iterator();
 while(it.hasNext())
 {
	Entry<Integer,String> entry=it.next();
	System.out.println(entry.getKey()+"     "+entry.getValue());
 }
 //Combination of key and value is called entry
 hm.clear();
 System.out.println(hm.isEmpty());

 
}
}
