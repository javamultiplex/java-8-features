package com.javamultiplex.function;

import java.util.function.Function;

//Find length of given string.
public class Example1 {

	public static void main(String[] args) {

		Function<String, Integer> function = s -> s.length();
		System.out.println(function.apply("javamultiplex"));

	}

}
