package superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public void print() {
		System.out.println("Super method child");
		super.display();
	}
	public static void main(String[] args) {
		SuperMethodChild sup = new SuperMethodChild();
		sup.print();
	}
}
