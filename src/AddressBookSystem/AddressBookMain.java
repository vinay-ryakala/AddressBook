package AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		
		AddressBookList addressBookList = new AddressBookList();
		Scanner in = new Scanner(System.in);
		boolean b = false;
		System.out.println("Welcome to Addressbook");
		while(true) {
			System.out.println("Multiple Address Book:\n"
					+ "1) open Existing Address book\n"
					+ "2) Create new address book\n"
					+ "3) Close \n");
			int option = in.nextInt();
			if(option == 1)
				addressBookList.openAddressBook();
			else if(option == 2)
				addressBookList.newAddressBook();
			else if(option == 3)
				break;
			else
				System.out.println("Enter Correct option");
		}
		System.out.println("Thank You");
	}	
}
