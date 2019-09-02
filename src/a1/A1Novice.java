package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// customer count
		int customer_count = scan.nextInt();
		
		// create a total price variable 
		double total_price = 0.0;
		
		// loop through each customer; declaring the first and last name, items bought, etc.
		for (int i = 0; i < customer_count; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int itemsBought = scan.nextInt();
			
			
			// create a loop for each different item(s) bought
			for (int j = 0; j < itemsBought; j++) {
				int item_quantity = scan.nextInt();
				String item_name = scan.next();
				double price = scan.nextDouble();
				double subTotal = price * item_quantity;
				total_price = total_price + subTotal;
			}
			
			
			System.out.println(first_name.charAt(0) +  ". " + last_name + ": " + total_price);
		}
		
		
		
		
			
	}
}
