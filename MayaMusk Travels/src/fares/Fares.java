package fares;

import java.util.*;

public class Fares {

	static String destination = "M";
	static String tier = "1"; // Number to be imported
	
	public static void main(String[] args) {

				
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Your Fares are calculated on the basis of the values chosen.");
		System.out.println("");
		
		Timer t = new java.util.Timer();
		t.schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	DetailsOfTheUser();
		            }
		        }, 
		        3000 
		);

		System.out.println();
		
		Timer t1 = new java.util.Timer();
		t.schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	System.out.println("Press 1 to confirm the details and 0 to rerun the programme");
		        		System.out.println();
		        		int confirmationFromUser = sc.nextInt();
		        		
		        		if(confirmationFromUser == 1) {

		        				FaresAllocatedToADestination();
		        		
		        				DiscountedPrice();
		        				
		        		}
		        		else if(confirmationFromUser == 0 ){
		        			System.out.println();
		        			System.out.println("You are redirected to the Booking menu...");
		        		}
		        		else {
		        			System.out.println("False entries, Try again");
		        		}
		            }
		        }, 
		        6000 
		);
		
		
		
	}
	
	public static void DetailsOfTheUser() {
		
		System.out.println("User Details alongwith the destination and tier bus");
		
		System.out.println();
	}

	
	public static void FaresAllocatedToADestination () {
		
		if(destination ==  "Mumbai" | destination == "M"| destination == "m") {
			
			MumbaiFares();
			
		}
		else if(destination ==  "Chennai" | destination == "C"| destination == "c") {
			
			ChennaiFares();
			
		}			
		else if(destination ==  "Kolkata" | destination == "K"| destination == "k") {
			
			KolkataFares();
			
		}			

		
	}
	
	public static void MumbaiFares() {
		if(tier == "1") {
			System.out.println("Your total fare is Rs. 5000");
			System.out.println();
		}
		else if(tier == "2") {
			System.out.println("Your total fare is Rs. 3000");
			System.out.println();
		}
		else {
			System.out.println("Your total fare is Rs. 1700");
			System.out.println();

		}
	}
	
	
	public static void ChennaiFares() {
		if(tier == "1") {
			System.out.println("Your total fare is Rs. 7500");
			System.out.println();

		}
		else if(tier == "2") {
			System.out.println("Your total fare is Rs. 5000");
			System.out.println();
}
		else {
			System.out.println("Your total fare is Rs. 2200");
			System.out.println();

		}
	}
	
	
	public static void KolkataFares() {
		if(tier == "1") {
			System.out.println("Your total fare is Rs. 8000");
			System.out.println();

		}
		else if(tier == "2") {
			System.out.println("Your total fare is Rs. 5500");
			System.out.println();

		}
		else {
			System.out.println("Your total fare is Rs. 3000");
			System.out.println();

		}
	}


	public static void DiscountedPrice () {
		
	
		System.out.println("The deducted price will be displayed on the ticket");
		
	}

}
