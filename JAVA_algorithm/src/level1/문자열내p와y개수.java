package level1;

public class 문자열내p와y개수 {

	boolean solution(String s) {
		boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;

		for (int i = 0; i < s.length(); i++) {
			String a = "";
			a = s.charAt(i) + "";
			if (a.equals("y") || a.equals("Y")) {
				yCnt++;
			} else if (a.equals("p") || a.equals("P")) {
				pCnt++;
			}
		}

		if (pCnt != yCnt) {
			answer = false;
		}

		return answer;

	}

	//소,대문자 둘다 같으면 이니까 그냥 애초에 s를 전부 소문자로 만들고 계산함 
	boolean solution2(String s) {
		s = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'p')
				count++;
			else if (s.charAt(i) == 'y')
				count--;
		}

		if (count == 0)
			return true;
		else
			return false;
	}

}
