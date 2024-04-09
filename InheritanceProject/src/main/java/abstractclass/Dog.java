package abstractclass;

public class Dog extends Animal {
	void show() {
		System.out.println("In dog class");
	}
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.show();
		obj.print();
	}
}
