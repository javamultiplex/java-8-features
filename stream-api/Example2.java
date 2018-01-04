package com.javamultiplex.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Double each list element and store it in another list.
public class Example2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		List<Integer> list1 = list.stream().map(I -> 2 * I).collect(Collectors.toList());
		System.out.println(list1);

	}

}
