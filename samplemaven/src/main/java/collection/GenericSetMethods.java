package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {

		Set<String> a = new HashSet<String>();
		a.add("apple");
		a.add("banana");
		a.add("orange");
		System.out.println("Set A: " + a);

		Set<String> b = new HashSet<String>();
		b.add("grapes");
		b.add("watermelon");
		System.out.println("Set B: " + b);

		a.addAll(b);
		System.out.println("Set a.addAll(b): " + a);

		System.out.println("Set a.contains(apple): " + a.contains("apple"));

		System.out.println("Set a.containsAll(b): " + a.containsAll(b));

		System.out.println("Set a.isEmpty(): " + a.isEmpty());

		a.remove("orange");
		System.out.println("Set a.remove(orange): " + a);

		a.removeAll(b);
		System.out.println("Set a.removeAll(b): " + a);

		System.out.println("Set a.size(): " + a.size());

		a.clear();
		System.out.println("Set a.clear(): " + a);
	}

}
