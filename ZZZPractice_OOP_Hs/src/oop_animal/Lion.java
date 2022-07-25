package oop_animal;

public class Lion extends Animal implements BarkablePredator{

	@Override
	public void getFood() {
		System.out.println("사자고기");
	}
	
	@Override
	public void bark() {
		System.out.println("사자는 사자사자");
	}
}
