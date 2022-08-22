import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

//		Calendar date = new Calendar();	에러임
//		Calendar(static)임.getInstance() 바로 Calendar.getInstance() 전세계가 같이 공유하므로 new를 하지않고
//		하나의 유일한 시간관념을 사용하라고 하므로 static으로 작성되있고 getInstance는 유일한주소를 가지고있다
		Calendar date = Calendar.getInstance();

		System.out.println(date);

		int yearStr = 0;
		int monthStr = 0;
		int dateStr = 0;
		int hourStr = 0;
		int minuteStr = 0;
		int secondStr = 0;

		yearStr = date.get(Calendar.YEAR);
		monthStr = date.get(Calendar.MONTH)+1;
		dateStr = date.get(Calendar.DATE);
		hourStr = date.get(Calendar.HOUR);
		minuteStr = date.get(Calendar.MINUTE);
		secondStr = date.get(Calendar.SECOND);

//		단위를 치환할줄 알아야한다. (60초 -> 1초가 와야지 60초 -> 61초오면 사고임) 60진법을쓰나?

		System.out.println(yearStr);
		System.out.println(monthStr);
		System.out.println(dateStr);
		System.out.println(hourStr);
		System.out.println(minuteStr);
		System.out.println(secondStr);

	}
}
