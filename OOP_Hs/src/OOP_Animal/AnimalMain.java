package OOP_Animal;

public class AnimalMain {

	public static void main(String[] args) {
//		개는 동물이다(O) Is-A 관계(상속)
//		Animal클래스타입 참조변수 dog는 Dog클래스타입 인스턴스를 참조한다
//		이경우 Animal의 기능만을 참조할수있다
		Animal dog = new Dog();
		dog.setName("바둑이");

//		동물은 개다(X)
//		Dog dog2 = new Animal();
	}

}
