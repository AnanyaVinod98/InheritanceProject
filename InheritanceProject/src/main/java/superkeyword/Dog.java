package superkeyword;

public class Dog extends Animal {
	int a = 20;
	
	public void show() {
		System.out.println(a);
		System.out.println(super.a); //refer immediate parent class instance variable
	}
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.show();

	}

}
