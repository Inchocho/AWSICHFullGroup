package level1;

public class 행렬의덧셈 {
	int[][] sumMatrix(int[][] A, int[][] B) {
		
		int row = Math.max(A.length, B.length);
		int col = Math.max(A[0].length, B[0].length);
		
		// int[][] answer = {{0, 0}, {0, 0}};
		
		int[][] answer = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}

		return answer;
	}
}
