package com.javamultiplex.streams;

import java.util.ArrayList;

//Find minimum and maximum in given list.
public class Example7 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum value : " + min);
		Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum value : " + max);
	}

}
