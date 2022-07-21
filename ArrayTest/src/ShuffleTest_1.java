//고정된 숫자 셔플 + 로또번호뽑기
public class ShuffleTest_1 {
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60};
		int pos = 0;
		int temp = 0;
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	
		for(int i = 0; i<100; i++) {
			pos = (int)(Math.random()*6);
				temp = array[0];
				array[0] = array[pos];
				array[pos] = temp;				
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println();
		System.out.println("=========================================");
		
		int[] arr = new int[6];

		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j<i-1; j++){
				while(arr[i] == arr[j]){
					arr[i] = (int)(Math.random()*45)+1;
				}
			}	
		}

		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + "\t");
		}		
	}
}
