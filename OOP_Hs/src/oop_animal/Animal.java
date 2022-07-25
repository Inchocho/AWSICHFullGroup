package oop_animal;

public class Animal {
	
	String name = "";
	String nick = "";
	int price = 0;

	void setName(String name) {
		this.name = name;
	}
	
//	메소드 오버로딩
	void setName(String name, String nick) {
		this.name = name;
		this.nick = nick;
	}
	
	void sleep() {
		System.out.println(name + "zzz");
	}
	
	void bark() {
		System.out.println(name + ": BARKBARK!");
	}
}
