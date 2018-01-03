package com.javamultiplex.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//Check whether given ArrayList is empty or not.
public class Example3 {

	public static void main(String[] args) {

		Predicate<Collection<Integer>> predicate = c -> c.isEmpty();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		System.out.println(predicate.test(list1));
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println(predicate.test(list2));

	}

}
