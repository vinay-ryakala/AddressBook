package AddressBookSystem;

public class Person 
{
	private String firstName;  
	private String lastName;
	private String phoneNumber;
	private String city;
	private String state;
	private String zipcode;
	private String email;

	  //constructor
	  public Person(String firstName, String lastName, String phoneNumber, String city, String state, String zipcode, String email) 
	  {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNumber = phoneNumber;
	    this.city=city;
		this.state=state;
		this.email=email;
		this.zipcode=zipcode;
	  }
	
	public String toString() 
	{
		return "Person [firstname=" + firstName + ", lastname=" + lastName + ", phoneNumber=" + phoneNumber+
				"city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", email=" + email+"]";
	}


	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getphoneNumber() 
	{
		return lastName;
	}

	public void setphoneNumber(String phoneNumber) 
	{
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
		return zipcode;
	}

	public void setZipCode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

