
public class ArrayExamTest1 {

	public static void main(String[] args) {

//		홀수 값만 배열에 저장하시오.

		int sum = 0;
		int odd = 0;	
		int num = 0;

		int[] oddArr = new int[5];
		
		for(int cnt = 1; cnt <=10; cnt++) {
			if(cnt % 2 == 1) {
				oddArr[num] = cnt;
				sum = sum +cnt;
				num++;
			}
		}
		
		int seq = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				oddArr[seq] = i;
				sum = sum + i;
				seq++;
			}
		}
				
		System.out.println("1부터 10까지의 홀수값의 합 :" + sum);

	}
}
