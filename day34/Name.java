package day34;
import java.util.ArrayList;

public class Name {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A"); //0
		list.add("B"); //1
		list.add("C"); //2
		list.add("D");
		list.add("E");  // can add many as you want
		System.out.println(list);
		
		// list[0]
		System.out.print(list.get(0));
	}

}
