package abstractclass;

public abstract class Animal {
	Animal(){
		System.out.println("Animal constructor");
	}
	abstract void show();
	void print() {
		System.out.println("Non-abstract method");
	}
}
