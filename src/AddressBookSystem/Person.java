package AddressBookSystem;


public class Person {
	//attributes
	  String firstName;  
	  String lastName;
	  String phoneNumber;
	  String city;
	  String state;
	  String zipCode;
	  String email;
	  

	  //constructor
	/*  public Person(String firstName, String lastName, String phoneNumber, String city, String state,String zipCode,String email) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNumber = phoneNumber;
	    this.city=city;
		this.state=state;
		this.zipCode=zipCode;
		this.email=email;
	   
	  }*/
	  
	@Override
	public String toString() {
		return "Person [firstname=" + firstName + ", lastname=" + lastName + ", phonenumber=" + phoneNumber + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipCode + ", email=" + email + "]";
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}