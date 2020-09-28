package com.capgemini;
import java.util.*;
public class AddressBookContact {

	public String bookname;
	ArrayList<AddressBookStructure> addressBook = new ArrayList<AddressBookStructure>();
 
 public AddressBookContact(String name) {
	 bookname = name;
 }
 
 public void setAddressBook(ArrayList<AddressBookStructure> m) {
	 this.addressBook= m;
 }
 public List<AddressBookStructure> getAddressBook(){
	 return this.addressBook;
 }
 public void addContactDetails(AddressBookStructure ContactDetailsObj) {
	 addressBook.add(ContactDetailsObj);
 }
 public List<AddressBookStructure> viewContactDetailss() {
	 return addressBook;
 }
 public String updateContactDetails(AddressBookStructure a) {
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
		 return "No ContactDetails found with this name";
	 else {
		 addressBook.remove(c);
		 addressBook.add(b);
		 return "ContactDetails Updated";
	 }
		
 }
 public boolean removeContactDetails(String f_name, String l_name) {
	 AddressBookStructure a=new AddressBookStructure("","","", "", "", "","", "");
	 for(AddressBookStructure x:addressBook) {
		 if(x.getfirstname().equalsIgnoreCase(f_name) && x.getlastname().equalsIgnoreCase(l_name)) {
			 a=x;
		 }
	 }
	 return addressBook.remove(a);
 }
	 }


