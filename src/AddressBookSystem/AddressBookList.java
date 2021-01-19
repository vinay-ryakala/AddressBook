package AddressBookSystem;

import java.util.*;

public class AddressBookList {
	Scanner in = new Scanner(System.in);
	 Map<String, AddressBook> addressBookMap = new TreeMap<>();

	 public AddressBookList() {
			addressBookMap = new TreeMap<>();
		}
	 public Map<String, AddressBook> getAddressBookMap() {
			return addressBookMap;
  }
  public void openAddressBook() {
	  System.out.println("address books you have created "+addressBookMap.keySet());
	  System.out.println("Enter name of addressbook you want to open");
	  String bookName = in.next();
	  boolean keyPresent = addressBookMap.containsKey(bookName);
	  if(keyPresent) {
		  AddressBook addressbook = addressBookMap.get(bookName);
     
      while(true) {
    	  System.out.println("Address Book:\n"
					+ "1) Add Person\n"
					+ "2) Edit Person\n"
					+ "3) Display\n"
					+ "4) Delete Person\n"
					+ "5) Close");
    	  int option = in.nextInt();
      if(option == 1)
      	addressbook.addNewContact();
      else if(option == 2) 
      	addressbook.editContact();
      else if (option == 3)
      	addressbook.showDetail();
      else if(option == 4) 
      	addressbook.deleteContact();
      else if(option == 5)
      	break;
      else
      System.out.println("Please Enter Correct Choice"); 
      }
  }
	  else {
		 System.out.println("Address Book is not present"); 
	  }
  }
public void newAddressBook() {
	AddressBook addressBook = new AddressBook();
	System.out.println("Enter name of address book");
	String bookName = in.next();
	boolean keyPresent = addressBookMap.containsKey(bookName);
	if(keyPresent)
		System.out.println("Already Present");
	else
		addressBookMap.put(bookName, addressBook);

}
} 