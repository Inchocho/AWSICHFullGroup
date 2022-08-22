package student;

public class StudentTest {

	public static void main(String[] args) {

		Student std = new Student();
		Student std2 = new Student("홍길동", 2, 1, 100, 60, 76);

		int sumResult = 0;
		double avgResult = 0;

		sumResult = std.getTotal();
		avgResult = std.getAverage();

		std.info();
		System.out.println("총점:" + sumResult);
		System.out.println("평균:" + avgResult);

		System.out.println();

		sumResult = std2.getTotal();
		avgResult = std2.getAverage();

		std2.info();
		System.out.println("총점:" + sumResult);
		System.out.println("평균:" + avgResult);
		
	}

}
