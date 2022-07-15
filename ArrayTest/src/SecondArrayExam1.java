
public class SecondArrayExam1 {
	public static void main(String[] args) {

//		2차원 배열에 강사가 제시한 값들을 순차적으로 담으시오
//		2 4 6 8 10 12 14 16 18
//		3 6 9 12 15 18 21 24 27

		int[][] evenArr = new int[4][5]; // 4행5열(4row5column)
//
//		System.out.println(evenArr.length);
//		System.out.println(evenArr[0].length);

		for (int i = 0; i < evenArr.length; i++) {
			for (int j = 0; j < evenArr[0].length; j++) {
				evenArr[i][j] = (i + 2) * (j + 1);
				System.out.print(evenArr[i][j] + " ");
			}
			System.out.println();
		}
		
		int cnt = 2;
		
		for (int i = 0; i < evenArr.length; i++) {
			for (int j = 0; j < evenArr[0].length; j++) {
				evenArr[i][j] = cnt * (j + 1);
				System.out.print(evenArr[i][j] + " ");				
			}
			cnt++;
			System.out.println();
		}		

	}
}
