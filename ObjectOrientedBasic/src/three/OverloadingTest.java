package three;

import java.util.Scanner;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		키보드 입력 하나를 받는다 
//		이 값으로 4칙연산이 각각 적용된다
		Scanner scan = new Scanner(System.in);

		long a = 0;
		long b = 0;

		System.out.println("첫번째값");
		a = scan.nextLong();

		System.out.println("두번째값");
		b = scan.nextLong();

		Calcurator calc = new Calcurator();

		int result = 0;

		result = calc.add(1000, 200);
		System.out.println(result);

		result = (int) calc.add(1000, 200L);
		System.out.println(result);

		result = (int) calc.add(1000L, 200);
		System.out.println(result);

		result = (int) calc.add(1000L, 200L);
		System.out.println(result);

		result = calc.sub(1000, 200);
		System.out.println(result);

		result = (int) calc.sub(1000, 200L);
		System.out.println(result);

		result = (int) calc.sub(1000L, 200);
		System.out.println(result);

		result = (int) calc.sub(1000L, 200L);
		System.out.println(result);

		result = calc.mul(1000, 200);
		System.out.println(result);

		result = (int) calc.mul(1000, 200L);
		System.out.println(result);

		result = (int) calc.mul(1000L, 200);
		System.out.println(result);

		result = (int) calc.mul(1000L, 200L);
		System.out.println(result);

		result = calc.div(1000, 200);
		System.out.println(result);

		result = (int) calc.div(1000, 200L);
		System.out.println(result);

		result = (int) calc.div(1000L, 200);
		System.out.println(result);

		result = (int) calc.div(1000L, 200L);
		System.out.println(result);

		result = (int) calc.div(a, b);
		System.out.println(result);

	}

}
