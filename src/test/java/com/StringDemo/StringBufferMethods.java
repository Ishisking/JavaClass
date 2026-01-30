package com.StringDemo;

public class StringBufferMethods {

	public static void main(String[] args) {
/*String Literal*/  	String str = "Hello World"; // String Intern Pool

/*String Object*/		String str1 = new String("Hello World"); // Heap Memory

		StringBuffer sb = new StringBuffer("Hello World");//Heap Memory

//		//Length of String
//		System.out.println(str.length());
//		System.out.println(str1.length());
//		System.out.println(sb.length());
//		
//		//concat
//		System.out.println(str+123);
//		System.out.println(str.concat("1234"));
//				
//		System.out.println(sb.append(12345));
		
//		//chatAT()
//		System.out.println(str.charAt(0));
//		System.out.println(sb.charAt(0));
//		//indexOf()
//		System.out.println(str);
//		System.out.println(str.indexOf('e'));
//		System.out.println(str.indexOf("ello"));
//		System.out.println(sb);
//		System.out.println(sb.indexOf("ello"));
//		//lastindexOf()
//		System.out.println(str.lastIndexOf('l'));
//		System.out.println(sb.lastIndexOf("l"));
//		System.out.println(str.lastIndexOf('d'));
//		System.out.println(str.lastIndexOf('d', 10));
//		System.out.println(str.lastIndexOf("rld"));
		//isEmpty()
		System.out.println(str.isEmpty());
	//reverse
		System.out.println(sb);
//		System.out.println(sb.reverse());
		//insert(int offset, String)
		System.out.println(sb.insert(6, "to JAVA "));
		//deletecharAT()
		System.out.println(sb.deleteCharAt(6));
		System.out.println(sb.insert(6, "the"));
		//delete() - deletes from a range of index
		System.out.println(sb.delete(5,10));
		//replace (startindex, end index, substring)
		System.out.println(sb.replace(0, 5, "Hi"));
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity()); //16
		System.out.println(sb.capacity()); //11 + 16 =27
		System.out.println(sb.length());
		sb.append("This is a sample text that iam adding to the StringBuffer");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		/*
		 * How is the capacity calculated in String Buffer
		 * new capacity =(oldCapacity*2)+2
		 *  
		 * */
	}
}
