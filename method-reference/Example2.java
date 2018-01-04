package com.javamultiplex.methodreference;

public class Example2 {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread.");
		}
	}

	public static void main(String[] args) {

		Example2 ex = new Example2();
		Runnable runnable = ex::m1;
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread.");
		}

	}

}
