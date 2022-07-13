
public class FlowEx4 {
	public static void main(String[] args) {

//		if-else if문
//		if(조건식1) {
//			조건식1의 연산결과가 true 일때 수행될 문장들
//		}else if(조건식2) {
//			조건식2의 연산결과가 true 일때 수행될 문장들
//		}else if(조건식3) {
//			조건식3의 연산결과가 true 일때 수행될 문장들
//		}else {
//			위의 어느 조건식도 만족하지 않을때 수행될 문장들
//		}

		int score = 0;
		score = 80;
		String gradeStr = "";

		if (score >= 90) {
			gradeStr = "A";
			System.out.println("★여기를 탔어요 A");
			System.out.println("연산 종료~");
		} else if (score >= 80) {
			gradeStr = "B";
			System.out.println("★여기를 탔어요 B");
			System.out.println("연산 종료~");
		} else if (score >= 70) {
			gradeStr = "C";
			System.out.println("★여기를 탔어요 C");
			System.out.println("연산 종료~");
		} else {
			gradeStr = "F";
			System.out.println("★여기를 탔어요 F");
			System.out.println("연산 종료~");
		}

		System.out.println("당신의 학점은 " + gradeStr + "입니다.");

	}
}
