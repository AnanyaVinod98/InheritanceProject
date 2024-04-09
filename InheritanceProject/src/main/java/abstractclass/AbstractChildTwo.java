package abstractclass;

public class AbstractChildTwo extends AbstractParent {
	void print() {
		System.out.println("Hello from child two");
	}
	public static void main(String[] args) {
		AbstractParent obj = new AbstractChildOne();//getting child class one properties only
		obj.print();
	}
}
