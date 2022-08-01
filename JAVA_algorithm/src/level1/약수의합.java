package level1;

public class 약수의합 {

	public int sumDivisor(int num) {
		int answer = 0;
		// for문 조건이 i <= num/2 인 이유: 최대공약수의 합이 아닌 모든약수의 합이므로
		// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
		// 절반까지만 돌리면 된다(정확히 제곱근까지)
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				answer += i;
		}
		return answer + num;
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				answer = answer + i;
			}
		}
		answer = answer + n;
		return answer;
	}
}
