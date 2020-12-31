package AddressBookSystem;

import java.util.ArrayList;

 class AddressBook1 {
	 public final String fisrtName;
	   public final String lastName;
	   public final String state;
	   public final int zip;
	   public final int number;

	   public AddressBook1(String firstName, String lastName, String state, int zip, int number)
	   {
	      this.fisrtName = firstName;
	      this.lastName = lastName;
	      this.state = state;
	      this.zip = zip;
	      this.number=number;
	   }
 }	   
public class AddressBook
{
	 static ArrayList<AddressBook1> addressBookArrayList;
	public AddressBook() {
	  	   addressBookArrayList = new ArrayList<>();
	}  
	   public void addToAddressBook1(String firstName, String lastName, String state, int zip, int number) 
		{
			AddressBook1 freshEntry = new AddressBook1(firstName, lastName, state, zip, number);
			addressBookArrayList.add(freshEntry);
		}
		public static void main(String[] args) {
			System.out.println("welcome to address book");
			AddressBook abc = new AddressBook(); 
			abc.addToAddressBook1("vin", "rya", "ts", 1, 2);
			abc.addToAddressBook1("vina", "ryak", "tgs", 11, 21);
			
			
		}
}
	   
