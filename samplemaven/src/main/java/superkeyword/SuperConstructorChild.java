package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public SuperConstructorChild() {
		super(10,20);
		System.out.println("Child class constructor");
		System.out.println("Sum = "+sum);
	}
	public static void main(String[] args) {
		SuperConstructorChild sup = new SuperConstructorChild();
		
	}

}
