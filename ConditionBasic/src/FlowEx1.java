
public class FlowEx1 {

	public static void main(String[] args) {

//		조건문		
//		if(조건식) { <- 블럭(block) {} 블럭
//			조건식이 true일 때 수행될 문장들을 적는다
//		}

		int score = 0;

		score = 60;

		if (score > 60) { // 블럭이 없으면 첫문장을 if문(true)와 연관을 지음
			System.out.println("합격입니다.");
			System.out.println("난 조건문하고 관련 있어. 조건문을 타야 실행됨");
		}

//		if (score > 60) < -- 나쁜케이스임 하지마라 무조건 블록화 if(){} 하셈
//			System.out.println("조건 맞음 합격");
//			System.out.println("조건 안맞음 불합격");

		System.out.println("여기는 무조건 실행됨");

	}

}
