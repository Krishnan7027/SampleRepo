package inheritance;

public class HierarchicalChild_A extends HierarchicalParent {

	public void display1() {
		System.out.println("Child A here");
	}
	
	public static void main(String[] args) {
		HierarchicalChild_A h = new HierarchicalChild_A();
		h.display();
		h.display1();
	}
}
