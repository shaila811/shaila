package com.learnjava;

import com.Interface.Interface1;

public class Hellojava implements Interface1 {

	public void ss() {
	System.out.println("I am hello java");
	}
		
	@Override
	public void c2() {
    System.out.println("blue");
		
	}
	@Override
	public void c22() {
	System.out.println("yellow");
		
	}
	@Override
	public void c3() {
	System.out.println("red");
		
	}
	@Override
	public void c33() {
		System.out.println("white");
		
	}
	@Override
	public void c1() {
		System.out.println("black");
		
	}
	@Override
	public void c11() {
	System.out.println("green");
		
	}
    public static void main(String[] args) {
	Hellojava hj= new Hellojava();
	
	hj.c1();
	hj.c3();
	hj.c33();
	hj.c11();
}
}

