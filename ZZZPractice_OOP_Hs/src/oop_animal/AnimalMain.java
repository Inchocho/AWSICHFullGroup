package oop_animal;

public class AnimalMain {

	public static void main(String[] args) {
//		개는 동물이다(O) Is-A 관계(상속)
//		Animal클래스타입 참조변수 dog는 Dog클래스타입 인스턴스를 참조한다
//		이경우 Animal의 기능만을 참조할수있다
		Animal dog = new Dog();
		Dog dog2 = new Dog();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile cro = new Crocodile();
		dog.setName("바둑이");

//		동물은 개다(X)
//		Dog dog2 = new Animal();

		ZooKeeper zoo = new ZooKeeper();
		zoo.getFood();
		dog2.getFood();
		tiger.getFood();
		lion.getFood();

		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(cro);
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(dog2);
		bouncer.barkAnimal(lion);
		
		cro.bark();
		dog2.bark();
		
		Tiger tiger2 = new Tiger();  // Tiger is a Tiger
		Animal animalT = new Tiger();  // Tiger is a Animal
		Predator predatorT = new Tiger();  // Tiger is a Predator
		Barkable barkableT = new Tiger();  // Tiger is a Barkable
		
//		predator 객체와 Barkable 로 선언된 barkable 객체는 
//		사용할 수 있는 메소드가 서로 다르다는 점이다. 
//		predator 객체는 getFood() 메소드가 선언된 Predator 인터페이스의 
//		객체이므로 getFood 메소드만 호출이 가능하다. 
//		Barkable 로 선언된 barkable 객체는 
//		bark 메소드만 호출이 가능하다		
		
		tiger2.bark();		
		animalT.setName("고양이");
		System.out.println(animalT.name);
		predatorT.getFood();
		barkableT.bark();
		
		Dog2 dooog = new Dog2();
		dooog.printFood();

	}

}
