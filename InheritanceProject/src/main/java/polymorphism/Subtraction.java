package polymorphism;

public class Subtraction extends Addition {
	public void print(int a, int b) {
		System.out.println(a-b);
		super.print(10,5);
	}
	public static void main(String[] args) {
		Subtraction obj = new Subtraction();
		obj.print(10, 5);
		//super.print(10,5); error
	}

}
