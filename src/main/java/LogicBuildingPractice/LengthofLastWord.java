package LogicBuildingPractice;

public class LengthofLastWord 
{
public static void main(String[] args)
{		int count = 0;
		String s1 = "     Hello      World     Moon     ";
		s1 = s1.trim();
		char inputArray[] = s1.toCharArray();
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != ' ') {
//			if(inputArray.charAt[i] !=" ") {
			count = count + 1;
			} else {
				if(count>0)
				{
					System.out.println(count);
					break;
				}  }
		                                               }	
}
}
