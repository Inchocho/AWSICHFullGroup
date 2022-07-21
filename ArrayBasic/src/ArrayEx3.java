import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {

//		배열(Array)
//		
//		배열 이란?
//		배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것		
//		
//	    배열의 선언문		
//		타입[] 변수명 = new 타입[크기];
//		인트형 배열 numArr = new 인트형배열5
		int[] numArr = new int[5];

		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 30;
		numArr[3] = 4;
		numArr[4] = 5;
		
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[3]);
		System.out.println(numArr[4]);
		
		String[] nameArr = new String[3];
		
		nameArr[0] = "이영빈";
		nameArr[1] = "황원준";
		nameArr[2] = "남기형";
		
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
		
		System.out.println(nameArr);
		System.out.println(Arrays.toString(nameArr));
		
	}
}
