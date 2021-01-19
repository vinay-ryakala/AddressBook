package AddressBookSystem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook {
	Scanner in = new Scanner(System.in);
	
	Map<String, Person> contactMap = new TreeMap<>();
	 static LinkedList<Person> contactList = new LinkedList<>();
	
	
	public AddressBook() {
		contactMap = new TreeMap<>();
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
		contactList.add(person);
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
			Person c = contactMap.get(name);
			contactList.remove(c);
		} else {
			System.out.println("This name is not present in address book.");
		}
	}
	public List<Person> searchPersonsByCity(String city) {
		return contactList.stream().filter(person -> person.getCity().equals(city)).collect(Collectors.toList());
	}
	public List<Person> searchPersonsByState(String state) {
		return contactList.stream().filter(person -> person.getState().equals(state)).collect(Collectors.toList());
	}	
	public int countPersonsByCity(String city) {
		return contactList.stream().filter(person -> person.getCity().equals(city)).collect(Collectors.toList()).size();
	}

	public int countPersonsByState(String state) {
		return contactList.stream().filter(person -> person.getState().equals(state)).collect(Collectors.toList()).size();
	}

	public List<Person> sortPersonsByCity() {
		return contactList.stream().sorted((a, b) -> a.getCity().compareTo(b.getCity())).collect(Collectors.toList());
	}

	public List<Person> sortPersonsByState() {
		return contactList.stream().sorted((a, b) -> a.getState().compareTo(b.getState())).collect(Collectors.toList());
	}

	public List<Person> sortPersonsByZip() {
		return contactList.stream().sorted((a, b) -> a.getZipCode().compareTo(b.getZipCode())).collect(Collectors.toList());
	}		
}
		
