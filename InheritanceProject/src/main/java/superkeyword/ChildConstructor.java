package superkeyword;

public class ChildConstructor extends ParentConstructor {
	ChildConstructor(){
		//super(); //calling parent constructor, evenif not given it will print parent
		System.out.println("Hello Child");
	}
	public static void main(String[] args) {
		ChildConstructor obj = new ChildConstructor();
	}

}
