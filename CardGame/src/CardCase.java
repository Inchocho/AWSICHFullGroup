
public class CardCase {

	int numOfCards = Card.shapeArr.length * Card.numberArr.length;

	Card[] cardArr = new Card[numOfCards];

	CardCase() {
		int totalCnt = 0; // 52장의 카드를 위한 배열 인덱스

		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt] = new Card(i, n);
				totalCnt++;
			}
		} // 전체 for문 종료
	}

	// 지정된 위치의 카드를 뽑는다
	Card pick(int index) {
		return cardArr[index];
	}

	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int rand = 0;

			rand = (int) (Math.random() * numOfCards);

			Card tempCard = null;

			tempCard = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = tempCard;

		} // for 종료
	}

//	카드케이스의 카드 보기 4줄안에 모든 카드종류가 출력이 되는 기능을 구현(포함관계를 이용)

	void showAll() {

		for (int i = 0; i < cardArr.length; i++) {
			if (i % 13 == 0) {
				System.out.println();
			}
			System.out.print(cardArr[i].getCard());
		}
	}

}
