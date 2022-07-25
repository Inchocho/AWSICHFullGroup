package oop_animal;

public class Tiger extends Animal implements BarkablePredator {

	@Override
	public void getFood() {
		System.out.println("호랑이고기");
	}
	
	@Override
	public void bark() {
		System.out.println("호랑이는 어흥");
	}
}
