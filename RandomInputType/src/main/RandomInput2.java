package main;

import java.util.Scanner;

public class RandomInput2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char[] arr = new char[input.length()];

		for (int i = 0; i < arr.length; i++) {
			char c = ' ';
			c = input.charAt(i);
			arr[i] = c;
		}

		for (char c : arr) {	//for-each문
			if (Character.isUpperCase(c))
				System.out.println(c + "는 대문자입니다.");
			if (Character.isLowerCase(c))
				System.out.println(c + "는 소문자입니다.");
			if (Character.isDigit(c))
				System.out.println(c + "은 숫자입니다.");
		}
	}

}
