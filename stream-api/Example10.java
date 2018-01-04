package com.javamultiplex.streams;

import java.util.stream.Stream;

//Demo of Stream.of() method.
public class Example10 {

	public static void main(String[] args) {
		System.out.println("For group of values.");
		Stream<Integer> stream = Stream.of(9, 99, 999, 9999, 9999);
		stream.forEach(I -> System.out.println(I));
		System.out.println("For arrays.");
		Double[] d = { 10.0, 10.2, 10.2, 10.3, 10.4 };
		Stream<Double> stream2 = Stream.of(d);
		stream2.forEach(System.out::println);
	}

}
