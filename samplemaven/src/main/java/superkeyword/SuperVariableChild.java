package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
	String s = "Blue";
	
	SuperVariableChild() {
		super("Hello from Chld constructor");
	}
	
	void display2() {
		System.out.println("Color: "+s);
		System.out.println("Color: "+super.s);
		super.display();
	}
	public static void main(String[] args) {
		SuperVariableChild child = new SuperVariableChild();
		child.display2();
	}
}
