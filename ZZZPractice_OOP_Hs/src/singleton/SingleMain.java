package singleton;

public class SingleMain {

	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing == sing2);
	}
}
