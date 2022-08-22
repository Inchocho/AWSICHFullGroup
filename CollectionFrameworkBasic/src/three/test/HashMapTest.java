package three.test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("myId", "1234");
		map.put("psu", "psu09");
		map.put("hs12", "1212");

		Scanner scan = new Scanner(System.in);

		System.out.println("id와 password를 입력해주세요");

		System.out.print("id: ");
		String id = "";
		id = scan.nextLine().trim();

		System.out.println("password: ");
		String password = "";
		password = scan.nextLine().trim();
		System.out.println();

		boolean keyCheck = false;
		boolean passwordCheck = false;

		keyCheck = map.containsKey(id);
		if (keyCheck == false) {
			System.out.println("입력하신 id는 존재하지 않습니다");
		} else {
			passwordCheck = password.equals(map.get(id));
			if (passwordCheck == false) {
				System.out.println("비밀번호가 일치하지 않습니다");
			} else {
				System.out.println("id와 비밀번호가 일치합니다");
			}
		}
	}

}
