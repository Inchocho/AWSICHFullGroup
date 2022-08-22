package two;

public class ForExpansion {	//for문의 확장 for each문 설명

	public static void main(String[] args) {
		
		int[] numArr = new int[5];
		
//		데이터를 가공처리할때 
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		
//		확장 포문, for each문 --> 단순하게 데이터의 값이 필요할경우 모든 값을 출력할때 
		
		for(int num : numArr) {
			System.out.println(num);
		}
	}
}
