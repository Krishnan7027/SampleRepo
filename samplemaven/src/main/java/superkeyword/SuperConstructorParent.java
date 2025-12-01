package superkeyword;

public class SuperConstructorParent {

	int sum = 0;

	public SuperConstructorParent(int a, int b) {
		System.out.println("Parent class constructor");
		this.sum = a + b;
	}
}
