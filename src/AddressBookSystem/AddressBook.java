package AddressBookSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBook {
	Scanner in = new Scanner(System.in);
	
	Map<String, Person> contactMap = new HashMap<>();
	//static Map<String, AddressBook> addressBookList = new HashMap<>();
	
	public AddressBook() {
		contactMap = new HashMap<>();
	}
	
	public Map<String, Person> getContactMap() {
		return contactMap;
	}
	public void addNewContact() {
		
		Person person = new Person();
		System.out.print("First Name: ");
		person.setFirstName(in.next());
		System.out.print("Last Name: ");
		person.setLastName(in.next());
		System.out.print("Address: ");
		System.out.print("City: ");
		person.setCity(in.next());
		System.out.print("State: ");
		person.setState(in.next());
		System.out.print("Zip: ");
		person.setZipCode(in.next());
		System.out.print("Phone Number: ");
		person.setPhoneNumber(in.next());
		System.out.print("Email: ");
		person.setEmail(in.next());
		String name = person.getFirstName()+" "+person.getLastName();
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			System.out.println("This name is already present\n");
		}else {
		contactMap.put(name, person);
		}
	}
	
	public void editContact() {
		System.out.println("Enter First Name :");
    	String firstName = in.next();
    	System.out.println("Enter Last Name :");
    	String lastName = in.next();
		String name = firstName+" "+lastName;
		boolean b = false;
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			System.out.println("Enter phone no");
			contactMap.get(name).setPhoneNumber(in.next());
			System.out.println("Enter email");
			contactMap.get(name).setEmail(in.next());
			System.out.println("Enter city");
			contactMap.get(name).setCity(in.next());
			System.out.println("Enter state");
			contactMap.get(name).setState(in.next());
			System.out.println("Enter zip");
			contactMap.get(name).setZipCode(in.next());			
		} else {
			System.out.println("This name is not present in the address book.");
		}
	
		
	}
	
	public void showDetail() {
		if(contactMap.size() == 0)
			System.out.println("No contacts to show");
		else {
			Set set = contactMap.entrySet();
			Iterator iterator = set.iterator();
			while(iterator.hasNext()) {
				Map.Entry entry = (Map.Entry)iterator.next();
				System.out.println(entry.getValue());
			}
		}
	}
	public void deleteContact() {
		System.out.println("Enter First Name :");
    	String firstName = in.next();
    	System.out.println("Enter Last Name :");
    	String lastName = in.next();
		String name = firstName+" "+lastName;
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			contactMap.remove(name);
		} else {
			System.out.println("This name is not present in address book.");
		}
	}
}