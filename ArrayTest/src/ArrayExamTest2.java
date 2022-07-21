import java.util.Scanner;

public class ArrayExamTest2 {

	public static void main(String[] args) {
		
		int[] scoreArray = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		
		int sumScore = 0;
		double avgScore = 0;
		
		System.out.println("국어 점수를 입력해주세요.");
		korScore = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		engScore = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		mathScore = scan.nextInt();
		
		scoreArray[0] = korScore;
		scoreArray[1] = engScore;
		scoreArray[2] = mathScore;
		
//		for(int i = 0; i<scoreArray.length; i++) {
//			scoreArray[i] = scan.nextInt();
//		}
		
		for(int i=0;i<scoreArray.length;i++) {
			sumScore = sumScore + scoreArray[i];			
		}
		
//		avg  = (int)((sum)/3.0 + 0.005) * 100)/100.0;

//		위와 아래는 같은작업을 하지만 아래로 작성하는걸 추천한다.(한번에 여러연산을 하는건 컴퓨터방식이아님)		
//		수행되는 모든 로직을 최소단위로 분리하는것 << 제일중요함		

//		강사님이짠 코드(로직 최소단위 분리작업 매우중요)		
//		avgScore = sumScore / 3.0;
//		avgScore = avgScore + 0.005;
//		avgScore = avgScore * 100;
//		avgScore = (int)avgScore;
//		avgScore = avgScore / 100.0;
//		
//		System.out.println("평균: " + avgScore);

//		내가짠코드(비효율 + 출력문에서 해결을함)		
		avgScore = (double)sumScore/scoreArray.length;
		
		System.out.println("총점 :" + sumScore);		
		System.out.printf("평균: " + "%.2f%n", + avgScore);
		System.out.println("평균 :" + (Math.round((avgScore)*1000)/1000.0));
				
	}
}
