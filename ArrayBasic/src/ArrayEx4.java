
public class ArrayEx4 {

	public static void main(String[] args) {
		
//		배열 선언 방법 2
//		타입[] 변수명 = {값, 값, 값, ,,, 값}
		
		int sum = 0;
		int[] scoreNumArr = {100, 88, 100, 100, 90};
		
//		안좋은 방식의 예임 한번에 여러개를 더하는것 무조건 최소단위로 실행
//		동시에 여러가지 작업하는 코드 XXXX		
		
		sum = scoreNumArr[0] + scoreNumArr[1] + scoreNumArr[2] 
				+scoreNumArr[3] + scoreNumArr[4];
		
//		위와 아래 결과는 같지만 아래방식으로 사용해야한다.
		
		
//		아래처럼 최소단위로 sum = sum + scoreNumArr[0]; 분리해서 진행해야 한다
//		여기서 바뀌는건 0 -> 1 -> 2 즉 인덱스 위치만 변경된다.
		
		sum = sum + scoreNumArr[0];
		sum = sum + scoreNumArr[1];
		sum = sum + scoreNumArr[2];
		sum = sum + scoreNumArr[3];
		sum = sum + scoreNumArr[4];
		
//		아래처럼 최소단위 sum = sum + scoreNumArr[i]; 로 분리했을경우 for문을 통해서 연산이 가능하다.
		
		for (int i = 0; i < scoreNumArr.length; i++) {
			sum = sum + scoreNumArr[i];
		}		
		
//		System.out.println("모든 성적의 총점: " + sum);
		
	}
}
