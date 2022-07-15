
public class ArrayEx5 {

	public static void main(String[] args) {

//		다차원 배열
//		
//		2차원 배열
//		
//		선언 방법
//		타입[][] 변수명 = new int[크기][크기];
//		
//		ex:int[][] numArr = new int[3][4];
//		int배열배열 numArr = 뉴 인트[3][4];
//		3행 4열의 2차원 배열을 생성한다

		int[][] numArr = new int[3][4];

//		System.out.println(numArr);
//		System.out.println(numArr[0]);
//		System.out.println(numArr[0][0]);

//		numArr[0][0] = 1;
//		numArr[0][1] = 2;
//		numArr[0][2] = 3;
//		numArr[0][3] = 4;
//		numArr[1][0] = 5;
//		numArr[1][1] = 6;
//		numArr[1][2] = 7;
//		numArr[1][3] = 8;
//		numArr[2][0] = 9;
//		numArr[2][1] = 10;
//		numArr[2][2] = 11;
//		numArr[2][3] = 12;

		System.out.println(numArr.length);
		System.out.println(numArr[0].length);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				numArr[i][j] = (4 * i) + (j + 1);
				System.out.print(numArr[i][j] + " ");
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[0].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
		}

//		System.out.println(numArr[0][0]);
//		System.out.println(numArr[0][1]);
//		System.out.println(numArr[0][2]);
//		System.out.println(numArr[0][3]);
//		System.out.println(numArr[1][0]);
//		System.out.println(numArr[1][1]);
//		System.out.println(numArr[1][2]);
//		System.out.println(numArr[1][3]);
//		System.out.println(numArr[2][0]);
//		System.out.println(numArr[2][1]);
//		System.out.println(numArr[2][2]);
//		System.out.println(numArr[2][3]);

	}
}
