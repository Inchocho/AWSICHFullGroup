package level1;

import java.util.*;

public class 문자열내마음대로정렬하기 {

	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		// ArrayList 사용
		ArrayList<String> array = new ArrayList<String>();

		for (int i = 0; i < strings.length; i++) {
			array.add(strings[i].charAt(n) + strings[i]);
		}

		Collections.sort(array);

		for (int i = 0; i < array.size(); i++) {
			answer[i] = array.get(i).substring(1);
		}

		return answer;
	}
	
	//문자열을 앞으로 옮길 생각 대단함
    public String[] solution2(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }	

}
