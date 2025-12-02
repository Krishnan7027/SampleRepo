package interfaceexample;

public class InterfaceChild implements InterfaceParent {
	int sum = 0;

	public static void main(String[] args) {
//		InterfaceChild obj = new InterfaceChild();
//		obj.get(10, 20);
//		obj.display();

		InterfaceParent obj2 = new InterfaceChild();
		obj2.get(10, 20) ;
		obj2.display();
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
