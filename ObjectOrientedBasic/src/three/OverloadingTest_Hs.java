package three;

import java.util.Scanner;

public class OverloadingTest_Hs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;

		System.out.println("1번째 값을 입력해주세요.");
		a = scan.nextInt();
		System.out.println("2번째 값을 입력해주세요.");
		b = scan.nextInt();

		System.out.println();
		System.out.println(1);
		System.out.println("설마");
		System.out.println(true);

		Calculator_Hs calc = new Calculator_Hs();

		double result = 0;

		result = calc.add(a, b);
//		System.out.println("int + int : " + result);

		result = calc.add(a, b);
//		System.out.println("double + double : " + result);

		result = calc.add(a, b);
//		System.out.println("long + long : " + result);
		result = calc.sub(a, b);

		result = calc.sub(a, b);

		result = calc.sub(a, b);

		result = calc.div(a, b);

		result = calc.div(a, b);

		result = calc.div(a, b);

		result = calc.mul(a, b);

		result = calc.mul(a, b);

		result = calc.mul(a, b);

	}
}
