package com.javamultiplex.lambda;

interface Length{
	int getLength(String string);
}
//Length of String
public class Example3 {

	public static void main(String[] args) {
		Length length=s->s.length();
		int length1 = length.getLength("Javamultiplex");
		int length2=length.getLength("Google");
		System.out.println("Length of Javamultiplex is : "+length1);
		System.out.println("Length of Google is : "+length2);
	}
	
}
