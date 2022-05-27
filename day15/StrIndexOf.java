package day15;

public class StrIndexOf {
	public static void main(String[] args) {
		/*
		 * indexOf(String) - it will return index of first char
		 * indexOf(char)  - it will return index of char
		 */
		
		//            012345
		String str = "applePie";
		int index = str.indexOf("l");
		
		System.out.println("index of \"l\" in " + str + " is " + index);
		                 // index of  "l"  in  applePie   is     3
		System.out.println(str.indexOf("p")); // 1
		System.out.println(str.indexOf("e")); // 4
		
		//             0123456
		String str1 = "abcabeabvf";
		System.out.println("str1 index:" + str1.indexOf('a')); //  0
		System.out.println("str1 index2: " + str1.indexOf('a', 2)); // 3
		System.out.println("str1 index3: " + str1.lastIndexOf('a'));// 6 start looking form back
		System.out.println("str1 index4: " +str1.indexOf('b', 2)); // 4 ( find b after 2nd char )
		  //             0123456789                               
		  String str2 = "HelloABCWorldJavaXYZ";
		  String value = "ABC";
		  int iOfWorld = str2.indexOf(value);
		  System.out.println(iOfWorld); // 5
		
		String firstPart = str2.substring(0, iOfWorld);
		String secondPart = str2.substring(iOfWorld + value.length());
		System.out.println(firstPart + secondPart); 
		                   // HelloWorldJavaXYZ
		                
		System.out.println(str2.indexOf("I"));
		
		String str3 = "HelloWorld ABCJavaXYZ";
		String value2 = "World ABC";
		System.out.println(str3.indexOf(value2)); // 5 -> starting point 
		System.out.println(str3.indexOf(value2) + value2.length()); // 14 <-ending point
	}	
	}