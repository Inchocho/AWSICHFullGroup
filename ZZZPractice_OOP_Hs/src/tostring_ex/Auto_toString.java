package tostring_ex;

public class Auto_toString {
	
	//toString()은 Object 메소드로 자동으로 실행됨 생성자 호출시 (주소가나옴)
	//오버라이드해서 toString()작성 안할시 경로 (패키지.클래스명 + 주소) 가 나온다.
	
	@Override
	public String toString() {
		String str = "";
		str = "toString()은 오토임";
		return str;
	}

	public static void main(String[] args) {
		Auto_toString auto = new Auto_toString();
		System.out.println(auto);
	}
}
