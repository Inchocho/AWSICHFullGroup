package one.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam1 {

	public static void main(String[] args) {

//		List list = new List(); --> List는 인터페이스이므로 객체생성이 불가

//		ArrayList 참조변수명 = new ArrayList(list의 크기);
//		ArrayList는 최초선언한 list의 크기에서 동적으로 변화가 가능하다
//		그래서 ArrayList의 경우 크기를 정하지 않는다 ArrayList() 여기선 확인용으로 5를 넣음
		ArrayList arrayList = new ArrayList(5);

//		add() 메소드를 통해서 값을 하나씩 넣을 수 있다
//		순서대로 인덱스번호 0번째부터 들어간다

//		ArrayList의 경우 배열의 크기를 선언해도 값을 추가해주면 동적으로 배열의 크기가 증가한다
		arrayList.add(1); // arrayList(0) = 1
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5); // 처음에 선언한 ArrayList배열의 크기는 5였지만
		System.out.println(arrayList.size()+"<- arrayList의 크기");
		arrayList.add(6); // 6번째 add를 사용해서 값을 추가하면 값이 들어간다

//		get() 메소드를 통해서 arrayList안의 값을 인덱스로 조회가능하다		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.get(4));
		System.out.println(arrayList.get(5));
		System.out.println(arrayList.size()+"<- 추가한 arrayList의 크기");

		System.out.println("=====================배열 시작=====================");

//		배열(Array)의 경우 선언시 크기가 고정되어 있으므로 유동적으로 늘릴 수 없다

		int[] numArr = new int[5];

		for (int i = 0; i < numArr.length + 1; i++) {
			numArr[i] = i + 1;
		}

		for (int i = 0; i < numArr.length + 1; i++) {
			System.out.println(numArr[i]);
		}
	}
}

//	List인터페이스
//	중복을 허용하면서 저장순서가 유지되는 인터페이스
//	
//	List의 구현클래스(List는 인터페이스이므로 반드시 구현필요) -> ArrayList가 대표적이다