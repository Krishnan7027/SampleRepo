package abstraction;

public class AbstractChild extends AbstractParent {

	int sum = 0;
	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.get(10,20);
		obj.display();
	}

	@Override
	public void get(int a, int b) {
		System.out.println("A: "+a+" B: "+b);
		this.sum = a+b;
	}

	@Override
	public void display() {
		System.out.println("Sum = "+sum);
	}
}
