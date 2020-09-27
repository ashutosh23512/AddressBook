package com.capgemini;
import java.util.*;
public class AddressBookContact {

	private ArrayList<AddressBookStructure> addressBook = new ArrayList<AddressBookStructure>();
	
	 public List<AddressBookStructure> getAddressBook(){
		 return this.addressBook;
	 }
	
	 public void addContact(AddressBookStructure contactObj) {
		 addressBook.add(contactObj);
	 }

}
