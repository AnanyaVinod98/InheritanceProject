package exceptionhandling;

public class ArrayIndexExceptionPrgm {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[10] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
	}
}
