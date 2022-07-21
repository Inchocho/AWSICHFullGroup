
public class FlowEx3 {
	public static void main(String[] args) {
		int visitCount = 0;

		if (visitCount < 1) {
			System.out.println("처음 오셨군요.");
			System.out.println("방문해 주셔서 감사합니다.");

		}

//		재방문 출력 프로그램
//		다시 방문 해주셔서 감사합니다

//		항상출력
//		방문 횟수는 n번입니다. 라고 출력

		int visitCnt = 0;

		if (visitCnt < 1) {
			System.out.println("처음 오셨군요.");
			System.out.println("방문해 주셔서 감사합니다.");
		} else {
			System.out.println("다시 방문해주셔서 감사합니다.");
			System.out.println("방문 횟수는 " + visitCnt + "번 입니다.");
		}

	}
}
