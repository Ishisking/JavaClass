package Day19;
//A b=(C) d
public class TypeCastingObjects3 {
public static void main(String[] args) {
/*	//If out of 3Rules if any one rule also Fails then the condition Fails
	//Example 1
	Object o=new String("welcome"); //Valid
	StringBuffer sb=(StringBuffer) o;  //Rule 1 Satisfied Rule 2 satisfied Rule 3 --Failed
	//Example 2
	//String s=new String("welcome");
	//StringBuffer sb=(StringBuffer) s;  //Rule 1---Failed no relation between c and d
	//Example 3
	Object p=new String("welcome");
	StringBuffer sb1=(StringBuffer) p;//Rule 1-pass  Rule 2-pass Rule 3-Failed
	//Example 4
	Object q=new String("Welcome");
//	StringBuffer sb2=(String) q; //Rule 1-Yes Rule2- Failed
	//Example 5
	String t=new String("welcome");
//	StringBuffer sb3=(String) t; //Rule1--Pass  Rule2--Failed
	//Example 6
	Object r=new String("welcome");
	StringBuffer sb4=(StringBuffer) r; //Rule 1--Pass Rule 2--Pass Rule3--Failed
	//Example 7
*/	Object x=new String("This is Correct Type Casting Method");
	String u=(String) x;	//Rule1--Pass Rule2--Pass  Rule3--Pass
	System.out.println(u);
//Rule 1:-Relationship between c and d either parent to child or child to parent class
//Rule 2:- After Convertion we are storing into the right variable type or not i.e same type or parent of it
//Rule 3:- The underlying object of p i.e String("welcome") should be same as c i.e (String)
	//if all 3 rules satify then type casting statement is correct.

}
}
