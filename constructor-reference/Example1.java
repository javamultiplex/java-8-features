package com.javamultiplex.constructorreference;

class Sample {

	public Sample() {

		System.out.println("Sample constructor execution and object creation.");
	}

}

interface InterfaceTest {
	public Sample get();
}

public class Example1 {

	public static void main(String[] args) {

		InterfaceTest interfaceTest = Sample::new;
		Sample sample = interfaceTest.get();
		System.out.println(sample);
	}

}
