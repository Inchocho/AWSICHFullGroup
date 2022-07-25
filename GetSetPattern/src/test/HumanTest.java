package test;

import people.Human;

public class HumanTest {

	public static void main(String[] args) {

		Human h = new Human();

		h.setName("김똘똘");
		h.setAge(25);
		h.setSex("호모뭐시기안드로진");
		h.setHairColor("무지개");

		String name = "";
		int age = 0;
		String sex = "";
		String hairColor = "";
		
		name = h.getName();
		age = h.getAge();
		sex = h.getSex();
		hairColor = h.getHairColor();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(hairColor);

	}
}
