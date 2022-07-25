package ArrayGugudan;

public class Arygugu {

	int[][] guguDan = new int[10][9];

	void gugu0(int a) { 
	for(int i = a; i == a; i++) {
		for(int j = 0; j < 9; j++) {
			guguDan[i][j] = (i)*(j+1);
			System.out.print(i + " * " + (j+1) 
					+ " = " + guguDan[i][j]+"\t");
		}
		System.out.println();
		}
	}
	
	void gugu1(int a) {
	for(int i = 0; i < guguDan[0].length; i++) {
		for(int j = 0; j < guguDan.length; j++) {			
			guguDan[i][j] = (i+1)*(j+1);
			System.out.print(a + "단: " + " = " + guguDan[i][j]+"\t");
		}
		System.out.println();
		}
	}
	
	void gugu2(int a) {
		for(int i = a; i == a; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(i + " * " + (j+1) + " = " + i*(j+1) + "\t");
			}
		}
	}
}