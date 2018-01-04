package com.javamultiplex.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Convert all list elements in upper case and store it in another list.
public class Example4 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Bhavna");
		list.add("Shivani");
		list.add("Javamultiplex");
		list.add("Rudrapur");
		System.out.println(list);
		List<String> list1 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list1);

	}

}
