package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent {
	public void print() {
		System.out.println("Printing from child");
	}
	public static void main(String args[]) {
		SingleInheritanceChild obj = new SingleInheritanceChild();
		obj.print();
		obj.display();
	}
}
