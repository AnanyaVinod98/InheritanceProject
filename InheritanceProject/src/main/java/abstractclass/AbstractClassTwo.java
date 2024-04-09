package abstractclass;

public class AbstractClassTwo extends AbstractClass {
	void show() {
		System.out.println("In abstract method");
	}
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClassTwo();//creating abstract class object
		obj.show();
		obj.print();
	}
}
