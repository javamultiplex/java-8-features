package com.javamultiplex.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Sort list elements in natural and customized order.
public class Example6 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("List according to default natural sorting order(Ascending order).");
		System.out.println(list1);
		List<Integer> list2 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("List according to customized sorting order(descending order).");
		System.out.println(list2);

	}

}
