package com.capgemini;
import java.util.*;
public class AddressBookContact {

	private ArrayList<AddressBookStructure> addressBook = new ArrayList<AddressBookStructure>();
	
	
	 public ArrayList<AddressBookStructure> getAddressBook(){
		 return this.addressBook;
	 }
	
	 public void addContact(AddressBookStructure contactObj) {
		 addressBook.add(contactObj);
	 }
	
	 public boolean check(String name)
	 {
		 for(AddressBookStructure x: addressBook) {
			 if(x.getfirstname().equalsIgnoreCase(name)) 
				 return true;
		 }
		 return false;
	 }
	 
	 public ArrayList<AddressBookStructure> viewContactDetails() {
		 return addressBook;
	 }
	 
		 
	 public String updateContact(AddressBookStructure a) {
		 int y=0;
		 AddressBookStructure b = new AddressBookStructure("", "", "", "", "", "", "", "");
		 AddressBookStructure c = new AddressBookStructure("", "", "", "", "", "", "", "");
		
		 for(AddressBookStructure x: addressBook) {
			 if(x.getfirstname().equalsIgnoreCase(a.getfirstname()) && x.getlastname().equalsIgnoreCase(a.getlastname())) {
			 c=x;
			 b=a;
			 y++;
			 }
		 }
		 if(y==0)
			 return "No contact found with this name";
		 else {
			 addressBook.remove(c);
			 addressBook.add(b);
			 return "Contact Updated";
		 }
			
	 }
	 public String deleteContact(String del) {
		 
			AddressBookStructure a=new AddressBookStructure("","","", "", "", "0","", "");
			 for(AddressBookStructure x:addressBook) {
				 if(x.getfirstname().equalsIgnoreCase(del)) {
					 a=x;
				 }
			 }
			 addressBook.remove(a);
			 return "Delete success";
				 
			 }
	
		
	 }


