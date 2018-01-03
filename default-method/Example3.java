package com.javamultiplex.defaultmethod;

interface Left {
	default void m1() {
		System.out.println("Left Interface");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right Interface");
	}
}

public class Example3 implements Left, Right {

	@Override
	public void m1() {
		// Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		Example3 ex = new Example3();
		ex.m1();
	}
}
