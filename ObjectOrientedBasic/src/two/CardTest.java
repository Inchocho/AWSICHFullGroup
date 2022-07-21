package two;

public class CardTest {

	public static void main(String[] args) {
		
//		클래스명.클래스변수 (클래스변수는 클래스명을 기준으로 바로 사용 가능하다) Card.width
		System.out.println("카드 width: " + Card.width);
		System.out.println("카드 height: " + Card.height);
		
		Card card = new Card();
		card.kind = "Heart";
		card.num = 7;
		
		Card secondCard = new Card();
		secondCard.kind = "Spade";
		secondCard.num = 4;
		
		System.out.println("card는 " + card.kind + ", " 
				+ card.num + "이며, 크기는 " + Card.width + ", " 
				+ Card.height);
		
		System.out.println("secondCard는 " + secondCard.kind + ", " 
				+ secondCard.num + "이며, 크기는 " + Card.width + ", " 
				+ Card.height);
		
		System.out.println("card의 width와 height를 각각 50, 80" 
				+ "으로 변경합니다");

//		클래스변수는 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.	
//		Card클래스 타입 인스턴스(객체) card를 이용해 클래스변수를 변경한다.
//		card와 secondCard의 크기(width, height)를 확인
		
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("card는 " + card.kind + ", " 
				+ card.num + "이며, 크기는 " + Card.width + ", " 
				+ Card.height);
		
		System.out.println("secondCard는 " + secondCard.kind + ", " 
				+ secondCard.num + "이며, 크기는 " + Card.width + ", " 
				+ Card.height);		

//		즉 card의 width와 height를 변경한거같지만 이건 클래스변수를 변경한것이므로
//		테스트를 하기위해서 card인스턴스에서 클래스변수값을 변경했지만 일반적으로		
//		클래스변수의 경우 "클래스명.클래스변수명"으로 사용해야한다. 		
//		결과 card와 secondCard의 크기가 같이 50,80으로 출력됨 즉 클래스변수의 경우
//		클래스변수는 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.
	
	}
}
