package level1;

public class 하샤드수 {
	public boolean isHarshad(int num) {
		int sum = 0;
		int n = num;
		// n이 0이 아니면(양의 정수면 n>0)
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		if (num % sum == 0)
			return true;
		else
			return false;
	}
}
