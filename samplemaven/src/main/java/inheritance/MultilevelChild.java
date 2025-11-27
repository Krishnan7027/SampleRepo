package inheritance;

public class MultilevelChild extends MultilevelParent {

	public void display3() {
		System.out.println("Child class here");
		System.out.println("A: "+a);
	}
	public static void main(String args[]) {
		MultilevelChild m = new MultilevelChild();
		m.display();
		m.display2();
		m.display3();
	}
}
