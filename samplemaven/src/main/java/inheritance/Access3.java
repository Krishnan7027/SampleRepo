package inheritance;

import accessmodifier.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 acc = new Access1();
		acc.display1();
//		acc.display2();

		
		Access3 obj = new Access3();
		obj.display1();
		obj.display3();
	}
}
