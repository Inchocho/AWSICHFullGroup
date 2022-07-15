import java.util.Arrays;

public class Array_Ex1 {

	public static void main(String[] args) {
		//2차원배열 예시(구구단)
		int[][] array = new int[9][9];

		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
				array[i-1][j-1] = i * j;				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "단: ");
			System.out.println(Arrays.toString(array[i]));
			System.out.println();
		}
	}

}
