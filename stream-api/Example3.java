package com.javamultiplex.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//In list find strings whose length is >=8 and store it in another list.
public class Example3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Bhavna");
		list.add("Shivani");
		list.add("Javamultiplex");
		list.add("Rudrapur");
		System.out.println(list);
		List<String> list1 = list.stream().filter(s -> s.length() >= 8).collect(Collectors.toList());
		System.out.println(list1);

	}

}
