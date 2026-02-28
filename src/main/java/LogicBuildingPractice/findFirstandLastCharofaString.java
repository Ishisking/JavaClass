package LogicBuildingPractice;

public class findFirstandLastCharofaString {

	public static void main(String[] args) {
		String input="Hello World";
		int firstIndex=-1;
		int lastIndex=-1;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)=='o') {
			firstIndex=index;
			break;
		} }
		for(int index=input.length()-1;index>firstIndex;index--) {
			if(input.charAt(index)=='o') {
			lastIndex=index;
			break;
		} }
		if(firstIndex<0) {
			System.out.println("Character is Not Present");
		} else {
System.out.println("First occurrence of 'o' is "+firstIndex+ " Last occurrence of 'o' is "+lastIndex); }
	}

}
