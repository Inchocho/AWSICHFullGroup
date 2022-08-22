package one.test;

import java.util.ArrayList;

public class ArrayListExax2 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();

		for (int i = 0; i < 10; i++) {
			arrayList.add(i + 1);
		}

		System.out.println("list의 크기: " + arrayList.size());
		
//		내가만든거(결과값은 나오는데 배열이 계속생성되서 느려짐)

//		for (int i = 0; i < arrayList.size(); i++) {
//			int a = 0;
//			a = i--;
//			arrayList.remove(i--);
//			arrayList.remove(a);
//			System.out.print(arrayList.size() + " ");
//			System.out.println("list의 크기: " + arrayList.size());
//		}
//
//		System.out.println(arrayList.isEmpty());
		
//		강사님이 만든거
		
		for (int i = 0; i < 10; i++) {
			arrayList.add(i + 1);
		}

		for (int i = arrayList.size() - 1; i >= 0; i--) {
			arrayList.remove(i);
			System.out.print(arrayList.size() + " ");
			System.out.println("list의 크기: " + arrayList.size());
		}

		System.out.println(arrayList.isEmpty());

	}
}

//	list 특징
//	배열을 이용한 자료구조는 데이터를 읽어오고 저장하는 데는
//	효율이 좋지만,
//	용량을 변경해야할 때는 새로운 배열을 생성한 후 기존의 배열로부터
//	새로 생성된 배열로 데이터를 복사해야하기 때문에 상당히 효율이 떨어진다는 단점이 있다
//	
//	ArrayList 순차적인 추가삭제는 빠르다
//	비효율적인 메모리 사용이 가능하니 추가/삭제는 주의해야 한다
//	ex: 중간이나 처음 삭제/추가가 필요한 경우 