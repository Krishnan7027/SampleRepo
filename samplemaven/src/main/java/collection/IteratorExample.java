package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorExample {

	public static void main(String[] args) {

		Set<String> s =new HashSet<String>();
		s.add("red");
		s.add("green");
		s.add("blue");
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it.remove();
		System.out.println("Set s: "+s);

	}

}
