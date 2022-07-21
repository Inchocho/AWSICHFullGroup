
public class RandomNumberEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		랜덤한 숫자 
//		임의의 숫자를 구하는 방법
//		Math.random() 0~1사이 난수생성(실수) 0.0<x<1.0	
//		Math.random() 생성되는 난수는 기본적으로 실수(double)
		
		int rndNum = 0;
		
//		0~9까지 -> 1~10까지 구하려면 + 1
		rndNum = (int)(Math.random() * 10); 
		
		System.out.println(rndNum);
	}

}
