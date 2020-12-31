package AddressBookSystem;

import java.util.Scanner;

public class AddressBook 
{
	private static void addContact() 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		System.out.println("Enter the LastName:");
		String lastName = inp.nextLine();
		System.out.println("Enter the phone:");
		String phoneNum = inp.nextLine();
		System.out.println("\nAddress:");
		System.out.println("Enter the city:");
		String city = inp.nextLine();
		System.out.println("Enter the state:");
		String state = inp.nextLine();
		System.out.println("Enter the zipcode:");
		String zipCode = inp.nextLine();
		System.out.println("Enter the email-id:");
		String email = inp.nextLine();
		Address personAddress = new Address(city,state,zipCode,email);
		Person details = new Person(firstName, lastName, phoneNum, personAddress);
		System.out.println(details.toString());
	}		
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Address Book Program");
		addContact();
	}
}
