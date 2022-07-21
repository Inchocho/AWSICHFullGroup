package two;

public class MyMath2 {
		
//	리턴 타입(int)이 있는 메서드
//	return type(반환타입) 메서드에서 수행된 결과를 반환한다
//	리턴 반환값의 타입을 적는다				
	int add(int x, int y) {	//선언부
		int result = x + y;		//구현부

//		System.out.println("두 수를 더한 결과: " + result);		//구현부
		
//		result값을 나를 호출한곳으로 반환한다.(MyMathTest2.java 파일을 참조)
//		여기서는 result = myMath2.add(10, 5) <- 여기로 반환한다;		
//		반환 타입이 int이므로 반환하는 return도 반드시 int타입이어야 한다.		
		return result;
	}
	
// 나누기(리턴타입 double 매개변수도 double타입)	
	double divide(double x, double y) {
		
		double rslt = 0.0;
		
		rslt = x / y;
		
		return rslt;
	}
	
//	인트타입을 소수점을 찍기위해서는	
	double divide2(int x, int y) {
		
		double rslt = 0.0;
		
		//매개변수중 하나에 double형으로 명시적 형변환하면 알아서 뒤에는 묵시적 형변환 됨
		rslt = (double)x / y;
		
		return rslt;
	}	
	
	int mul(int x, int y) {
		
		int result = 0;
		
		result = x*y;
		
		return result;
	}
	
	
}
