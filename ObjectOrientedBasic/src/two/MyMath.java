package two;

public class MyMath {
	
//	메서드의 선언과 구현
	
//	표현식
//	반환타입 메서드이름(타입 변수명, 타입 변수명, ,,,) {	-- 선언부
//		// 메서드 호출 시 수행될 코드					-- 구현부
//	}

//	반환타입:void(반환값이 없다), 메서드이름:add, 타입변수명: (int x, int y, ,,,(필요한만큼))
//	()안에 있는 변수들을 매개변수(parameter)라고 부른다	
	
	void add(int x, int y) {	//선언부
		int result = x + y;		//구현부 (result는 지역변수이다)

		System.out.println("두 수를 더한 결과: " + result);		//구현부
		
//		return; <-- 실제로 return이 묵시적으로 수행되고는 있다.
//		여기서의 return 의미는 메소드의 종료를 의미한다.
	}
	
}
