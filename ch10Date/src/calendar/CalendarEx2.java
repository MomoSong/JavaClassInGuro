package calendar;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// calendar 객체 2개를 생성하자.
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		System.out.println(date1); // 날짜 바꾸기
		System.out.println(date2); // 현재 년월일

		date1.set(2018, 1 - 1, 1);
		System.out.println(date1);
		System.out.println(date1.getTimeInMillis());
		System.out.println(date2.getTimeInMillis());

		long dif = date2.getTimeInMillis() - date1.getTimeInMillis();
		System.out.println(dif);
		System.out.println(dif / 1000 + "초 지남");
		System.out.println(dif / 1000 / (60 * 60 * 24));

	}

}
