package abstractclass_ex;

public abstract class AbstractEx {

	String name = ""; 
	int num = 0;
	
	String setName(String name) {
		String setName = "";
		setName = name;
		this.name = setName;
		return setName;
	}
	
	abstract void add(int a, int b);
		
	abstract String getName(AbstractEx abs);
	
}
