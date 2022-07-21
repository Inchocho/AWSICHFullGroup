package three;

import java.util.Scanner;

public class Calculator_Hs {

	int a = 0;
	int b = 0;

//	오버로딩(overloading)
//	오버로딩이란 메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 
//	구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 한다
//	
//	그러나 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을
//	가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면,
//	같은 이름을 사용해서 메서드를 정의 할 수 있다
//	
//	요약: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것
//	을 메서드 오버로딩 또는
//
//	간단히 오버로딩(overloading)이라 한다
//	
//	오버로딩의 조건
//	1.메서드 이름이 같아야 한다
//	2.매개변수의 개수 또는 타입이 달라야 한다
//	
//	반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다
//	
//	오버로딩의 장점
//	1.메서드의 이름만 보고도 같은 기능을 하겠구나 쉽게 예측이 가능 
//	2.메서드의 이름을 절약
//	3.메서드의 이름 짓는데 고민을 덜 수 있다

	Scanner scan = new Scanner(System.in);

	int add(int x, int y) {
		int result;

		result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;

	}

	long add(int x, long y) {
		long result;

		result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;

	}

	long add(long x, int y) {
		long result;

		result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;

	}

	long add(long x, long y) {
		long result;

		result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;

	}
	
	double add(double x, double y) {
		double result;

		result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;
	}	

	double sub(double x, double y) {
		double result;

		result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		return result;
	}

	int sub(int x, int y) {
		int result;

		result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		return result;

	}

	long sub(long x, long y) {
		long result;

		result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		return result;

	}

	double mul(double x, double y) {
		double result;

		result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;
	}

	int mul(int x, int y) {
		int result;

		result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;

	}

	long mul(long x, long y) {
		long result;

		result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;

	}

	double div(double x, double y) {
		double result;

		result = (x / y);
		System.out.println(x + " / " + y + " = " + result);
		return result;
	}

	int div(int x, int y) {
		int result;

		result = (x / y);
		System.out.println(x + " / " + y + " = " + result);
		return result;

	}

	long div(long x, long y) {
		long result;

		result = (x / y);
		System.out.println(x + " / " + y + " = " + result);
		return result;

	}

}
