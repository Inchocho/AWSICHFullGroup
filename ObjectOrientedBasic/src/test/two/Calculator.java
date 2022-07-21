package test.two;

import java.io.PrintStream;

public class Calculator {

//	클래스 Calculator에 사칙연산을 구현해라
//	출력형태: 입력한 숫자 + 입력한 숫자 = 계산된 결과값
//	소수점 2번째 자리까지 표현 (3번째 자리에서 반올림) -> 추가기능	

	// 사칙연산 더하기
	void add(int x, int y) { // 선언부
		int result = x + y; // 구현부

		System.out.println(x + " + " + y + " = " + result);
	}

	// 사칙연산 빼기
	void sub(int x, int y) {
		int result = x - y;

		System.out.println(x + " - " + y + " = " + result);
	}

	// 사칙연산 곱하기
	void mul(int x, int y) {
		int result = x * y;

		System.out.println(x + " * " + y + " = " + result);
	}

	// 사칙연산 나누기
	void div(int x, int y) {
		double result = x / y;

		System.out.println(x + " / " + y + " = " + result);
//		소수점 3자리에서 반올림 처리를 하려면 
//		System.out.printf("%.2f" ,result);		
	}

	// 사칙연산 나누기 (실수부 3자리까지 출력인데 야매)
	void div2(double x, double y) {
		double result = x / y;

		System.out.println(x + " / " + y + " = " + result);
		//야매처리
		System.out.println(x + " / " + y + " = " + ((result + 0.01) * 100) / 100);
		// 소수점 3자리에서 반올림 처리를 하려면
//		System.out.printf("%.2f" ,result);

	}

}
