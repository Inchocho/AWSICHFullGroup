package one;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {

//		ArrayList는 동적인 list의 크기를 갖기때문에 크기를 지정하지않는다.
		ArrayList arrayList = new ArrayList();

		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}

		arrayList.add("가");
		arrayList.add("나");
		arrayList.add("다");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		System.out.println("list의 크기: " + arrayList.size());

		// 데이터 하나 지우기 (인덱스 위치를 지운다)
		arrayList.remove(0); // 0번인덱스 삭제

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		System.out.println("list의 크기: " + arrayList.size());

		// list가 비어져있는지 확인한다(boolean값 리턴)
		System.out.println(arrayList.isEmpty());	// false

		// 전부 지우기
		arrayList.clear();	

		System.out.println(arrayList.isEmpty());	// true
		
		System.out.println("list의 크기: " + arrayList.size());	// 전부 삭제하고 사이즈는 0

	}

}