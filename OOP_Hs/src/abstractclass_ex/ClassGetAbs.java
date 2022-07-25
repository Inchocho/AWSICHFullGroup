package abstractclass_ex;

public class ClassGetAbs extends AbstractEx {
	
//	@Override
//	해당 메소드가 부모 클래스에 있는 메서드를 Override 했다는 것을 
//	명시적으로 선언	

	@Override
	String getName(AbstractEx abs) {
		String getName = "";
		getName = abs.setName(abs.name);
		return getName;
	}

	@Override
	void add(int a, int b) {
		System.out.println(a + b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
