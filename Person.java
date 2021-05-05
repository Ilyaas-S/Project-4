
public class Person {
	
	//The 'Person' will contain the below details(attributes).
	private String name;
	private int telnumber;
	private String email;
	private String address;
	
	//Constructor
	public Person(String initName, int initTelNumber, String initEmail, String initAddress ) {
		name = initName;
		telnumber = initTelNumber;
		email = initEmail;
		address = initAddress;
	}
    
	//Setters
	//will be used to set the data for each attribute(will not return anything)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTelNumber(int telnumber) {
		this.telnumber = telnumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Getters
	//Will be used to get the data of each attribute(will return a specified attribute of the 'Person')
	public String getName() {
		return name;
	}
	
	public int getTelNumber() {
		return telnumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	//tostring() method to return(Display) the details(attributes) of the 'Person'.
	public String toString() {
		String result1 = " ";
		result1 = "\nName: " + name + "\nTel number: " + telnumber + "\nEmail: " + email + "\nAddress: " + address;
		return result1;
		
	}

}
