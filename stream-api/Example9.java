package com.javamultiplex.streams;

import java.util.ArrayList;

//Convert list to array.
public class Example9 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		list.stream().forEach(I -> System.out.println(I));
		Integer[] arr = list.stream().toArray(Integer[]::new);
		System.out.println("Array content");
		for (Integer a : arr) {
			System.out.println(a);
		}
	}

}
