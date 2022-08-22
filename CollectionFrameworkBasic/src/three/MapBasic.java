package three;

import java.util.HashMap;

public class MapBasic {

	public static void main(String[] args) {

		HashMap<String, Integer> doorMap = new HashMap<String, Integer>();

//		HashMap에 값을 넣으려면 put()메소드를 사용한다

		doorMap.put("001", 1234);
		doorMap.put("101", 1111);
		doorMap.put("102", 2222);

//		HashMap의 값을 출력하려면 원하는 value의 key값을 입력한다(doorMap.get()또한 오브젝트타입으로 리턴받음)
//		지금까지 index를 통해서 값을 얻는 방식에서 이제 해당 value가 담긴 key값을 통해서 찾을 수 있다
		System.out.println(doorMap.get("001"));
		System.out.println(doorMap.get("101"));
		System.out.println(doorMap.get("102"));
		System.out.println(doorMap.size()); // 사이즈 3
		
//		key값("102")이 중복된경우? put으로 할당해서 추가했는데 똑같이 사이즈가 3인 이유?
//		Map은 키값의 중복을 허용하지 않고, 마지막에 선언한 키에 해당하는 값이 저장된다 (최근에 입력한 키의 해당값으로 덮어씌움)
		doorMap.put("102", 22222);
		
		System.out.println(doorMap.get("001"));
		System.out.println(doorMap.get("101"));
		System.out.println(doorMap.get("102"));
		System.out.println(doorMap.size()); // 사이즈 3
		
//		value값인 1234의 중복은 허용한다 
		doorMap.put("103", 1234);
		System.out.println(doorMap.size()); // 사이즈 4

	}

}

//	키(key) : 컬렉션 내의 키 중에서 유일해야 한다
//	값(value) : 키와 달리 데이터의 중복을 허용한다
//	
//	많은 양의 데이터를 검색하는데 있어서 뛰어난 성능을 보인다
