package edu.neu.Client;

import java.util.List;

public class Client {
	
	public Client() {
		
	}
	
	public int add(int a, int b) {
		System.out.print("Adding "+a+" + "+b+" = ");
		return a+b;
	}
	
	public int sub(int a, int b) {
		System.out.print("Substracting "+a+" - "+b+" = ");
		return a-b;
	}
	
	public double divide(double a, double b) {
		System.out.print("Dividing "+a+" / "+b+" = ");
		return a/b;
	}
	
	
	public int multiply(int a, int b) {
		System.out.print("Multiply "+a+" * "+b+" = ");
		return a*b;
	}
	
	public int sum(List<Integer> lst) {
		Integer sm = 0;
		System.out.print("Sum of the list : ");
		for(Integer i: lst) {
			System.out.print(i+", ");
			sm = sm+i;
		}
		
		return sm.intValue();
		
	}
}
