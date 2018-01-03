package com.javamultiplex.defaultmethod;

interface interface1 {

	default void m1() {
		System.out.println("Default method");
	}
}

public class Example1 implements interface1 {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.m1();
	}

}
