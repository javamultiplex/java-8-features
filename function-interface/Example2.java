package com.javamultiplex.function;

import java.util.function.Function;

//Find square of give number.
public class Example2 {

	public static void main(String[] args) {

		Function<Integer, Integer> function = i -> i * i;
		System.out.println(function.apply(5));
		System.out.println(function.apply(10));

	}

}
