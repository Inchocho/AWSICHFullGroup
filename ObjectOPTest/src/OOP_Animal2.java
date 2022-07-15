class Animal {
	String name;
	int age;

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + "는 " + age + "살 입니다.");
	}

	public void hello(String name) {
		System.out.println(name + " Hello~");
	}
}

public class OOP_Animal2 {

	public static void main(String[] args) {
		Animal cat = new Animal();
		Animal dog = new Animal();
//		System.out.println(cat.name); 결과:null

		cat.setInfo("고양이", 15);
		cat.hello(cat.name);

		dog.setInfo("개", 5);
		dog.hello(dog.name);

	}
}
