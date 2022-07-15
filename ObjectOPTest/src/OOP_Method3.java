//메소드의 구조
//입력과 출력이 모두 있는 메소드
//입력과 출력이 모두 없는 메소드
//입력은 없고 출력은 있는 메소드
//입력은 있고 출력은 없는 메소드

class Method {

	int sum(int a, int b) { // 메소드 sum은 입력값 int형 a,b를 받아서 리턴값 int형 a+b로 돌려준다.
		return a + b;
	}

	String say() { // 메소드 say는 입력값이 없고 리턴값 String형 Hi를 돌려준다. 리턴타입 String
		return "리턴값 Hi";
	}

	void sum2(int a, int b) { // 메소드 sum2는 입력값 int형 a,b를 받아서 리턴없이 출력만 있다.
		System.out.println("a와 b의 합 = " + (a + b));
	}

	void say2() { // 메소드 say2는 입력값도 리턴값도 없이 출력만 있다. 매개변수()없음 = 입력값없음
		System.out.println("출력값 Hi");
	}

	void sayNick(String nick) { // void(리턴없음)
		if ("fool".equals(nick)) {
			return; // 메소드 종료 return의 쓰임새2
		}
		System.out.println("나의 별명은 " + nick + " 입니다.");
	}

	void varTest(int a) { // return없음, 매개변수 int타입으로 받아야함 (즉 인스턴스 인수를 작성해야함)
		a++;
	}

	public void varTest2(int b) { // varTest 1과 2는 동일한 기능을함
		b++;
	}

	int varTest3(int a) {
		a++;
		return a;
	}

	int a;

	void varTest4(Method method) {
		method.a++;
	}

	void varTest5() { // this 키워드로 바로 객체에 접근함(mtd) -> varTest4의 개선(?)버전임
		this.a++; // 즉 mtd.a++처리한거임
	}

//		메소드의 입력항목이 값인지 객체인지를 구별하는 기준은 입력항목의 자료형이 primitive 자료형인지 아닌지에 따라 나뉜다. 
//		int 자료형과 같은 primitive 자료형인 경우값이 전달되고 그 이외의 경우(reference 자료형)는 객체가 전달된다.    

}

//한 개의 자바파일에 2개 이상 클래스 선언하기 (특이한 경우 잘 안쓰는데 작동은 한다)

class Updater {
	int count;
	
	void update(int count) {
		count++;
	}
	void update2() {
		this.count++;
	}
}

class Counter {
	int count = 0; // 객체변수
}

public class OOP_Method3 {

	public static void main(String[] args) {
		Method mtd = new Method();
		System.out.println(mtd.sum(3, 5));
		System.out.println(mtd.say());
		mtd.say2();
		mtd.sum2(3, 5);
		mtd.sayNick("Cho");
		mtd.sayNick("fool"); // sayNick 메소드에서 nick이 "fool"과 같으면 메소드종료됨(즉 출력없음) 리턴없음
		int a = 5;
		a = mtd.varTest3(a); // varTest2메소드 인수로 a(5)을 넣어서 varTest메소드를 실행 a++를한 리턴값 a를받음
		System.out.println(a); // varTest를 수행한 뒤 값 a++ 즉 a=6를 출력한다. 6

		mtd.a = 1; // 객체의 a값을 1을 지정했음
		System.out.println("mtd의 a값: " + mtd.a); // 1
		mtd.varTest4(mtd); // 객체를 넘겨서, 객체를 전달해서 메소드(a++)실행에서 객체의 a값(mtd.a)을 증가시키게됨
		System.out.println("mtd의 a값: " + mtd.a); // 2
		mtd.varTest5();
		System.out.println("mtd의 a값: " + mtd.a); // 3

//		여기서 주목해야 하는 부분은 varTest4 메소드의 
//		입력 파라미터가 값이 아닌 Method 클래스의 객체라는데 있다.
//		이렇게 메소드가 객체를 전달 받으면 메소드 내의 객체는 
//		전달받은 객체 그 자체로 수행된다. 
//		따라서 입력으로 전달받은 Method 객체의 객체변수 a(mtd.a)의 값이 증가하게 되는 것이다.		

//		int a = 1;
//		mtd.varTest(5);			여기서 5는 메소드안의 매개변수로 쓰기위한 인수5 즉 메소드 내부에서만 쓰는 로컬변수.
//		System.out.println(a);	1찍힘 varTest 메소드에서 지역변수 a로 뭐를하든 메인메소드 안에 선언한 a값인 1이 출력됨
		
		Updater upt = new Updater();
		upt.count = 1;
		upt.update(1);
		System.out.println("인스턴스 upt.count의 값: " + upt.count);	//update 메소드에서 증가한거 상관x
		upt.update2();
		System.out.println("인스턴스 upt.count의 값: " + upt.count);	//객체에 직접 증가해서 2
		
		Counter ctr = new Counter();
		System.out.println("before update:"+ctr.count);			

	}
}
