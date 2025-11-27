package accessmodifier;

public class Access1
{
	public void display1() {
		System.out.println("Public");
	}
	private void display2() {
		System.out.println("Private");
	}
	protected void display3() {
		System.out.println("Protected");
	}
	void display4() {
		System.out.println("Default");
	}
	public static void main(String[] args) {
		Access1 acc = new Access1();
		acc.display1();
		acc.display2();
		acc.display3();
		acc.display4();
	}
}