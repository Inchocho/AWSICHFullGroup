//VarExchangeEx2 참조(변수로 구현했음)
public class Shuffle {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println();

		int pos = 0;	//인덱스의 위치를 활용할 변수
		int tempNum = 0;
		for (int i = 0; i < 100; i++) {

//			pos에도 0~9까지의 값을 무작위로 넣어주는 이유 - numArr의 인덱스가 0~9이므로 (int[10])
			pos = (int) (Math.random() * 10);

			tempNum = numArr[0];
			numArr[0] = numArr[pos];
			numArr[pos] = tempNum;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}

	}
}
