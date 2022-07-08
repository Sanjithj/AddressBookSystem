package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	
		public static String first_name;
		public static String last_name;
		public static String Address;
		public static String city;
		public static String state;
		public static int zip;
		public static long phone_number;
		public static String email;
		
		public AddressBookMain(String first_name, String last_name,String Address,String city,String state,long phone_number,String email, int zip) {
			AddressBookMain.first_name=first_name;
			AddressBookMain.last_name=last_name;
			AddressBookMain.Address=Address;
			AddressBookMain.city=city;
			AddressBookMain.state=state;
			AddressBookMain.zip=zip;
			AddressBookMain.phone_number=phone_number;
			AddressBookMain.email=email;
			
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Welcome to Address Book Program");
			System.out.println("enter the first name");
			first_name=sc.next();
			System.out.println("enter the last name");
			last_name=sc.next();
			System.out.println("enter the Address");
			Address=sc.next();
			System.out.println("enter the city");
			city=sc.next();
			System.out.println("enter the state");
			state=sc.next();
			System.out.println("enter the zip");
			zip=sc.nextInt();
			System.out.println("enter the phone number");
			phone_number=sc.nextInt();
			System.out.println("enter the email");
			email=sc.next();
			System.out.println("delete the Name");
			
			AddressBookMain address =new AddressBookMain(first_name,last_name,Address,city,state,phone_number,email, zip); 
			System.out.println("Name : "+AddressBookMain.first_name+" "+AddressBookMain.last_name+"\nAddress: "+AddressBookMain.Address+".\n city :"+AddressBookMain.city+"\n state"+AddressBookMain.state+"\n phone number:"+AddressBookMain.phone_number+"\n email"+AddressBookMain.email);
			
		}
		
}



