import java.util.Arrays;

public class StringConstAndMethod {

	public static void main(String[] args) {

		System.out.println("String(String s)");
		System.out.println("주어진 문자열(s)을 갖는 String클래스의 인스턴스 생성");
		String s = new String("s");
		System.out.println(s);
		System.out.println();
		System.out.println();

		System.out.println("String(char[] value)");
		System.out.println("주어진 문자열(value)를 갖는 String 인스턴스 생성");
		char[] c = { 'H', 'e', 'l', 'l', 'o' };
		s = new String(c);
		System.out.println(s);
		System.out.println();
		System.out.println();

		System.out.println("String(StringBuffer sb)");
		System.out.println("StringBuffer인스턴스가 갖고있는 문자열과 같은 내용의 String 인스턴스 생성");
		StringBuffer sb = new StringBuffer("Hello");
		s = new String(sb);
		System.out.println(s);
		System.out.println();
		System.out.println();

		System.out.println("charAt(int index)");
		System.out.println("저장된 위치(index)에 있는 문자열을 알려줌");
		char cc = s.charAt(1);
		System.out.println(cc);
		System.out.println();
		System.out.println();

		System.out.println("int compareTo(String str)");
		System.out.println("문자열(str)과 사전순서로 비교");
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "aaa".compareTo("aaa");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println();
		System.out.println();

		System.out.println("String concat(String str)");
		System.out.println("문자열(str)을 뒤에 붙임");
		String s1 = "Hello";
		String s2 = s1.concat(" World");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		System.out.println();

		System.out.println("boolean contains(CharSequence s)");
		System.out.println("지정된 문자열(s)이 포함되었는지 검사");
		s = "Hello";
		boolean b = s.contains("H");
		System.out.println(b);
		System.out.println();
		System.out.println();

		System.out.println("boolean endsWith(String suffix)");
		System.out.println("지정된 문자열(suffix)로 끝나는지 검사");
		s = "Hello";
		b = s.endsWith("lo");
		System.out.println(b);
		System.out.println();
		System.out.println();

		System.out.println("boolean equals(Object obj)");
		System.out.println("문자열(obj)과 String의 인스턴스의 문자열을 비교(클래스끼리 주소가아닌 문자열을 비교)");
		s = "Hello";
		s1 = new String("Hello");
		s2 = new String("Hello");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println();
		System.out.println();

		System.out.println("boolean equalsignorecase(String str)");
		System.out.println("문자열과 String인스턴스의 문자열 비교(대소문자 구분없음)");
		s = "Hello";
		boolean b1 = s.equalsIgnoreCase("Hello");
		boolean b2 = s.equalsIgnoreCase("hello");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		System.out.println();

		System.out.println("int indexOf(char ch)");
		System.out.println("주어진 문자(ch)가 문자열에 존재하는지 확인하여");
		System.out.println("위치(index)를 알려줌 없을시 -1 반환");
		s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('H');
		System.out.println(idx1); // 4번인덱스
		System.out.println(idx2); // 0번인덱스
		System.out.println();
		System.out.println();

		System.out.println("int indexOf(char ch, ing pos)");
		System.out.println("주어진 문자(ch)가 문자열에 존재하는지를 지정한");
		System.out.println("위치(pos)부터 확인하여 위치(index)를 알려줌");
		s = "Hello";
		idx1 = s.indexOf('e', 0); // 1
		idx2 = s.indexOf('e', 2); // -1
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println();
		System.out.println();

		System.out.println("int indexOf(String str)");
		System.out.println("주어진 문자열(str)이 존재하는지를 확인하여 위치(index)를 알려줌");
		s = "Hello";
		idx1 = s.indexOf("ell");
		System.out.println(idx1); // 1 H(0)ell(1)o
		System.out.println();
		System.out.println();

		System.out.println("String intern()");
		System.out.println("문자열을 상수풀(constant pool)에 등록");
		System.out.println("상수풀에 같은 문자열이 있을 경우 주소값을 반환");
		s1 = new String("abc");
		s2 = new String("abc");
		b1 = (s1 == s2);
		b2 = s1.equals(s2);
		boolean b3 = (s1.intern() == s2.intern());
		System.out.println(b1); // false
		System.out.println(b2); // true
		System.out.println(b3); // true
		System.out.println();
		System.out.println();

		System.out.println("int lastIndexOf(char ch)");
		System.out.println("지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아 위치(index)를 알려줌");
		s = "java.lang.java";
		idx1 = s.lastIndexOf('.');
		idx2 = s.indexOf('.');
		System.out.println(idx1); // 9 맨뒤부터 0123456789
		System.out.println(idx2); // 4 앞에서부터 01234
		System.out.println();
		System.out.println();

		System.out.println("int lastIndexOf(String str)");
		System.out.println("지정된 문자열을 인스턴스의 문자열 끝부터 찾아서 위치(index)를 알려줌");
		s = "java.lang.java";
		idx1 = s.lastIndexOf("java");
		idx2 = s.indexOf("java");
		System.out.println(idx1); // 10 뒤부터
		System.out.println(idx2); // 0 앞부터
		System.out.println();
		System.out.println();

		System.out.println("int length() 문자열의 길이 확인");
		s = "Hello";
		int length = s.length();
		System.out.println(length); // 5
		System.out.println();
		System.out.println();

		System.out.println("String replace(char old, char new)");
		System.out.println("문자열의 문자(old)를 새로운 문자(new)로 바꾼 문자열 반환");
		s = "Hello World";
		s1 = s.replace("H", "h"); // H를 -> h로 변경
		System.out.println(s1);
		System.out.println();
		System.out.println();

		System.out.println("String replace(CharSequence old, CharSequence new)");
		System.out.println("문자열 중의 문자(old)를 새로운 문자(new)로 모두 바꾼 문자열로 반환");
		s = "Heeello Heeello Man";
		s1 = s.replace("e", "E"); // 모든 소문자 e를 대문자 E로 변경함
		System.out.println(s1); // 모든 e를 -> E로 변경
		System.out.println();
		System.out.println();

		System.out.println("String replaceAll(String regex, String replacement)");
		System.out.println("문자열 중에서 지정된 문자열(regex)와 일치하는 것을 새로운 문자열(replacement)로 모두 변경");
		s = "Hello HEEEELLLLOOOOO";
		s1 = s.replaceAll("EE", "AA");
		System.out.println(s1);
		System.out.println();
		System.out.println();

		System.out.println("String replaceFirst(String regex, String replacement)");
		System.out.println("문자열 중에서 지정된 문자열(regex)와 일치하는 것중 첫번째 것만 새로운 문자열로 변경");
		s = "Hello World Yeah~ World";
		s1 = s.replaceFirst("World", "Earth");
		System.out.println(s1);
		System.out.println();
		System.out.println();

		System.out.println("String[] split(String regex)");
		System.out.println("문자열을 지정한 분리자(regex)로 나누어 문자열을 배열에 담아 반환");
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println();

		System.out.println("String[] split(String regex, int limit)");
		System.out.println("문자열을 지정된 수(limit)에서 지정된 분리자(regex)로 잘라 문자열 배열에 담아 반환");
		animals = "dog, cat, bear, lion, tiger";
		arr = animals.split(",", 2);
		System.out.println(arr[0]); // dog [0]에 dog
		System.out.println(arr[1]); // cat, bear, lion, tiger 나머지는 전부 [1]에		
		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[2]); 분리자(,)로 나누어 지정된수의 크기인 배열(2) 즉 2개로 나눔 배열의크기 2 2칸짜리임
		System.out.println();
		System.out.println();

		System.out.println("boolean startsWith(String prefix)");
		System.out.println("주어진 문자열(prefix)로 시작하는지 검사");
		s = "java.lang.java";
		b1 = s.startsWith("ja");
		b2 = s.startsWith("lang");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		System.out.println();

		System.out.println("String substring(int begin)");
		System.out.println("String substring(int begin, int end)");
		System.out.println("주어진 위치(begin)부터 끝(end)범위에 포함된 문자열을 얻음 (begin <= 문자열 <= end)");
		s = "java.lang.java"; // [0]j[1]a[2]v ...
		String ss = s.substring(5);
		String ss2 = s.substring(5, 10);
		System.out.println(ss); // lang.java 5번부터 쭈욱
		System.out.println(ss2); // lang. 5번부터 10번까지
		System.out.println();
		System.out.println();

		System.out.println("String toLowerCase();");
		System.out.println("String 인스턴스에 저장된 모든 문자열을 소문자로 변환");
		s = "HELLO WORLD!!!!";
		s1 = s.toLowerCase();
		System.out.println(s1);
		System.out.println();
		System.out.println();

		System.out.println("String toUpperCase();");
		System.out.println("String 인스턴스에 저장된 모든 문자열을 대문자로 변환");
		s = "hello world world";
		s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println();
		System.out.println();

		System.out.println("String toString();");
		System.out.println("String 인스턴스에 저장된 문자열을 반환 (이 메소드는 묵시적으로 무조건 실행됨)");
		s = "Hello";
		System.out.println(s.toString());
		System.out.println(s); // 묵시적으로 실행됨 toString();
		System.out.println();
		System.out.println();

		System.out.println("String trim()");
		System.out.println("문자열의 양쪽 끝에 있는 공백을 없앤 결과를 반환");
		s = "Hello World    !!! !!! !!!!!!!";
		s1 = s.trim();
		System.out.println(s1);
		System.out.println();
		System.out.println();

	}
}
