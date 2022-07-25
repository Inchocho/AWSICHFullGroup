package ArrayGugudan;

import java.util.Scanner;

public class AryguguMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하시는 구구단 값을 입력하세요.");
		int inputNum = 0;
		inputNum = scan.nextInt();

		Arygugu gu = new Arygugu();
//		gu.gugu0(inputNum);
		
		gu.gugu2(inputNum);

	}
}
