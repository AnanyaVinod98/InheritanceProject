package superkeyword;

public class SuperChildMethod extends SuperParentMethod {
	public void show() {
		System.out.println("Hello Child");
		super.show();
	}
	public static void main(String[] args) {
		SuperChildMethod obj = new SuperChildMethod();
		obj.show();
	}
}
