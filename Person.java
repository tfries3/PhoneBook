package main;

public class Person {
	
	private String middleName;
	private String firstName;
	private String lastName;
	private long phoneNumber;	
	private Address address;
	
	public Person(String firstName, String middleName, String lastName, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.middleName = middleName;		
	}
	public void addAddress(String street, String city, String state, String zip) {
		Address tempAddress = new Address(street, city, state, zip);
		address = tempAddress; 
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMyCity() {
		return address.getCity();
	}
	
	public String getMyState() {
		return address.getState();
	}
	
	public String getMyZip() {
		return address.getZip();
	}
	
	public String getMyStreet() {
		return address.getStreet();
	}
	public void getPerson() {
		String newPhone = Long.toString(phoneNumber);
		System.out.println("First Name: " + firstName + "\nMiddle Name: " + middleName + "\nLast Name: " + lastName + "\nPhone #: " + "(" + newPhone.substring(0,3) + ")-" + newPhone.substring(3,6) + "-" + newPhone.substring(6,10)
				+ "\n\nAddress:\n " + address);
		System.out.println("-----------------------------\n");
	}
	
}
