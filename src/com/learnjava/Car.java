package com.learnjava;

public class Car extends Abstract{
	
	public void Color() {
		System.out.println("Red");
	}

	@Override
	void getGrocery() {
		System.out.println("Need some grocery child" );
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Car cr= new Car ();		
	cr.getGrocery();
	cr.Color();
	cr.getPhone();
	}
}

