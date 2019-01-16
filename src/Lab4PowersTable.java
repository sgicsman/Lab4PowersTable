import java.util.Scanner;

public class Lab4PowersTable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		int userNum;
		int i;
		String userDecision = "";
		
		//loop to calculate + print square values first, then calculate + print cube values
		//loop needs to begin with i = user #, then subtract 1 for each iteration, until i = 1

		do {
			System.out.println("Please enter an integer greater than zero, and I will create a table of powers for every number from your input down to 1.");
			userNum = scnr.nextInt();
			i = userNum;
			
			
			if (userNum == 0) {
			System.out.println("Please enter a number greater than zero.");
			continue; 
			}
		 
			
			System.out.printf("%-12s %-12s %-12s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-12s %-12s %-12s\n", "=======", "=======", "=======");
			
			for (i = 1; i <= userNum; i++) {
				System.out.printf("%-12s %-12s %-12s\n", i, i * i, i * i * i);
				
				//System.out.printf("%-12s %-12s %-12s\n", userNum, Math.pow(userNum, 2), Math.pow(userNum, 3));  MATH PRODUCTS PRINT AS DECIMALS.
			} 
			
			System.out.println("\n" + "Would you like to do it again? (y/n)");
			userDecision = scnr.next();

		} while (userDecision.equalsIgnoreCase("y"));
		//while (!(userDecision.startsWith("N")));
		//while (userDecision.startsWith("y"));  WHY DOES THIS RETURN AS FALSE BEFORE INPUT IS ENTERED?

		 System.out.println("Thank you, and come again.");
					
		
	}
}
