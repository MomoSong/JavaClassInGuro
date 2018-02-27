package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx1 {

	// 요일이 1, 2, 3... -> 일, 월, 화, 수...
	public static final String[] SHORT_DAY = { "짧은 요일", "일", "월", "화", "수", "목", "금", "토" };

	public static void main(String[] args) {

		// Date today = new Date();
		// System.out.println(today.getYear());
		// System.out.println(today.getMonth());
		// System.out.println(today.getDate());
		// System.out.println(today.getDay());

		// 오늘 날짜 객체를 생성해서 저장한다.
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH) + 1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(SHORT_DAY[today.get(Calendar.DAY_OF_WEEK)]);

		System.out.println(getDateString(today));

		System.out.println(getFormDate(calendarToDate(today), "yyyy-MM-dd(E)"));

	}

	public static String getDateString(Calendar c) {
		return c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE) + "("
				+ SHORT_DAY[c.get(Calendar.DAY_OF_WEEK)] + ")";
	}

	public static String getFormDate(Date d, String s) {
		return new SimpleDateFormat(s).format(d);
	}

	public static Date calendarToDate(Calendar c) {
		return new Date(c.getTimeInMillis());
	}

}
