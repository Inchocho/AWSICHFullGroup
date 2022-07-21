
public class OOP_Test1 {

	void add(int a) {
		a++;
	}

	int add1(int a) {  //add1메소드를 이용해 메소드 외부의 a를 1만큼 증가시키기 위해 return값 사용
		a++;
		return a;
	}

	int a;

	void add2(OOP_Test1 t2) { // 클래스 OOP_Test1타입 객체 t2를 인수로 받음
		t2.a++;
	}

	void add3() { // this를 이용해서 현재 참조중인 객체에 직접 전달
		this.a++;
	}

	public static void main(String[] args) {

		int a = 1;
		OOP_Test1 t1 = new OOP_Test1();
		t1.a = 3;
		t1.add(a);
		System.out.println(a); // 1 (2가찍혀야 되는거 아닌가?에 대한 답)
		System.out.println(t1.a); // 3	
		
		a = t1.add1(a);		   // 변수 a에 t1.add1(a) 매개변수a를 넣은 add1메소드 실행결과 담음
		System.out.println(a); // 2

//		메소드 내부의 변수는 메소드 밖의 변수이름과는 전혀 상관이 없다.
//		이렇게 메소드 내부에서만 쓰이는 변수를 로컬변수(지역변수)라고도 한다.

//		객체를 넘겨서 직접적으로 a의 값을 증가시키는 방법
//		OOP_Test1클래스 타입 객체 t2를 직접 전달한경우이다.	

		OOP_Test1 t2 = new OOP_Test1();
		t2.a = 3;
		System.out.println(t2.a); // 3
		t2.add2(t2);
		System.out.println(t2.a); // 4

//		this 활용하기
//		t3 객체를 이용하여 add3라는 메소드를 호출할 경우 
//		굳이 t3 객체를 전달할 필요가 없다. 
//		전달하지 않더라도 add3 메소드는 
//		this라는 키워드를 이용하여 객체에 접근할 수 있기 때문이다. 
//		this를 이용하여 add3 메소드를 작성했다.		

		OOP_Test1 t3 = new OOP_Test1();
		t3.a = 5;
		System.out.println(t3.a); // 5
		t3.add3();
		System.out.println(t3.a); // 6
	}
}
