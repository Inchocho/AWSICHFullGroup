package four;

public class Car {
	
	String color = "";		//색상
	String gearType = "";	//변속기 종류 - auto, manual
	String country = "";
	String role = "";
	int price = 0;
	int door = 0;			//문의 개수
	
	
//	생성자의 조건
//	1. 생성자의 이름은 클래스의 이름과 같아야 한다
//	2. 생성자는 리턴 값이 없다	
//	3. 생성자는 클래스의 생성시에 단 한번만 호출되며, 
//	4. 객체의 초기화를 담당하게 된다. 일반 메소드와는 달리 필요할 때마다 호출될 수 없다.
	
	Car(){
		
	}
	
//	생성자
	Car(String c, String g, int d){ //생성자 Car
		color = c;
		gearType = g;
		door = d;
	}
	
	Car(String a, String b){
		color = a;
		gearType = b;
	}
	
	Car(String col, String gear, String con, String rol, int pri){
		color = col;
		gearType = gear;
		country = con;
		role = rol;
		price = pri;
	}
	
	Car(String col, String gear, String con, int dooor, int pri){
		color = col;
		gearType = gear;
		country = con;
		door = dooor;
		price = pri;
	}	
}
