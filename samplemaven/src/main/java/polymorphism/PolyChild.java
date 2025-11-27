package polymorphism;

public class PolyChild extends PolyParent {

	public void display(int a, int b) {
		super.display(100, 50);
		int c = a-b;
		System.out.println("C: "+c);
	}
	
	public static void main(String[] args) {
		PolyChild poly = new PolyChild();
		poly.display(100, 50);
	}
}
