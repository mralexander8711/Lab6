package labexample;

import java.util.Scanner;

public class Cubed {

	public static void main(String[] args) {

		Scanner scar = new Scanner(System.in);
		String choice= "y";

		System.out.println("Let's Learn your squares and cubes!");

		do {
		
			
		System.out.println("Please Enter an Number:");
		int userInput = scar.nextInt();

		System.out.println("Number   " + " Sqaured " + "  Cubed   ");
		System.out.println("=======  " + " =======  " + " ======= ");


		for (int i = 1; i <= (userInput); i++) {
				System.out.printf("%4d %9d %9d\n",(i), (i*i), (i*i*i) );
		}
		choice = ("y");

		System.out.println("Continue? (y/n):");
		choice = scar.next();
	
		 } while(!(choice.equalsIgnoreCase("n")));
			System.out.println("Ok Goodbye, This was great");
		
		}
}


