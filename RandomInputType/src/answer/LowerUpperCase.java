package answer;

import java.util.Scanner;

public class LowerUpperCase {
	public static void main(String[] args) {
		char alpha;

		System.out.println("한 문자를 입력하세요 >>>");
		Scanner in = new Scanner(System.in);
		alpha = in.next().charAt(0);

		if (alpha >= 'a' && alpha <= 'z') {
			// ASCII 코드값: 'a' : 97, 'A' : 65
			alpha = (char) (alpha - 32);
		} else if (alpha >= 'A' && alpha <= 'Z') {
			alpha = (char) (alpha + 32);
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		System.out.println(alpha);

	}
}