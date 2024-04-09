package finalkeyword;

public class FinalVariable {
	final int a = 5;
	public void display() {
//		a = 10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.display();

	}

}
