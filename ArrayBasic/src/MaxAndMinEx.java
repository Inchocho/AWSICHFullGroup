
public class MaxAndMinEx {

	public static void main(String[] args) {

		int ranNum = 0;
		int[] scoreArr = new int[5];
		
		System.out.print("랜덤 정수 뽑기(1~20): ");

		for (int i = 0; i < scoreArr.length; i++) {
			ranNum = (int) (Math.random() * 20) + 1;
			scoreArr[i] = ranNum;
			System.out.print(scoreArr[i] + "\t");
		}

		int maxNum = scoreArr[0];
		int minNum = scoreArr[0];

		System.out.println("\n");

		for (int i = 0; i < scoreArr.length; i++) {
			if (maxNum < scoreArr[i]) {
				maxNum = scoreArr[i];
			} else if (minNum > scoreArr[i]) {
				minNum = scoreArr[i];
			}
		}

		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum +"\n");

		int[] cnumArr = new int[8];
		
		for(int i=0; i<cnumArr.length; i++) {
			cnumArr[i] = (i+1)*10;
			System.out.print(cnumArr[i] + "\t");
		}
		
		System.out.println("\n");

		int maxNum2 = cnumArr[0];
		int minNum2 = cnumArr[0];

		for (int i = 0; i < cnumArr.length; i++) {
			if (maxNum2 < cnumArr[i]) {
				maxNum2 = cnumArr[i];
			} else if (minNum2 > cnumArr[i]) {
				minNum2 = cnumArr[i];
			}
		}

		System.out.println("최대값: " + maxNum2);
		System.out.println("최소값: " + minNum2);

	}
}
