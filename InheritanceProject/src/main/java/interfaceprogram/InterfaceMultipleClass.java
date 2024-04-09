package interfaceprogram;

public class InterfaceMultipleClass implements InterfaceMultiple1, InterfaceMultiple2 {
	public void show() {
		System.out.println("IN show");
	}
	public static void main(String[] args) {
		InterfaceMultipleClass obj = new InterfaceMultipleClass();
		obj.show();
	}
}
