package com.bridgelabz;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contactsList = new ArrayList<>();
    public void printContacts() {
        System.out.println("You have" + contactsList.size() + "contacts");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + "." + contactsList.get(i));
        }
    }
    public void addNewContact(String contact) {

        contactsList.add(contact);
    }
    public void removeContact(String contact) {
        int index = findContact(contact);
        if (index >= 0) {
            deleteContact(index);
        } else {
            System.out.println("No such contact found");
        }
    }
    public void updateContact(String replacedContact,String newContact) {
        int index = findContact(replacedContact);
        if (index >= 0) {
            contactsList.set(findContact(replacedContact), newContact);
        } else {
            System.out.println("No such contact found to update");
        }
    }
    public int findContact(String contact){

        return contactsList.indexOf(contact);
    }
    private void deleteContact(int index){

        contactsList.remove(index);
    }
    public ArrayList<String>getContactsList(){

        return contactsList;
    }
}
