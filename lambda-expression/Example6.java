package com.javamultiplex.lambda;

interface Interf {
	public void m1();
}

/*
 * The local variables referenced from lambda expression are implicitly final
 * and hence we can’t perform re-assignment for those local variables otherwise
 * we get compile time error.
 */
public class Example6 {

	int x = 10;

	public void m2() {
		int y = 20;
		Interf i = () -> {
			System.out.println(x); // 10
			System.out.println(y); // 20
			x = 100;
			y = 300; // Compile Time Error
		};
		i.m1();
	}

	public static void main(String[] args) {

		Example6 ex = new Example6();
		ex.m2();

	}

}
