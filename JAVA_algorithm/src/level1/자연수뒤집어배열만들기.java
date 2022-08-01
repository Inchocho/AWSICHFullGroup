package level1;

public class 자연수뒤집어배열만들기 {

	public int[] solution(long n) {
		String a = "" + n;
		int[] answer = new int[a.length()];
		int cnt = 0;

		while (n > 0) {
			answer[cnt] = (int) (n % 10);
			n /= 10;
			System.out.println(n);
			cnt++;
		}
		return answer;
	}

	public int[] solution2(long n) {
		int[] answer;
		//count의 값 - n의 자릿수가된다
		int count = 0;
		long temp = n;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		answer = new int[count];
		for (int i = 0; i < count; i++) {
			answer[i] = (int) (n % 10);
			n /= 10;
		}

		return answer;
	}
}
