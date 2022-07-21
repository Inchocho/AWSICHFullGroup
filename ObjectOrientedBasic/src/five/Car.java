package five;

public class Car {

	String color = "";		//차의 색상
	String gearType = "";	//기어타입(수동,자동)
	int door = 0;			//문의 갯수
	
//	기본 생성자(default 생성자)
	Car(){
		
	}
	
//	생성자(매개변수로 유동적으로 유저의 요구에 따라 인스턴스변수 값을 초기화해줌)	
//	앞으로는 이와같이 매개변수와 인스턴스변수를 무조건 똑같이 짓게된다.
//	이걸 가능케 하는게 this키워드이다.	
	Car(String color, String gearType, int door){
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
//	this?
//	생성자의 이름으로 ###클래스이름 대신 this를 사용한다###
//	this는 그 인스턴스의 주소이다
//	동일한 클래스 내의 다른 생성자에서 하나의 생성자를 호출하려면this 키워드를 사용
//	this 키워드를 사용하는 표현식은 생성자의 첫 번째 행이어야한다.	
//	this는 객체 내부에서의 접근이다. this가 현재 객체니까	
	
	void carInfo() {
		String color = "이건 메서드 안에서 만든 내용이야"; //지역변수가 인스턴스변수보다 더 가깝기 때문에 이름을 동일하게 지으면 지역변수를 통해서 출력이된다
		
		System.out.println("나의 드림카 정보");
		System.out.println("지역변수로 같은이름 color 선언,초기화시: " + color);	//그래서 출력시 color에 위 지역변수 내용이 들어가게된다.
		System.out.println("객체 자신의 color this.color를 이용함: " + this.color);
		System.out.println("gearType: " + gearType);
		System.out.println("door: " + door);
		
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(this.gearType);
	}
}
