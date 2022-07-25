package abstractclass_ex;

public class AbsMain {

	public static void main(String[] args) {
		ClassGetAbs abs = new ClassGetAbs();
		abs.setName("곰");
		System.out.println(abs.name);
		
		abs.getName(abs);
		System.out.println(abs.getName(abs));
		
		abs.add(3, 3);
	}

}
