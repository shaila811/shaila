package com.learnjava;

public class SwitchGate {
//StudentAccesscode = 101 Teacher 201 Admin = 301
	public void getAccess(int x) {
	switch(x) {
	case 101: {System.out.println("Welcome to school. Study heard.");}
	case 201: {System.out.println("Welcome.Teach well.");}
	case 301: { 
	    System.out.println("Welcome! Work hard.");
	int a = 10;
	System.out.println(a);
	
	   }
	 }
	}

	public static void main(String[] args) {
	SwitchGate acc = new SwitchGate();
			acc.getAccess(201);
			
		
		
	}

}
