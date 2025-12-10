package collection;

import java.util.List;
import java.util.ArrayList;

public class GenericList {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("green");
		l.add("blue");
		l.add("green");
		l.add("blue");
		l.add("black");
		System.out.println("List: " + l);
		System.out.println("get(2): " + l.get(2));
		System.out.println("set(1,white): " + l.set(1, "white"));
		System.out.println("List: " + l);
		System.out.println("indexOf(red): " + l.indexOf("red"));
		System.out.println("lastIndexOf(blue): " + l.lastIndexOf("blue"));
		System.out.println("remove(3): " + l.remove(3));
		System.out.println("List: " + l);
		System.out.println("contains(white): " + l.contains("white"));
		System.out.println("isEmpty(): " + l.isEmpty());
		System.out.println("size(): " + l.size());
		System.out.println("List: " + l);
	}
}