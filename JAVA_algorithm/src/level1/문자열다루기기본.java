package level1;

public class 문자열다루기기본 {

	public boolean solution(String s) {
		char b = ' ';
		boolean answer = false;
		answer = true;
		int a = s.length();

		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				b = (char) s.charAt(i);
				if (b >= 48 && b <= 57) {
				} else if (b >= 'a' && b <= 'z') {
					answer = false;

				} else if (b >= 'A' && b <= 'Z') {
					answer = false;

				}
			}
		} else {
			answer = false;
		}

		return answer;
	}
	
	//예외처리를 통해 Integer.parseInt()가 모두 처리되면 true 아니면 에러캐치 false 대단
	class Solution {
		public boolean solution(String s) {
			if (s.length() == 4 || s.length() == 6) {
				try {
					int x = Integer.parseInt(s);
					return true;
				} catch (NumberFormatException e) {
					return false;
				}
			} else
				return false;
		}
	}

	public static void main(String[] args) {
		문자열다루기기본 a = new 문자열다루기기본();

		System.out.println(a.solution("1234"));
	}
}
