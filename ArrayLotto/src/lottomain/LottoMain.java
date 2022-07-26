package lottomain;

import java.util.Scanner;

import lotto.Lotto;

public class LottoMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Lotto lot = new Lotto();

		System.out.println("몇개살거야?");
		lot.buylot = scan.nextInt();

		lot.lottoBuy(lot.buylot);

		System.out.println();
		lot.printLotto();

	}
}
