package level1;

public class 서울에서김서방찾기 {

	public String solution(String[] seoul) {
		String answer = "";
		int cnt = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + cnt + "에 있다";
				break;
			}
			cnt++;
		}
		return answer;
	}

}
