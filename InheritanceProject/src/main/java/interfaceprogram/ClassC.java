package interfaceprogram;

public class ClassC implements InterfaceA {
	public void show() {
		System.out.println("In ClassC");
	}
	public static void main(String[] args) {
		InterfaceA obj = new ClassC();
		obj.show();

	}
}
