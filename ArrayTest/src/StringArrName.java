
public class StringArrName {

	public static void main(String[] args) {

		// 배열 쓸것
		String[] nameArr = new String[3];
		nameArr[0] = "이영빈";
		nameArr[1] = "황원준";
		nameArr[2] = "남기형";

		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);

		String[] nameArr2 = new String[3];

		for (int i = 0; i < 3; i++) {
			nameArr2[i] = nameArr[i];
		}

		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr2[i]);
		}

	}
}
