package inheritance;

public class MultipleChild implements MultipleParent1, MultipleParent2 {

	int sum = 0;

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.get(10, 20);
		obj.display();
	}

	@Override
	public void display() {
		System.out.println("Sum: " + sum);
	}

	@Override
	public void get(int a, int b) {
		this.sum = a + b;
		System.out.println("A: " + a + " B: " + b);
	}

}
