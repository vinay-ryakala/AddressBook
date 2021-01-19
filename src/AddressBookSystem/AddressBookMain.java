package AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		
		AddressBook addressBook = new AddressBook();
		AddressBookList addressBookList = new AddressBookList();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Addressbook");
		while(true) {
			System.out.println("Multiple Address Book:\n"
					+ "1) open Existing Address book\n"
					+ "2) Create new address book\n"
					+ "3) Search by city or State\n"
					+ "4) Close\n");
			int option = in.nextInt();
			if(option == 1)
				addressBookList.openAddressBook();
			else if(option == 2)
				addressBookList.newAddressBook();
			else if(option == 3) {
				System.out.println("1) to search by  City\n"+"2) to search person using state");
				int check = in.nextInt(); 
				if(check == 1) {
					System.out.println("Enter City");
					String city = in.next();
					System.out.println(addressBook.searchPersonsByCity(city));
				}
				else if(check == 2 ){
					System.out.println("Enter State");
					String state = in.next();
					System.out.println(addressBook.searchPersonsByState(state));
				}
			}
			else if (option == 4)
				break;
			else
				System.out.println("Enter Correct option");
		}
		System.out.println("Thank You");
	}	
}
