package interfaceprogram;

public class InterfaceClassOne implements InterfaceOne{
	public void show() {
		System.out.println("In InterfaceClassOne");
	}
	public static void main(String[] args) {
		InterfaceOne obj = new InterfaceClassOne();// interface obj = new class();
		obj.show();
	}
}
