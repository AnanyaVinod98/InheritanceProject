package aggregation;

public class Employee {
	Address address; //reference obj of 1st class as an instance variable
	int id;
	String name;
	Employee(int id, String name, Address address ){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address obj = new Address("Kochi","Kerala","India");
		Employee obj1 = new Employee(10,"Tom", obj);
		obj1.display();
	}
}
