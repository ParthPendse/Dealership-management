package dealership;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import dealership.Car;

public class Dealership {



	public static void main(String[] args) throws IOException {
		double quotation = 0;
		Scanner sc = new Scanner(System.in);
		Car userCar = new Car();
		Car nexon = new Car(1000000, "Nexon");
		Car harrier = new Car(1800000, "Harrier");
		Car tiago = new Car(600000, "Tiago");
		System.out.println("Welcome to TATA Motors\nPlease enter your name");
		String name = sc.nextLine();
		System.out.println("Please enter your country name");
		String country = sc.next();
		System.out.println("Please enter your Budget for the car");
		double budget = sc.nextDouble();
		System.out.println("Enter G for GST or V for VAT");
		String taxMethod = sc.next();
		
		if (budget>1500000) {
			System.out.println("The car Harrier fits in your given Budget");
		}
		else if (budget<1500000 && budget>700000) {
			System.out.println("The car Nexon fits in your given Budget");
		}
		else {
			System.out.println("The car Tiago fits in your given Budget");
		}
		
		System.out.println("Which Car would you like to choose? (Harrier or Nexon or Tiago?)");
		String carName = sc.next();
		
		switch(carName) {
		case "Harrier":
			userCar = harrier;
			
			if (taxMethod.equalsIgnoreCase("G")) {
				quotation = userCar.getQuotationGST();
	
				}
			else if (taxMethod.equalsIgnoreCase("V")) {
				quotation = userCar.getQuotationTax();
	
				}
			break;
		case "Nexon":
			userCar = nexon;
			
			if (taxMethod.equalsIgnoreCase("G")) {
				quotation = userCar.getQuotationGST();
	
				}
			else if (taxMethod.equalsIgnoreCase("V")) {
				quotation = userCar.getQuotationTax();
	
				}
			break;
		case "Tiago":
			userCar = tiago;
			
			if (taxMethod.equalsIgnoreCase("G")) {
				quotation = userCar.getQuotationGST();
	
				}
			else if (taxMethod.equalsIgnoreCase("V")) {
				quotation = userCar.getQuotationTax();
	
				}
			break;
			
		} //end switch
		System.out.println("You have chosen the car " + userCar.cname + " with the quotation INR " + quotation );
		
	        try{
	            FileOutputStream fis = new FileOutputStream("C:\\Users\\parth\\eclipse-workspace\\TTM\\src\\dealership\\quotation.txt");
	            String s = "Car Model is: "+ userCar.cname + "The Quotation for the selected car is " + quotation;
	            
	            Car cobj = new  Car();
	            ObjectOutputStream obj = new ObjectOutputStream(fis);
	            

	            obj.writeObject(cobj);
	            obj.flush();
	            fis.close();
	            System.out.println("Quotation saved");           
	            
	        }
	        catch(FileNotFoundException e){
	            e.printStackTrace();

	}
	}
}

