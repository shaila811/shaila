package com.learnjava;

public class MethodParameter {
  
	private int a;
	int b;
	
	
	
 MethodParameter(int x, int y) {
	 System.out.println("I am the constructor");
     this.a=x;
     this.b=y;
 
 }
 
public void  getName() {
	
}
 
 public void getsum(int a, int b){
       int c = a+b;
       System.out.println();
}

 public void geSub(int a, int b) {
	 int c = a-b;
	 System.out.println(c);
 } 
	 
	 public void getDiv(int a, int b){
		 System.out.println((double)a/b);
		 
 }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodParameter obj = new MethodParameter(20,10);

	}

}
