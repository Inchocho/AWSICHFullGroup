package GuGuTriangle;

//import java.util.Scanner;

public class GuGuTest {

	public static void main(String[] args) {

		System.out.println("숫자를 입력해주세요.");

		GuGu gu = new GuGu();
		Triangle tr = new Triangle();
		
		System.out.println(gu.n + "  연산전 인스턴스 gu의 n 변수의값 확인");

		System.out.println(gu.guguDan2(gu));
		
		System.out.println(gu.n + "  연산후 인스턴스 gu의 n 변수의값 확인");
		
		System.out.println("숫자를 입력해주세요.");
		
		tr.triStar();
		tr.triStar2();

	}
}
