package com.learnjava;

public class Fibonacci2 {
// 0 1 1 2 3 5 8 13 21
	public static void main(String[] args) {
		
		
	int a = 0;
	int b = 1;
	int t = a+b;
	
	//System.out.println(a);
	//System.out.println(b);
	
	for(int i=0; i <= 15; i++) {
	
		t=a+b;
		a=b;
		b=t;
		System.out.println(t);
	}
	
		
	}

}
