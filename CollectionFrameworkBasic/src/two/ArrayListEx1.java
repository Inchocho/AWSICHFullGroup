package two;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {

//		<Integer> 제너릭, 제너릭스(Generics)
//		ArrayList tvList = new ArrayList();
//		제너릭을 통해서 아래 형변환을 쉽게 처리할 수 있다.
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		Tv tv = new Tv();

		tvList.add(tv); // Tv클래스의 인스턴스 참조변수 tv를 담음
//		add를 통해서 들어가는값은 부모로 들어간다(Object화되서 들어가게된다 최상위클래스인 Object)

		System.out.println(tvList.get(0).channel);
		tvList.get(0).channelUp();

//		get()메소드는 Object타입으로 값을 리턴받아서 주소를 받는것이다 그러므로 해당 클래스로 형변환하면 이제 해당 클래스의 값을 얻을 수 있다
		System.out.println(tvList.get(0)); // 해당 참조하는 객체의 주소를 출력 그러나 tv의 멤버에 접근불가(인스턴스변수나 메소드나)

//		tvList.get(0).channelUp();		// 이건 오류남
//		사용하기 위해 Tv클래스형 참조변수 tempTv에 Tv클래스로 형변환한 tvList.get(0) <- 즉 Tv의 주소를 담아줌
//		get을 통해서 들어가는값도 Object이다. 그러므로 (Tv) Tv클래스로 형변환 시켜주면 이제 Tv클래스의 값을 얻을 수 있다

//		제너릭쓰기 전 방식 ArrayList tvList = new ArrayList();
		Tv tempTv = (Tv) tvList.get(0); // --> 이 형변환을 제너릭을 통해 쉽게 구현가능하다

		System.out.println(tempTv.channel);
		tempTv.channelUp();
		System.out.println(tempTv.channel);

		System.out.println(tvList.size() + "크기");

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

//		add() 메소드(할당연산자)를 통해서 값을 하나씩 넣을 수 있다
//		순서대로 인덱스번호 0번째부터 들어간다

		arrayList.add(1); // arrayList(0) = 1
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		Iterator it = arrayList.iterator();

		while (it.hasNext()) {
			int num = (Integer) it.next();

			System.out.println(num);
		}

//		get() 메소드를 통해서 arrayList안의 값을 인덱스로 조회가능하다		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(2));
//		System.out.println(arrayList.get(3));
//		System.out.println(arrayList.get(4));
	}
}

//<Integer> 제너릭, 제너릭스(Generics)

//	컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능이다
//	객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안정성을 높이고 형변환의 번거로움이 줄어든다
//	
//	제너릭 장점
//	-타입 안정성을 제공한다
//	-타입체크와 형변환을 생략 할 수 있으므로 코드가 간결해진다
