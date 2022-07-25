package student;

public class Student {

	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;

	Student() {
		name = "홍길동";
		ban = 2;
		no = 1;
		kor = 100;
		eng = 60;
		math = 76;
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		int sum = 0;
		sum = kor + eng + math;
		return sum;
	}

//	나누기 계산	
//	100점/60점/76점 총합 236점 --> 순서
//	(1)236/3.0 (자동형변환되서 더블로 계산됨) --> 78.66666666666667
//	(2)78.66666666666667 + 0.005 = 78.67166666666667
//	(3)78.67166666666667 * 100 = 7867.166666666667
//	(4)(int)정수형으로 형변환 소숫점 다떨어짐 -> 7867
//	(5)7867/100.0 (자동형변환 더블로 계산됨) --> 78.67

	double getAverage() {
		double avg = 0;
		avg = (int) ((getTotal() / 3.0 + 0.005) * 100) / 100.0;
		return avg;
	}

	void info() {
		System.out.println("이름: " + name + " / 반: " + ban + " / 번호: " + no);
		System.out.println("국어:" + kor + " / 영어: " + eng + " / 수학: " + math);

	}
}
