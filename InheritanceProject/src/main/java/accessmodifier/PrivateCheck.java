package accessmodifier;

public class PrivateCheck extends Private {

	public static void main(String[] args) {
		Private obj = new Private();
		System.out.println(obj.a);//trying to access private method, but will throw error because it is outside class
		obj.show();//trying to access private variable
	}

}
