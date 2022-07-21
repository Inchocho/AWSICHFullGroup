package GuGuTriangle;

public class ArrayPlusTest {

	public static void main(String[] args) {
		ArrayPlus arr = new ArrayPlus();

		int result2 = 0;
		int[] cArr = new int[1];
		int[] dArr = new int[1];

		cArr[0] = 10;
		dArr[0] = 20;

		result2 = arr.add2(cArr, dArr);

		System.out.println(cArr[0]);
		System.out.println(dArr[0]);

		System.out.println(result2);

	}

}
