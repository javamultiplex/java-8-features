package com.javamultiplex.defaultmethod;

interface interface2 {

	default void m1() {
		System.out.println("Default method");
	}
}

public class Example2 implements interface1 {

	@Override
	public void m1() {
		System.out.println("My own implementation.");
	}

	public static void main(String[] args) {
		Example2 ex = new Example2();
		ex.m1();
	}

}
