package calendar;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {

		String form = "yyyy-MM-dd(E)";
		Calendar date = Calendar.getInstance();
		System.out.println(date);

		// 1일후
		date.add(Calendar.DATE, 1);
		System.out.println(date);
		System.out.println(CalendarEx1.getFormDate(CalendarEx1.calendarToDate(date), form));
		date.add(Calendar.MONTH, -6);
		System.out.println(CalendarEx1.getFormDate(CalendarEx1.calendarToDate(date), form));
	}

}
