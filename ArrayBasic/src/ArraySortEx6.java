//오름차순
public class ArraySortEx6 {
	public static void main(String[] args) {

		int[] numArr = { 10, 20, 3, 50, 40 };
		//오름차순 전체 정렬
		int tempNum = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr.length; n++) {

				if (numArr[i] < numArr[n]) {
					tempNum = numArr[n];
					numArr[n] = numArr[i];
					numArr[i] = tempNum;
				}
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}

	}
}
