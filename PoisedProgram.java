import java.util.Scanner;
import java.util.Random;

public class PoisedProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Creating the Person classes, architect, contractor and customer
		//No details as a new project still needs to still be created, to fill the 'Blanks'.
		Person contractor = new Person("Blank", 0000000000, "Blank", "Blank");
		Person architect = new Person("Blank", 0000000000, "Blank", "Blank");
		Person customer = new Person("Blank", 0000000000, "Blank", "Blank");
		
		//Displaying the menu for the to user Decide from.
		System.out.println("Menu" + "\n====================================="
				+ "\n1. Create New Project"
				+ "\n2. Change Due Date"
				+ "\n3. Change Total amount paid to Date"
				+ "\n4. Update Contractor Details"
				+ "\n5. Generate Invoice"
				+ "\nPLease Enter a number: ");
		int selected = input.nextInt();
		input.nextLine();
		
		//If the users choice should be '1' - to create a new Project, 
		if (selected == 1) { 
			
			//Collecting the data needed to create the new project
			System.out.println("Project Number: ");
			int proNumber = input.nextInt();
		    input.nextLine();
		    System.out.println("\nProject Name: ");
		    String proName = input.nextLine();
		    System.out.println("\nThe Type of Project: (House, Apartment block etc)");
		    String proType = input.nextLine();
		    System.out.println("\nThe Address of the Project: ");
		    String proLocation = input.nextLine();
		    System.out.println("\nThe Deadline for the Project: ");
		    String proDeadline = input.nextLine();
		    System.out.println("\nThe Total fee of the Project: ");
		    int proTotalfee = input.nextInt();
		    input.nextLine();
		    System.out.println("\nThe total amount Paid to date: ");
		    int proPaidToDate = input.nextInt();
		    input.nextLine();
		    Random proerfnumber = new Random();
		    String procomplete = Project.getComplete();
		
		    System.out.println();
		
		    // Collecting the customers Details 
		    System.out.println("Customer Name: ");
		    String cusName = input.nextLine();
		    System.out.println("\nTelephone number: ");
	        int cusTelNumber = input.nextInt();
	        input.nextLine();
		    System.out.println("\nEmail: ");
		    String cusEmail  = input.nextLine();
		    System.out.println("\nCustomer's Address : ");
		    String cusAddress = input.nextLine();
		    
		    //set the customers details(fill the blanks), creating the customer.
		    customer.setName(cusName);
		    customer.setTelNumber(cusTelNumber);
		    customer.setEmail(cusEmail);
		    customer.setAddress(cusAddress);
		
		    // Collecting the architects Details
		    System.out.println();
		    System.out.println("Architect Name: ");
		    String arcName = input.nextLine();
		    System.out.println("\nTelephone number: ");
	        int arcTelNumber = input.nextInt();
	        input.nextLine();
		    System.out.println("\nEmail: ");
		    String arcEmail  = input.nextLine();
		    System.out.println("\nArchitect's Address : ");
		    String arcAddress = input.nextLine();
		    
		    //set the architects details(fill the blanks), creating the architect.
		    architect.setName(arcName);
		    architect.setTelNumber(arcTelNumber);
		    architect.setEmail(arcEmail);
		    architect.setAddress(arcAddress);
		    
		    //System.out.println("Architect Details: " + "\n" + architect.toString());
		
		    // Collecting the Contractors Details
	        System.out.println();
		    System.out.println("Contractor Name: ");
		    String conName = input.nextLine();
		    System.out.println("\nTelephone number: ");
	        int conTelNumber = input.nextInt();
	        input.nextLine();
		    System.out.println("\nEmail: ");
		    String conEmail  = input.nextLine();
		    System.out.println("\nContractor's Address : ");
		    String conAddress = input.nextLine();
		    System.out.println("New Project created!");
			
		    //set the contractors details(fill the blanks), creating the contractor.
		    contractor.setName(conName);
		    contractor.setTelNumber(conTelNumber);
		    contractor.setEmail(conEmail);
		    contractor.setAddress(conAddress);
            
		    //Creating the new Project 'project1'.
		    Project project1 = new Project(proNumber, proName, proType, proLocation, proDeadline, proerfnumber, proTotalfee, proPaidToDate, customer, architect, contractor, procomplete);
		}
		// Else if the user selects option '2', To Change the Due Date of the project
		else if (selected == 2) {
			
			//Collect the data for the 'Newdate'.
			System.out.println("Enter the New Due Date: ");
			String Newdate = input.nextLine();
			Project.setDeadline(Newdate);
			System.out.println("date Updated.");
			}
		
		//Else if the user selects option '3', To update the amount paid to date
		else if (selected == 3) {
			
			//Collect the data for the updated amount.
			System.out.println("Enter the new amount paid to Date: ");
			int Newamountptd = input.nextInt();
		    Project.setPaidToDate(Newamountptd);
		    System.out.println("Amount Paid Updated.");
		    }
		
		//Else if the user selects option '4', To Update the Contractors details.
		else if (selected == 4) {
			
			// Collect the new data to update the contractors details.
		    System.out.println();
			System.out.println("Contractor Name: ");
			String NewconName = input.nextLine();
		    contractor.setName(NewconName);
			System.out.println("\nTelephone number: ");
		    int NewconTelNumber = input.nextInt();
		    input.nextLine();
		    contractor.setTelNumber(NewconTelNumber);
			System.out.println("\nEmail: ");
			String NewconEmail  = input.nextLine();
			contractor.setEmail(NewconEmail);
			System.out.println("\nContractor's Address : ");
			String NewconAddress = input.nextLine();
			contractor.setAddress(NewconAddress);
			System.out.println("Contractors Details Updated.");
		    }
		
		//Else if the user selects option '5', To generate an invoice.
		else if (selected == 5) {
			
			//If the Outstanding amount is 0, meaning the full fee is paid, 
			//An invoice will not be generated and the project will be complete and marked as 'finalised'.
			int Outstanding = Project.getPaidToDate() - Project.getTotalfee();
			if (Outstanding == 0) { 
				Project.setComplete("Yes");
				System.out.println("Finalised.");
				}else {
					System.out.println("Date complete: Blank");
					System.out.println("Projects To be completed: Blank");
					System.out.println("Projects overdue: Blank");
					System.out.println("Search project(Enter Project number or Project Name: N/A");
		    	}
		    	
		    }
		}
		
	}
