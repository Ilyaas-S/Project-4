import java.util.Random;


public class Project {
	
	//The 'Project' to create a project,
	//will be used to create a project 
	Random ran = new Random();
	//random numbers will be used to generate the ERF number of the Project.
	int random = ran.nextInt(9999999);
	private int number;
	private String name;
	private String type;
	private String location;
	private static String deadline;
	private int erfnumber;
	private static int totalfee;
	private static int paidtodate;
	private Person customer;
	private Person architect;
	private Person contractor;
	private static String complete;
	
	//Constructor
	//to specify the attributes of the Project,
	//project will be created in this form.
	public Project(int number, String name, String type, String location, String deadline, Random erfnumber, int totalfee, int paidtodate, Person customer, Person architect, Person contractor, String complete) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.location = location; 
		this.deadline = deadline;
		Random random = erfnumber;
		this.totalfee = totalfee;
		this.paidtodate = paidtodate;
		this.customer = customer;
		this.architect = architect;
		this.contractor = contractor;
		this.complete = complete;
		
	}
	
	//Setters
	////will be used to set the data for each attribute(will not return anything)
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	
	public void setName(String newName) {
		name = newName;
	}
    
	public void setType(String newType) {
		type = newType;
	}
	
	public void setLocation(String newLocation) {
		location = newLocation;
	}
	
	public static void setDeadline(String newDeadline) {
		deadline = newDeadline;
	}
	
	public void setErfnumber(int newErfnumber) {
		erfnumber = newErfnumber;
	}
	
	public void setTotalfee(int newTotalfee) {
		totalfee = newTotalfee;
	}
	
	public static void setPaidToDate(int newPaidToDate) {
		paidtodate = newPaidToDate;
	}
	
	public static void setComplete(String newComplete) {
		complete = "No";
	}
	
	
	//getters
	//Will be used to get the data of each attribute(will return a specified attribute of the 'Project')
	public int getNumber() {
		return number;
	}
	public String getName() { 
		return name;
	}
	public String getType() {
		return type;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public int getErfnumber() {
		return erfnumber;
	}
	
	public static int getTotalfee() {
		return totalfee;
	}
	
	public static int getPaidToDate() {
		return paidtodate;
	}
	
	public static String getComplete() {
		return complete;
	}
	
	//The toString() method to return the details of the Project created
	public String toString() {
		String objectString = "Project: " + 
	            "\nNumber: " + number + 
				"\nName: " + name + 
				"\nType: " + type + 
				"\nAddress: " + location + 
				"\nDeadline: " + deadline + 
				"\nERF Number: " + erfnumber + 
				"\nTotal Fee: R" + totalfee + 
				"\nPaid to Date: R" + paidtodate + "\n" +
				"\nCustomer Details: " + customer.toString() + "\n" + 
				"\nArchitect Details: " + architect.toString() + "\n" +
				"\nContractor details: " + contractor.toString() + 
				"\nComplete: " + complete;
		
		return objectString;
	}
}
