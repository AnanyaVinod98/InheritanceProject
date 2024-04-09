package finalkeyword;

public class FinalClassTwo extends FinalClassOne {
	public void show() {
		System.out.println("In final class child");
	}
	public static void main(String[] args) {
		FinalClassTwo obj = new FinalClassTwo();
		obj.show();
		obj.print();
	}
}
