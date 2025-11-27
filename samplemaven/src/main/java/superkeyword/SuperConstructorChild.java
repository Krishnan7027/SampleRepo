package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public SuperConstructorChild() {
		super();
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		SuperConstructorChild sup = new SuperConstructorChild();
		
	}

}
