package com.javamultiplex.supplier;

import java.util.function.Supplier;

//Randomly print string from given array.
public class Example1 {
	public static void main(String[] args) {

		String[] str = { "Rohit", "Mohit", "Sohan", "Mohan" };

		Supplier<String> supplier = () -> {
			int index = (int) (Math.random() * 3 + 1);
			return str[index];

		};
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());

	}
}
