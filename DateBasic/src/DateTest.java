import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date);

		String yearStr = "";
		String monthStr = "";
		String dateStr = "";
		String hourStr = "";
		String minuteStr = "";
		String secondStr = "";

//		@Deprecated - 침체기(사양됨 오래된거니까 쓰지마셈이라고 권고하는거)
		yearStr = date.getYear() + 1900 + ""; // 2000년 넘어가면서 초기화됬음
		monthStr = date.getMonth() + 1 + ""; // 0부터쓰니까 +1을해야 맞음 (즉 12월을 0~11월로 표시해놓은상태임)
		dateStr = date.getDate() + ""; // getDay()의 경우 월(1)~일(7)로 표시
		hourStr = date.getHours() + "";
		minuteStr = date.getMinutes() + "";
		secondStr = date.getSeconds() + "";

//		단위를 치환할줄 알아야한다. (60초 -> 1초가 와야지 60초 -> 61초오면 사고임) 60진법을쓰나?

		System.out.println(yearStr);
		System.out.println(monthStr);
		System.out.println(dateStr);
		System.out.println(hourStr);
		System.out.println(minuteStr);
		System.out.println(secondStr);

	}
}
