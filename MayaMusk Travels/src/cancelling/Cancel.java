package cancelling;

import java.util.*;

public class Cancel {

	static Map <String, String> database = new HashMap<>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To cancel your existing booking, press 1 else 0 to redirect to the main menu.");
		System.out.println();
		
		int a = sc.nextInt();
		
		if(a == 1) {
			
			System.out.println("Please enter the ticket number given at the time of booking.");
			System.out.println();
			checkingWhetherTicketNumberIsValid();
		}
		else if( a == 0) {
			
			redirectToTheMainMenu();
			
		}
		else {
			throwAnErrorMessage();
		}

	}
	
	public static void throwAnErrorMessage() {
		System.out.println();
		System.out.println("You have an entered an invalid entry! Please try again.");
		
	}

	public static void checkingWhetherTicketNumberIsValid() {
		Scanner sc = new Scanner (System.in);
		int ticketNumber = sc.nextInt();
			if(database.containsKey(Integer.toString(ticketNumber)) == true) {
			
				executingCancellation();
				
			}
			else {
			System.out.println("Your ticket number is invalid!");
			}
	
		
	}
	
	public static void executingCancellation() {
		
		// Taking the value from checkingWhetherTicketNumberIsValid() method, However for the time being I have initialized a sample of it here.
		
		database.put("213", "Ram");

		int ticketNumber = 213;
		
		System.out.println("Please wait your request is being complying!");
		
		Timer t = new java.util.Timer();
		t.schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	System.out.println("Your booking has been cancelled!");
		        		System.out.println();
		        		database.remove(Integer.toString(ticketNumber));	
		        		
		        		System.out.println("Your refund will be initiated within 3 days. ");
		        		System.out.println();
		        		System.out.println("Thank You For Visiting!");
		            }
		        }, 
		        3000 
		);
		
		
		
		
		
	}
	
	public static void redirectToTheMainMenu () {
		System.out.println();
	}
}
