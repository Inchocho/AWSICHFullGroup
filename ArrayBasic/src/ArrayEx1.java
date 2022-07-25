
public class ArrayEx1 {

	public static void main(String[] args) {

//		배열(Array)
//		
//		배열 이란?
//		배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것		
//		
//	    배열의 선언문(방식 여러가지)	
//		타입[] 변수명 = new 타입[크기];
		
//		인덱스(index)
//		인덱스의 범위는 0부터 배열길이-1 까지이다
		
//		인트형 배열 numArr = new 인트형배열5
		int[] numArr = new int[5];

//		numArr[0] = 1;
//		numArr[1] = 2;
//		numArr[2] = 3;
//		numArr[3] = 4;
//		numArr[4] = 5;
		
		for(int i=0; i<5; i++) {
			numArr[i] = (i+1)*2;
		}
		
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[3]);
		System.out.println(numArr[4]);
		System.out.println(numArr[0] + numArr[1]);
		System.out.println(numArr[1] + numArr[2]);
		
		System.out.println("배열길이: " + numArr.length);		
		

//		ctrl + alt + 화살표 아래 or 위 : 라인 복제

	}
}
