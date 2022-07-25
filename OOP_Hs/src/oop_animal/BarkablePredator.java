package oop_animal;

//인터페이스는 다중상속이 가능하기때문에
//인터페이스 BarkablePredator에 인터페이스 Predator와 Barkable을 상속
//두 부모 인터페이스의 기능을 사용(extends 응용) 

public interface BarkablePredator extends Predator, Barkable {

}