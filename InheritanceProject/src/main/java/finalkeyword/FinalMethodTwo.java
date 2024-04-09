package finalkeyword;

public class FinalMethodTwo extends FinalMethodOne {
	public void show() {
		System.out.println("In method two");
	}
	public static void main(String[] args) {
		FinalMethodTwo obj = new FinalMethodTwo();
		obj.show();

	}

}
