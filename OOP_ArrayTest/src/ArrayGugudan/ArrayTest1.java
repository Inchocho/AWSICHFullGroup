package ArrayGugudan;

public class ArrayTest1 {
	public static void main(String[] args) {

		int[] array = new int[5];
		int ranNum = 0;

		for (int i = 0; i < 5; i++) {
			ranNum = (int) (Math.random() * 20) + 1;
			array[i] = ranNum;
		}

		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}
}
