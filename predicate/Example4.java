package com.javamultiplex.predicate;

import java.util.function.Predicate;

//Print array elements based on some logical operation.
public class Example4 {

	public static void main(String[] args) {

		int arr[] = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("The numbers greater than 10 are : ");
		m1(p1, arr);
		System.out.println("The even numbers are : ");
		m1(p2, arr);
		System.out.println("The numbers not greater than 10 are : ");
		m1(p1.negate(), arr);
		System.out.println("The numbers greater than 10 and even numbers are : ");
		m1(p1.and(p2), arr);
		System.out.println("The numbers greater than 10 or even numbers are : ");
		m1(p1.or(p2), arr);

	}

	private static void m1(Predicate<Integer> p, int[] arr) {

		for (int element : arr) {
			if (p.test(element)) {
				System.out.println(element);
			}
		}

	}

}
