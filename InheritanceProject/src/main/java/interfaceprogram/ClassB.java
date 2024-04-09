package interfaceprogram;

public class ClassB implements InterfaceA {
	public void show() {
		System.out.println("In ClassB");
	}
	public static void main(String[] args) {
		InterfaceA obj = new ClassB();
		obj.show();

	}

}
