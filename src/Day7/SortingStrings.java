package Day7;
import java.util.Arrays;
public class SortingStrings 
{
public static void main(String[] args) 
{
	//char s[]= {'A','C','B','G','D','F','E','H'};
	String s[]= {"ganesh","kartikey","shubh","labh","amodh","pramod"};
	System.out.println("Before Sorting....."+ Arrays.toString(s));

	Arrays.sort(s);
	System.out.println("After Sorting...."+Arrays.toString(s));

}
}
