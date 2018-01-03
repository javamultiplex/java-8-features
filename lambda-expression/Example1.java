package com.javamultiplex.lambda;

interface PrintHello {
	void printHello();
}
//Print Hello World
public class Example1 {

	public static void main(String[] args) {

		PrintHello printHello = () -> System.out.println("Hello World");
		printHello.printHello();

	}

}
