//switch(가벼움) 쉬운작업 <-> if문(상대적으로 무거움 왠만하면 다작동함)
//switch로 안되는 작업 -> if로는 가능 반대는 불가. 조건문은 if문이 중요함

public class SwitchEx1 {
	
	public static void main(String[] args) {
	
//		switch(조건식) {
//			case 값1:
//				조건식의 결과가 값1과 같을 경우 수행될 문장들
//			break;(종료)
//			case 값2:
//				조건식의 결과가 값2과 같을 경우 수행될 문장들
//			break;(종료)
//			default:
//				조건식의 결과가 일치하는 case문이 없을 때 수행될 문장들
//		
//		}
//		
//		switch문의 제약조건
//		조건식의 결과값이 반드시 정수여야 한다
//		조건식의 결과는 정수 또는 문자열
//		case문의 값은 정수 상수만 가능, 중복되면 안된다
//		break시점 또는 default에서 종료됨
//		break처리 안할경우 break를 만날때까지 만족하는 case 다음값을 전부 수행함
		
		int choiceNum = 0;
		
		choiceNum = 1;
		
		switch (choiceNum * 100) {
			case 100:
				System.out.println("당신의 점수는 100이고, 상품은 자전거입니다");
				break;
			case 200:
				System.out.println("당신의 점수는 200이고, 상품은 TV입니다");
				break;
			case 300:
				System.out.println("당신의 점수는 300이고, 상품은 노트북입니다");
				break;
			case 400:
				System.out.println("당신의 점수는 400이고, 상품은 자동차입니다");
				break;	
			default:
				System.out.println("꽝 다음 기회에");
				break;
		}
		
		System.out.println("시스템을 종료합니다.");
		
	}
}
