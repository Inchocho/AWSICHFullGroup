
public class Card {

//	카드생성을 위한 클래스변수 (문양,숫자)
	static String[] shapeArr = { "♥", "◆", "♠", "♣" };
	static String[] numberArr = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	String card = "";

	Card() {
		init();
	}
	
	Card(int shapeIndex, int numberIndex) {
		init(shapeIndex,numberIndex);
	}

//	Card(int shapeIndex, int numberIndex) {
//		
//	}

//	임의의 카드를 생성하는 메소드
//	클래스변수(String배열형태 shapeArr,numberArr)을 이용해서
//	지역변수 shapeIndex,numberIndex에 Math.random을 이용해 
//	무작위로 배열길이만큼의 숫자를 집어넣고 그 변수를
//	인스턴스변수 card에 배열의 인덱스넘버로 대입해서 사용한다
	void init() {
		int shapeIndex = 0;
		shapeIndex = (int) (Math.random() * shapeArr.length);

		int numberIndex = 0;
		numberIndex = (int) (Math.random() * numberArr.length);

		card = shapeArr[shapeIndex] + numberArr[numberIndex];

	}

//	수동으로 카드를 선택해서 생성하는 메소드
//	임의의 카드를 생성하는 메소드에서 응용
//	이번엔 무작위로 뽑지않고 매개변수로 1번배열(문양),2번배열(숫자)값을 넣어서
//	인스턴스 변수 card에 대입하여 출력
	void init(int shapeIndex, int numberIndex) {
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}

	String getCard() {
		return card;
	}
}
