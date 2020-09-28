package com.capgemini;
import java.util.*;
public class AddressBookMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 List<AddressBookContact> book = new ArrayList<AddressBookContact>();
		 System.out.println("How many address books do you want to make: ");
		 		 int n = sc.nextInt();
		 		 sc.nextLine();
		 for(int i =0;i<n;i++) {
			 
			 System.out.println("Enter name of address book for book no "+(i+1)+" :");
			 String aname = sc.nextLine();
			 AddressBookContact ab = new AddressBookContact(aname);
			 
			 book.add(ab);
			 }
		
		int c=5;
		System.out.println("Welcome to the Address Book");
		do {
			
			System.out.println("Menu \n1.Add a ContactDetails \n2.Edit a ContactDetails \n3.Remove a ContactDetails \n4.View all ContactDetails \n5.Exit");
			c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name1 = sc.nextLine();
				System.out.println("Enter first name: ");
				String firstName = sc.nextLine();
				System.out.println("Enter last name: ");
				String lastName = sc.nextLine();
				System.out.println("Enter address: ");
				String address = sc.nextLine();
				System.out.println("Enter city: ");
				String city = sc.nextLine();
				System.out.println("Enter state: ");
				String state = sc.nextLine();
				System.out.println("Enter zip: ");
				String zip = sc.nextLine();
				System.out.println("Enter phone number: ");
				sc.nextLine();
				String phoneNumber = sc.nextLine();
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				
				AddressBookStructure ContactDetails = new AddressBookStructure(firstName, lastName, address, city, state, zip, phoneNumber, email);
				for(AddressBookContact x: book) {
					 if(x.bookname.equalsIgnoreCase(name1)) {
						 x.addContactDetails(ContactDetails);
					 }
					 else
						 continue;
				}
				break;
				
			case 2:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name2 = sc.nextLine();
				System.out.println("Update ContactDetails:\nEnter name and all details:");
				System.out.println("Enter first name: ");
				
				String firstName1 = sc.nextLine();
				System.out.println("Enter last name: ");
				String lastName1 = sc.nextLine();
				System.out.println("Enter address: ");
				String address1 = sc.nextLine();
				System.out.println("Enter city: ");
				String city1 = sc.nextLine();
				System.out.println("Enter state: ");
				String state1 = sc.nextLine();
				System.out.println("Enter zip: ");
				String zip1 = sc.nextLine();
				System.out.println("Enter phone number: ");
				sc.nextLine();
				String phoneNumber1 = sc.nextLine();
				System.out.println("Enter email: ");
				String email1 = sc.nextLine();
				
				AddressBookStructure update = new AddressBookStructure(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, email1);
				String s = "";
				for(AddressBookContact x: book) {
					 if(x.bookname.equalsIgnoreCase(name2)) {
						 s = x.updateContactDetails(update);
					 }
					 else
						 continue;
				}
				
				System.out.println(s);
				break;
			case 3:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name3 = sc.nextLine();
				System.out.println("Enter first name of ContactDetails to remove: ");
				
				String fname= sc.nextLine();
				System.out.println("Enter last name of ContactDetails to remove: ");
				String lname= sc.nextLine();
				boolean b = false;
				for(AddressBookContact x: book) {
					 if(x.bookname.equalsIgnoreCase(name3)) {
						 b = x.removeContactDetails(fname, lname);
					 }
					 else
						 continue;
				}
				
				if(b)
					System.out.println("ContactDetails removed");
				else
					System.out.println("ContactDetails not found");
				break;
				
			case 4:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name4 = sc.nextLine();
				
				List<AddressBookStructure> cl = new ArrayList<AddressBookStructure>();
								
				for(AddressBookContact x: book) {
					 if(x.bookname.equalsIgnoreCase(name4)) {
						 cl=x.viewContactDetailss();
					 }
					 else
						 continue;
				}
				
				
				System.out.println("The ContactDetails in Address Book is: ");
				for(AddressBookStructure z:cl) {
					System.out.println(z);
				}
				break;
			
			case 5: break;
				
			}
		
		}while(c!=5);
	}


	}
	


