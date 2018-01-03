package com.javamultiplex.lambda;

interface Addition {
	void getSum(int a, int b);
}
//Sum of two numbers
public class Example2 {
	public static void main(String[] args) {

		Addition addition=(a,b)->System.out.println("Sum of a and b is : "+ (a+b));
		addition.getSum(10, 20);
		
	}
}
