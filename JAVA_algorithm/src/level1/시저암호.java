package level1;

public class 시저암호 {
	
	String caesar(String s, int n) {
		String result = "";
		//n만큼 밀었을때 즉 아스키코드상에서 알파벳(26개)만큼만 밀어야하므로 한바퀴를 밀면 다시 제자리로 돌아오게하려고
		//즉 'a'에서 26자리 밀면 똑같이 'a'
		n = n % 26;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			//알파벳은 26자이므로 'z'다음 'a'가 와야되므로 26으로나눈 나머지(0)+'a'처리한것
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		return result;
	}
	
}
