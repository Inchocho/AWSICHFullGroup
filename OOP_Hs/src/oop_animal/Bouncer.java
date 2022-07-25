package oop_animal;

public class Bouncer {
	
//	instanceof 		
//	어떤 객체가 특정 클래스의 객체인지를 조사할 때 사용되는 
//	자바의 내장 명령어이다. animal instanceof Tiger 는 
//	"animal 객체는 Tiger 클래스로 만들어진 객체인가?"를 묻는 조건문
	
//	barkAnimal 메소드는 입력으로 받은 
//	animal 객체가 Tiger의 객체인 경우에는 "어흥"을 출력하고 
//	animal 객체가 Lion 객체인 경우에는 "으르렁"을 출력한다.
	
//	Is-A 관계 (상속)
//	barkAnimal 메소드의 입력자료형은 Tiger나 Lion이 아닌 Animal이다. 
//	barkAnimal 메소드를 호출할때는 tiger또는 lion객체를 전달할 수가 있다. 
//	이게 가능한 이유는 Tiger, Lion 클래스가 
//	Animal이라는 부모 클래스를 상속한 자식 클래스이기 때문이다. 
//	자식 클래스에 의해서 만들어진 객체는 
//	언제나 부모 클래스의 자료형으로 사용할 수가 있다.	
	
//	Animal tiger = new Tiger();  // Tiger is a Animal
//	Animal lion = new Lion();  // Lion is a Animal
	
    void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
//        	animal 객체는 Tiger 클래스로 만들어진 객체면 조건 true
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
//        	animal 객체는 Lion 클래스로 만들어진 객체면 조건 true
            System.out.println("으르렁");
        } else if (animal instanceof Crocodile) {
//        	클래스 추가시 계속 else if~ 추가해야됨 복잡함
//        	해결법 - 인터페이스: Barkable 생성
        	System.out.println("악어는 어케움?");
        }
    }
}
