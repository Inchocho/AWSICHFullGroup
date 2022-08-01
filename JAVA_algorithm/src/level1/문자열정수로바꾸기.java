package level1;

public class 문자열정수로바꾸기 {

	//알고리즘 <-- 이쪽으로 풀어야됨
	public int getStrToInt(String str) {
		boolean Sign = true;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '-')
				Sign = false;
			else if (ch != '+')
				result = result * 10 + (ch - '0');
		}
		//sign이 true면 1 아니면 -1 * result(부호처리하는것)
		return Sign ? 1 : -1 * result;
	}

	//이건 함수사용이잖아 알고리즘이 아님
	class Solution {
		public int solution(String s) {
			return Integer.parseInt(s);
		}
	}
}
