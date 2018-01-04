package com.javamultiplex.streams;

import java.util.ArrayList;

//Demo of forEach() method.
public class Example8 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println("Output by Lambda Expression.");
		list.stream().forEach(I -> System.out.println(I));
		System.out.println("Output by Method reference.");
		list.stream().forEach(System.out::println);
	}

}
