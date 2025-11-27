package inheritance;

public class SingleChild extends SingleParent {

	public void print(){
		System.out.println("Child class here");	
	}
	
	public static void main(String args[]) {
		SingleChild s = new SingleChild();
		s.display();
		s.print();
	}
}
