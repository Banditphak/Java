package day37;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {
	public static void main(String[] args) {
		// TreeSet
		// it doesn't allow duplicates.
		// it keeps elements in the sorted order.
		Set<Integer> numbers2 = new TreeSet<>();
		numbers2.add(8);
		numbers2.add(4);
		numbers2.add(1);
		numbers2.add(-99);
		numbers2.add(5);
		numbers2.add(100);
		System.out.println(numbers2);

		Set<String> names2 = new TreeSet<>();
		names2.add("Ramesh");
		names2.add("Kuba");
		names2.add("Alex");
		names2.add("Bek");
		names2.add("Azamat");
		names2.add("Kuba");
		System.out.println(names2);
		
// ******** For Interview Question**********
//		Set:
//		-> Set doesn't allow duplicates.
//		-> HashSet
//		   - it doesn't allow duplicates.
//		   - it doesn't maintain insertion order
//		-> LinkedHashSet
//		   - it doesn't allow duplicates.
//		   - it maintains insertion order.
//		-> TreeSet
//		   - it doesn't allow duplicates.
//		   - it keeps elements in sorted order.
	 
//	    How to remove dupplicates from String/Array/list?
//	    - I can remove duplicates by using contains method.
//	    - By using Set from collection framework because it doesn't allow duplicates.

	}
}
