//multiple inheritance

package inheritance;

public class BabyDog extends Dog {
	public void runBabyDog() {
		System.out.println("BabyDog class");
	}
	public static void main(String[] args) {
		BabyDog obj = new BabyDog();
		obj.runBabyDog();
		obj.runDog();
		obj.run();
	}
}
