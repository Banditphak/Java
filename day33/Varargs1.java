package day33;

public class Varargs1 {
	public static void main(String[] args) {
		System.out.println(join("hello", "world")); // helloworld
		System.out.println(join("apple", "orange", "banana")); // appleorangebanana
		System.out.println(join("one", "two", "three", "four", "five"));
		
		String[] langs = {"java", "python", "js", "ruby", "php"};
		System.out.println(join(langs));
	}
	
	// TODO join method concatenates all its arguments and return as one string
	public static String join(String...langs) {
		String res = "";
		for(int i = 0; i < langs.length; i++) {
			res += langs[i];
		}
			return res;
	}
}