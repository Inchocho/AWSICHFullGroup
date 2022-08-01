package level1;

public class 핸드폰번호별가리기 {
	public String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
		for (int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		}
		// String.valueOf로 값을 반환
		return String.valueOf(ch);
	}

	class Solution {	//정규표현식 응용 - 전방탐색)
		public String solution(String phone_number) {
			return phone_number.replaceAll(".(?=.{4})", "*");
		}
	}

}
