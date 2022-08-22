package level1;

import java.util.Arrays;

public class 정수내림차순배치 {

	public int reverseInt(int n) {
		String arr[] = String.valueOf(n).split("");

		Arrays.sort(arr);
		String str = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			str += arr[i];
		}

		return Integer.parseInt(str);
	}

	public long solution(long n) {

		String num = String.valueOf(n);
		String getNum = "";
		char[] arr = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			arr[i] += num.charAt(i);
		}
		// 정렬을 sort메소드를 이용해서 하자
		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			getNum = getNum + arr[i];
		}

		long answer = Long.parseLong(getNum);
		return answer;
	}
}
