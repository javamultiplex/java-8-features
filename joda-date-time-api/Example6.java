package com.javamultiplex.datetime;

import java.time.LocalDate;
import java.time.Period;

//How to get Age using Period class
public class Example6 {
	public static void main(String[] args) {

		LocalDate birthDate = LocalDate.of(1992, 06, 11);
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(birthDate, currentDate);
		System.out.printf("Your age is %d years, %d months and %d days.\n", period.getYears(), period.getMonths(),period.getDays());
		LocalDate deathDate = LocalDate.of(1992 + 60, 06, 11);
		Period period2 = Period.between(currentDate, deathDate);
		int days = period2.getYears() * 365 + period2.getMonths() * 30 + period2.getDays();
		System.out.println("Days : " + days);

	}
}
