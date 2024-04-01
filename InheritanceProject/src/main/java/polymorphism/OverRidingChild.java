package polymorphism;

public class OverRidingChild extends OverRidingParent{
	public void show() {
		System.out.println("Inside child");
	}
	public static void main(String[] args) {
		OverRidingChild obj = new OverRidingChild();
		obj.show(); // method over-riding and child will be printed
		
		OverRidingParent obj1 = new OverRidingParent();
		obj1.show();
	}
}
