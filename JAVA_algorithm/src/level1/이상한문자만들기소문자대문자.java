package level1;

public class 이상한문자만들기소문자대문자 {

	public String solution(String s) {
		// toCharArray -> String을 char타입 배열로 만드는 메소드
		char[] chars = s.toCharArray();
		int idx = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ')
				idx = 0;
			else
				chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) 
						: Character.toLowerCase(chars[i]));
		}

		//char타입 배열의 값을 String형태로 값을 출력
		return String.valueOf(chars);
	}
}
