package com.capgemini;
import java.util.*;
public class AddressBookMain {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Address Book");
		
		AddressBookContact newp = new AddressBookContact();
		int flag=-1;
		do {
		AddressBookStructure ab = new AddressBookStructure();

		Scanner s = new Scanner(System.in); 
		System.out.println("Press 1 to Add New Contact ");
		System.out.println("Press 2 to Edit Contact ");
		System.out.println("Press 4 to View Address Book ");

		int choice = s.nextInt();
		Scanner s1 = new Scanner(System.in); 
		switch(choice)
		{
		case 1:
			System.out.print("\nEnter First name: ");
	        ab.setfirstname(s1.nextLine());
	        System.out.print("Enter Last name: ");
	        ab.setlastname(s1.nextLine());
	        System.out.print("Enter Address: ");
	        ab.setaddress(s1.nextLine());
	        System.out.print("Enter City: ");
	        ab.setcity(s1.nextLine());
	        System.out.print("Enter State: ");
	        ab.setstate(s1.nextLine());
	        System.out.print("Enter Zip: ");
	        ab.setzip(s1.nextLine());
	        System.out.print("Enter Phone Number: ");
	        ab.setphone(s1.nextLine());
	        System.out.print("Enter Email: ");
	        ab.setemail(s1.nextLine());
	        newp.addContact(ab);
	        System.out.println("Contact Created");
	        break;
	        
		case 2:
			ArrayList<AddressBookStructure> l = new ArrayList<AddressBookStructure>();
			l=newp.getAddressBook();
			if(l.size() == 0) {
			System.out.println("Empty Address Book");
			break;
			}
			else
			{
			Scanner s2 = new Scanner(System.in);	
			System.out.println("Enter First Name of the contact to be updated");
			String name = s2.nextLine();
			if(newp.check(name))
			{
			Scanner up = new Scanner(System.in);
			System.out.println("Updated Contact details:");
			System.out.println("Enter first name: ");
			String fname1 = up.nextLine();
			System.out.println("Enter last name: ");
			String lname1 = up.nextLine();
			System.out.println("Enter address: ");
			String address1 = up.nextLine();
			System.out.println("Enter city: ");
			String city1 = up.nextLine();
			System.out.println("Enter state: ");
			String state1 = up.nextLine();
			System.out.println("Enter zip: ");
			String zip1 = up.nextLine();
			System.out.println("Enter phone number: ");
			String phonenumber=up.nextLine();
			String phNo1 = up.nextLine();
			System.out.println("Enter email: ");
			String email1 = up.nextLine();

			AddressBookStructure update = new AddressBookStructure(fname1, lname1, address1, city1, state1, zip1, phNo1, email1);
			String updation = newp.updateContact(update);
			System.out.println(updation);

			
			l=newp.viewContactDetails();
			System.out.println("The updated Contact in Address Book is: ");
			for(AddressBookStructure z:l) {
			System.out.println(z);
			}
			}
			else
			{System.out.println("No such contact found");
			break;}
			}
			break;
			
		
					
		case 4:
			System.out.println(newp.getAddressBook());
			break;
				
			
	
		case 0:
			flag=0;
        	System.out.println("Invalid Input");
        	break;
		}}
		while(flag==-1);
	}
	}
	


