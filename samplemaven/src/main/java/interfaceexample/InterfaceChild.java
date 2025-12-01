package interfaceexample;

public class InterfaceChild implements InterfaceParent {
	int sum = 0;

	public static void main(String[] args) {
		InterfaceChild obj = new InterfaceChild();
		obj.get(10, 20);
		obj.display();
	}

	@Override
	public void get(int a, int b) {
		this.sum = a + b;
		System.out.println("A = " + a + "\nB = " + b);
	}

	@Override
	public void display() {
		System.out.println("Sum = " + sum);
	}

}
