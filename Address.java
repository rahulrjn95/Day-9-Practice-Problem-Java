package com.bridgelabz;

public class Address {
    public static void main(String[] args){
        AddressBookEntry details = new AddressBookEntry();
        details.setFirstName("Vishnu");
        details.setLastName("reddy");
        details.setAddress("12-89/9 mehadipatnam");
        details.setCity("Hyderabad");
        details.setState("Telangana");
        details.setZipCode(58123);
        details.setMobileNumber(9553212371l);
        details.setEmailAddress("vishnu95532@gmail.com");
        System.out.println(details);
    }
}
