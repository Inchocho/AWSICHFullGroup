package GuGuTriangle;

import java.util.*;

public class GuGu {

	int n = 0;

	Scanner scan = new Scanner(System.in);

//	야매로 한거(문제는 출력문을 메인에서 실행)
	int guguDan(GuGu gu) {
		n = scan.nextInt();
		for (int i = gu.n; i == gu.n; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j + " ");
			}

		}
		return n;
	}

//	리턴을 출력할 문자열 즉 String타입을 리턴을 받아야된다.	
	String guguDan2(GuGu gu) {
		String mul = "";
		n = scan.nextInt();
		for (int i = n; i <= n; i++) {
			for (int j = 1; j < 10; j++) {
				mul += i + " * " + j + " = " + (i * j) + "\n";
			}

		}
		return mul;
	}

}
