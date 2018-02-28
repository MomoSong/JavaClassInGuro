package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class NewTimeEx1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now(); //오늘 날짜
		LocalTime now = LocalTime.now();
		System.out.println(today + " , " + now);
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31);
		System.out.println(birthDate);
		LocalTime birthTime = LocalTime.of(23, 59, 59);
		System.out.println(birthTime);
		
		System.out.println(birthDate.withYear(2000));// 데이터가 완전히 바뀌지 않는다.
		System.out.println(birthDate);
		birthDate.plusDays(1); //데이터가 완전히 바뀌지 않는다. 다시 원복됨
		System.out.println(birthDate.plusDays(1));
		

	}

}
