package demoaccessmodifier;

import accessmodifier.Default;

public class DefaultChecker {

	public static void main(String[] args) {
		Default obj = new Default();
		obj.show();//no access since this is trying to access from another package

	}

}
