package polymorphism;

public class MethodOverloading {
	public void show(int a) {
		System.out.println(a);
	}
	public void show(String name) {
		System.out.println(name);
	}
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.show(10);
		obj.show("Hello");
	}
}
