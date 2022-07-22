
public class CardCaseTest {

	public static void main(String[] args) {

//		CardCase 클래스 인스턴스를 만드는 시점에 이미 52장카드는 있음(인스턴스변수 numOfCards)
//		int numOfCards = Card.shapeArr.length * Card.numberArr.length;
		CardCase cardCase = new CardCase();
		Card card = null;

		card = cardCase.pick(0);
		System.out.println(card.getCard());

//		cardCase.shuffle();
		card = cardCase.pick(0);
		System.out.println(card.getCard());

		for (int i = 0; i < cardCase.cardArr.length; i++) {
			card = cardCase.pick(i);
			System.out.print(card.getCard());
		}
		System.out.println();
		
		cardCase.showAll();

	}
}
