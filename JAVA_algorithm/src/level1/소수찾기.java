package level1;

import java.util.Arrays;

public class 소수찾기 {
	
	int numberOfPrime(int n) {
		int count = 0;
		int result = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			//2도 소수니까 추가처리
			if (count == 2)
				result++;
			count = 0;
		}

		return result;
	}
	
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        //Arrays.fill(배열, 초기화값) 배열의 모든값을 같은값으로 초기화
        Arrays.fill(arr, 0);

        for(int i = 2; i <= n; i++){
            if(arr[i] == 0){
                answer++;
                for(int j = i; j <= n; j += i){
                    arr[j] = 1;
                }
            }

        }
        return answer;
    }	
}
