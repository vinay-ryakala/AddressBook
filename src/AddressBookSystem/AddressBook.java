package AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook 
{
	public static ArrayList<Person> contacts = new ArrayList<Person>();
	
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
		contacts.add(details);
	}	
	private static void display() 
	{
		for (Person person : contacts) {
			System.out.println(person.toString());
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Address Book Program");
		int cond = 1;
		while (cond == 1) 
		{
			System.out.println("Address Book:\n"
					+ "1) Add Person\n"
					+ "2) Display\n"
					+ "0) Close");
			Scanner inp = new Scanner(System.in);
			System.out.println("Select an option:");
			int num=inp.nextInt();
			switch (num) 
			{
			case 1:
				addContact();
				break;
			case 2:
				display();
				break;
			case 0:
				cond=0;
				break;
			default:
				System.out.println("Wrong option");
				break;
			}
		}

	}
}
