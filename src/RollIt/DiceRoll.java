package RollIt;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
	static Random rand = new Random();
	static Scanner scna = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		 String choice;
		 choice = ("Yes");
		 int sides;
		 System.out.println(" How many sides do your dice have?");
		 sides=userInput.nextInt();
			 
		  do {	
		  	
			generateRandomDieRoll(sides);
			generateRandomDieRoll(sides);
			
			
		    System.out.println(generateRandomDieRoll(sides));
		    System.out.println(generateRandomDieRoll(sides));
		    System.out.println();
	
		 System.out.println("Roll Again? Yes/No ");
		  choice = scna.nextLine();		  
		 } while(!(choice.equalsIgnoreCase("no")));
			System.out.println("Ok Goodbye, This was great");
			
		
	}
     public static int generateRandomDieRoll(int sides) {
    	int  n=rand.nextInt(sides)+ 1;
		return (n);
    	 
     }
}
