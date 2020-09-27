package com.capgemini;
import java.util.*;
public class AddressBookMain {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Address Book");
		AddressBookContact newp = new AddressBookContact();
		AddressBookStructure ab = new AddressBookStructure();
		Scanner s = new Scanner(System.in); 
		System.out.println("Press 1 to Add New Contact ");
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
	        System.out.println(ab.toString());
	        break;
	        
	        default:
	        	System.out.println("Incorrect Input");
		}
	}


	
	}
	


