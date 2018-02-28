package time;

import java.time.LocalDate;
//import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.DayOfWeek;

public class NewTimeEx3 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today.with(firstDayOfNextMonth()));
		System.out.println(today.with(lastDayOfMonth()));
		System.out.println(today.with(lastInMonth(DayOfWeek.TUESDAY)));
		System.out.println(today);
		

		
	}

}
