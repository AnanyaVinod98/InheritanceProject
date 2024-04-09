package exceptionhandling;

public class ArithmeticExceptionPrgm {

	public static void main(String[] args) {
		try {
			int a = 10/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Exception handled");
		}

	}

}
