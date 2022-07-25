package people;

public class Human {

//	getter setter 패턴은 일관성
//	private 접근제어자를 사용하는 이유 : 기밀성 (캡슐화 Encapsulation)
//	꼭 필요한 정보와 기능만 외부에 오픈하는 것
//	대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공해 일관된 기능을 구현하게 하는 것
//	앞으로 getter/setter는 직접 만들지 않고 필드,즉 멤버변수만을 작성하고 source->generate를 통해 만든다.
//	source -> generate getter/setter 선택시 자동으로 생성
//	getter/setter는 반드시 기본생성자를 만들어야함

	private String name = "";
	private int age = 0;
	private String sex = "";
	private String hairColor = "";
	
// source -> generate -> constructor using fields (체크 다풀고 -> 기본생성자) 

	public Human() {
		super();
	}
	
// source -> generate -> constructor using fields (체크 하고 -> 필드값이 매개변수로 들어간 생성자)	

	public Human(String name, int age, String sex, String hairColor) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hairColor = hairColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	
//	source -> generate -> generate toString() -> 필드를 전부 문자형으로 변환하고 [ ]안에 반환(자동완성 형태가 이럼)	
//	오브젝트 toString()메소드를 오버라이딩해서 재정의해서 사용함 -> 이또한 자동완성으로 사용
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", sex=" + sex + ", hairColor=" + hairColor + "]";
	}
	
	

}
