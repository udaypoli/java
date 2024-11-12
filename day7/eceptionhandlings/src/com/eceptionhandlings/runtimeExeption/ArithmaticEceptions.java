package com.eceptionhandlings.runtimeExeption;

public class ArithmaticEceptions {

	public static void main(String[] args) {
		System.out.println("Execution starts ");
		int a=5;
		int b=0;
		try {
			 b=a/b;
		} catch (ArithmeticException e) {
			System.err.println("Arithmatic exception occured");
		}
		 System.out.println(b);
		 System.out.println("Execution end");

	}

}
