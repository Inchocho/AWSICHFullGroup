package practice;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = "";
		System.out.println("영문자를 입력해주세요.");
		input = sc.next();
		char[] chkCaseArr = new char[input.length()];
		char c = ' ';
		c = input.charAt(0);

		for (int i = 0; i < chkCaseArr.length; i++) {
			c = input.charAt(i);
			chkCaseArr[i] = c;
			if (chkCaseArr[i] >= 'a' && chkCaseArr[i] <= 'z') {
				System.out.println((char) (chkCaseArr[i] - 32));
			} else if (chkCaseArr[i] >= 'A' && c <= 'Z') {
				System.out.println((char) (chkCaseArr[i] + 32));
			} else {
				System.out.println("영문자를 입력해주세요.");
			}

		}
		System.out.println("실제입력값: " + input);

	}

}
