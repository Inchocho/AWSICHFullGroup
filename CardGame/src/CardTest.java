
public class CardTest {

	public static void main(String[] args) {

		Card card = new Card();

		String myCard = "";

		myCard = card.getCard();

		System.out.println(myCard);
		
		Card card2 = new Card(2,12);
		
		myCard = card2.getCard();

		System.out.println(myCard);		
	}
}
