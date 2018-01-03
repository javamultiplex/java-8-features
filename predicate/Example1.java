package com.javamultiplex.predicate;

import java.util.function.Predicate;

//Check whether given integer is greater than 10 or not
public class Example1 {

	public static void main(String[] args) {

		Predicate<Integer> predicate = I -> I > 10;
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(90));

	}

}
