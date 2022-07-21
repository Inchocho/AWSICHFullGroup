
public class MaxAndMin {

	public static void main(String[] args) {

//		랜덤한 숫자 5개를 배열에 담는다
//		
//		그 5개의 숫자중에 가장 큰 값과 작은 값을 출력하시오.

		int ranNum = 0;

		int[] ranArr = new int[5];

		for (int i = 0; i < 5; i++) {
			ranNum = (int) ((Math.random() * 20)) + 1;
			ranArr[i] = ranNum;
			System.out.print(ranArr[i]+"\t");
		}

		System.out.println();
		
		int max = ranArr[0];
		int min = ranArr[0];

//		 max의 값보다 array[i]이 크면 max = array[i]
//		 min의 값보다 array[i]이 작으면 min = array[i]

		for (int i = 0; i < ranArr.length; i++) {
			if (max < ranArr[i]) {
				max = ranArr[i];
			}

//		max < ranArr[i] ? max = ranArr[i]; --> max = ranArr[0]
//		즉 ranArr[0] -> 0번째 요소와  0,1,2,3,4번째 값을 비교해서 최대값을 넣는것 (최소값도 동일)
			
			if (min > ranArr[i]) {
				min = ranArr[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
}
