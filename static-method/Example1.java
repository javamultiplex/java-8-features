package com.javamultiplex.staticmethod;

interface Interface1 {
	public static void m1() {
		System.out.println("Static method");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Interface1.m1();
	}

}
