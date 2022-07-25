package people;

public class Human {

//	getter setter 패턴은 일관성
//	private 접근제어자를 사용하는 이유 : 기밀성 (캡슐화 Encapsulation)
//	꼭 필요한 정보와 기능만 외부에 오픈하는 것
//	대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공해 일관된 기능을 구현하게 하는 것

	private String name = "";
	private int age = 0;
	private String sex = "";
	private String hairColor = "";

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

}
