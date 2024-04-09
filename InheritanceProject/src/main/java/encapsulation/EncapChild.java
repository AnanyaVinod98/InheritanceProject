package encapsulation;

public class EncapChild {
	
	public static void main(String[] args) {
		EncapParent obj = new EncapParent();//aggregation, no extend b/w parent and child but 1st class obj is created in 2nd
		obj.setAge(25);//to modify
		System.out.println(obj.getAge());//to view
		obj.setName("Sam");
		System.out.println(obj.getName());
	}
	
}
