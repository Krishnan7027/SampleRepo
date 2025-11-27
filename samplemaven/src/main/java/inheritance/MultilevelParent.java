package inheritance;

public class MultilevelParent extends MultilevelGrandParent{

	int a;
	public void display2() {
		a = 10;
		System.out.println("Intermediate class here");
	}
}
