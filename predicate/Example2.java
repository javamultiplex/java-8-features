package com.javamultiplex.predicate;

import java.util.function.Predicate;

//Check whether length of given string is greater than 5 or not.
public class Example2 {

	public static void main(String[] args) {

		Predicate<String> predicate = string -> string.length() > 5;
		System.out.println(predicate.test("abcdef"));
		System.out.println(predicate.test("abcd"));

	}

}
