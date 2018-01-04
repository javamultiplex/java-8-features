package com.javamultiplex.streams;

import java.util.ArrayList;

//In list count number of strings whose length is >=8.
public class Example5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Bhavna");
		list.add("Shivani");
		list.add("Javamultiplex");
		list.add("Rudrapur");
		System.out.println(list);
		long count = list.stream().filter(s -> s.length() >= 8).count();
		System.out.println("Number of Strings with length>=8 is : " + count);

	}

}
