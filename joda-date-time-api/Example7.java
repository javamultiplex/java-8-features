package com.javamultiplex.datetime;

import java.time.Year;
import java.util.Scanner;

//How to check whether given year is leap year or not?
public class Example7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year : ");
		int y = input.nextInt();
		Year year = Year.of(y);
		if (year.isLeap()) {
			System.out.printf("%d is leap year", y);
		} else {
			System.out.printf("%d is not leap year", y);
		}
		input.close();

	}
}
