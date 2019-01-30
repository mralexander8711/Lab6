import java.util.Scanner;
import java.util.ArrayList;
public class CarApp {

	
	private static ArrayList <UsedCar> carList = new ArrayList<>();

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String selection = ("Y");
		int input;
		UsedCar car = new UsedCar();
		
		populatecarList(car);
		
		
		System.out.println("Welcome Grand Circus Auto Sales");
		
		do {
			System.out.println("Are You Looking For A New Vecicle ");	
			selection=scan.next("y");
		   
		   for(UsedCar c:carList){
			   System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "   Make", "Model","Type", "Year",  "Price", "Mileage");// printf is formatting
		       System.out.printf("%-10s %-10s %-10s %-10s %-10s\n" , " ~~~~~~~ ", "~~~~~~", "~~~~~~", "~~~~~~~", "~~~~~~~");
			   System.out.printf("%-10s %-10s %-10s %-10d $ %.2f%n%n", c.getCarMake(), c.getCarModel(),c.getCarType(), c.getCarYear(), c.getCarPrice(),c.getCarMiles());
		   }
		
		  System.out.println("Which car would you like?");
		  
		  input=scan.nextInt(); 
		}while(!selection.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		scan.close();
	}		

	
		public static void populatecarList(UsedCar Car) {
		carList.add(new UsedCar("Ford", "Explorer","(New)", 2019,0,65000.00));
		carList.add(new UsedCar("Tesla","Model S","(New)", 2019,0, 89000.00));
		carList.add(new UsedCar("Dodge", "Charger","(New)",2019,0, 75000.00));
		carList.add(new UsedCar("Jeep", "Wrangler","(Used)",2016, 15456, 28500.00));
		carList.add(new UsedCar("Land Rover", "Range Rover","(Used)", 2013,34575,32000.00));
		carList.add(new UsedCar("Ford", "Taurus","(Used)",2002,200343,1200.00));
	}
}
