package lotto;

public class Lotto {

	public int buylot = 0;
	static int[] winLotto = new int[6];
	public int[][] lotto = new int[6][6];

	public Lotto() {
		System.out.println("==============당첨번호===============");
		winLotto();
		printWin();
	}

	public static void winLotto() {
		for (int i = 0; i < winLotto.length; i++) {
			winLotto[i] = (int) ((Math.random() * 45) + 1);
		}
	}

	public void lottoBuy(int n) {
		buylot = n;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				this.lotto[i][j] = (int) ((Math.random() * 45) + 1);
			}
		}
	}

	public static void printWin() {
		for (int i = 0; i < winLotto.length; i++) {
			int n = 1;
			n = n + i;
			System.out.print(" 당첨번호" + n + ": " + winLotto[i]);
		}
		System.out.println();
	}

	public void printLotto() {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				int n = 1;
				n = n + j;
				for (int k = 0; k < winLotto.length; k++) {
					if (winLotto[k] == lotto[i][j]) {
						System.out.print("***");
						continue;
					}
				}
				System.out.print(" 번호" + n + "번: " + lotto[i][j]);
			}
			System.out.println();
		}
	}

}
