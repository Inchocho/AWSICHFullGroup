package level1;

import java.util.Arrays;

public class 문자열내림차순배치 {

	public String solution(String s) {
		String answer = "";
		char[] arr = s.toCharArray();
		char a = ' ';
		Arrays.sort(arr);

		for (int i = arr.length - 1; i != -1; i--) {
			answer = answer + arr[i];
		}
		return answer;
	}
	
	//StringBuilder의 함수 reverse()를 통해 정렬을함

	public String reverseStr(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}

}
