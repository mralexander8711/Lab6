import java.util.Arrays;
import java.util.Scanner;
public class Lab8 {
 
	
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
			
			//make three arrays (name, hometown ,favorite food) 7 total
			String[]studentName= {"1.Mike","2.Sunny","3.Cyn","4.Iah","5.Jason","6.Dereq","7.Carl"};
			String[]Hometown= {"Sw Detroit", "Sweden","Detroit","Miami","Canton","London","New York"};
			String[]Food= {"Pasta","MacNcheese","Tacos","Mangos","Chicken","Salmon","RiceBowls"};
			
			// prompt about user to pick a student
			System.out.println("Welcome to our Java class."
				+ "Which student would like to learn more about?");
			System.out.println(Arrays.toString(studentName));
			// find the student's info
			int choice =scan.nextInt();
			String answer=scan.nextLine();
			//scan.nextLine();
			//first find student's name
			
			System.out.println(studentName[choice -1]);
			System.out.println("You want to know some information about this student? Y/N");
			answer=scan.next("y");
			// then ask if they want to find out about
			if(answer.equalsIgnoreCase("y")) {
			System.out.println("Which topic would you like to know?[Hometown,Fav Food,Hobby");			
			String response = scan.nextLine();
			if (response.equalsIgnoreCase("Hometown")) {
				String studentHometown = Hometown[choice-1];
				System.out.println(studentHometown);
			} if (response.equalsIgnoreCase("Fav food")) {
				String studentFavFood = Food[choice-1];
				System.out.println(studentFavFood);
			}else {System.out.println("What Else Will You Want To Know?");
			response = scan.nextLine();{
			
			
			
		
				// then ask if they want to find out about
					//hometown or favorite food, then print
			// ask if they would like to find out about another student
			}System.out.println("Thank you for learning about us!!");	
			} while(!response.isEmpty());
	}
}		

}
