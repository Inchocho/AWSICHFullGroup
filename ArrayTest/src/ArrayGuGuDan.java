
public class ArrayGuGuDan {
	public static void main(String[] args) {
		
		int [][] guguDan = new int[9][9];
		
		for(int i = 0; i < guguDan[0].length-1; i++) {
			for(int j = 0; j < guguDan.length; j++) {
				guguDan[i][j] = (i+2)*(j+1);
				System.out.print((i+2) + " * " + (j+1) 
						+ " = " + guguDan[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("====================================================================");
		for(int i = 0; i < guguDan[0].length; i++) {
			for(int j = 0; j < guguDan.length-1; j++) {
				guguDan[i][j] = (j+2)*(i+1);
				System.out.print((j+2) + " * " + (i+1) 
						+ " = " + guguDan[i][j]+"\t");
			}
			System.out.println();
		}		
		System.out.println();
		
		int [][] guguDan2 = new int[9][9];
		
		for(int i = 0; i < guguDan2[0].length-1; i++) {
			for(int j = 0; j < guguDan2.length; j++) {
				guguDan[i][j] = (i+2)*(j+1);
				System.out.print((i+2) + " * " + (j+1) 
						+ " = " + guguDan[i][j]+"\t");
			}
			System.out.println();
		}		
	}
}
