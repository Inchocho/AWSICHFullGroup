package level1;

public class 최대공약수_최소공배수 {
	
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		int temp = 1;
		int gcd = a * b;
		while (temp != 0) {
			temp = b % a;
			b = a;
			a = temp;
		}
		answer[0] = b;
		answer[1] = gcd / b;
		return answer;
	}
	
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
}
