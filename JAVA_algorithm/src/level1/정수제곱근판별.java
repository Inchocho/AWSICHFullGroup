package level1;

public class 정수제곱근판별 {

	public long solution(long n) {
		if (Math.pow((int) Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		}
		return -1;
	}

	public long solution2(long n) {
		long answer = 0;

		for (long i = 1; i <= n; i++) {
			if (n == (i * i)) {
				answer = i + 1;
				answer = answer * answer;
				break;
			} else
				answer = -1;
		}
		return answer;
	}
}
