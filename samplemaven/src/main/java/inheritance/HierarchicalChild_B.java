package inheritance;

public class HierarchicalChild_B extends HierarchicalParent{

	public void display2() {
		System.out.println("Child B here");
	}
	
	public static void main(String[] args) {
		HierarchicalChild_B h = new HierarchicalChild_B();
		h.display();
		h.display2();
	}
}
