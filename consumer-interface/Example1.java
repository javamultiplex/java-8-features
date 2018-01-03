package com.javamultiplex.consumer;

import java.util.function.Consumer;

//Print given String on console.
public class Example1 {

	public static void main(String[] args) {

		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Rohit");
		consumer.accept("Javamultiplex");

	}

}
