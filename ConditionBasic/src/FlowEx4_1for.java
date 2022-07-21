import java.util.Scanner;

public class FlowEx4_1for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = "";
		
		//for문의 성질을 이용해서 범위를 작성

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "점 입니다." + "등급은 " + grade + " 입니다.");

		scan.close();
	}

}
