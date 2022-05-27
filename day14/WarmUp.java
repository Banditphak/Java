package day14;

public class WarmUp {
	public static void main(String[] args) {

		System.out.println(getNumStr(1)); // one
		System.out.println(getNumStr(3)); // three
		System.out.println(getNumStr(5)); // five
		System.out.println(getNumStr(6)); // six

	}

	public static String getNumStr(int number) {

		switch (number) {
		case 1:
			return "one";

		case 2:
			return "two";

		case 3:
			return "three";

		case 4:
			return " four";

		case 5:
			return "five";

		case 6:
			return "six";

		default:
			return "???????";

		}

	}

}
