package com.learnjava;

public class Constructor {
	 
  Constructor(){	//(non- parameterized)
	System.out.println("I am the default constructor");
    //System.out.println(a);
    //this.x=a;
 }	
	
	
  Constructor (int a){    //(int X)(Parameterized) argument pass bcz declared
	  
     System.out.println("I am the method");
     //System.out.println("My name is "+ name);
   
   } 
   public void someMethod(String name ) {
	   System.out.println("I am the method");
   System.out.println("My name is " + name);
   
   }
  
   public void MathaNoshto(int s,int r ) {
	   System.out.println("I am the method");
   System.out.println(s+r);
   
   }  
 public static void main(String[] args) {
		
		Constructor abc = new Constructor(400);
		abc.someMethod("Mohammed");
abc.MathaNoshto(11,15);

 }
}
