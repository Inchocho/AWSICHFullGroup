
class Calculator {
	int result = 0;

	int add(int num) {
		result += num;
		return result;
	}
	
	int sub(int num) {
		result -= num;
		return result;
	}

}

public class OOP_Cal1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Calculator cal2 = new Calculator();

		System.out.println(cal.add(3));
		System.out.println(cal.sub(5));
		System.out.println(cal2.add(2));
		System.out.println(cal2.sub(5));
	}

}
