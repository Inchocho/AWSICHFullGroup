package four;

public class Car2 {

	String color = ""; // 색상
	String gearType = ""; // 변속기 종류 - auto, manual
	int door = 0;
	
//	기본 생성자(default constructor)
//	모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 한다
//	기본 생성자는 매개변수가 없는 형태다
//	자바 컴파일러가 자동으로 기본생성자 Car(){}를 명시해준다.	
	
//	아무것도 선언하지 않은 경우 컴파일러가 자동으로 기본생성자를 생성해준다(생성자를 선언한경우 기본생성자 자동으로 안만들어짐)
//	Car2(){
//		
//	}

//	명시적으로 선언한경우
	Car2(){
		System.out.println("아하 이 순간에 생성자가 수행되는 구나");
	}
	
	Car2(int d){
		System.out.println("내 매개변수는 정수형이야 - 오버로딩의 예시");
	}
	
	Car2(String d){
		System.out.println("내 매개변수는 문자열이야 - 오버로딩의 예시");
	}	

}
