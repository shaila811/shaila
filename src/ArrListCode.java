import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrListCode {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[] x = {1 ,2 , 3, 4, 5, 6, 7};

ArrayList <String>cars = new ArrayList <String>();


cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");

for (int i = 0; i <cars.size(); i++) {
	System.out.println(cars.get(i)+ "car name");
	
}
   for (String i : cars) {
   System.out.println(i);		
   }
		
		
		
	
ArrayList<Integer>odd=new ArrayList<Integer>();

  odd.add(302);
  odd.add(2);
  odd.add(3);
  odd.add(4);
  odd.add(5);
  odd.add(6);
  odd.add(34);
  
  int max =Collections.max(odd);
  System.out.println(max + "This is max ");
  int min = Collections.min(odd);
  System.out.println(min + "This is min");
  
  
 int Counter1=0;
 
 for (int i=0; i<odd.size(); i++) {
	 if (odd.get(i)%2==0) {
	 Counter1 = odd.get(i);
	 System.out.println(Counter1 + "   This is even");
	 
 }
	 else if (odd.get(i)%2!=0) {
	Counter1 = odd.get(i);
	System.out.println(Counter1 + " this is odd");
 }
 
}
}
}
  
  
  
  
  
  
  
 











