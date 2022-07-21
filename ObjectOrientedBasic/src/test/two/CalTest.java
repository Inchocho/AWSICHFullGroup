package test.two;

public class CalTest {
	public static void main(String[] args) {

		Calculator cal = new Calculator();

		int x = 15;
		int y = 4;

		cal.add(x, y);
		cal.sub(x, y);
		cal.mul(x, y);
		cal.div(x, y);
		cal.div2(x, y);		

	}

}
