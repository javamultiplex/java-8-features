package com.javamultiplex.lambda;

interface Square {
	int getSquare(int x);
}
//Find square of given number
public class Example4 {

	public static void main(String[] args) {
		Square square = x -> x * x;
		int a = square.getSquare(12);
		int b = square.getSquare(5);
		System.out.println("Square of 12 is : " + a);
		System.out.println("Square of 5 is : " + b);
	}
}
