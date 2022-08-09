import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList <Integer>();

		//int []a = {1, 2, 3, 4, 5, 6,};
		     
		     number.add(1); // in arrylist take duplicate value.it follows
		     number.add(5);
		     number.add(6);
		     number.add(8);
		     number.add(11);
		     number.add(12);
		     
		     number.remove(2);
		     
		     for (Integer i : number) {
		    	 
		     System.out.println("index value " + i);
		    	 
		}
		 int Counter = 0;
		 for (int i=0; i<number.size(); i++) {
			 
			 if (number.get(i)%2==0) {
				 Counter = number.get(i);
				 
				 System.out.println(Counter + "  This is even");
		}     
			 else { System.out.println("not even ");
		 
			 }
	}

	}
}
