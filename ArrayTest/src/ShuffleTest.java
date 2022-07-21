
public class ShuffleTest {
	public static void main(String[] args) {

//		int[] numArr = new int[45];
//		int lotto = 0;
//		int temp = 0;
//
//		for (int i = 0; i < numArr.length; i++) {
//			numArr[i] = i+1;
//		}
//
//		int pos = 0; // 인덱스의 위치를 활용할 변수
//		int tempNum = 0;
//		for (int i = 0; i < 10000; i++) {
//			pos = (int) (Math.random() * 45);
//			tempNum = numArr[0];
//			numArr[0] = numArr[pos];
//			numArr[pos] = tempNum;
//		}
//
//		for (int i = 0; i < 6; i++) {
//			System.out.print(numArr[i] + "\t");
//		}

		int[] num = new int[6];
		int lotto2 = 0;
		int temp2 = 0;

		int pos2 = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
//		int[] samej = new int[6];

		for (int i = 0; i < 5000000; i++) {	
			for (int j = 0; j < num.length; j++) {
				pos2 = (int) (Math.random() * 45) + 1;
				temp2 = num[j];
				num[j] = pos2;
				pos2 = temp2;
				for (int k = 0; k < j; k++) {
					if (num[k] == num[j]) {
						j--;
						break;
					}
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

//		int[] lotto = new int[6];
//
////		 번호 생성
//		for (int i = 0; i < 6; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//
////			  	  중복 번호 제거
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.print("로또 번호: ");
//
////		  번호 출력
//		for (int i = 0; i < 6; i++) {
//			System.out.print(lotto[i] + " ");
//		}

	}
}
