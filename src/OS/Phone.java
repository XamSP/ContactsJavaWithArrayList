package OS;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {

    //NOTE: better to check if that contact exist, then pass the index to remove, modify, etc. :D

    private boolean poweredUp;

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    private int myPhoneNumber;

    public Phone(int number) {
        this.myPhoneNumber = number;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public boolean isPoweredUp() {
        return poweredUp;
    }

    public void setPoweredUp(boolean poweredUp) {
        this.poweredUp = poweredUp;
    }

    public int getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void createContact(int number, String name){
        if(findContact(number) > 0 || findContact(name) > 0){
            System.out.println(number + " or " + name +" is already registered!");
        } else {
            Contact contact = new Contact(number, name);
            //Could of used "this(number, "unknown");", but I kinda made the overloaded method in Contact class :P
            contacts.add(contact);
            System.out.println(name + " was added!");
        }
    }

    public void createContact(int number){
        if(findContact(number) > 0){
            System.out.println(number + " is already registered!");
        } else {
            Contact contact = new Contact(number);
            //Could of used "this(number, "unknown");", but I kinda made the overloaded method in Contact class :P
            contacts.add(contact);
        }

    }

    public void getMyContacts() {

        System.out.println("Your Contacts are :");

        for (int i = 0; i < contacts.size(); i++) {

            System.out.println((i+1) + "." + contacts.get(i).getName());

        }

    }

    public Contact getContact(int number){

        int contactIndex = findContact(number);

        if(contactIndex < 0){
            System.out.println(number + " was not found!");
            return null;
        } else {
            Contact thisContact = contacts.get(contactIndex);
            System.out.println(thisContact.getName() + "'s phone number is " + thisContact.getPhoneNumber());
            return thisContact;
        }
    }

    public Contact getContact(String name){

        int contactIndex = findContact(name);

        if(contactIndex < 0){
            System.out.println(name + " was not found!");
            return null;
        } else {
            Contact thisContact = contacts.get(contactIndex);
            System.out.println(thisContact.getName() + "'s phone number is " + thisContact.getPhoneNumber());
            return thisContact;
        }

    }

    public void removeContact(int number){

        int thisContactIndex = findContact(number);

        if(thisContactIndex < 0){
            System.out.println(number + " was not found");
        }

        System.out.println(contacts.get(thisContactIndex).getName() + " with the phone-number " + contacts.get(thisContactIndex).getPhoneNumber() + " was removed!");
        contacts.remove(thisContactIndex);
    }

    public void removeContact(String name){

        int thisContactIndex = findContact(name);

        if(thisContactIndex < 0){
            System.out.println(name + " was not found");
        }

        System.out.println(contacts.get(thisContactIndex).getName() + " with the phone-number " + contacts.get(thisContactIndex).getPhoneNumber() + " was removed!");
        contacts.remove(thisContactIndex);

    }

    public Contact changeContact(int number, int newNumber, String newName){

        int thisContactIndex = findContact(number);

        if(thisContactIndex < 0){
            System.out.println(number + " was not found");
            return null;
        }
        contacts.get(thisContactIndex).setPhoneNumber(newNumber);
        contacts.get(thisContactIndex).setName(newName);
        return contacts.get(thisContactIndex);

    }

    public Contact changeContact(int number, int newNumber){

        int thisContactIndex = findContact(number);

        if(thisContactIndex < 0){
            System.out.println(number + " was not found");
            return null;
        }

        contacts.get(thisContactIndex).setPhoneNumber(newNumber);
        return contacts.get(thisContactIndex);

    }

    public Contact changeContact(int number, String newName){

        int thisContactIndex = findContact(number);

        if(thisContactIndex < 0){
            System.out.println(number + " was not found");
            return null;
        }

        contacts.get(thisContactIndex).setName(newName);
        return contacts.get(thisContactIndex);

    }

    public Contact changeContact(String name, int newNumber, String newName){

        int thisContactIndex = findContact(name);

        if(thisContactIndex < 0){
            System.out.println(name + " was not found");
            return null;
        }

        contacts.get(thisContactIndex).setPhoneNumber(newNumber);
        contacts.get(thisContactIndex).setName(newName);
        return contacts.get(thisContactIndex);

    }



    public Contact changeContact(String name, int newNumber){

        int thisContactIndex = findContact(name);

        if(thisContactIndex < 0){
            System.out.println(name + " was not found");
            return null;
        }

        contacts.get(thisContactIndex).setPhoneNumber(newNumber);

        return contacts.get(thisContactIndex);

    }


    public Contact changeContact(String name, String newName){

        int thisContactIndex = findContact(name);

        if(thisContactIndex < 0){
            System.out.println(name + " was not found");
            return null;
        }

        contacts.get(thisContactIndex).setName(newName);

        return contacts.get(thisContactIndex);

    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(int number) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber() == number){
                return i;
            }
        }

        return -1;
    }

    private int findContact(String name) {
        //System.out.println(name.length());

        for (int i = 0; i < contacts.size(); i++) {
            //System.out.println(contacts.get(i).getName().length());
            if (contacts.get(i).getName().equals(name)){
                System.out.println("It's index is: " + i);
                return i;
            }
        }

        return -1;
    }

    public void menu() {
        System.out.println( "0 - Shutdown\n" +
                            "1 - Print Contacts\n" +
                            "2 - Add a new Contact\n" +
                            "3 - Update a Contact\n" +
                            "4 - Remove a Contact\n" +
                            "5 - Find Contact\n" +
                            "6 - Print all Actions again.\n");



    }



    public void main(String[] args) {

    }

}
