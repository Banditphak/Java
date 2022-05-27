package day45;

import java.time.LocalDate;
import java.time.Period;

public class DatePractice {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today); //  2022-03-24
		
		//                   LocalDate.of(year, month, day);
		LocalDate birthday = LocalDate.of(1981, 12, 13);
		System.out.println("Birthday: " + birthday);//Birthday: 1981-12-13
		
		System.out.println("Day of week: " + birthday.getDayOfWeek());// SUNDAY
		System.out.println("Is leap yeap: " + birthday.isLeapYear());//false
		
		Period lifetime = Period.between(birthday, today);
 System.out.println("Number of months from my birthday: " + lifetime.toTotalMonths());
														//483
		LocalDate afterThreeMonth = today.plusMonths(3);
		System.out.println(afterThreeMonth.getYear());//2022
		System.out.println(afterThreeMonth.getMonth());//JUNE
		System.out.println(afterThreeMonth.getDayOfMonth());//24
		
		// LocalDate class is immutable
		System.out.println(today);//2022-03-24
	}
}