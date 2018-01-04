package com.javamultiplex.methodreference;

interface MyInterface {
	public void m1();
}

public class Example1 {

	public static void m2() {
		System.out.println("Implementation by method reference.");
	}

	public static void main(String[] args) {

		MyInterface myInterface = Example1::m2;
		myInterface.m1();

	}

}
