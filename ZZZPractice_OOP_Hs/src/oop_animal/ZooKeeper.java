package oop_animal;

public class ZooKeeper implements Predator {
	
	void feed(Predator pre) {
		pre.getFood();
	}

	@Override
	public void getFood() {
		System.out.println("고기고기");
	}

}
