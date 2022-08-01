package level1;

public class 자릿수더하기 {
	public int solution(int n) {
		int answer = 0;

		//n이 10보다 클때까지
		while (n > 10) {
			//answer는 n%10을 계속 더해준다(1)순서
			answer += n % 10;
			//만약 n이 10보다 작으면 종료(2~3)순서 -- 여기 조건만족하면 들어옴
			if (n < 10)
				break;
			//n은 n/10;  (2)순서
			n = n / 10;
		}

		return answer;
	}
}
