package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {
	
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		//int[] copyArr = new int[arr.length-1]; -> arr.clone()과 동일
		int[] copyArr = arr.clone();
		Arrays.sort(copyArr);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < copyArr.length; i++) {
			if (arr[i] != copyArr[0])
				list.add(arr[i]);
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
