package day37;

import java.util.Set;
import java.util.LinkedHashSet;

public class SetLinkedHashSet {
	public static void main(String[] args) {
		// LinkedHashSet
		// it doesn't allow duplicates
		// It does maintain insertion order
		
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5); // duplicate
		numbers.add(3); // duplicate
		numbers.add(9); 
		
		System.out.println(numbers); // [5, 3, 2, 9]
		
		Set<String> names = new LinkedHashSet<>();
		names.add("Alex");
		names.add("Kuba");
		names.add("John");
		names.add("Bek");
		names.add("Ramesh");
		names.add("Kuba");
		System.out.println(names); // [Alex, Kuba, John, Bek, Ramesh]
		
	}
}