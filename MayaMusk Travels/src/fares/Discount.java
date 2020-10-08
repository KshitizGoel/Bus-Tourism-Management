package fares;

import java.util.*;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Play a discount round with us to get a reduction in fares!");
		
		System.out.println("Give an input of 2 numbers from 1 to 10");
		
		
	
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a > 10 | b  > 10  ) | (a<0 | b<0)) {
			System.out.println("Wrong entry, Please retry");
			
		}
		else {
			int c = a | b;
			
			 String luckyNumber = Integer.toString(c);
			 
			int x =  Integer.parseInt(luckyNumber);
			 
		      if (x> 13) {
		    	  System.out.println("Congratulations! You got 10% reductions in total fares. Have a safe journey!");

		      }
		      else if(x <= 13 & x >9) {
		    	  System.out.println("Congratulations! You got 7% reductions in total fares. Have a safe journey!");
		      }
		      else if(x <=9 & x >5) {
		    	  System.out.println("Congratulations! You got 5% reductions in total fares. Have a safe journey!");

		      }else  if( x<=5) {
		    	  System.out.println("Hard luck! You dont get any reductions. Have a safe journey!");
		      }
		}
		
		
	}


}
