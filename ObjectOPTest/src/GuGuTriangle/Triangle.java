package GuGuTriangle;

import java.util.Scanner;

public class Triangle {
	
	int n = 0;
	
	Scanner scan = new Scanner(System.in);

	void triStar() {
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void triStar2() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
