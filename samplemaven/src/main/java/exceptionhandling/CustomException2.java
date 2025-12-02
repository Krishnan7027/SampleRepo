package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws DivisionByZeroException {
		int a = 10;
		int b = 0;
		
		if(b > 0) {
			System.out.println("Division possible");
			int c = a/b;
			System.out.println("C: "+c);
		} else {
			throw new DivisionByZeroException("Division by zero is not defined.");
		}
	}

}
