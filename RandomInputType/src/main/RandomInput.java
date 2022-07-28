package main;

import java.util.Scanner;

public class RandomInput {

	static char ch = ' ';

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("영문자를 입력해주세요");
		String str = scan.next();
		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			arr[i] = ch;
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				System.out.println("원본: " + arr[i] + "대문자화: " + (char) (arr[i] - 32));
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				System.out.println("원본: " + arr[i] + "소문자화: " + (char) (arr[i] + 32));
			} else {
				System.out.println("영문자를 입력해주세요.");
			}

		}

		System.out.println("실제입력한값: " + str);

//		a: 97 A : 65 z: 122 Z: 90
//
//		if (ch >= 'a' && ch <= 'z') {
//			System.out.println("대문자화: " + (char)(ch-32));
//		} else if (ch >= 'A' && ch <= 'Z') {
//			System.out.println("소문자화: " + (char)(ch+32));
//		} else {
//			System.out.println("영문자를 입력해주세요.");
//		}
//		System.out.println("실제입력한값: " + str);

	}
}
