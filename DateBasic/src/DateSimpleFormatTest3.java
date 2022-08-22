import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimpleFormatTest3 {

	public static void main(String[] args) {

//		형식화 클래스 Format

//		형태를 만들어주는 느낌이다
//		원하는 형식으로 내용을 변환해 주는 것

		Date date = new Date();
		
//		패턴(반드시 지켜야함)
//		yyyy	: 년도
//		YYYY	: 년도
//		MM		: 월
//		dd		: 날짜 
//		hh		: 12 시간기준으로 나옴
//		HH		: 24 시간기준으로 나옴(즉 hh + 12랑 같게나옴)
//		mm		: 분
//		ss		: 초

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		SimpleDateFormat koreaSdf = new SimpleDateFormat("YYYY년MM월dd일 hh시mm분ss초");

		String resultDate = sdf.format(date);
		String koreaDate = koreaSdf.format(date);

		System.out.println(date);
		System.out.println(resultDate);
		System.out.println(koreaDate);

	}
}
