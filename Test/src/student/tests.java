package student;

public class tests {

	static void selectNum(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
			System.out.print(arr[i]+" ");
		}
		System.out.println("숫자를 조회합니다.");
	}


	public static void main(String[] args) {
		
		int[] Numarr = new int[10];
		System.out.println("숫자를 조회합니다");
		selectNum(Numarr);
	}
}
