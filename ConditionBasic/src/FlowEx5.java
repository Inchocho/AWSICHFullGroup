import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = 0;
		score = scan.nextInt();
		String grade = "";

//		중첩if문
//		중첩if문 수행순서
//		if(조건식1) {
//			조건식 true시 수행
//			if(조건식2) {
//				조건식2 true시 수행
//			}else {
//				조건식1은 true, 2는 false일시 실행
//			}
//		}else {
//			
//		}

//		유효성 검사
		if (score > 100) {
			System.out.println("입력값 확인");
		}

		if (score >= 90) {
			grade = "A";
			
			if (score >= 95) {
				grade = grade + "+";
			} else if (score <= 92) {
				grade = grade + "-";
			}

		} else if (score >= 80) {
			grade = "B";

			if (score >= 85) {
				grade = grade + "+";
			} else if (score <= 82) {
				grade = grade + "-";
			}

		} else if (score >= 70) {
			grade = "C";

			if (score >= 75) {
				grade = grade + "+";
			} else if (score <= 72) {
				grade = grade + "-";
			}
		} else if (score >= 60) {
			grade = "D";

			if (score >= 65) {
				grade = grade + "+";
			}

		} else {
			grade = "F";
		}
		System.out.println("당신의 점수는 " + score + "점 입니다." 
				+ "등급은 " + grade + " 입니다.");

//		scan.close();
	}

}
