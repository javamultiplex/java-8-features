package com.javamultiplex.lambda;

interface abc {
	public void m1();
}

/*
 * 1. Inside lambda expression we can’t declare instance variables. 
 * 2. Whatever the variables declare inside lambda expression are simply acts as local variables
 * 3. Within lambda expression ‘this” keyword represents current outer class object
 * reference (that is current enclosing class reference in which we declare lambda expression)
 * 
 */
public class Example7 {

	int x = 10;

	public void m2() {
		abc i = () -> {
			int x = 20;
			System.out.println(x); // 20
			System.out.println(this.x); // 10
		};
		i.m1();
	}

	public static void main(String[] args) {

		Example7 ex = new Example7();
		ex.m2();

	}

}
